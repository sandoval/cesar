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

    private Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testCaesarCipher() {
        assertEquals("whvw", main.cipher("test"));
    }

    @Test
    public void testDecodeCeasarCipher() {
        assertEquals("test", main.decipher("whvw"));
    }

    @After
    public void tearDown() throws Exception {

    }
}
