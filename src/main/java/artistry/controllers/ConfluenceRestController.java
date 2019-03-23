package artistry.controllers;

import artistry.models.ConfluenceSpaces;
import artistry.services.ConfluenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@Description("Controller to manage confluence")
@RequestMapping("/confluence")
public class ConfluenceRestController {

    static final Logger log = LoggerFactory.getLogger(AddressRestController.class);

    @Autowired
    private ConfluenceService confluenceService;

    @RequestMapping(value = "/getspaces", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public ConfluenceSpaces getAll() {

        return confluenceService.getSpaces();
    }

}
