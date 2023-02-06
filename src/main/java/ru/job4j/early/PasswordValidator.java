package ru.job4j.early;

import java.util.Objects;

public class PasswordValidator {

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if (!Character.isUpperCase(x)) {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
            if (Character.isLowerCase(x)) {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
            if (Character.isDigit(x)) {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
            int code = password.codePointAt(x);
            if (code != 36 || code != 95) {
                throw new IllegalArgumentException("Password should contain at least one special symbol");
            }
            if (!Objects.equals(password, password.toLowerCase())) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
