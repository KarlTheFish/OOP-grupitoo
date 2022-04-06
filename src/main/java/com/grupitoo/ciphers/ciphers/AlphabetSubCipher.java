package com.grupitoo.ciphers.ciphers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphabetSubCipher {
    String text;
    String alphabetSubstitute;
    boolean deciphering;

    @GetMapping("alpha/{text}/{sub}/{deciphering}")
    public String getResult(@PathVariable String text, @PathVariable String sub, @PathVariable boolean deciphering) {
        this.text = text;
        this.alphabetSubstitute = sub;
        this.deciphering = deciphering;
        if(isValidAlphabetSubstitute()) {
            return "Asendus ei sobi!";
        }
        return "";
    }

    public boolean isValidAlphabetSubstitute() {
        char currentChar;
        for (int i = 0; i < this.alphabetSubstitute.length(); i++) {
            currentChar = this.alphabetSubstitute.charAt(i);
            if(i != this.alphabetSubstitute.indexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }
}
