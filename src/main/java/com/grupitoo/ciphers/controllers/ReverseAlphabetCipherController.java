package com.grupitoo.ciphers.controllers;

import com.grupitoo.ciphers.ciphers.ReverseAlphabetCipher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseAlphabetCipherController {
    ReverseAlphabetCipher text;

    @GetMapping("ReverseAlphabetCipher/{input}")
    public String cipher(@PathVariable String input){
        text = new ReverseAlphabetCipher(input);
        return text.ReverseAlphabet(input);
    }
}
