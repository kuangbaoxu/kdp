package com.bxkj.kdp.common;

import org.springframework.security.crypto.password.PasswordEncoder;

public class SystemPasswordEncoder implements PasswordEncoder {
	
	private static final String DIGEST_ALG = "SHA1";
	
	@Override
    public String encode(CharSequence rawPassword) {
        if (rawPassword == null) {
            return "";
        } else {
            String result = CommonUtils.digest(DIGEST_ALG, rawPassword.toString().getBytes());
            return result;
        }
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equalsIgnoreCase(encodedPassword);
    }
}
