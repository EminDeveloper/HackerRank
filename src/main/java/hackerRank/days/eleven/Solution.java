package hackerRank.days.eleven;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int arr[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = s.nextInt();
                if (i > 1 && j > 1) {
                    int hgSum = arr[i-2][j-2] + arr[i-2][j-1] +arr[i-2][j]
                            + arr[i-1][j-1]
                            + arr[i][j-2] + arr[i][j-1] + arr[i][j];
                    max = hgSum > max ? hgSum : max;
                }
            }
        }

        s.close();
        System.out.println(max);
    }
}

