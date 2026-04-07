import java.util.*;

public class Basics_Maths {

    // -------------------------------------------------
    // DIGIT EXTRACTION
    // TC: O(log10 N) → number of digits
    // -------------------------------------------------
    private static void extraction(int n) {
        while (n > 0) {
            int lastDigit = n % 10;   // get last digit
            System.out.print(lastDigit + " ");
            n /= 10;                 // remove last digit
        }
        System.out.println();
    }

    // -------------------------------------------------
    // ARMSTRONG NUMBER (3 digit based)://Armstrong strong:Taking cube of each and sum up its the number its self than its armstromng num
    // TC: O(log N)
    // -------------------------------------------------
    private static boolean armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        return sum == original;
    }

    // -------------------------------------------------
    // PRINT ALL DIVISORS
    // TC: O(√N)
    // -------------------------------------------------
    private static void divisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                // avoid duplicate when i*i == n(// eliminating the case where same happens i.e Math.sqrt(n))
                if (n / i != i)
                    System.out.println(n / i);
            }
        }//you can use list add all element sort and than print for correct sequence
    }

    // -------------------------------------------------
    // PRIME CHECK (Optimal)://check for prime: Number which has exactly two factors i.e: 1 and number itself   (sqrt method)
    // TC: O(√N)
    // -------------------------------------------------
    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // -------------------------------------------------
    // SIEVE OF ERATOSTHENES (print primes till N)
    // TC: O(N log log N)
    // -------------------------------------------------
    private static void sieve(int n) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // -------------------------------------------------
    // GCD BRUTE FORCE
    // TC: O(min(a,b))
    // -------------------------------------------------
    private static int gcdBrute(int a, int b) {

        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    // -------------------------------------------------
    // EUCLIDEAN GCD (BEST)
    // TC: O(log min(a,b))
    // -------------------------------------------------
    private static int gcdEuclid(int a, int b) {

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    // -------------------------------------------------
    // PRIME FACTORIZATION://print prime factors of a number: a number which is divisor and prime among them :  Tc:it will approximate as inside primecheck is not always = approx O(root n * 2 * root)
    // TC: O(√N)
    // -------------------------------------------------
    private static void primeFactors(int n) {

        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // remaining prime > √n
        if (n > 1)
            System.out.print(n);

        System.out.println();
    }

    // -------------------------------------------------
    // POWER OF TWO CHECK (BEST BIT TRICK)
    // TC: O(1)
    // -------------------------------------------------
    //Given number is power of two or not :  using count of setbits :if count of setbit == 1 than it is a power of 2 else not    
     private static boolean isPowOF2(int n){   // TC: O(log n ) 
          if (n <= 0)
            return false;
        int count =0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        if(count == 1) return true;
        return false;
     } 
     //using AND operator : TC O(1);
     private static boolean isPower2(int n){
           return (n > 0) && ((n & (n - 1)) == 0);
     }

    // -------------------------------------------------
    // LARGEST POWER OF 2 ≤ N:// n se chhota (or equal) sabse bada power of 2 nikalna:
    // TC: O(1)
    // -------------------------------------------------
    private static int largestPowerOf2(int n) {

        return Integer.highestOneBit(n);
    }

    // -------------------------------------------------
    // NEXT POWER OF 2 ≥ N (IMPORTANT!)
    // TC: O(1)
    // -------------------------------------------------
    private static int nextPowerOf2(int n) {

        if (n <= 1) return 1;

        return Integer.highestOneBit(n - 1) << 1;
    }

    // -------------------------------------------------
    // COUNT SET BITS
    // TC: O(1)
    // -------------------------------------------------
    private static int countSetBits(int n) {

        return Integer.bitCount(n);
    }

    // -------------------------------------------------
    // LCM USING GCD
    // TC: O(log n)
    // -------------------------------------------------
    private static int lcm(int a, int b) {

        return (a / gcdEuclid(a, b)) * b;
    }

    //bninary expoenention or fast exponentition:it is one of the most efficient ways to calculate large powers a to power b . in O(log b) time
    private static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long half = pow(a, b / 2);

        if (b % 2 == 0) {
            return half * half;
        } else {
            return a * half * half;
        }
    }

    /*
    🔥 Modular nCr using Fermat's Little Theorem

    Problem:
    We want to compute (nCr) % MOD efficiently.

    Issue:
    Division is NOT allowed in modular arithmetic.
    Example:
        (a / b) % MOD ❌ invalid

    Solution:
        (a / b) % MOD = (a * b^(-1)) % MOD

    👉 We use Modular Inverse:
        b^(-1) ≡ b^(MOD - 2) % MOD   (Fermat’s Little Theorem)

    Condition:
        - MOD must be prime (e.g., 1e9+7)
        - b and MOD must be coprime

    Final Formula:
        nCr % MOD = fact[n] * invFact[r] * invFact[n-r] % MOD
     */

        static final int MOD = 1000000007;
 //precomputation for better complexity 
    static long[] fact;     // factorial array
    static long[] invFact;  // inverse factorial array

    // 🔹 Binary Exponentiation (a^b % MOD)
    // Time Complexity: O(log MOD)
    static long power(long a, long b) {
        long result = 1;
        a %= MOD;

        while (b > 0) {
            if ((b & 1) == 1) {   // if b is odd
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return result;
    }

    // 🔹 Precompute Factorials
    // Time Complexity: O(n)
    // Why? Single loop from 1 to n
    static void precomputeFactorials(int maxN) {
        fact = new long[maxN + 1];
        fact[0] = 1;

        for (int i = 1; i <= maxN; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
    }

    // 🔹 Precompute Inverse Factorials
    // Time Complexity: O(n)
    // Why? One power() call (log MOD) + one reverse loop
    static void precomputeInverseFactorials(int maxN) {
        invFact = new long[maxN + 1];

        // inverse of n! using Fermat
        invFact[maxN] = power(fact[maxN], MOD - 2);

        // fill remaining using relation:
        // invFact[i] = invFact[i+1] * (i+1)
        for (int i = maxN - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    // 🔹 nCr Function
    // Time Complexity: O(1)
    // Why? Only array lookups + constant multiplications
    static long nCr(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }

        return (fact[n] * invFact[r] % MOD * invFact[n - r] % MOD);
    }


    /*🔥 MATRIX EXPONENTIATION: is an powerful optimization technique to compute linear recurrence relation.
    Example:
        F(n) = F(n-1) + F(n-2)  Dp:Time O(n), but using matrix expo: O(logn)🚀

    dekho form:   [f(n),f(n-1)] = T ^ n-1 * [f(n-1) , f(n-2)]
    --------------------------------------------------

    🧠 Core Idea:
    
    Convert recurrence into matrix form:

        [ F(n)   ]   =   [1  1]^(n-1) * [F(1)]
        [ F(n-1) ]       [1  0]         [F(0)]

    👉 Transformation matrix T = [1 1; 1 0]
    Final Answer:
        F(n) = (T^(n-1))[0][0]

    --------------------------------------------------


    Dekho samjaho : hum given recurrence realtion se matrix relation banate jahan RHS mein: T ^n-1 * recurrence ko matrix form mein .   and hamra jo bhi f(n) ka ans rahta woh t matrix ke o,o mein aata.   
    ek baat samjho hum matrix multiply tabhi kar skte jab b == a hoo doh matrix ka jo ans matrix ata woh a * b aat,   toh cusing comparison tum T matrix ka value and size nikal skte , also degree of recurrencce is t size.
    ⏱️ Time Complexity:

    Matrix Multiplication → O(k³)  (k = matrix size, here k=2 → constant)

    Matrix Power → O(log n)
    👉 Final: O(log n)   

    🧠 What actually happens?

If you have a recurrence of degree k:

F(n) = a1*F(n-1) + a2*F(n-2) + ... + ak*F(n-k)

👉 You can convert it into a k × k transformation matrix
👉 Then: F(n)=T(n−k)⋅base vector
 */

    // 🔹 MATRIX MULTIPLICATION (Generic k × k)
    // Time: O(k^3)
    static long[][] multiply(long[][] A, long[][] B, int size) {
        long[][] C = new long[size][size];

        for (int i = 0; i < size; i++) {           // row of A
            for (int j = 0; j < size; j++) {       // col of B
                for (int k = 0; k < size; k++) {   // common dimension
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }

    // 🔹 IDENTITY MATRIX (important for exponent = 0)
    static long[][] identity(int size) {
        long[][] I = new long[size][size];

        for (int i = 0; i < size; i++) {
            I[i][i] = 1;
        }

        return I;
    }

    // 🔹 MATRIX POWER (Binary Exponentiation)
    // Time: O(k^3 * log n)
    static long[][] matrixPower(long[][] T, long power, int size) {

        long[][] result = identity(size); // start with identity

        while (power > 0) {
            // if power is odd → multiply once
            if ((power & 1) == 1) {
                result = multiply(result, T, size);
            }

            // square the matrix
            T = multiply(T, T, size);

            power >>= 1; // divide by 2
        }

        return result;
    }

    /*
        🔹 MAIN FUNCTION (Wrapper)

        Input:
            - transformation matrix T
            - exponent n

        Output:
            - T^n
     */
    static long[][] matrixExponentiation(long[][] T, long n) {
        int size = T.length; // dynamic size
        return matrixPower(T, n, size);
    }

    



    public static void main(String[] args) {

        extraction(5999);

        System.out.println(armstrong(371));

        divisors(45);

        System.out.println(isPrime(23));

        sieve(50);

        System.out.println(gcdBrute(12, 20));
        System.out.println(gcdEuclid(12, 20));

        primeFactors(84);

        System.out.println(isPowOF2(16));

        System.out.println(largestPowerOf2(20));

        System.out.println(nextPowerOf2(20));

        System.out.println(countSetBits(29));

        System.out.println(lcm(12, 20));


        int maxN = 100000;

        // Precompute once → O(n)
        precomputeFactorials(maxN);
        precomputeInverseFactorials(maxN);

        // Query → O(1)
        System.out.println(nCr(5, 2)); // Output: 10
        

        //matrixExponention:
        // Example: 2x2 matrix (can be ANY size)
        long[][] T = {
            {1, 1},
            {1, 0}
        };

        long n = 5;

        long[][] result = matrixExponentiation(T, n);

        // print result matrix
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        //ans will be result[0][0] for nth fibonnaci
        
     }
}
