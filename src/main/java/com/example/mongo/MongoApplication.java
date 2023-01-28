package com.example.mongo;

import com.example.mongo.entity.User;
import com.example.mongo.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Random;

@SpringBootApplication
@EnableMongoRepositories
public class MongoApplication {


	@Autowired
	ItemRepository itemRepository;


	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);

	}

	@Bean
	String save(){

		User user= new User();
		user.setUserId(""+ System.currentTimeMillis());
		user.setName("Anshul");
		itemRepository.save(user );
return "Done";
	}

}
