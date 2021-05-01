package com.ksanchezp.webAppDeployment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String getHome() {
        return "Hello World";
    }

}
