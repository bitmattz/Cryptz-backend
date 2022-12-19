package com.bitmattz.cryptz.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordRules {
    private Integer length;
    private boolean hasNumbers;
    private boolean hasUppercase;
    private boolean hasLowercase;
    private boolean hasSymbols;
    private boolean hasSimilarCharacters;
}
