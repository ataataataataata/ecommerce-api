package com.ecommerce.ecommerce_api.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class ProductRequest {
    
    @NotBlank
    private String name;

    private String description;
    
    @NotNull
    @Positive
    private BigDecimal price;
    
    @NotNull
    @PositiveOrZero
    private Integer stockQuantity;
    
    private String category;

}
