package com.mygroup.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message="������ �ʼ��׸��Դϴ�.")
    @Size(max=200)
    private String subject;

    @NotEmpty(message="������ �ʼ��׸��Դϴ�.")
    private String content;
}
