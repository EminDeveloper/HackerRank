package hackerRank.days.twentyeight;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), k = 0;
        String[] names = new String[N];
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);

        for (int i = 0; i < N; i++) {
            String firstName = in.next();
            String emailId = in.next();

            Matcher m = p.matcher(emailId);
            if (m.find()) {
                //System.out.println(firstName);
                names[k++] = firstName;
            }
        }
        String[] names2 = new String[k];
        System.arraycopy(names, 0, names2, 0, k);


        Arrays.sort(names2);

        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
    }
}
