package de.fnortheim.didemo.config;

import de.fnortheim.didemo.examplebeans.FakeDataSource;
import de.fnortheim.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * created by sebastian on Apr, 2019
 */
@Controller
public class PropertyConfig {

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

        fakeDataSource.setUser(user);
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

}
