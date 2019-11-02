import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
public class DuplicateCounter {

    Map<String, Integer> wordCounter = new HashMap<>();

    public void count(String dataFile) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
        String textLine = bufferedReader.readLine();

        while(textLine != null) {

            String temporary[] = textLine.split(" ");

            for(int i = 0; i < temporary.length; i++) {

                if (!wordCounter.containsKey(temporary[i])) {

                    wordCounter.put(temporary[i], 1);

                }
                else {

                    int count = wordCounter.get(temporary[i]);
                    wordCounter.put(temporary[i], count + 1);

                }
            }
            textLine = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
    //End of count

    public void write(String outputFile) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(outputFile);

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {

            printWriter.println(entry.getKey()+" -- "+entry.getValue());

        }

        printWriter.close();

    }
    //End of write
}
//End of DuplicateCounter