package com.grupitoo.ciphers.ciphers;

import java.lang.StringBuilder;

public class AlphabetSubCipher {
    String text;
    String alphabetSubstitute;
    boolean isValid;

    public AlphabetSubCipher(String text, String alphabetSubstitute) {
        this.text = text;
        this.alphabetSubstitute = alphabetSubstitute;
        this.isValid = this.isValidAlphabetSubstitute();
    }

    private int indexInAlphabet(char letter) {
        if((int) letter >= 65 && (int) letter <= 90) {
            return (int) letter - 65;
        } else if((int) letter >= 97 && (int) letter <= 122) {
            return (int) letter - 97;
        }
        return -1; //pole tähestikus, seega seda ei muuda
    }

    public String applyCipher() {
        if(!this.isValid) {
            return "Antud tähestiku asendus on sobimatu!";
        }
        char currentLetter;
        int currentLetterIndex;
        char newLetter;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.text.length(); i++) {
            currentLetter = this.text.charAt(i);
            currentLetterIndex = this.indexInAlphabet(currentLetter);
            newLetter = currentLetter;
            if(currentLetterIndex != -1 && currentLetterIndex <= this.alphabetSubstitute.length()-1) {
                newLetter = this.alphabetSubstitute.charAt(currentLetterIndex);
            }
            result.append(newLetter);
        }
        return result.toString();
    }

    public String getAlphabetSubstitute() {
        return this.alphabetSubstitute;
    }

    public String applyDecipher() {
        if(!this.isValid) {
            return "Antud tähestiku asendus on sobimatu!";
        }
        char currentLetter;
        int newLetterIndex;
        char newLetter;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.text.length(); i++) {
            currentLetter = this.text.charAt(i);
            newLetter = currentLetter;
            if(this.alphabetSubstitute.indexOf(currentLetter) != -1) { //kas asenduses on currentLetter
                newLetterIndex = this.alphabetSubstitute.indexOf(currentLetter) + 97;
                newLetter = (char) newLetterIndex;
            }
            result.append(newLetter);
        }
        return result.toString();
    }

    //alphabetSubstitute ei tohi sisaldada korduvaid tähti
    //see meetod kontrollib seda, lisaks lühendab seda kui rohkem kui 26 tähte
    private boolean isValidAlphabetSubstitute() {
        char currentChar;
        if(this.alphabetSubstitute.length() > 26) {
            this.alphabetSubstitute = this.alphabetSubstitute.substring(0,26);
        }
        for (int i = 0; i < this.alphabetSubstitute.length(); i++) {
            currentChar = this.alphabetSubstitute.charAt(i);
            if(i != this.alphabetSubstitute.indexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }
}
