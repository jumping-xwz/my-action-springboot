package com.wjpdev.springboot.springbootindev;

import com.wjpdev.springboot.springbootindev.config.BookSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootindevApplication {

	@Autowired
	private BookSettings bookSettings;

	@RequestMapping("/")
	String index(){
		return "book name is: " + bookSettings.getName() + ", and book author is: " + bookSettings.getAuthor();
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootindevApplication.class);
		app.run(args);
	}
}
