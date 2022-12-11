package com.example.employeetaskspingboot.dao;

import com.example.employeetaskspingboot.model.Task;
import com.example.employeetaskspingboot.model.Userregistration;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserregistrationDao extends CrudRepository<Userregistration,Integer> {
    @Modifying
    @Transactional
    @Query(value = "SELECT `id`, `address`, `confirmpass`, `department`, `email`, `empcode`, `name`, `password`, `phn` FROM `employee` WHERE `empcode`=:empcode AND `password`=:password",nativeQuery = true)
    List<Userregistration> userLogin(@Param("empcode") Integer empcode , @Param("password") String password);

    @Query(value = "SELECT `id`, `address`, `confirmpass`, `department`, `email`, `empcode`, `name`, `password`, `phn` FROM `employee` WHERE `empcode`=:empcode",nativeQuery = true)
    List<Userregistration> FindEmployee(@Param("empcode") Integer empcode);

}
