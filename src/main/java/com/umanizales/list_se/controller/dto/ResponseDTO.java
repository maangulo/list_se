package com.umanizales.list_se.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;
    private List<ErrorDTO> erros;
}
