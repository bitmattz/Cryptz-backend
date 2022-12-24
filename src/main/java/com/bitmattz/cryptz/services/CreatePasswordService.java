package com.bitmattz.cryptz.services;

import com.bitmattz.cryptz.models.PasswordRules;
import com.bitmattz.cryptz.models.Password;

import java.util.List;
import java.util.Random;

public class CreatePasswordService {
    private final LoadAllowedCharsService loadAllowedCharsService = new LoadAllowedCharsService();

    public Password execute(Password password){
        PasswordRules rules = password.getRules();
        Integer length = rules.getLength();
        char[] pwd = new char[length];
        List<String> allowedChars = loadAllowedCharsService.execute(rules);
        for(int i = 0; i < pwd.length; i++){
            if(pwd[i] == '\0'){

                Random randomizer = new Random();
                String randomChar = allowedChars.get(randomizer.nextInt(allowedChars.size()));
                if(rules.isHasSimilarCharacters()){
                    if((pwd).toString().contains(randomChar)){
                        while((pwd).toString().contains(randomChar)) {
                            randomChar = allowedChars.get(new Random().nextInt(allowedChars.size()));
                        }
                        pwd[i] = randomChar.charAt(0);
                    }
                    else{
                        pwd[i] = randomChar.charAt(0);
                    }
                }
                else{
                    pwd[i] = randomChar.charAt(0);
                }
            }
        }
        password.setPassword(pwd);
        return password;
    }
}
