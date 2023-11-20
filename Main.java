import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import java.nio.file.Path;

import java.util.List;

public class Main {
    
    public static void main(String args[])
        throws IOException {
    Path path = Paths.get("br-utf8.txt");
    List<String> lista = Files.readAllLines(path);
    for(var linha: lista){
        System.out.println(linha);
    }
    }
}