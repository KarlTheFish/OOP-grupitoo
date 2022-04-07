package com.grupitoo.ciphers.ciphers;

import java.util.Arrays;
import java.util.List;

public class ReverseAlphabetCipher {
    String input;
    String newText;

    //constructor
    public ReverseAlphabetCipher(String input){
        this.input = input;
    }

    public String ReverseAlphabet(String input){
        input = input.toLowerCase();
        newText = input;
        List<String> alphabet = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i); //take one letter from the input
            int code1 = alphabet.indexOf(Character.toString(letter)); //find the letter's position in the alphabet
            if(code1 != -1){
                newText = newText.replace(Character.toString(letter), alphabet.get(26 - (code1 + 1)));
            }
        }
        return newText;
    }
}
