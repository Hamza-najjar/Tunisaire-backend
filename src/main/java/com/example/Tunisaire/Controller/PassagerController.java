package com.example.Tunisaire.Controller;

import java.util.List;

import com.example.Tunisaire.Module.Passager;
import com.example.Tunisaire.Service.PassagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "api/passager")
public class PassagerController {
	
	@Autowired
    private PassagerService passagerService;
	
	@GetMapping
    public List<Passager> getAllPassagers() {
        return passagerService.getAllPassagers();
    }

    @GetMapping("/{id}")
    public Passager getPassagertById(@PathVariable Integer id) {
        return passagerService.getPassagertById(id);
    }

    @PostMapping
    public Passager createPassager(@RequestBody Passager passager) {
        return passagerService.createPassager(passager);
    }

    @DeleteMapping("/{id}")
    public void deletePassager(@PathVariable Integer id) {
    	passagerService.deletePassager(id);
    }

}
