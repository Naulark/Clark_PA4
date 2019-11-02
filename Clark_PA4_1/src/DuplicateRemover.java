import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class DuplicateRemover {

    ArrayList<String> uniqueWords = new ArrayList();

    public void remove(String dataFile) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(dataFile));
        String line = bReader.readLine();
        while (line != null) {
            String tempVal[] = line.split(" ");
            for (int i = 0; i<tempVal.length; i++){
                if (!uniqueWords.contains(tempVal[i])) {
                    uniqueWords.add(tempVal[i]);
                }
            }
            line = bReader.readLine();
        }
        bReader.close();
    }

    public void write(String outputFile) throws FileNotFoundException {
        PrintWriter pWriter = new PrintWriter(outputFile);
        //Using for-each loop
        for (String i : uniqueWords) {
            pWriter.println(i);
        }
        pWriter.close();
    }
}