package hackerRank.days.sixth;

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
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int entries = scanner.nextInt();
        StringBuilder[] freqs = new StringBuilder[100];

        for (int i = 0; i < entries; i++) {
            int idx = scanner.nextInt();
            if (i < entries / 2) {
                freqs[idx] = freqs[idx] == null ? new StringBuilder("-")
                        : freqs[idx].append(" -");
                scanner.next();
            } else {
                freqs[idx] = freqs[idx] == null ? new StringBuilder(scanner.next())
                        : freqs[idx].append(" ").append(scanner.next());
            }
        }

        for (int i = 0; i < freqs.length; i++) {
            if (freqs[i] != null) {
                System.out.print(freqs[i].toString());
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}