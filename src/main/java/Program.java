import task2.fileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Program {

    public static void main (String [] args) throws FileNotFoundException {

        System.out.println(fileUtils.entryWord("src/main/java/file.txt","word"));

    }
}
