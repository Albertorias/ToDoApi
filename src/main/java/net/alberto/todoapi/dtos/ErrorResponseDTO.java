package net.alberto.todoapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.alberto.todoapi.enums.InternalErrorCode;

import java.util.List;

@AllArgsConstructor
@Data
public class ErrorResponseDTO {
    private InternalErrorCode code;
    private String message;
    private List<String> details;
}