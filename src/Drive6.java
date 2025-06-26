/*
Flower Prints
------------------
Emima owns a boutique and decides to design a new gown. She wants to design
lll and each block consists of some flowers.
the gown by printing some flowers over it. There are X printing blocks in total,
Your task is to help Emma find and return the maximum number of flowers that cannot be printed on the gown, using the X printing blocks.
Any block can be used any humber of times.
Note: The number of flowers bi any to blocks is co-prime.
Input Specification:
input1: An integer value X representing the total number of blocks available. input2: An integer array representing the number of flowers on the each printing block.
Output Specification:
Return an integer value representing the maximum number of flowers that cannot be printed on the gown.

 */
public class Drive6 {
    public static void main(String[] args) {
            int X = 2;
            int[] flowers = {4, 7}; // Co-prime

            int result = maxUnprintableFlowers(flowers);
            System.out.println(result); // Output: 17
        }

        // For 2 co-prime numbers a and b, max unreachable number is (a*b - a - b)
        public static int maxUnprintableFlowers(int[] flowers) {
            if (flowers.length != 2) {
                throw new IllegalArgumentException("Only supports 2 co-prime flower counts.");
            }

            int a = flowers[0], b = flowers[1];

            // Check if co-prime
            if (gcd(a, b) != 1) return -1; // Not co-prime, infinite unprintable cases

            return a * b - a - b;
        }

        private static int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    }

