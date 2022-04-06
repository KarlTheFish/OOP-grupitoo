package com.grupitoo.ciphers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CaesarCipherTests {
    CaesarCipher testCipher;

    @Test
    void HelloWorld_astmega_7_on_OlssvDvysk() {
        this.testCipher = new CaesarCipher("HelloWorld", 7);
        String ciphertext = this.testCipher.applyCipher();
        
    }

}
