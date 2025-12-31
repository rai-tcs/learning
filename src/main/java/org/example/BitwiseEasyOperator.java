package org.example;
//
//Check odd        → n & 1
//Get bit i        → (n >> i) & 1    (8 - 1000  let say i =3rd bit -> 1000 >>3 = 0001 & 1 = 1)
//Set bit i        → n | (1 << i)
//Clear bit i      → n & ~(1 << i)
//Toggle bit i     → n ^ (1 << i)
//Remove last 1    → n & (n - 1)
//Is power of 2?   → n > 0 && (n & (n - 1)) == 0

import java.util.ArrayList;
import java.util.List;

//🛠️ 2. Bitwise Operators in Java
//
//        OperatorMeaningExample
//        &             AND         5 & 3
//        |             OR          5 | 3
//        ^             XOR         5 ^ 3
//        ~             NOT         ~5
//        <<        Left Shift      5 << 1
//        >>        Right Shift     5 >> 1
//        >>> Unsigned Right Shift -5 >>> 1
//
//        🎯 3. Most Useful Bit Tricks
//        ✅ Check if a number is odd
//        boolean isOdd = (n & 1) == 1;``Show more lines
//        Because odd numbers end with binary 1.
//
//        ✅ Get i-th bit
//        int bit = (n >> i) & 1;Show more lines
//
//        ✅ Set i-th bit to 1
//        n = n | (1 << i);Show more lines
//
//        ✅ Clear i-th bit (set to 0)
//        n = n & ~(1 << i);Show more lines
//
//        ✅ Toggle i-th bit
//        n = n ^ (1 << i);Show more lines
//
//        ✅ Remove last set bit
//        Very common interview trick.
//        n = n & (n - 1);Show more lines
//        Example:
//        100100 → 100000
//
//        ✅ Check if number is power of 2
//        boolean isPowerOf2 = (n & (n - 1)) == 0 && n > 0;Show more lines
//        All powers of 2 have only one bit set.
//
//        🧠 4. XOR Superpowers
//        1️⃣ XOR with same number = 0
//        x ^ x = 0
//
//        2️⃣ XOR with 0 = x
//        x ^ 0 = x
//
//        3️⃣ Find unique number in array
//        (Every element appears twice except one)
//        int res = 0;for (int x : arr) res ^= x;return res;Show more lines
//
//        💡 5. Bit Shifting
//        Left Shift <<
//        Moves bits left, multiplies by 2 per shift.
//        5 << 1 -> 10Show more lines
//        Right Shift >>
//        Divides by 2 per shift.
//        10 >> 1 -> 5Show more lines
//        Unsigned Shift >>>
//        Fills left with 0, not sign bit.
//
//        🔥 6. Common Interview Problems
//        Here are must‑solve problems:
//        🔸 Count set bits (Brian Kernighan’s Algorithm)
//        int count = 0;while (n > 0) {    n &= (n - 1);    count++;}Show more lines
//
//        🔸 Reverse bits of 32‑bit integer
//        Bit-by-bit build reverse.
//
//        🔸 Find 2 unique numbers where all others appear twice
//        Use XOR trick + bit splitting.
//
//        🔸 Subset generation using bits
//        for (int mask = 0; mask < (1 << n); mask++) {    for (int i = 0; i < n; i++) {        if ((mask & (1 << i)) != 0)            include element i;    }}Show more lines
//
//        🔸 Swap without temp variable
//        a ^= b;b ^= a;a ^= b;Show more lines
//
//        📘 7. Cheat Sheet
//        Check odd        → n & 1
//        Get bit i        → (n >> i) & 1
//        Set bit i        → n | (1 << i)
//        Clear bit i      → n & ~(1 << i)
//        Toggle bit i     → n ^ (1 << i)
//        Remove last 1    → n & (n - 1)
//        Is power of 2?   → n > 0 && (n & (n - 1)) == 0
//
//
//        🧑‍💻 8. Practice Questions (Java)
//        I can give full solutions if you want.
//
//        Count set bits in all numbers from 1 to N
//        Find single number in array
//        Subsets using bitmasking
//        Power of 2 check
//        Find missing number using XOR
//        Reverse bits of integer
//        Bitwise addition (without +)
public class BitwiseEasyOperator {
    // check whether ith bit is equal to 1
    // n =5, i= -> true( 5-> 101 -> 0th bit is 1)
    public static boolean isIthBitSet(int digit, int i){
        int ithBit = (digit >> i) & 1;
        return i == ithBit;
    }

    // a= 10 (1010), b =7 (0111) , output = 3
    // a= 3 (011), b =4(100) output =3
    public static int countNoOfBitsToBeFlippedToMakeAtoB(int a, int b){

        return 0;








//        int xor = a ^ b; // bits which are different will be set to 1
//        int count =0;
//        while(xor>0){
//            count += (xor &1);
//            xor = xor >>1;
//        }
//        return count;
    }

    public static long computePower(int n, int power){
        // approach 1
        // recursive approach
        if(power ==0) return 1;
        if(power %2 ==0){
            long halfPower = computePower(n, power/2);
            return halfPower * halfPower;
        } else {
            return n * computePower(n, power -1);
        }

        // let's do it using bit manipulation



//        int result =1;
//        while(power>0){
//            if((power &1) ==1){
//                result = result * n;
//            }
//            n = n * n;
//            power = power >>1; // (5-> 0101 , 4-> 0100, 3 -> 0011, 2->0010, 1->0001)
        // right shift 5 -> 0101 >> by 1 digit ( 0010 (2), 0001 (1))
//        }
//        return result;
    }


    public static List<Long> primeFactors(long n) {
        List<Long> f = new ArrayList<>();
        if (n == 0) return f;
        if (n < 0) {
            f.add(-1L);
            n = -n;
        }
        // remove 2s
        while (n % 2 == 0) {
            f.add(2L);
            n /= 2;
        }
        // odd factors
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                f.add(i);
                n /= i;
            }
        }
        if (n > 1) f.add(n);
        return f;
    }


    public static void main(String[] args){
        System.out.println("------ Bitwise Easy Operator -----");
    }
}
