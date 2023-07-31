package com.mygroup.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mygroup.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("�׽�Ʈ �������Դϴ�:[%03d]", i);
            String content = "���빫";
            this.questionService.create(subject, content,null);
        }
    }
}
