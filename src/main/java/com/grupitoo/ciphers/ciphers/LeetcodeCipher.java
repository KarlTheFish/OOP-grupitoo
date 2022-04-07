package com.grupitoo.ciphers.ciphers;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class LeetcodeCipher {
    String input;
    String leetSpeak;

    //constructor
    public LeetcodeCipher(String input){
        this.input = input;
    }

    public String makeLeet(@NotNull String input){
        input = input.toLowerCase();
        leetSpeak = input;
        List<String>alphabet = Arrays.asList("a","b","c","d","e","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x");
        List<String>leet = Arrays.asList("4 ","8 ","< ","|) ","3 ","& ","|-| ","1 ","] ","|< ","[_ ","|\\/| ","|\\| ","0 ","|' ","0, ","|? ","5 ","7 ","|_| ","\\/ ","\\/\\/ ",">< ");
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i); //take one letter from the input
            int code1 = alphabet.indexOf(Character.toString(letter)); //find the letter's position in the alphabet
            if(code1 != -1){
                leetSpeak = leetSpeak.replace(Character.toString(letter), leet.get(code1));
            }
        }
        return leetSpeak;
    }

}
