package com.example.serviceselect.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class SessionDataDto {
    private String sessionId;
    private List<Long> selectedServices;
}
