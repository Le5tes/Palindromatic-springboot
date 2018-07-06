package com.palindromatic.palidromaticservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PalidromaticServiceController {

    @Autowired
    private PalidromaticServiceApplication palindromatic;

    @RequestMapping("/")
    public String index() {
        return "It's working!";
    }

    @RequestMapping("/check/{palindrome}")
    public String check(@PathVariable String palindrome) {
        return String.valueOf(palindromatic.check(palindrome));
    }

}
