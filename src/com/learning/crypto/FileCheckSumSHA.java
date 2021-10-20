package com.learning.crypto;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileCheckSumSHA {

	public static void main(String args[]) throws NoSuchAlgorithmException, IOException{
		//MessageDigest md = MessageDigest.getInstance("SHA");
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		//MessageDigest md = MessageDigest.getInstance("SHA-512");
		String hex = checksum("F:\\Softwares\\sts-workspace-new\\AuthenticationService\\authentication_service.log", md);
		System.out.println(hex);
	}

	private static String checksum(String filePath, MessageDigest md) throws IOException {
		try(DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(filePath), md)) {
			while(digestInputStream.read() != -1) {
				md= digestInputStream.getMessageDigest();
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(byte b : md.digest()) {
			result.append(String.format("%02x", b));
		}
		
		return result.toString();
	}

}
