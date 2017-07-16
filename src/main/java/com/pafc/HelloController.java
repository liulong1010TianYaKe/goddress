package com.pafc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by coco on 17/7/16.
 */

@RestController
@RequestMapping("/hello")
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

    @GetMapping(value = "/say1")
    public  String say1(@RequestParam(value = "id",required = false) Integer myId){
        return  "Say1"+myId;
    }



//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public  String index(){
//        return "index";
//    }
}
