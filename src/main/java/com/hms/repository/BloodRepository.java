package com.hms.repository;

import com.hms.entity.Blood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRepository extends JpaRepository<Blood,Long> {
}
