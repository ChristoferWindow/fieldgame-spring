package com.example.fieldgamespring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "assginments")
public class Assignment extends AuditModel{
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String title;

    @Column(columnDefinition = "description")
    private String description;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "password", table = "assignments_passwords")
    @Column(columnDefinition = "assignment_password")
    @JsonIgnore
    private AssignmentPassword assignmentsPassword;
}
