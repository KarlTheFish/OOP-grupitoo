package com.grupitoo.ciphers;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode {
    String input;
    String leetSpeak;

    //constructor
    public Leetcode(String input){
        this.input = input;
    }

    public String makeLeet(@NotNull String input){
        input = input.toLowerCase();
        leetSpeak = input;
        List<String>alphabet = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x");
        List<String>leet = Arrays.asList("4","8","<","|)","3","F","&","|-|","1","]","|<","[_","|\\/|","|\\|","0","|'","0,","|?","5","7","|_|","\\/","\\/\\/","><");
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i); //make the input into separate letters
            int code1 = alphabet.indexOf(Character.toString(letter)); //find the letter's position in the alphabet
            leetSpeak = leetSpeak.replace(Character.toString(letter), leet.get(code1));
        }
        return leetSpeak;
    }

}
