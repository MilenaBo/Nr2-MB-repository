package com.crud.tasks.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="tasks")
public class Task {
    @ID
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String title;

    @Column(name = "description")
    private String content;
}
