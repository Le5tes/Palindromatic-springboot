package com.palindromatic.palidromaticservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PalidromaticServiceController {

    @RequestMapping("/")
    public String index() {
        return "It's working!";
    }

    @RequestMapping("/check/eevee")
    public String check() {
        return "true";
    }

}
