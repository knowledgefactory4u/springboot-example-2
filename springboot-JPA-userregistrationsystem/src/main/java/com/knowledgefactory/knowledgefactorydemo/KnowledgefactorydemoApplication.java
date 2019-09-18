package com.knowledgefactory.knowledgefactorydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.knowledgefactory.Repository")
@SpringBootApplication
@ComponentScan({ "com" })
@EntityScan("com.knowledgefactory.Entity")
public class KnowledgefactorydemoApplication {
	//private static final Logger log = LoggerFactory.getLogger(KnowledgefactorydemoApplication.class);

	

	public static void main(String[] args) {
		SpringApplication.run(KnowledgefactorydemoApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");

		repository.save(new User("Knf"));
		repository.save(new User("sibin"));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)");
		repository.findById(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		repository.findByName("sibin").forEach(x -> System.out.println(x));

	}*/

}
