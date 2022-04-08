package com.grupitoo.ciphers;

import com.grupitoo.ciphers.ciphers.LeetcodeCipher;
import com.grupitoo.ciphers.ciphers.ReverseAlphabetCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReverseAlphabetCipherTests {
    ReverseAlphabetCipher testCipher = new ReverseAlphabetCipher("");


    @Test
    void Tekst_Iga_Tahte_1(){
        this.testCipher = new ReverseAlphabetCipher(testCipher.ReverseAlphabet("My Dog is Lazy"));
        Assertions.assertEquals("nb wlt rh ozab", testCipher.ReverseAlphabet("My Dog is Lazy"));
    }

    @Test
    void Tekst_Korduvad_Tahed() {
        this.testCipher = new ReverseAlphabetCipher(testCipher.ReverseAlphabet("I like Ice Cream"));
        Assertions.assertEquals("r orpv rxv xivzn", testCipher.ReverseAlphabet("I like Ice Cream"));
    }
}
