package task2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class fileUtilsTest {

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
        createFile("emptyFile.txt");
        createFile("testFile.txt");
        FileWriter writer = new FileWriter("testFile.txt");
        writer.write("word\n");
        writer.write("house\n");
        writer.write("water\n");
        writer.write("word\n");
        writer.flush();
        writer.close();
    }

   @AfterClass
    public static void deleteTestFiles() {
        deleteFile("emptyFile.txt");
        deleteFile("testFile.txt");
    }
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void checkFileEmptyException() throws FileNotFoundException {
        String path = "emptyFile.txt";

        exceptionRule.expect(fileUtilsException.class);
        exceptionRule.expectMessage("File is empty");
        fileUtils.entryWord(path,path);
    }

    @Test
    public void checkEntryWord() throws FileNotFoundException {
        int actual = fileUtils.entryWord("testFile.txt","word");
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void checkAbsentWord() throws FileNotFoundException{
        int actual = fileUtils.entryWord("testFile.txt","test");
        int expected = 0;
        assertEquals(expected,actual);
    }
}