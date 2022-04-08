package com.grupitoo.ciphers;

import com.grupitoo.ciphers.ciphers.LeetcodeCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetSpeakCipherTests {
    LeetcodeCipher testCipher = new LeetcodeCipher("");


    @Test
    void Tekst_Iga_Tahte_1() {
        this.testCipher = new LeetcodeCipher(testCipher.makeLeet("My Dog is Lazy"));
        Assertions.assertEquals("|\\/| y |) 0 &  1 5  [_ 4 zy", testCipher.makeLeet("My Dog is Lazy"));
    }

    @Test
    void Tekst_Korduvad_Tahed() {
        this.testCipher = new LeetcodeCipher(testCipher.makeLeet("I like Ice cream"));
        Assertions.assertEquals("1  [_ 1 |< 3  1 < 3  < |? 3 4 |\\/| ", testCipher.makeLeet("I like Ice cream"));
    }
}
