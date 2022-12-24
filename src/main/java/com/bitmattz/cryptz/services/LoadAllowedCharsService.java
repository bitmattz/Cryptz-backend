package com.bitmattz.cryptz.services;

import com.bitmattz.cryptz.models.PasswordRules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;



public class LoadAllowedCharsService {
    public List<String> execute(PasswordRules rules){
        List<String> allowedChars = new ArrayList<>();
        if(rules.isHasLowercase()){
            // a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
            List<String> lowercase = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
            Stream.of(lowercase).forEach(allowedChars::addAll);
        }
        if(rules.isHasNumbers()){
            // 0,1,2,3,4,5,6,7,8,9
            List<String> numbers = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
            Stream.of(numbers).forEach(allowedChars::addAll);
        }
        if(rules.isHasSymbols()){
            // !,@,#,$,%,&,(,)
            List<String> symbols = Arrays.asList("!","@","#","$","&","(",")");
            Stream.of(symbols).forEach(allowedChars::addAll);
        }
        if(rules.isHasUppercase()){
            // A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
            List<String> uppercase = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
            Stream.of(uppercase).forEach(allowedChars::addAll);
        }
        Collections.shuffle(allowedChars);
        return allowedChars;
    }
}
