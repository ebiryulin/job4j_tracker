package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialSymbol = false;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char x = 0;
        for (int i = 0; i < password.length(); i++) {
            x = password.charAt(i);
            if (Character.isUpperCase(x)) {
                upperCase = true;
            }
            if (Character.isLowerCase(x)) {
                lowerCase = true;
            }
            if (Character.isDigit(x)) {
                digit = true;
            }
            int code = password.codePointAt(x);
            if (code == 36 || code == 95) {
                specialSymbol = true;
            }
        }
        if (!upperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!specialSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (password.toLowerCase().contains(password.toLowerCase())) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;
    }
}
