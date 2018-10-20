package pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlikIntro {
    public static void main(String[] args) {

        BufferedReader reader = null;
        FileReader fileReader = null;
        try {
            fileReader  = new FileReader ("C:\\Users\\joann\\IdeaProjects\\introduction-to-programming\\src\\plik");
            reader = new BufferedReader(fileReader);
            String line = null;
            // najpierw odczytujemy zawartość linii, jeśli linia była pusta, to będzie zwrócona wartość null
            // w drugiej części sprawdzamy, czy odczytaliśmy coś (wtedy zmienna line będzie różna od null)
            // jeśli line == null to obieg pętli się nie wykona
            while ((line = reader.readLine()) !=null) {
                System.out.println(line);
            }
          reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileReader.close();
            } catch (IOException e) {
              e.printStackTrace();
            }
        }
    }
}
