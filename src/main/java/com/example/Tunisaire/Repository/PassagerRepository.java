package com.example.Tunisaire.Repository;

import com.example.Tunisaire.Module.Passager;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Integer>{

}
