package com.example.Tunisaire.Repository;

import com.example.Tunisaire.Module.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer>{

}
