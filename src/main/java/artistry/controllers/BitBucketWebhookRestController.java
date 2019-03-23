package artistry.controllers;

import artistry.models.BitBucketActivity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
@Description("Controller to receive messages from BitBucket webhooks")
@RequestMapping("/bitbuckethook")
public class BitBucketWebhookRestController {

    private static final Logger log = LoggerFactory.getLogger(BitBucketWebhookRestController.class);

    @RequestMapping(value = "/receiveactivity", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public void receiveMessage(@RequestBody BitBucketActivity data) {
        log.debug(data.toString());

    }

}
