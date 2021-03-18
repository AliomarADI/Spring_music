package kz.iitu.spotify.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "kz.iitu.spotify")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "kz.iitu.spotify.repo")//
public class Config {
}
