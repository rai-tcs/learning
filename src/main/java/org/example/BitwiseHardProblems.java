package org.example;

public class BitwiseHardProblems {
    // print prime factors of a number using bitwise operators
    public static void printPrimeFactors(int n) {
        // Create a bitset to mark non-prime numbers
        int size = n + 1;
        int[] bitset = new int[(size >> 5) + 1]; // each int holds 32 bits

        // Sieve of Eratosthenes using bitwise operations
        for (int i = 2; i * i <= n; i++) {
            if ((bitset[i >> 5] & (1 << (i & 31))) == 0) { // if i is prime
                for (int j = i * i; j <= n; j += i) {
                    bitset[j >> 5] |= (1 << (j & 31)); // mark multiples of i as non-prime
                }
            }
        }

        // Print prime factors
        for (int i = 2; i <= n; i++) {
            if ((bitset[i >> 5] & (1 << (i & 31))) == 0) { // if i is prime
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
        System.out.println();
    }

    // count primes in a range of L to R
    public static int countPrimesInRange(int L, int R) {
        if (R < 2) return 0;
        if (L < 2) L = 2;

        int size = R + 1;
        int[] bitset = new int[(size >> 5) + 1]; // each int holds 32 bits

        // Sieve of Eratosthenes using bitwise operations
        for (int i = 2; i * i <= R; i++) {
            if ((bitset[i >> 5] & (1 << (i & 31))) == 0) { // if i is prime
                for (int j = i * i; j <= R; j += i) {
                    bitset[j >> 5] |= (1 << (j & 31)); // mark multiples of i as non-prime
                }
            }
        }

        // Count primes in the range [L, R]
        int count = 0;
        for (int i = L; i <= R; i++) {
            if ((bitset[i >> 5] & (1 << (i & 31))) == 0) { // if i is prime
                System.out.print(i+" ,");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args){
        System.out.println("------- bitwise hard problems");

        int[][] queries = {{10, 30}, {15, 50}, {1, 100}};
        for(int[] query : queries){
            int L = query[0];
            int R = query[1];
            int count = countPrimesInRange(L, R);
            System.out.println("Number of primes between " + L + " and " + R + " : " + count);
        }
    }
}
