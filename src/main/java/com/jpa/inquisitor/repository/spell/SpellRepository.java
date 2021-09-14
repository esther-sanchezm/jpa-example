package com.jpa.inquisitor.repository.spell;

import com.jpa.inquisitor.repository.spell.entity.SpellEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<SpellEntity, Integer> {

}
