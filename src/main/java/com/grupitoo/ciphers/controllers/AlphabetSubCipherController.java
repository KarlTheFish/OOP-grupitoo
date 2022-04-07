package com.grupitoo.ciphers.controllers;

import com.grupitoo.ciphers.ciphers.AlphabetSubCipher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphabetSubCipherController {
    AlphabetSubCipher cipherObject;

    @GetMapping("subcipher/{text}/{sub}/{deciphering}")
    public String getResult(@PathVariable String text, @PathVariable String sub, @PathVariable boolean deciphering) {
        cipherObject = new AlphabetSubCipher(text, sub);
        String newText;
        if(deciphering) {
            newText = cipherObject.applyDecipher();
        } else {
            newText = cipherObject.applyCipher();
        }
        return newText;
    }
}
