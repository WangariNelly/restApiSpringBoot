package com.restApiSpringBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
    private final CurrencyServiceConfiguration configuration;

    @Autowired
    public CurrencyConfigurationController(CurrencyServiceConfiguration configuration) {
        this.configuration = configuration;
    }
//    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getConfiguration() {
        return configuration;
    }
}
