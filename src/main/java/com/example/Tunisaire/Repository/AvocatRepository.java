package com.example.Tunisaire.Repository;

import com.example.Tunisaire.Module.Avocat;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AvocatRepository extends JpaRepository<Avocat, Integer>{

}
