package org.example;
//
//Check odd        → n & 1
//Get bit i        → (n >> i) & 1    (8 - 1000  let say i =3rd bit -> 1000 >>3 = 0001 & 1 = 1)
//Set bit i        → n | (1 << i)
//Clear bit i      → n & ~(1 << i)
//Toggle bit i     → n ^ (1 << i)
//Remove last 1    → n & (n - 1)
//Is power of 2?   → n > 0 && (n & (n - 1)) == 0

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
}
