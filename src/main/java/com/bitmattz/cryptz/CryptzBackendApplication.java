package com.bitmattz.cryptz;

import com.bitmattz.cryptz.models.Password;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptzBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptzBackendApplication.class, args);
		Password password =  new Password();
		char pwd[] = "teste".toCharArray();
		password.setPassword(pwd);
		System.out.printf(password.getPassword().toString());
		for(char i: pwd){
			System.out.printf(String.valueOf(i));
		}

	}

}
