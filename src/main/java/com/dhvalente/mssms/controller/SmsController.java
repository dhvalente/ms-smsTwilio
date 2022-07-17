package com.dhvalente.mssms.controller;

import com.dhvalente.mssms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @GetMapping("/notification")
    public void notifySms(){
        smsService.sendSms();
    }
}
