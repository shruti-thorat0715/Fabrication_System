package com.example.fabrication_system.repository;

import com.example.fabrication_system.model.Fabrication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricationRepository extends JpaRepository<Fabrication, Long> {
}
