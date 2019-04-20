package de.fnortheim.didemo.config;

import de.fnortheim.didemo.examplebeans.FakeDataSource;
import de.fnortheim.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"}) //datasource.properties should be used
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties"),
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${fnortheim.username}")
    String user;

    @Value("${fnortheim.password}")
    String password;

    @Value("${fnortheim.dburl}")
    String url;

    @Value("${fnortheim.jms.username}")
    String jmsUsername;

    @Value("${fnortheim.jms.password}")
    String jmsPassword;

    @Value("${fnortheim.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();

        fakeDataSource.setUser(env.getProperty("USERNAME")); //Environment Variable USERNAME is used
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();

        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    // This is needed to resolve @Value values as it reads the properties file
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;
    }
}
