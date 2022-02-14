package hackerRank.days.second;

import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        int i=4;
        double d=4.0;
        String s="HackerRank";
        //variable declaration and object creation
        //done in the same line...
        Scanner scan = new Scanner(System.in);

        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();

        String s2 = scan.next()+scan.nextLine();
        // addition and concatination along with
        //printing the output. done in same line
        System.out.println((i+i2)+"\n"+(d+d2)+"\n"+s.concat(s2));

        scan.close();
    }
}
