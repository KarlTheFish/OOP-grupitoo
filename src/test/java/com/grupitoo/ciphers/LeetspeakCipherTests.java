package com.grupitoo.ciphers;

//see on minu klasside testimiseks, ära puutu pls ma kustutan hiljem ära -Karl

import com.grupitoo.ciphers.ciphers.LeetcodeCipher;

public class LeetspeakCipherTests {
    public static void main(String[] args){
        LeetcodeCipher hi = new LeetcodeCipher("Hello");
        System.out.println(hi.makeLeet("Get hacked"));
    }
}
