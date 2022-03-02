package hackerRank.days.sixteenth;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try{
            int input = Integer.parseInt(S);
            System.out.println(input);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}

