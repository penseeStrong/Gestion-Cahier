package com.uasz.demo;

import com.uasz.demo.Model.Cahier.Cahier;
import com.uasz.demo.Repository.Cahier.CahierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GestionDaosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionDaosApplication.class, args);
	}

	@Autowired
	private CahierRepository ueRepository;

	@Override
	public void run(String... args) throws Exception{
		ueRepository.save(new Cahier(null, "info", "INF351", 8, 4,"Bonne",new Date()));
		ueRepository.save(new Cahier(null, "maths", "INF3", 2, 1,"Moyenne",new Date()));
		ueRepository.save(new Cahier(null, "pc", "INF3", 1, 3,"Faible",new Date()));
		ueRepository.save(new Cahier(null, "info", "INF351", 8, 4,"Bonne",new Date()));
		ueRepository.save(new Cahier(null, "maths", "INF3", 2, 1,"Moyenne",new Date()));
		ueRepository.save(new Cahier(null, "pc", "INF3", 1, 3,"Faible",new Date()));
		ueRepository.save(new Cahier(null, "info", "INF351", 8, 4,"Bonne",new Date()));
		ueRepository.save(new Cahier(null, "maths", "INF3", 2, 1,"Moyenne",new Date()));
		ueRepository.save(new Cahier(null, "pc", "INF3", 1, 3,"Faible",new Date()));
		ueRepository.save(new Cahier(null, "info", "INF351", 8, 4,"Bonne",new Date()));
		ueRepository.save(new Cahier(null, "maths", "INF3", 2, 1,"Moyenne",new Date()));
		ueRepository.save(new Cahier(null, "pc", "INF3", 1, 3,"Faible",new Date()));
		ueRepository.save(new Cahier(null, "info", "INF351", 8, 4,"Bonne",new Date()));
		ueRepository.save(new Cahier(null, "maths", "INF3", 2, 1,"Moyenne",new Date()));
		ueRepository.save(new Cahier(null, "pc", "INF3", 1, 3,"Faible",new Date()));
		ueRepository.save(new Cahier(null, "info", "INF351", 8, 4,"Bonne",new Date()));
		ueRepository.save(new Cahier(null, "maths", "INF3", 2, 1,"Moyenne",new Date()));
		ueRepository.save(new Cahier(null, "pc", "INF3", 1, 3,"Faible",new Date()));


	}


}
