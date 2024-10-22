package com.example.Tunisaire.Service;

import java.util.List;

import com.example.Tunisaire.Module.Personnel;
import com.example.Tunisaire.Repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonnelService {
	
	@Autowired
	private PersonnelRepository personnelRepository;
	
	public List<Personnel> getAllPersonnels() {
        return personnelRepository.findAll();
    }

    public Personnel getPersonneltById(Integer id) {
        return personnelRepository.findById(id).orElse(null);
    }

    public Personnel createPersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    public void deletePersonnel(Integer id) {
    	personnelRepository.deleteById(id);
    }


}
