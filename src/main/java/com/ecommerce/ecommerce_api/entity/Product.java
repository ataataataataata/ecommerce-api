package com.ecommerce.ecommerce_api.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;


    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @PrePersist
    private void onCreate(){
        this.createdAt=LocalDateTime.now();
        this.updatedAt=LocalDateTime.now();
    }

    @PreUpdate
    private void onUpdate(){
        this.updatedAt=LocalDateTime.now();
    }


}
