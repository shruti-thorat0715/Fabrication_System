package com.example.fabrication_system.controller;
import com.example.fabrication_system.repository.FabricationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.fabrication_system.model.Fabrication;

import java.util.List;

@RestController
@RequestMapping("/api/fabrications")
@CrossOrigin(origins = "*")
public class FabricationController {

    @Autowired
    private FabricationRepository repo;

    @GetMapping
    public List<Fabrication> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Fabrication create(@RequestBody Fabrication fab) {
        return repo.save(fab);
    }

    @PutMapping("/{id}")
    public Fabrication update(@PathVariable Long id, @RequestBody Fabrication updatedFab) {
    	Fabrication fab = repo.findById(id).orElseThrow(() -> new RuntimeException("Fabrication not found with id: " + id));
    	fab.setCustomerName(updatedFab.getCustomerName());
    	fab.setItemName(updatedFab.getItemName());        
        fab.setQuantity(updatedFab.getQuantity());
        return repo.save(fab);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
