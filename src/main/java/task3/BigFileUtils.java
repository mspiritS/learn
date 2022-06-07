package task3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class BigFileUtils {
    private static int parseString(String str, String ent) {
        String result = str.replaceAll("[()?:!_./,;{}']+", " ");
        String[] words = result.toLowerCase().split(" ");
        int k = 0;
        for (String word : words) {
            if (word.equals(ent.toLowerCase(Locale.ROOT))) {
                k++;
            }
        }
        return k;
    }

    public static Map<String, Integer>  readBigFile(String path, String... words) throws IOException {

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            map.put(word, 0);
        }

        try (FileInputStream inputStream = new FileInputStream(path);
             Scanner sc = new Scanner(inputStream)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (String word:words) {
                    map.put(word, map.get(word)+parseString(line, word));
                }
            }
            return map;
        }

    }
}