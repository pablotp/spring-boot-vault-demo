package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.annotation.VaultPropertySource;

@Configuration
@VaultPropertySource({"secret/local/policyinjector/one", "secret/policyinjector"})
public class BitlyConfiguration {

    @Value("${mysecret_1}")
    private String mysecret1;

    @Value("${mysecret_2}")
    private String mysecret2;

    public String getMysecret1() {
        return mysecret1;
    }


    public String getMysecret2() {
        return mysecret2;
    }

}
