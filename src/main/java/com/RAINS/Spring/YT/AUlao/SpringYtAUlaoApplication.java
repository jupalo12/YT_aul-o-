package com.RAINS.Spring.YT.AUlao;

import com.RAINS.Spring.YT.AUlao.entities.Category;
import com.RAINS.Spring.YT.AUlao.entities.Product;
import com.RAINS.Spring.YT.AUlao.repositories.CategoryRepository;
import com.RAINS.Spring.YT.AUlao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class SpringYtAUlaoApplication implements CommandLineRunner  {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringYtAUlaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Obras Primas");
		Category cat2 = new Category(2L, "+ ou -");

		Product p1 = new Product(1L,"Kaifuku",20.00,cat1);
		Product p2 = new Product(2L,"Boku No Piko",24.00,cat1);
		Product p3 = new Product(3L,"Attack on Titan",13.00,cat2);
		Product p4 = new Product(4L,"Demon Slayer",10.00,cat2);

		cat1.getProducts().addAll(Arrays.asList(p1,p2));
		cat2.getProducts().addAll(Arrays.asList(p3,p4));

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);

}	}

