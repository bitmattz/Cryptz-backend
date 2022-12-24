package com.bitmattz.cryptz;

import com.bitmattz.cryptz.models.Password;
import com.bitmattz.cryptz.models.PasswordRules;
import com.bitmattz.cryptz.services.CreatePasswordService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptzBackendApplication {

	//TODO Criar esquema para salvar as senhas
	//TODO Criar extensão código vr no navegador para toda vez que tiver um campo de senha, poder usar o aplicativo para colar a senha já
	//TODO usar Solr, Keycloak
	public static void main(String[] args) {
		SpringApplication.run(CryptzBackendApplication.class, args);
//		CreatePasswordService createPasswordService = new CreatePasswordService();
//		Password password =  new Password();
//		PasswordRules rules = new PasswordRules();
//		password.setName("Senha teste");
//		rules.setLength(8);
//		rules.setHasLowercase(true);
//		rules.setHasNumbers(true);
//		rules.setHasSymbols(true);
//		rules.setHasUppercase(true);
//		rules.setHasSimilarCharacters(true);
//		password.setRules(rules);
//		createPasswordService.execute(password);
//		for(char c: password.getPassword()){
//			System.out.printf(String.valueOf(c));
//		}

	}

}
