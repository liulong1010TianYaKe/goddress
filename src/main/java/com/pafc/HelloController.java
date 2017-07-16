package com.pafc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by coco on 17/7/16.
 */

@RestController
public class HelloController {

    public HelloController() {
        super();
    }

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  String  say(){
        return "Hello Spring Boot!"+girlProperties.getCupSize();
    }
}
