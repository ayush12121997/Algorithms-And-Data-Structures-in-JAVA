# Data Structures and Algorithms

<a name="Contents"></a>
## Table of contents
1. [Reader class](#ReaderClass)
2. [Faster printing using String Builder](#Printing)
3. [Arrays](#Arrays)
    - [Basic Concepts](#Arrays_BasicConcepts)
    - [Bubble Sort](#Arrays_BubbleSort)
    - [Selection Sort](#Arrays_SelectionSort)
    - [Insertion Sort](#Arrays_InsertionSort)
    - [Merge Sort](#Arrays_MergeSort)
    - [Binary Search](#Arrays_BinarySearch)
    - [Bucket Sort]
    - [Count Sort]
    - [Sorting using Comparator]
    - [Kadane's Algorithm](#Arrays_KadanesAlgo)
    - [Merge two sorted arrays in O(1) space](#Arrays_MergeTwo)
    - [Store two values in single position](#Arrays_InPlace)
    - [Finding single element in array of pairs](#Arrays_FindSingle)
    - [Prefix Sum]
    - [Scanline algorithm]
4. [Math](#Math)
    - [Sieve of eratosthenes (Find prime numbers upto a given number)](#Math_SieveOfErast)
    - [Check if a number is prime](#CheckPrime)
    - [Finding all factors of a number](#FindFactors)
    - [Binary conversions](#BinaryToAndFro)
    - [Decimal to binary conversion]
    - [Any base conversion (Example with excel column numbers/names)]
    - [Calculate GCD of two numbers]
    - [Calculate LCM of two numbers]
    - [Calculate factorial of a number]
    - [Divisibility by 3, 4, 5, 6, 7, 8, 9 and (2, 3 and 5)]
    - [Numbers of length N and value less than K]
5. [String]
    - [Splitting a string in Java]
    - [Find all permutations of a String]
6. [Others]
    - [Square root decomposition]
    - [Segment trees]
    - [Priority Queues and Comparators]

<a name="ReaderClass"></a>
## Reader Class
```java
import java.io.*;
import java.lang.*;
import java.util.*;
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

<a name="Printing"></a>
## String Builder Printing
Faster printing which requires multiple print statements one after the anothers cab ne achieved through StringBuilder. Use StringBuilder to form a big string and then print that String. Saves time.
```java
StringBuilder sb = new StringBuilder();
sb.append("Printing content");
System.out.println(sb.toString());
```
<a href="#Contents">Back to contents</a>

<a name="Arrays"></a>
## Arrays
<a name="Arrays_BasicConcepts"></a>
### Basic Concepts
- Lookup : O(1)
- Update : O(1)
```java
ArrayList<Integer> arr = new ArrayList<Integer>(); //Empty size
ArrayList<Integer> arr = new ArrayList<Integer>(10); //10 size
arr.get(i); //Get value at index i in O(1)
arr.set(i, value); //Set value at index i in O(1)
arr.size(); //Get array size in O(1)
arr.add(value); //Add value at end of array in O(1)
arr.add(i, value); //Add value at index i in O(size - i)
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_BubbleSort"></a>
### Bubble Sort
- Best Case : O(n)
- Average Case : O(n^2)
- Worst Case : O(n^2)
- Number of comparisons(Best case) : n-1
- Number of comparisons(Worst case) : (n-1)(n)/2
- Space complexity : O(1)
```java
public int[] BubbleSort(int[] a)
{
    int temp = 0;
    int n = a.length;
    for(int i = 0; i < n - 1; i++)
    {
        boolean flag = false;
        for(int j = 1; j < n; j++)
        {
            if(a[j-1] > a[j])
            {
                temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                flag = true;
            }
        }
        if(!flag)
        {
            break;
        }
    }
    return a;
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_SelectionSort"></a>
### Selection Sort
- Best Case : O(n)
- Average Case : O(n^2)
- Worst Case : O(n^2)
- Number of comparisons(Best case) : (n-1)(n)/2
- Number of comparisons(Worst case) : (n-1)(n)/2
- Space complexity : O(1)
```java
public int[] SelectionSort(int[] a)
{
    int n = a.length;
    for(int i = 0; i < n- 1; i++)
    {
        int min_ind = i;
        int min = a[i];
        for(int j = i + 1; j < n; j++)
        {
            if(a[j] < min)
            {
                min = a[j];
                min_ind = j;
            }
        }
        int temp = a[min_ind];
        a[min_ind] = a[i];
        a[i] = temp;
    }
    return a;
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_InsertionSort"></a>
### Insertion Sort
- Best Case : O(n)
- Average Case : O(n^2)
- Worst Case : O(n^2)
- Number of comparisons(Best case) : (n-1)(n)/2
- Number of comparisons(Worst case) : (n-1)(n)/2
- Space complexity : O(1)
```java
public int[] InsertionSort(int[] arr)
{
    int n = arr.length;
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }
    return arr;
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_MergeSort"></a>
### Merge Sort
- Best Case : O(nlog(n))
- Average Case : O(nlog(n))
- Worst Case : O(nlog(n))
- Number of comparisons(Best case) : nlogn(n)
- Number of comparisons(Worst case) : nlogn(n)
- Space complexity : O(n)
```java
public void MergeSort(int[] arr, int start, int end)
{
    if(start>end)
    {
        int mid = (start + end)/2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);
        Merge(arr, start, mid, end);
    }
}

public Merge(int[] arr, int start, int mid, int end)
{
    int[] temp = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    while(i <= mid && j <= end)
    {
        if(arr[i] <= arr[j])
        {
            temp[k] = arr[i];
            k++;
            i++;
        }
        else
        {
            temp[k] = arr[j];
            k++;
            j++;
        }
    }
    while(i <= mid)
    {
        temp[k] = arr[i];
        k++;
        i++;
    }
    while(j <= end)
    {
        temp[k] = arr[i];
        k++;
        i++;
    }
    for(int m = start; m <= end; m++)
    {
        arr[m] = temp[m-start];
    }
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_BinarySearch"></a>
### Binary Search
- Best Case : O(1)
- Average Case : O(log(n))
- Worst Case : O(log(n))
- Space complexity : O(1)
```java
public int BinarySearch(int[] arr, int start, int end, int value)
{
    if (start > end)
    {
        return -1;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == value)
    {
        return mid;
    }
    else if (arr[mid] > value)
    {
        return BinarySearch(arr, start, mid - 1, value);
    }
    else
    {
        return BinarySearch(arr, mid + 1, end, value);
    }
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_KadanesAlgo"></a>
### Kadane's Algorithm (Maximum sum contigous sub array)
- To find the maximum sub contigous sub-array we maintain two variables, a local sum and a global sum.
- Local sum is the max of current local sum + arr[i] and arr[i]. The global sum is the maximum of localsum and current global sum.
- Return the list of indexes from where to where the sum is maximum. Also return the sum. Return (start index, end index, sum).
```java
public int[] KadaneAlgo(int[] arr)
{
    int n = arr.length;
    int localsum = 0;
    int globalsum = 0;
    int start = 0;
    int end = 0;
    for(int i = 0; i < n; i++)
    {
        int c = arr[i];
        if(c + localsum >= c)
        {
            localsum += c;
        }
        else
        {
            localsum = c;
            start = i;
        }
        if(localsum > globalsum)
        {
            globalsum = localsum;
            end = i;
        }
    }
    int[] ans = new int[3];
    ans[0] = start;
    ans[1] = end;
    ans[2] = globalsum;
    return ans;
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_MergeTwo"></a>
### Merge two sorted arrays in O(1) extra space
```java
public void merge(int[] arr1, int[] arr2)
{
    StringBuilder sbf = new StringBuilder();
    int gap = n + m;
    gap = (int) Math.ceil(((double) gap) / 2);
    while (gap >= 1)
    {
        for (int i = 0; i + gap < n + m; i++)
        {
            if (i < n)
            {
                if (i + gap < n)
                {
                    if (arr1[i] > arr1[i + gap])
                    {
                        int temp = arr1[i];
                        arr1[i] = arr1[i + gap];
                        arr1[i + gap] = temp;
                    }
                }
                else
                {
                    if (arr1[i] > arr2[(i + gap) - n])
                    {
                        int temp = arr1[i];
                        arr1[i] = arr2[(i + gap) - n];
                        arr2[(i + gap) - n] = temp;
                    }
                }
            }
            else
            {
                if (arr2[i - n] > arr2[(i + gap) - n])
                {
                    int temp = arr2[i - n];
                    arr2[i - n] = arr2[(i + gap) - n];
                    arr2[(i + gap) - n] = temp;
                }
            }
        }
        if (gap == 1)
        {
            break;
        }
        gap = (int) Math.ceil(((double) gap) / 2);
    }
    for (int i = 0; i < n; i++)
    {
        sbf.append(arr1[i] + " ");
    }
    for (int i = 0; i < m; i++)
    {
        sbf.append(arr2[i] + " ");
    }
    System.out.println(sbf);
}
```
<a href="#Contents">Back to contents</a>
<a name="Arrays_InPlace"></a>
### In place operations to store two values in single position
If the maximum element of an array is known, pick any number, say value, greater than this maximum element. Now in order to make in place swaps, without the use of a temp variable, just add ((arr(i)%value) * value) to the new index.
This works in all cases as:
- For move involving an unchanged index to an unchanged index:
    - As value > maximum element of array, initially any arr(i) % value = arr(i).
    - Now at new index the number will be arr(new index) + (arr(i) * value).
    - If this index is now divided by the number value, it would give us the answer arr(i) as arr(new index)/value = 0 and (arr(i) * value) / value = arr(i).
- For a move involving a previously changed index to a unchanged index:
    - Let the number at a particular index already be arr(index) + ((arr(other index)%value) * value).
    - Now, the mod of this number will always be equal to arr(index) itself as the number ((arr(other index)%value) * value) % value = 0.
	- Hence, the problem then becomes similar to case where an unchanged value is moved to another unchanged value.

***Note: Only one time changed/unchanged indexes can be moved to unchanged indexes. No movements can be made to changed indexes.***

<a href="#Contents">Back to contents</a>
<a name="Arrays_FindSingle"></a>
### Find single element in an arrray where every other element comes twice
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

<a name="Math"></a>
## Math
<a name="Math_SieveOfErast"></a>
### Sieve of Erastothenes (Find prime numbers upto a given number)
Sieve of Erastothenes is used to find prime numbers upto a given number N. The time complexity is O(N * log(log(N))).
```java
void sieveOfEratosthenes(int n)
{
    boolean prime[] = new boolean[n+1];
    for(int i = 0; i <= n; i++) 
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

<a name="CheckPrime"></a>
### Primality Check (School Method)
- 0 and 1 are not prime nubmers
- Prime numbers should be checked for disivibility only till sqrt(N) as no number greater than sqrt(N) would produce a factor that hasn't already been covered till sqrt(N).
- Primes other than 2 and 3 are of the form 6k +- 1
```java
boolean isPrime(int n)
{
    if(n <= 1)
    {
    	return false;
    }
    else if(n == 2 || n == 3)
    {
    	return true;
    }
    else
    {
    	for(int i = 5; i < sqrt(n); i+= 6)
	{
	    if(n % i == 0 || n%(i+2) == 0)
	    {
	    	return false;
	    }
	}
    }
    return true;
}
```
<a href="#Contents">Back to contents</a>

<a name="FindFactors"></a>
### Find factors of a number
#### Find all factors
When calculating a factor, if we check that whether or not a number divides another number, if it does, at the same time we have also found another factor that is the quoteint of the divsion.
```java
ArrayList<Integer> factorize(int n)
{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 1; i <= sqrt(n); i++)
    {
    	if(n%i == 0)
	{
	    arr.add(i);
	    int c = n/i;
	    if(c != i)
	    {
	    	arr.add(c);
	    }
	}
    }
    return arr.sort();
}
```
#### Find all prime factors
```java
ArrayList<Integer> factorize(int n)
{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    if(n == 2 || n == 3)
    {
    	arr.add(n);
    }
    while(n != 1)
    {
    	for(int i = 2; i <= sqrt(n); i++)
	{
	    if(n%i == 0)
	    {
	    	arr.add(i);
		n = n/i;
	    }
	}
	
    }
    return arr.sort();
}
```
<a href="#Contents">Back to contents</a>

<a name="BinaryToAndFro"></a>
### Binary Conversions to and from Decimal
#### From decimal to binary
We know that a dcimal number is converted into binary by dividing the number repeatedly by 2 until the qoutient becomes 0. The binary number is represented by adding the remainder at every step to the answer so far.
```java
String decToBin(long n, String s)
{
    if(n>1)
    {
    	s += decToBin(n/2, s);
    }
    s += (n%2);
    return s;
}

// Call the function as decToBin(n, "");
```
#### From binary to decimal
```java
long binToDec(String s)
{
    long ans = 0;
    int len = 0;
    long start = 1;
    while(len < s.length())
    {
    	if(s.charAt(len) == '1')
	{
	    ans += base;
	}
	base *= 2;
	len++;
    }
    return ans;
}
```
<a href="#Contents">Back to contents</a>
