package com.bitmattz.cryptz.models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Password {

    private String name;
    private char[] password;
    private PasswordRules rules;


}
