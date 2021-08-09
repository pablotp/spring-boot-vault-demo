package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

import java.net.URI;

@Configuration
public class VaultConnection extends AbstractVaultConfiguration {
    @Override
    public ClientAuthentication clientAuthentication() {
        return new TokenAuthentication(getEnvironment().getProperty("spring.cloud.vault.token"));
    }

    @Override
    public VaultEndpoint vaultEndpoint() {
        return VaultEndpoint.from(URI.create(getEnvironment().getProperty("spring.cloud.vault.uri")));
    }
}
