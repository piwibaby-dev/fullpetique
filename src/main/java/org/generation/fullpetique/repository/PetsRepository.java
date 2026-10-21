package org.generation.fullpetique.repository;

import org.generation.fullpetique.models.Pets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PetsRepository extends JpaRepository <Pets, Long> {
    List<Pets> findByUserId_Id(Long userId);
}
