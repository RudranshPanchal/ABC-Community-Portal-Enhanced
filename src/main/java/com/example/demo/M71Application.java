/*package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M71Application {

	public static void main(String[] args) {
		SpringApplication.run(M71Application.class, args);
	}

}*/

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class M71Application {

	public static void main(String[] args) {
		SpringApplication.run(M71Application.class, args);
	}

}
