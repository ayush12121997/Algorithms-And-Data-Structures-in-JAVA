# Data Structures and Algorithms

<a name="Contents"></a>
## Table of contents
1. [Reader class](#ReaderClass)
2. [Import statements](#Imports)
3. [Square root](#SquareRoot)
4. [Sieve of eratosthenes](#SieveOfErast)
5. [Properties of a square](#CheckIfSquare)
6. [Finding single element in array of pairs](#FindSingle)
7. [Arrays](#Arrays)
    - Basic Concepts
    - Sorting
8. [Something]

<a name="ReaderClass"></a>
## Reader Class for Java
```java
class Reader
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    
    static void init(InputStream input)
    {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }
    
    static String next() throws IOException
    {
        while(!tokenizer.hasMoreTokens())
        {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }
    
    static int nextInt() throws IOException
    {
        return Integer.parseInt(next());
    }
    
    static long nextLong() throws IOException
    {
        return Long.parseLong(next());
    }
    
    static double nextDouble() throws IOException
    {
        return Double.parseDouble(next());
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="Imports"></a>
## Import Statements
```java
import java.io.*;
import java.lang.*;
import java.util.*;
```
<a href="#Contents">Back to contents</a>

<a name="SquareRoot"></a>
## Square Root
```java
Math.sqrt(n);
```
<a href="#Contents">Back to contents</a>

<a name="SieveOfErast"></a>
## Sieve of Erastothenes (Find prime numbers upto a given number)
Sieve of Erastothenes is used to find prime numbers upto a given number N. The time complexity is O(N*log(log(N))).
```java
void sieveOfEratosthenes(int n)
{
    boolean prime[] = new boolean[n+1];
    for(int i=0;i<n;i++) 
    {
        prime[i] = true;
    }
    for(int p = 2; p*p <=n; p++) 
    {
        if(prime[p] == true) 
        {
            for(int i = p*p; i <= n; i += p) 
            {
                prime[i] = false; 
            } 
        }
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="CheckIfSquare"></a>
## Properties of a Square
- All sides of a square are equal in length say, a.
- The length of the diagonal of a square is sqrt(2)*a.
- The distance between two points is <img src="images/DistanceBetweenPoints.png" height="30">

<a href="#Contents">Back to contents</a>

<a name="FindSingle"></a>
## Find single element in an arrray where every other element comes twice
- Use the XOR property of bit manipulation.
- a XOR a = 0
- 0 XOR a = a
```java
int check(int[] nums)
{
    int a = 0;
    for(int i = 0; i < nums.length; i++)
    {
        a ^= nums[i];
    }
    return a;
}
```
<a href="#Contents">Back to contents</a>

<a name="Arrays"></a>
## Arrays
- Constant time lookup
- Constant time update

<a href="#Contents">Back to contents</a>
