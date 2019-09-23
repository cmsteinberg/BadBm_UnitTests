package edu.touro.mco152.bm;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import javax.swing.filechooser.FileSystemView;

import static org.junit.jupiter.api.Assertions.*;

public class UtilTest{

    public UtilTest(){

    }

    Util u = new Util();

    /**
     * Satisfies right of right bicep,
     * and reasonable range of correct (can't be bigger than int max)
     */
    @Test
    public void testRandIntRange(){
        int min = 0;
        int max = 1000;

        int rand = u.randInt(min, max);
        assertTrue(rand >= min);
        assertTrue(rand <= max);
        assertTrue(rand <= Integer.MAX_VALUE);
    }

    /**
     * error forced condition
     * method should throw an exception if you pass in null file
     * ALso maybe a boundary condition for existence
     */

    @Test
    public void testDeleteNullDirectory() {
        File f = null;
        u.deleteDirectory(f);
        assertThrows(NullPointerException.class, ()-> {u.deleteDirectory(f);});
    }

    /**
     *
     */
    @Test
    public void testDeleteFakeDirectory() {
        File f = new File("sldfkfalkajjqewoiinfoiaoiejfgrrgkngr");
        boolean result = u.deleteDirectory(f);
        assertFalse(result);
    }
}