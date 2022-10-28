Ad


GEEKSFORGEEKS
Bits manipulation (Important tactics)
Prerequisites: Bitwise operators in C, Bitwise Hacks for Competitive Programming, Bit Tricks for Competitive Programming

Table of Contents

Compute XOR from 1 to n (direct method)
Count of numbers (x) smaller than or equal to n such that n+x = n^x
How to know if a number is a power of 2?
Find XOR of all subsets of a set
Find the number of leading, trailing zeroes and number of 1’s
Convert binary code directly into an integer in C++
The Quickest way to swap two numbers
Simple approach to flip the bits of a number
Finding the most significant set bit (MSB)
Check if a number has bits in an alternate pattern
1. Compute XOR from 1 to n (direct method):
The  problem can be solved based on the following observations:

Say x = n%4. The XOR value depends on the value if x. If



x = 0, then the answer is n.
x = 1, then answer is 1.
x = 2, then answer is n+1.
x = 3, then answer is 0.
Below is the implementation of the above approach.

/*package whatever //do not write package name here */

import java.io.*;
 

class GFG
{

   

  // Direct XOR of all numbers from 1 to n

  public static int computeXOR(int n)

  {

    if (n % 4 == 0)

      return n;

    if (n % 4 == 1)

      return 1;

    if (n % 4 == 2)

      return n + 1;

    else

      return 0;

  }
 

  public static void main (String[] args) {
 

  }
}
 

