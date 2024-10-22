package com.example.Tunisaire.Controller;

import java.util.List;

import com.example.Tunisaire.Module.Personnel;
import com.example.Tunisaire.Service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(path = "api/personnel")
public class PersonnelController {
	
	@Autowired
    private PersonnelService personnelService;
	
	@GetMapping
    public List<Personnel> getAllPersonnels() {
        return personnelService.getAllPersonnels();
    }

    @GetMapping("/{id}")
    public Personnel getPersonneltById(@PathVariable Integer id) {
        return personnelService.getPersonneltById(id);
    }

    @PostMapping
    public Personnel createPersonnel(@RequestBody Personnel personnel) {
        return personnelService.createPersonnel(personnel);
    }

    @DeleteMapping("/{id}")
    public void deletePersonnel(@PathVariable Integer id) {
    	personnelService.deletePersonnel(id);
    }

}
