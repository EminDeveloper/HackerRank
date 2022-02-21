package hackerRank.days.nine;

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
    public static void main(String[] args)
    {
        System.out.println(factorial(new Scanner(System.in).nextInt()));
    }

    public static long factorial( int n )
    {
        return (n == 1) ? 1 : n*factorial(n-1);
    }
}
