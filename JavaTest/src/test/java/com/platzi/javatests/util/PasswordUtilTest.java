package com.platzi.javatests.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import  static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_eigth_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public  void weak_when_only_has_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("ABCDER"));
    }

    @Test
    public  void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("ABCDE1231"));
    }

    @Test
    public  void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abdca456156!!!///"));
    }
}