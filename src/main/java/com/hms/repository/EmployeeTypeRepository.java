package com.hms.repository;

import com.hms.entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Long> {

    @Query("from EmployeeType where active = 1")
    List<EmployeeType> getAllEmplyeeType();

    @Transactional
    @Modifying
    @Query("update EmployeeType set employeeType = ?2 where employeeTypeId=?1")
    Long updateEmployeeTypeById(Long id, String employeeType);

    @Transactional
    @Modifying
    @Query("update EmployeeType set active=0 where employeeTypeId = ?1")
    Long deleteEmployeeTypeById(Long id);


}
