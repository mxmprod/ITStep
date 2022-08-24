package problems;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

         double sum = 0;
         for(int i = 1; i<= n; i++){
             sum += (double) 1/i;
             System.out.println(sum);
         }


    }
}
