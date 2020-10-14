package Lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExReadFile {
    public static void main(String[] args) {

        Path pFile = Paths.get("myNewFile.txt");

        try {
            BufferedReader reader = Files.newBufferedReader(pFile, StandardCharsets.UTF_8);

            String msg  =null;
            System.out.println("Text form file: ");
            while ((msg = reader.readLine())!=null){
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
