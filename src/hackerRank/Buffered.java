package hackerRank;

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



public class Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        //Create an output that prints out the integers in the index zero
        System.out.println(a.get(0));

        //declare an integer i and create a while loop that iterates through the buffered input till it gets to the
        //last character (-1)
        int i;
        while((i = bufferedReader.read()) != -1) {
            System.out.print((char)i);
        }

        bufferedReader.close();
    }
}
