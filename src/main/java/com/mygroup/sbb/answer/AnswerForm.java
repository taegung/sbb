package com.mygroup.sbb.answer;

import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
    @NotEmpty(message = "������ �ʼ��׸��Դϴ�.")
    private String content;
}
