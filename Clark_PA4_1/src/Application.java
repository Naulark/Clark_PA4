import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException
    {
        //Creating a new object of class DuplicateRemover
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        //Reading in problem1 text file as an arugment
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");
    }
}