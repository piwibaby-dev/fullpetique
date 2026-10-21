package org.generation.fullpetique.repository;

import org.generation.fullpetique.models.PetsType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PetsTypeRepository extends JpaRepository<PetsType, Long> {
    Optional<PetsType> findByPetType(String petType);
}