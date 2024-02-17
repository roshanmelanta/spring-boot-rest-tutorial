package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@Profile("test")
@PropertySource(value = {"classpath:application-test.properties", "classpath:application.properties"})
public class AppConfigurationTest {

}
