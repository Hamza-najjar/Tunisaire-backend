package com.example.Tunisaire.Service;

import java.util.List;

import com.example.Tunisaire.Module.Contrat;
import com.example.Tunisaire.Repository.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContratService {
	
	@Autowired
	private ContratRepository contratRepository;
	
	public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    public Contrat getContratById(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void deleteContrat(Integer id) {
    	contratRepository.deleteById(id);
    }

}
