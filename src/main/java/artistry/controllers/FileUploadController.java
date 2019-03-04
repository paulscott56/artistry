package artistry.controllers;


//import com.amazonaws.SdkClientException;
// import artistry.services.AwsS3Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
@Description("Controller to manage uploads")
@RequestMapping("/upload")
public class FileUploadController {

    static final Logger log = LoggerFactory.getLogger(FileUploadController.class);

    /*@Autowired
    private AwsS3Service s3;

    @RequestMapping(value = "/checkbucketexists", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public boolean checkBucketExists(@RequestParam("bucketname") String bucketname) {
        try {
            return s3.doesBucketExist(bucketname);
        } catch (SdkClientException e) {
            log.info(e.getLocalizedMessage());
            return false;
        }
    }*/


}
