package com.example.Tunisaire.Service;

import java.util.List;

import com.example.Tunisaire.Module.Fournisseur;
import com.example.Tunisaire.Repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FournisseurService {

	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    public Fournisseur getFournisseurById(Integer id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    public Fournisseur createFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    public void deleteFournisseur(Integer id) {
    	fournisseurRepository.deleteById(id);
    }
}
