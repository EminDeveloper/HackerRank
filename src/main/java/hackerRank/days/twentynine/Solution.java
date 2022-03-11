package hackerRank.days.twentynine;

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

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */
}

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int maxed = 0;
            for (int b = 2; b <= n; b++) {
                for (int a = 1; a < b; a++) {
                    if (a == b) continue;
                    int ab = a&b;
                    if (ab > maxed && ab < k) maxed = ab;
                }
            }
            System.out.println(maxed);
        }
    }
}
