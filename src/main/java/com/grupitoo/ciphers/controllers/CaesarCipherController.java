package com.grupitoo.ciphers.controllers;

import com.grupitoo.ciphers.ciphers.CaesarCipher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaesarCipherController {
    CaesarCipher cipherObject;

    @GetMapping("caesar/{text}/{step}/{deciphering}")
    public String getResult(@PathVariable String text, @PathVariable int step, @PathVariable boolean deciphering) {
        cipherObject = new CaesarCipher(text, step);
        String newText;
        if(deciphering) {
            newText = cipherObject.applyDecipher();
        } else {
            newText = cipherObject.applyCipher();
        }
        return newText;
    }
}
