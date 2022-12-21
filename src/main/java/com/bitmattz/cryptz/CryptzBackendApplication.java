package com.bitmattz.cryptz;

import com.bitmattz.cryptz.models.Password;
import com.bitmattz.cryptz.models.PasswordRules;
import com.bitmattz.cryptz.services.CreatePassword;
import org.apache.tomcat.util.digester.Rules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptzBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptzBackendApplication.class, args);
		CreatePassword createPassword = new CreatePassword();
		Password password =  new Password();
		PasswordRules rules = new PasswordRules();
		password.setName("Senha teste");
		rules.setLength(8);
		rules.setHasLowercase(true);
		rules.setHasNumbers(true);
		rules.setHasSymbols(true);
		rules.setHasUppercase(true);
		rules.setHasSimilarCharacters(true);
		password.setRules(rules);
		createPassword.execute(password);
		for(char c: password.getPassword()){
			System.out.printf(String.valueOf(c));
		}



	}

}
