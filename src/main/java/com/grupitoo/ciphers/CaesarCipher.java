package com.grupitoo.ciphers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.lang.StringBuilder;

@RestController
public class CaesarCipher {
    String text;
    int step;

    public CaesarCipher(String text, int step) {
        this.text = text;
        this.step = step;
    }

    @GetMapping("caesar/{text}/{step}/{deciphering}")
    public String getResult(@PathVariable String text, @PathVariable int step, @PathVariable boolean deciphering) {
        new CaesarCipher(text, step);
        String newText;
        if(deciphering) {
            newText = applyDecipher();
        } else {
            newText = applyCipher();
        }
        return newText;
    }

    private int getAsciiValue(char letter) {
        return letter;
    }

    private char asciiToChar(int asciiValue) {
        return (char)(asciiValue);
    }

    private int fixOutOfBounds(int asciiValue, boolean isUppercase) {
        if(isUppercase) {
            if(asciiValue > 90) {
                return asciiValue - 26;
            } else if(asciiValue < 65) {
                return asciiValue + 26;
            }
        } else {
            if(asciiValue > 122) {
                return asciiValue - 26;
            } else if(asciiValue < 97) {
                return asciiValue + 26;
            }
        }
        return asciiValue;
    }

    public String applyCipher() {
        char currentLetter;
        int currentAscii;
        int cipheredAscii;
        char cipheredLetter;
        StringBuilder cipheredText = new StringBuilder();
        for (int i = 0; i < this.text.length(); i++) {
            currentLetter = text.charAt(i);
            if(!Character.isAlphabetic(currentLetter)) {
                cipheredText.append(currentLetter);
                continue;
            }
            currentAscii = getAsciiValue(currentLetter);
            cipheredAscii = currentAscii + this.step;
            cipheredAscii = fixOutOfBounds(cipheredAscii, Character.isUpperCase(currentLetter));

            cipheredLetter = asciiToChar(cipheredAscii);
            cipheredText.append(cipheredLetter);
        }
        return cipheredText.toString();
    }

    public String applyDecipher() {
        int decipherNum = Math.negateExact(this.step);
        String decipheredText;
        this.step = decipherNum;
        decipheredText = this.applyCipher();
        this.step = Math.abs(this.step);
        return decipheredText;
    }
}