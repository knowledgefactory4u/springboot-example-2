package com.knowledgefactory;

import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowledgefactory.util.AESUtil;
import com.knowledgefactory.util.AesVo;
import com.knowledgefactory.util.MD5;
import com.knowledgefactory.util.MD5VO;
import com.knowledgefactory.util.SHA256;
import com.knowledgefactory.util.SHA256VO;
import com.knowledgefactory.util.SHA512;
import com.knowledgefactory.util.SHA512VO;

@RestController
public class HomeController {

	@GetMapping(value = "/getAesRandomKey")
	public ResponseEntity<AesVo> getAesRandomKey() throws NoSuchAlgorithmException {
		AesVo vo = new AesVo();
		vo.setRandomString(AESUtil.aesKey());

		return new ResponseEntity<>(vo, HttpStatus.OK);

	}

	@GetMapping(value = "/encrypt")
	public ResponseEntity<AesVo> aesencrypt(AesVo vo) {
		AesVo voobj = new AesVo();
		voobj.setEncryptedString(AESUtil.encrypt(vo.getSecret(), vo.getRandomString()));

		return new ResponseEntity<>(voobj, HttpStatus.OK);
	}

	@GetMapping(value = "/decrypt")
	public ResponseEntity<AesVo> aesdecrypt(AesVo vo) {
		AesVo voobj = new AesVo();
		voobj.setDecryptedString(AESUtil.decrypt(vo.getEncryptedString(), vo.getRandomString()));

		return new ResponseEntity<>(voobj, HttpStatus.OK);

	}

	@GetMapping(value = "/md5crypt")
	public ResponseEntity<MD5VO> md5crypt(MD5VO vo) {

		String crypted = MD5.getMd5(vo.getSecret());
		MD5VO voobj = new MD5VO();
		voobj.setEncrypted(crypted);

		return new ResponseEntity<>(voobj, HttpStatus.OK);

	}

	@GetMapping(value = "/sha256crypt")
	public ResponseEntity<SHA256VO> sha256crypt(SHA256VO vo) throws NoSuchAlgorithmException {
		SHA256VO voobj = new SHA256VO();

		voobj.setEncrypted(SHA256.toHexString(SHA256.getSHA(vo.getSecret())));

		return new ResponseEntity<>(voobj, HttpStatus.OK);

	}

	@GetMapping(value = "/sha512crypt")
	public ResponseEntity<SHA512VO> sha512crypt(SHA512VO vo) throws NoSuchAlgorithmException {
		SHA512VO voobj = new SHA512VO();
		
		voobj.setEncrypted(SHA512.encryptThisString(vo.getSecret()));

		// voobj.setEncrypted(SHA256.toHexString(SHA256.getSHA(vo.getSecret())));

		return new ResponseEntity<>(voobj, HttpStatus.OK);

	}
}
