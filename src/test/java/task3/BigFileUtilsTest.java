package task3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import task2.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BigFileUtilsTest {

    private static void createFile(String fileName) throws IOException {
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
            writer.write("word Word.waTer'worD wOrd_WoRd\nword Word.wAter/worD wOrd:WoRd\n");
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
    public void checkEntryWords() throws IOException {
        Map<String, Integer> actual = new HashMap<String, Integer>();
        actual = BigFileUtils.readBigFile("testFile.txt","word", "water");
        String expected = "{word=10, water=2}";
        assertEquals(expected,actual.toString());
    }


}
