package com.jpa.inquisitor.repository.spell.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "SPELL")
@NoArgsConstructor
public class SpellEntity {

    @Id
    private Integer id;

    private String name;

    private String description;
}
