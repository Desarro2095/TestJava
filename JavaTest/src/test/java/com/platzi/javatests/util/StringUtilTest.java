package com.platzi.javatests.util;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.junit.Test;

import java.util.IllegalFormatCodePointException;

public class StringUtilTest {
    @Test
    public void TestReapet() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }
}