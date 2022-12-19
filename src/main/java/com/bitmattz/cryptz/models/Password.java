package com.bitmattz.cryptz.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Password {

    private String name;
    private char[] password;
    private PasswordRules rules;


}
