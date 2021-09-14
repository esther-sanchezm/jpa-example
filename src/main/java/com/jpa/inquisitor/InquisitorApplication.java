package com.jpa.inquisitor;

import com.jpa.inquisitor.repository.race.entity.RaceEntity;
import com.jpa.inquisitor.repository.race.RaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.jpa.inquisitor.repository.*.entity"})
@EnableJpaRepositories(basePackages = {"com.jpa.inquisitor.repository.*"} )
public class InquisitorApplication {

	public static void main(String[] args) {

		SpringApplication.run(InquisitorApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialDatabase(RaceRepository raceRepository) {
		return (args) -> {
			raceRepository.save(new RaceEntity(0, "Human", "Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds."));
			raceRepository.save(new RaceEntity(1, "Elf", "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it."));
			raceRepository.save(new RaceEntity(2, "Dwarf", "Dwarves are solid and enduring like the mountains they love, weathering the passage of centuries with stoic endurance and little change"));
			raceRepository.save(new RaceEntity(3, "Tiefling", ""));
			raceRepository.save(new RaceEntity(4, "Lizardfolk", ""));
		};
	}

}
