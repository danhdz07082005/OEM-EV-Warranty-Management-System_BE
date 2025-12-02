package com.mega.warrantymanagementsystem.model.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ServiceCenterRequest {
    @NotEmpty
    private String centerName;

    @NotEmpty
    private String location;
}
