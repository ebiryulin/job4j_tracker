package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialSymbol = false;
        boolean passwordContainSubstring = false;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char x;
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
            if (!Character.isLetterOrDigit(x)) {
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
        String[] notValidPassword = {"qwerty", "12345", "password", "admin", "user"};
        password.toLowerCase();
        for (String s : notValidPassword) {
            if (s.contains(password)) {
                passwordContainSubstring = true;
                break;
            }
        }
        if (!passwordContainSubstring) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
