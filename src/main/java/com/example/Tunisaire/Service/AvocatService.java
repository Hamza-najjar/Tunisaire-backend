package com.example.Tunisaire.Service;

import java.util.List;

import com.example.Tunisaire.Module.Avocat;
import com.example.Tunisaire.Repository.AvocatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AvocatService {

	@Autowired
	private AvocatRepository avocatRepository;
	
	public List<Avocat> getAllAvocats() {
        return avocatRepository.findAll();
    }

    public Avocat getAvocatById(Integer id) {
        return avocatRepository.findById(id).orElse(null);
    }

    public Avocat createAvocat(Avocat avocat) {
        return avocatRepository.save(avocat);
    }

    public void deleteAvocat(Integer id) {
    	avocatRepository.deleteById(id);
    }
}
