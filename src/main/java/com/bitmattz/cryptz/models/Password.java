package com.bitmattz.cryptz.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Password {

    private String name;
    private char[] password;
    private Integer length;
    private boolean hasNumbers;
    private boolean hasUppercase;
    private boolean hasLowercase;
    private boolean hasSymbols;
    private boolean hasCharacters;


}
