package com.grupitoo.ciphers;

import com.grupitoo.ciphers.ciphers.AlphabetSubCipher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlphabetSubCipherTests {
    AlphabetSubCipher testCipher;

    @Test
    void Kui_tahestiku_asenduses_on_mitu_sama_tahte_siis_see_ei_sobi() { //case-sensitive
        this.testCipher = new AlphabetSubCipher("Hello world", "aaa");
        Assertions.assertEquals("Antud tähestiku asendus on sobimatu!", this.testCipher.applyCipher());
    }

    @Test
    void Kui_tahestiku_asenduses_on_mitu_sama_tahte_aga_eri_caseides_siis_see_on_ok() {
        this.testCipher = new AlphabetSubCipher("abcd", "AaBb");
        Assertions.assertEquals("AaBb", this.testCipher.applyCipher());
    }

    @Test
    void Kui_tahestiku_asendus_on_pikem_kui_26_tahte_siis_seda_luhendatakse() {
        this.testCipher = new AlphabetSubCipher("abcd", "abcdefghijklmnopqrstuvwxyz12345");
        Assertions.assertEquals(26, this.testCipher.getAlphabetSubstitute().length());
    }

    @Test
    void Tekst_Amazing_cipher_asendusega_12345_sihver_on_1m1zing_3iph5r() {
        this.testCipher = new AlphabetSubCipher("Amazing cipher", "12345");
        Assertions.assertEquals("1m1zing 3iph5r", this.testCipher.applyCipher());
    }

    @Test
    void Tekst_1M1ZING_3IPH5R_asendusega_12345_desihver_on_aMaZING_cIPHeR() { //desihvreeritud tähed on alati lowercase
        this.testCipher = new AlphabetSubCipher("1M1ZING 3IPH5R", "12345");
        Assertions.assertEquals("aMaZING cIPHeR", this.testCipher.applyDecipher());
    }
}