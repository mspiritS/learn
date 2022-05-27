package task2;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {

    public static int entryWord (String path, String word) throws IOException {
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

    private static ArrayList<String> words (String path) throws IOException {

        ArrayList<String> words = new ArrayList<String>();


        try (FileReader reader = new FileReader(new File(path));
             BufferedReader bReader = new BufferedReader(reader)){
            String line = bReader.readLine();
            while (line != null){
                words.add(line);
                line = bReader.readLine();
            }
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        return words;
    }

}
