// Given a positive integer N, the task is to find the Nth natural number after 
// removing all the natural numbers containing digit 9.
// Input: N = 8
// Output: 8

// Input: N = 9
// Output: 10

import java.util.*;
class NNaturalNo {
    static long findNthNumber(long N) {
	    long result = 0;
	    long p = 1;
	    while (N > 0) {
            result += (p * (N % 9));
            N = N / 9;
            p = p * 10;
	    }
	    return result;
    }
    public static void main(String[] args) {
	    int N = 9;
	    System.out.print(findNthNumber(N));
    }
}

