package com.jpa.inquisitor.repository.character;

import com.jpa.inquisitor.repository.character.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {
}
