package br.unb.cbsoft2013.cesar.tests;

import br.unb.cbsoft2013.cesar.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Copyright (C) 2013 Loop EC - All Rights Reserved
 * Created by sandoval for cesar
 */
public class MainTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCaesarCipher() {
        Main main = new Main();
        assertEquals("whvw", main.cipher("test"));
    }

    @After
    public void tearDown() throws Exception {

    }
}
