package com.hms.repository;

import com.hms.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciliazationRepository extends JpaRepository<Specialization,Long> {
}
