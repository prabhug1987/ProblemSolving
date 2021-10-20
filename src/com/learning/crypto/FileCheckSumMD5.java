package com.learning.crypto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileCheckSumMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		// create an instance of message digest with MD5
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		// call checksum method by passing file path and message digest object
		String hex = checksum("F:\\Softwares\\sts-workspace-new\\AuthenticationService\\authentication_service.log",
				messageDigest);
		System.out.println(hex);
	}

	private static String checksum(String filePath, MessageDigest messageDigest)
			throws FileNotFoundException, IOException {
		try (InputStream inputStream = new FileInputStream(filePath)) {
			byte[] buffer = new byte[1024];
			int read;
			while ((read = inputStream.read(buffer)) != -1) {
				messageDigest.update(buffer, 0, read);
			}
		}

		StringBuilder result = new StringBuilder();
		for (byte b : messageDigest.digest())
			result.append(String.format("%02x", b));

		return result.toString();
	}

}
