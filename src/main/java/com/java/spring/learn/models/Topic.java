package com.java.spring.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Topic {

    @Setter
    @Getter
    @Id
    private String id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String description;

}
