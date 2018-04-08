package com.onfacemind.batchimportfiles.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class MultiDataSourceConfig {

    @Bean(name = "writeDataSource")
    @Qualifier("writeDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource writeDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "readDataSource")
    @Qualifier("readDataSource")
    @ConfigurationProperties(prefix = "custom.write")
    public DataSource readDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "writeJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate() {
        return new JdbcTemplate(writeDataSource());
    }
    @Bean(name = "readJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate() {
        return new JdbcTemplate(readDataSource());
    }

}
