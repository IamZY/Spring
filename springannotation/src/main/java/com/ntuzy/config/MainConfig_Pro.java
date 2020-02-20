package com.ntuzy.config;

import com.ntuzy.bean.Person;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author IamZY
 * @create 2020/2/20 20:43
 */
@Configuration
@PropertySource(value = "classpath:/person.properties")
public class MainConfig_Pro {

    @Bean("person")
    public Person person() {
        return new Person();
    }

}
