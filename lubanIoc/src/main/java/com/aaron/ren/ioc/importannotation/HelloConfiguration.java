package com.aaron.ren.ioc.importannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HelloImportSelector.class)
@ComponentScan("com.aaron.ren.ioc.importannotation")
public class HelloConfiguration {

}
