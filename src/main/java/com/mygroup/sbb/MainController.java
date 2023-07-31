package com.mygroup.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "�ȳ��ϼ��� sbb�� ���Ű��� ȯ���մϴ�.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}