package com.example.Tunisaire.Controller;

import java.util.List;

import com.example.Tunisaire.Module.Avocat;
import com.example.Tunisaire.Service.AvocatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "api/avocat")
public class AvocatController {

	@Autowired
    private AvocatService avocatService;
	
	@GetMapping
    public List<Avocat> getAllAvocats() {
        return avocatService.getAllAvocats();
    }

    @GetMapping("/{id}")
    public Avocat getAvocatById(@PathVariable Integer id) {
        return avocatService.getAvocatById(id);
    }

    @PostMapping
    public Avocat createAvocat(@RequestBody Avocat avocat) {
        return avocatService.createAvocat(avocat);
    }

    @DeleteMapping("/{id}")
    public void deleteAvocat(@PathVariable Integer id) {
    	avocatService.deleteAvocat(id);
    }
}
