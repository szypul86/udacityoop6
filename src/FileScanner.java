
import java.io.File;
import java.util.Scanner;

public class FileScanner {
    // throws Excepitons added!
    public static void main(String [] args) throws Exception{
        File file = new File("book.txt");
        // (file) instead of System.in to operate on file nit on terminal input
        Scanner scanner = new Scanner(file);
        int words = 0;
        //unless the file has no more lines:
        while(scanner.hasNextLine()) {
            //scan a line and store it in line variabl
            String line = scanner.nextLine();
            // count all parts of the line splitted with " " and add to a words counter
            words += line.split(" ").length;
        }

        System.out.println("the file has " + words + " words.");
    }


}
