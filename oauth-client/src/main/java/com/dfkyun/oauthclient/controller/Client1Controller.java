package com.dfkyun.oauthclient.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {

    @GetMapping("/high")
    @PreAuthorize("hasAuthority('ROLE_HIGH')")
    public String normal( ) {
        return "high permission";
    }

    @GetMapping("/mid")
    @PreAuthorize("hasAuthority('ROLE_MID')")
    public String medium() {
        return "mid permission";
    }

    @GetMapping("/low")
    @PreAuthorize("hasAuthority('ROLE_LOW')")
    public String admin() {
        return "low permission";
    }
}
