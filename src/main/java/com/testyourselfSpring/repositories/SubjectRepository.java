package com.testyourselfSpring.repositories;

import com.testyourselfSpring.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
