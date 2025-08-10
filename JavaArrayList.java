import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        int n = scanner.nextInt();
        int d;
        for(int i=0; i<n; i++){
            d = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < d; j++){
                int number = scanner.nextInt();
                row.add(number);
            }
            rows.add(row);
        }

        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try{
                System.out.println(rows.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
