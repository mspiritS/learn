import task2.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Program {

    public static void main (String [] args) throws IOException {

        System.out.println(FileUtils.entryWord("src/main/java/file.txt","word"));

    }
}
