package hackerRank.days.twentyth;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static int bubbleSort(int[] a, int n){
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    //swap(a[j], a[j + 1]);

                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;

                    numberOfSwaps++;
                    numSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numSwaps;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());


        // Write your code here
        int[] convert = a.stream().mapToInt(Integer::intValue).toArray();
        int numSwaps = bubbleSort(convert, n);

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + convert[0]);
        System.out.println("Last Element: " + convert[n-1]);
        bufferedReader.close();
    }
}

