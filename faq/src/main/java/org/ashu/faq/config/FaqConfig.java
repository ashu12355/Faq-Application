package org.ashu.faq.config;

import org.ashu.faq.repository.FaqRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FaqConfig {
    @Bean
    FaqRepository faqRepository() {
        return new FaqRepository();
    }
}
