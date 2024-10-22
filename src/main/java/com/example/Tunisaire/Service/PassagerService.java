package com.example.Tunisaire.Service;

import java.util.List;

import com.example.Tunisaire.Module.Passager;
import com.example.Tunisaire.Repository.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PassagerService {
	
	@Autowired
	private PassagerRepository passagerRepository;
	
	public List<Passager> getAllPassagers() {
        return passagerRepository.findAll();
    }

    public Passager getPassagertById(Integer id) {
        return passagerRepository.findById(id).orElse(null);
    }

    public Passager createPassager(Passager passager) {
        return passagerRepository.save(passager);
    }

    public void deletePassager(Integer id) {
    	passagerRepository.deleteById(id);
    }

}
