package com.bitmattz.cryptz.services;

import com.bitmattz.cryptz.models.PasswordRules;
import com.bitmattz.cryptz.models.Password;

import java.util.List;
import java.util.Random;

public class CreatePassword {
    private final LoadAllowedChars loadAllowedChars = new LoadAllowedChars();

    public Password execute(Password password){
        PasswordRules rules = password.getRules();
        Integer length = rules.getLength();
        char[] pwd = new char[length];
        List<String> allowedChars = loadAllowedChars.execute(rules);

        for (char i : pwd){
            System.out.println(pwd[i]);
            if(i == '\0'){
                pwd[i] = '1';
                Random randomizer = new Random();
                String randomChar = allowedChars.get(randomizer.nextInt(allowedChars.size()));
                if(rules.isHasSimilarCharacters()){

                }
            }
            System.out.println(pwd[i]);
        }

        return new Password();
    }
}
