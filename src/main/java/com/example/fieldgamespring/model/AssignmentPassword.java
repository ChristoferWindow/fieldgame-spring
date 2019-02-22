package com.example.fieldgamespring.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "assignments_passwords")
public class AssignmentPassword extends AuditModel{
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Column(columnDefinition = "password")
    private String password;
}
