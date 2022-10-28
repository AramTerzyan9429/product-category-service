package com.example.productcategoryservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductPutRequest {
    private int id;
    private String title;
    private int count;
    private double price;
    @JsonProperty(namespace = "categoryPutRequestDto")
    private CategoryPutRequestDto categoryPutRequestDto;
}
