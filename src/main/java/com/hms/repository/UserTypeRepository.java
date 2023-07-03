package com.hms.repository;

import com.hms.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType,Long> {

    @Transactional
    @Modifying
    @Query("update UserType set userType= ?2 where userTypeId = ?1")
    Integer updateUserTypeById(Long id,String userType);


    @Query("from UserType where active = 1")
    List<UserType> getAllUserType();

   @Transactional
    @Modifying
    @Query("update UserType set active= 0 where userTypeId= ?1")
    void deleteUserTypeById(Long id);
}
