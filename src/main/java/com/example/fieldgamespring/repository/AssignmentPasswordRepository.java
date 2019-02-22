package com.example.fieldgamespring.repository;

import com.example.fieldgamespring.model.AssignmentPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentPasswordRepository extends JpaRepository<AssignmentPassword,Long> {
}
