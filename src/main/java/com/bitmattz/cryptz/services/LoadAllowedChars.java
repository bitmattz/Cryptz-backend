package com.bitmattz.cryptz.services;

import com.bitmattz.cryptz.models.PasswordRules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoadAllowedChars {
    public List<String> execute(PasswordRules rules){
        List<String> allowedChars = new ArrayList<>();
        if(rules.isHasLowercase()){
            // a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
            String lowercase = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
            allowedChars.add(String.valueOf(lowercase.split(",")));
        }
        if(rules.isHasNumbers()){
            // 0,1,2,3,4,5,6,7,8,9
            String numbers = "0,1,2,3,4,5,6,7,8,9";
            allowedChars.add(String.valueOf(numbers.split(",")));
        }
        if(rules.isHasSymbols()){
            // !,@,#,$,%,&,(,)
            String symbols = "!,@,#,$,%,&,(,)";
            allowedChars.add(String.valueOf(symbols.split(",")));
        }
        if(rules.isHasUppercase()){
            // A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
            String uppercase = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
            allowedChars.add(String.valueOf(uppercase.split(",")));
        }
        Collections.shuffle(allowedChars);
        return allowedChars;
    }
}
