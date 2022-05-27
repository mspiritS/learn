package task2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileUtilsTest {

    private static void createFile(String fileName) throws IOException{
        File file = new File(fileName);
        if(file.createNewFile()==false) {
            file.delete();
            file.createNewFile();
        }
    }

    private static void deleteFile(String fileName){
        File file = new File(fileName);
        file.delete();
    }

    @BeforeClass
    public static void createTestFiles() throws IOException {
        createFile("testFile.txt");
        try (FileWriter writer = new FileWriter("testFile.txt")) {
            writer.write("word\nhouse\nwater\nword\n");
            writer.flush();
        }
    }

   @AfterClass
    public static void deleteTestFiles() {
        deleteFile("testFile.txt");
    }
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void checkEntryWord() throws IOException {
        int actual = FileUtils.entryWord("testFile.txt","word");
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void checkAbsentWord() throws IOException {
        int actual = FileUtils.entryWord("testFile.txt","test");
        int expected = 0;
        assertEquals(expected,actual);
    }
}