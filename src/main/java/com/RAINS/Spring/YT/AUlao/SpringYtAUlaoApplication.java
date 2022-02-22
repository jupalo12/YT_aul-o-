package com.RAINS.Spring.YT.AUlao;

import com.RAINS.Spring.YT.AUlao.entities.Category;
import com.RAINS.Spring.YT.AUlao.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringYtAUlaoApplication implements CommandLineRunner  {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringYtAUlaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Hentais");
		Category cat2 = new Category(2L, "Livros");

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}
}
