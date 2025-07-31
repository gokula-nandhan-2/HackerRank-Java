import java.util.*;
import java.io.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(count +" "+ line);
            count++;
        }
    }
}
