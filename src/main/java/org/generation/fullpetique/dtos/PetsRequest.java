package org.generation.fullpetique.dtos;

public record PetsRequest(//@NotBlank
                          Long userId,
                          String petName,
                          String petAge,
                          String petWeight,
                          String petSize,
                          Long petTypeId) {
}
