package ba.sake.spring.examples.logging.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import ba.sake.spring.examples.logging.domain.model.BlogPost;
import ba.sake.spring.examples.logging.service.BlogService;
import ba.sake.spring.examples.logging.service.ServicePackage;

@Configuration
@ComponentScan(basePackageClasses = ServicePackage.class)
public class MainConfig {

}
