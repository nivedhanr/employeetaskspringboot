package com.example.employeetaskspingboot.dao;

import com.example.employeetaskspingboot.model.Task;
import com.example.employeetaskspingboot.model.Userregistration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskDao extends CrudRepository<Task,Integer> {
//    @Query(value = "SELECT `id`, `empcode`, `task` FROM `tasks1` WHERE `empcode`=:empcode",nativeQuery = true)
//    List<Task> FindEmployee(@Param("empcode") Integer empcode);

}
