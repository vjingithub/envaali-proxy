package com.envaali.controller;

import com.envaali.model.DefaultResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @RequestMapping( value="/" , method = RequestMethod.GET)
    @ResponseBody
    public String getResponse(){
        return "I am here";
    }

    @RequestMapping( value="/test" , method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public DefaultResponse getResponseTest(){
        DefaultResponse resp = new DefaultResponse("MuruganD");
        return  resp;
    }

}
