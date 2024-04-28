package com.cdn.persistance.entity;

import jakarta.persistance.Entity;
import jakarta.persistance.Id;
import lombok.*;

import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@Entity
public class CDN {
    private Long id;
    private String name;
    @CreatedDate private LocalDateTime createdAt;
}
