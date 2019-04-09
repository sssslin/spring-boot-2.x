package com.bigdoufuspace.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LinJunFeng
 * @Date: 2019-04-09 20:48
 * @Description:
 * @Version: 1.0.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
}
