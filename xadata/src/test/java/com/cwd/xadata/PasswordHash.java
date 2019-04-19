package com.cwd.xadata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordHash {

	@Test
	public void testMD5Hash() {

		String password = "secret";
		String salt = BCrypt.gensalt();	  	 
		System.out.println(BCrypt.hashpw(password, salt));
        assertNotNull( BCrypt.hashpw(password, salt));
	}

}
