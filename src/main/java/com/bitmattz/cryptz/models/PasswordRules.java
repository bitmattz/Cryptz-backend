package com.bitmattz.cryptz.models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PasswordRules {
    private Integer length;
    private boolean hasNumbers;
    private boolean hasUppercase;
    private boolean hasLowercase;
    private boolean hasSymbols;
    private boolean hasSimilarCharacters;
}
