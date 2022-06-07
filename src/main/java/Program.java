import task2.FileUtils;
import task3.BigFileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Program {

    public static void main (String [] args) throws IOException {

        BigFileUtils.readBigFile("src/main/java/test.log","get", "post", "bitrix","ajax");

    }
}
