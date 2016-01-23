package com.example.comment.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by HSH on 2016. 1. 14..
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.comment.domain"})
@EnableJpaRepositories(basePackages = {"com.example.comment.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
