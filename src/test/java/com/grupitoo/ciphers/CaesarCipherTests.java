package com.grupitoo.ciphers;

import com.grupitoo.ciphers.ciphers.CaesarCipher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CaesarCipherTests {
    CaesarCipher testCipher;

    @Test
    void Hello_world_astmega_7_sihver_on_Olssv_dvysk() {
        this.testCipher = new CaesarCipher("Hello world", 7);
        Assertions.assertEquals("Olssv dvysk", this.testCipher.applyCipher());
    }

    @Test
    void Hello_world_astmega_7_desihver_on_Axeeh_phkew() {
        this.testCipher = new CaesarCipher("Hello world", 7);
        Assertions.assertEquals("Axeeh phkew", this.testCipher.applyDecipher());
    }

    @Test
    void Kalamees_astmega_35_sihver_on_Tjujvnnb() {
        this.testCipher = new CaesarCipher("Kalamees", 35);
        Assertions.assertEquals("Tjujvnnb", this.testCipher.applyCipher());
    }

    @Test
    void Kalamees_astmega_miinus45_desihver_on_Dtetfxxl() {
        this.testCipher = new CaesarCipher("Kalamees", -45);
        Assertions.assertEquals("Dtetfxxl",this.testCipher.applyDecipher());
    }
}