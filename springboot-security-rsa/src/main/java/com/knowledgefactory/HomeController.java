package com.knowledgefactory;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgefactory.util.RSAUtil;
import com.knowledgefactory.util.RSAVO;

@RestController
public class HomeController {

	@GetMapping(value = "/getRsaKeyPair")
	public ResponseEntity<RSAVO> getRsaKeyPair() throws NoSuchAlgorithmException {
		RSAVO vo = new RSAVO();
		RSAUtil keyPairGenerator = new RSAUtil();
		vo.setPrivatekey(Base64.getEncoder().encodeToString(keyPairGenerator.getPrivateKey().getEncoded()));
		vo.setPublicKey(Base64.getEncoder().encodeToString(keyPairGenerator.getPublicKey().getEncoded()));
		return new ResponseEntity<>(vo, HttpStatus.OK);

	}

	@GetMapping(value = "/encrypt")
	public ResponseEntity<RSAVO> encrypt(RSAVO vo) throws Exception {

		String pubkey = vo.getPublicKey().replaceAll("\\s+", "").trim();
		RSAVO voobj = new RSAVO();
		String dec = RSAUtil.encryptMessage(vo.getText(), pubkey);
		voobj.setEncryptedvalue(dec);

		return new ResponseEntity<>(voobj, HttpStatus.OK);

	}
	
	@GetMapping(value = "/dencrypt")
	public ResponseEntity<RSAVO> dencrypt(RSAVO vo) throws Exception {

		String pvtkey = vo.getPrivatekey().replaceAll("\\s+", "").trim();
		RSAVO voobj = new RSAVO();
		String dec = RSAUtil.decryptMessage(vo.getEncryptedvalue(), pvtkey);
		voobj.setText(dec);;

		return new ResponseEntity<>(voobj, HttpStatus.OK);

	}

}
