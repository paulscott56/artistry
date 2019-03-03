package artistry.services;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;
import com.amazonaws.services.s3.transfer.Upload;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;

@Service
@Configuration
public class AwsS3Service {

    private final AmazonS3 s3client;
    @Value("${aws.region}")
    private String region;
    @Value("${aws.max-upload-threads}")
    private int maxUploadThreads;
    @Value("${aws.bucket-name}")
    private String artistryBucketName;


    public AwsS3Service() {
        if (region != null) {
            this.s3client = AmazonS3ClientBuilder.standard()
                    .withRegion(Regions.valueOf(region))
                    .withCredentials(new EnvironmentVariableCredentialsProvider())
                    .build();
        } else {
            this.s3client = AmazonS3ClientBuilder.standard()
                    .withRegion(Regions.DEFAULT_REGION)
                    .withCredentials(new EnvironmentVariableCredentialsProvider())
                    .build();
        }
    }

    //is bucket exist?
    public boolean doesBucketExist(String bucketName) {
        return s3client.doesBucketExistV2(bucketName);
    }

    //create a bucket
    public Bucket createBucket(String bucketName) {
        return s3client.createBucket(bucketName);
    }

    //list all buckets
    public List<Bucket> listBuckets() {
        return s3client.listBuckets();
    }

    //delete a bucket
    public void deleteBucket(String bucketName) {
        s3client.deleteBucket(bucketName);
    }

    //uploading object
    public PutObjectResult putObject(String bucketName, String key, File file) {
        return s3client.putObject(bucketName, key, file);
    }

    //listing objects
    public ObjectListing listObjects(String bucketName) {
        return s3client.listObjects(bucketName);
    }

    //get an object
    public S3Object getObject(String bucketName, String objectKey) {
        return s3client.getObject(bucketName, objectKey);
    }

    //copying an object
    public CopyObjectResult copyObject(
            String sourceBucketName,
            String sourceKey,
            String destinationBucketName,
            String destinationKey
    ) {
        return s3client.copyObject(
                sourceBucketName,
                sourceKey,
                destinationBucketName,
                destinationKey
        );
    }

    //deleting an object
    public void deleteObject(String bucketName, String objectKey) {
        s3client.deleteObject(bucketName, objectKey);
    }

    //deleting multiple Objects
    public DeleteObjectsResult deleteObjects(DeleteObjectsRequest delObjReq) {
        return s3client.deleteObjects(delObjReq);
    }

    public void uploadFile(String keyName, String filePath) throws Exception {
        TransferManager tm = TransferManagerBuilder
                .standard()
                .withS3Client(s3client)
                .withMultipartUploadThreshold((long) (5 * 1024 * 1024))
                .withExecutorFactory(() -> Executors.newFixedThreadPool(maxUploadThreads))
                .build();

        ProgressListener progressListener =
                progressEvent -> System.out.println("Transferred bytes: " + progressEvent.getBytesTransferred());

        PutObjectRequest request = new PutObjectRequest(artistryBucketName, keyName, new File(filePath));
        request.setGeneralProgressListener(progressListener);
        Upload upload = tm.upload(request);

        try {
            upload.waitForCompletion();
            System.out.println("Upload complete.");
        } catch (AmazonClientException e) {
            System.out.println("Error occurred while uploading file");
            e.printStackTrace();
        }

    }
}
