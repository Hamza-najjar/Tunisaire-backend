package com.example.Tunisaire.Repository;

import com.example.Tunisaire.Module.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer>{

}
