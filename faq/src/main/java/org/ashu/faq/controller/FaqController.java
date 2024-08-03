package org.ashu.faq.controller;

import org.ashu.faq.model.Heading;
import org.ashu.faq.service.FaqService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FaqController {

    private final FaqService service;

    @GetMapping({ "/", "/home" })
    public String home(Model model) {
        String title = "FAQ's";
        String subTitle = "Just The Fact";

        var heading = Heading.builder()
                .title(title)
                .subTitle(subTitle)
                .build();

        model.addAttribute("heading", heading);

        var questions = service.getQuestions();
        model.addAttribute("questions", questions);

        return "home";
    }

}
