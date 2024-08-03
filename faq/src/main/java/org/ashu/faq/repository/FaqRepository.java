package org.ashu.faq.repository;

import org.ashu.faq.model.Faq;
import org.springframework.stereotype.Repository;

@Repository
public class FaqRepository {
    public Faq getQuestion1() {
        var faq = new Faq();
        faq.setQuestion("What is Spring Boot?");
        faq.setAnswer(
                "Spring Boot is an extension of the Spring framework that simplifies the setup and development of new Spring applications.");
        return faq;
    }

    public Faq getQuestion2() {
        var faq = new Faq();
        faq.setQuestion("What is Thymeleaf?");
        faq.setAnswer(
                "Thymeleaf is a modern server-side Java template engine for web and standalone environments capable of processing HTML, XML, JavaScript, CSS, and even plain text.");
        return faq;
    }

    public Faq getQuestion3() {
        var faq = new Faq();
        faq.setQuestion("How do you integrate Thymeleaf with Spring Boot?");
        faq.setAnswer(
                "Thymeleaf is integrated with Spring Boot by including the Thymeleaf starter dependency in the pom.xml or build.gradle file, which configures Thymeleaf automatically.");
        return faq;
    }

    public Faq getQuestion4() {
        var faq = new Faq();
        faq.setQuestion("What are Thymeleaf fragments?");
        faq.setAnswer(
                "Thymeleaf fragments are reusable pieces of templates that can be included in other templates, helping to keep the code DRY (Don't Repeat Yourself).");
        return faq;
    }

    public Faq getQuestion5() {
        var faq = new Faq();
        faq.setQuestion("What is Spring Boot DevTools?");
        faq.setAnswer(
                "Spring Boot DevTools is a set of tools that can help improve the development experience, such as automatic restarts, live reload, and configurations for better debugging.");
        return faq;
    }

    public Faq getQuestion6() {
        var faq = new Faq();
        faq.setQuestion("How do you configure a Spring Boot application to connect to a MySQL database?");
        faq.setAnswer(
                "To configure a Spring Boot application to connect to a MySQL database, you need to add the MySQL dependency in your `pom.xml` or `build.gradle` file, and then configure the datasource properties in the `application.properties` or `application.yml` file.");
        return faq;
    }
}
