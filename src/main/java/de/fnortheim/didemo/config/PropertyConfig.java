package de.fnortheim.didemo.config;

import de.fnortheim.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
@PropertySource("classpath:datasource.properties") //datasource.properties should be used
public class PropertyConfig {

    @Value("${fnortheim.username}")
    String user;

    @Value("${fnortheim.password}")
    String password;

    @Value("${fnortheim.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();

        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    // This is needed to resolve @Value values as it reads the properties file
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;
    }
}
