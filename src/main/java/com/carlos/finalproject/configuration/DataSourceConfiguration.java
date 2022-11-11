package com.carlos.finalproject.configuration;

import javax.activation.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfiguration {

    @Primary
    public DataSource getDataSource(){
        return (DataSource) DataSourceBuilder.create().build();
    }
    
    @Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
