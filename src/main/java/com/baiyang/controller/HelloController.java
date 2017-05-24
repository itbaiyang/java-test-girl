package com.baiyang.controller;

import com.baiyang.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by baiyang on 2017/5/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id是：" + id;
    }

    @GetMapping(value = "/see")
    public String see(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id是：" + myId;
//        return girlProperties.getCupSize();
    }
}