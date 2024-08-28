package com.tushar.ToDo_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tushar.ToDo_App.model.ToDo;
@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
