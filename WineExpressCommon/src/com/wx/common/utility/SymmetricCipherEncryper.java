/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.common.utility;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Hao
 */
public class SymmetricCipherEncryper {

    private static final String X_FORM = "AES/ECB/PKCS5Padding";
    private static final int KEY_LENGTH = 128;
    private static final String ENCRYPT_METHOD = "AES";
    public static byte[] encrypt(byte[] inpBytes,
            SecretKey key) throws Exception {
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        aes.init(Cipher.ENCRYPT_MODE, key);
        byte[] ciphertext = aes.doFinal("my cleartext".getBytes());
        return ciphertext;
    }

    public static String decrypt(byte[] inpBytes,
            SecretKey key) throws Exception {
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        aes.init(Cipher.DECRYPT_MODE, key);
        String cleartext = new String(aes.doFinal(inpBytes));
        return cleartext;
    }

    public static SecretKey generateKey(String email) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] salt = "choose a better salt".getBytes();
        int iterations = 10000;
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        SecretKey tmp = factory.generateSecret(new PBEKeySpec(email.toCharArray(), salt, iterations, KEY_LENGTH));
        SecretKeySpec key = new SecretKeySpec(tmp.getEncoded(), ENCRYPT_METHOD);
        return key;
    }

    public static String convertKeyToString(SecretKey secretKey) {
        // CREATE NEW KEY
// GET ENCODED VERSION OF KEY (THIS CAN BE STORED IN A DB)
        String stringKey = null;
  
        return stringKey;
    }

    public static void convertStringToKey(String stringKey) {
        // CREATE NEW KEY
// GET ENCODED VERSION OF KEY (THIS CAN BE STORED IN A DB)

    }
}
