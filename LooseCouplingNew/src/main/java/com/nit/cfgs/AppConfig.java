package com.nit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.nit.target")
@ImportResource("com/nit/appcntxt/applicationContext.xml")
public class AppConfig {

}
