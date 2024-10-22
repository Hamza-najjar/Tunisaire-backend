package com.example.Tunisaire.Repository;

import com.example.Tunisaire.Module.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer>{

}
