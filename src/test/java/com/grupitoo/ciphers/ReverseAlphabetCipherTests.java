package com.grupitoo.ciphers;

import com.grupitoo.ciphers.ciphers.ReverseAlphabetCipher;

public class ReverseAlphabetCipherTests {

    public static void main(String[] args){
        ReverseAlphabetCipher test = new ReverseAlphabetCipher("hi there");
        System.out.println(test.ReverseAlphabet("Hi there"));
    }
}
