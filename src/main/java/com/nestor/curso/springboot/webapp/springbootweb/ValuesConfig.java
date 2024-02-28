package com.nestor.curso.springboot.webapp.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
    @PropertySource(value="classpath:values.properties", encoding= "UTF-8"),
    })
@Configuration
public class ValuesConfig {

}
