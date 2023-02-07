package ru.job4j.tracker.early;

import org.junit.jupiter.api.Test;
import ru.job4j.early.PasswordValidator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordValidatorTest {

    @Test
    void whenPasswordIsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(null)
        );
        String expected = "Password can't be null";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordLengthLess8() {
        String password = "Ln2$mrT";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should be length [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    void whenPasswordLengthMore32() {
        String password = "Ln2$mrTY3245nMdsdfdfPPPg$#dg124531";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should be length [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }
}