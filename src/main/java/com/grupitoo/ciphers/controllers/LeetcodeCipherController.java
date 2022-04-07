package com.grupitoo.ciphers.controllers;

import com.grupitoo.ciphers.ciphers.LeetcodeCipher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeetcodeCipherController {
    LeetcodeCipher text;

    @GetMapping("Leetcodecipher/{input}")
    public String cipher(@PathVariable String input){
        text = new LeetcodeCipher(input);
        return text.makeLeet(input);
    }
}
