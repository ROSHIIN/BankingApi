package com.myproject.BankingApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @Autowired
    Service service;
    @GetMapping("/accountdetails")
    public void getAccountDetails(){
        service.getDetails();
    }
}
