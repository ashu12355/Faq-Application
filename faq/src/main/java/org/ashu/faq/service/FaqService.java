package org.ashu.faq.service;

import java.util.List;

import org.ashu.faq.model.Faq;
import org.ashu.faq.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Scope("prototype")
public class FaqService {

    private FaqRepository repository;

    public FaqService(FaqRepository repository) {
        System.out.println("object constructed");
        this.repository = repository;
        System.out.println("Dependency injected");
    }

    @PostConstruct
    void init() {
        System.out.println("init method called");
    }

    @PreDestroy
    void destroy() {
        System.out.println("Destroy called");
    }

    @Value("${prefix}")
    private String prefix;

    public List<Faq> getQuestions() {
        return getMultipleQuestions()
                .stream().map(faq -> {
                    var answer = faq.getAnswer();
                    faq.setAnswer(prefix + answer);
                    return faq;
                }).toList();

    }

    public List<Faq> getMultipleQuestions() {
        return List.of(repository.getQuestion1(),
                repository.getQuestion2(),
                repository.getQuestion3(),
                repository.getQuestion4(),
                repository.getQuestion5(),
                repository.getQuestion6());
    }

}
