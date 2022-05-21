package task2;

import java.io.*;
import java.util.ArrayList;

public class fileUtils {

    public static int entryWord (String path, String word) throws FileNotFoundException {
         ArrayList<String> result = new ArrayList<String>();
         result = words(path);
         int i = 0;
         for(String results:result){
             if(results.equals(word)){
                 i++;
             }
         }
         return i;
    }

    private static ArrayList<String> words (String path) throws FileNotFoundException {

        checkFile(path);

        ArrayList<String> words = new ArrayList<String>();
        try {
            FileReader reader = new FileReader(new File(path));
            BufferedReader bReader = new BufferedReader(reader);
            String line = bReader.readLine();

            while (line != null){
                words.add(line);
                line = bReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }
    private static void checkFile(String path) throws FileNotFoundException {
        File file = new File(path);

        if (file.length()==0){
            throw new fileUtilsException("File is empty");
        }

    }
}
