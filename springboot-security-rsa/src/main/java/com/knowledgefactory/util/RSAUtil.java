package com.knowledgefactory.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAUtil {

	public PrivateKey privateKey;
	public PublicKey publicKey;

	public RSAUtil() throws NoSuchAlgorithmException {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);
		KeyPair pair = keyGen.generateKeyPair();
		this.privateKey = pair.getPrivate();
		this.publicKey = pair.getPublic();
	}

	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public PublicKey getPublicKey() {
		return publicKey;
	}

	public static Key loadPublicKey(String stored) throws GeneralSecurityException, IOException {
		byte[] data = Base64.getDecoder().decode((stored.getBytes()));
		X509EncodedKeySpec spec = new X509EncodedKeySpec(data);
		KeyFactory fact = KeyFactory.getInstance("RSA");
		return fact.generatePublic(spec);

	}

	// Encrypt using publickey
	public static String encryptMessage(String plainText, String publickey) throws Exception {
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, loadPublicKey(publickey));
		return Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes()));
	}

	// Decrypt using privatekey
	public static String decryptMessage(String encryptedText, String privatekey) throws Exception {
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.DECRYPT_MODE, loadPrivateKey(privatekey));
		return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText)));
	}

	public static PrivateKey loadPrivateKey(String key64) throws GeneralSecurityException {
		byte[] clear = Base64.getDecoder().decode((key64.getBytes()));
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(clear);
		KeyFactory fact = KeyFactory.getInstance("RSA");
		PrivateKey priv = fact.generatePrivate(keySpec);
		Arrays.fill(clear, (byte) 0);
		return priv;
	}

	
}