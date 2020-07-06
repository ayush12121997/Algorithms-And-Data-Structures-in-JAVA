# <p align="center"> Data Structures and Algorithms (JAVA) </p>

<a name="Contents"></a>
## <p align="center"> Table of contents </p>
1. [Reader class](#ReaderClass)
2. [Faster printing using String Builder](#Printing)
3. [Arrays](#Arrays)
    - [Basic Concepts](#Arrays_BasicConcepts)
    - [Bubble Sort](#Arrays_BubbleSort)
    - [Selection Sort](#Arrays_SelectionSort)
    - [Insertion Sort](#Arrays_InsertionSort)
    - [Merge Sort](#Arrays_MergeSort)
    - [Bucket Sort]
    - [Count Sort]
    - [Quick Sort]
    - [Prefix Sum](#Arrays_PrefixSum)
    - [Array tips and tricks in JAVA, multiplication, char_arr and String, substring hashmap, stringbuilder](#Arrays_TipsAndTricks)
    - [Binary Search](#Arrays_BinarySearch)
    - [Store two values in a single index](#Arrays_InPlace)
    - [Kadane's Algorithm (Maximum sum subarray)](#Arrays_KadanesAlgo)
    - [Kadane's Algorithm for maximum product (Maximum product subarray)]
    - [Merge two sorted arrays in O(n1+n2) time]
    - [Merge two sorted arrays in O(1) space](#Arrays_MergeTwo)
    - [Find closest number in sorted array]
    - [Finding single element in array of pairs](#Arrays_FindSingle)
    - [Generalization of above if available]
    - [Merge intervals together](#Arrays_MergeIntervals)
    - [Range Sum Query](#Arrays_RSQuery)
    - [Scanline algorithm]
    - [Boyer-Moore Voting Algorithm (For majority, for n/3 and so on)]
4. [Math](#Math)
    - [Sieve of eratosthenes (Find prime numbers upto a given number)](#Math_SieveOfErast)
    - [Check if a number is prime](#CheckPrime)
    - [Finding all factors of a number](#FindFactors)
    - [Binary conversions](#BinaryToAndFro)
    - [Any base conversion (Example with excel column numbers/names)]
    - [Calculate GCD of two numbers]
    - [Calculate LCM of two numbers]
    - [Calculate factorial of a number]
    - [Divisibility by 3, 4, 5, 6, 7, 8, 9 and (2, 3 and 5)]
    - [Calculate nCr](#Math_NCR)
    - [Palindrome Number]
5. [String]
    - [Java String workarounds (Substring, toCharArray, charAt)]
    - [Learn KMP robin karp and stuff]
6. [Linked Lists](#LinkedLists)
    - [Singly Linked List](#LL_SinglyLinkedList)
    - [Detect a cycle in a linked list](#LL_Cycle)
    - [Reverse a linked list](#LL_Reverse)
    - [Find the middle element of a linked list](#LL_FindMid)
    - [Palindrome Linked List]
    - [Merge two sorted linked lists](#LL_MergeSorted)
    - [Sort a linked list](#LL_Sort)
    - [Intersection of 2 linked lists](#LL_Intersect)
    - [Remove duplicates from a linked list](#LL_RemoveDuplicates)
    - [Doubly linked lists](#LL_Double)
    - [Odd even linked lists]
    - [Remove N'th Node from end]
7. [Stacks and Queues](#StackAndQueue)
    - [Stacks](#SQ_Stack)
    - [Queues](#SQ_Queue)
    - [Priority Queues](#SQ_PQ)
    - [Monotonous increasing/decreasing stacks, use for previous smaller, next smaller, previous greater, next greater]
    - [Next greater element - I]
    - [Next greater element - II]
    - [Implement stack using queue]
    - [Implement queue using stack]
    - [Min Stack]
    - [Score of Parentheses]
    - [Minimum removals to make valid parentheses]
    - [Minimum additions to make valid parentheses]
    - [Online stock span]
    - [Daily temperatures]
    - [Sum of all subarray minimums]
    - [Evaluate Reverse Polish Notation]
    - [Trapping rain water]
    - [Binary Tree Traversls - Inorder, Postorder and Preorder]
    - [Binary tree zigzag traversal]
    - [Binary tree level order traversal]
8. [Heaps and Maps]
9. [Hashing]
10. [Trees]
    - [Traversals take from leetcode]
    - [Binary tree zigzag traversal, level order traversal]
11. [Graphs](#Graphs)
    - [Representing a graph](#GP_Representaations)
    - [Breadth First Traversal](#GP_BFS)
    - [Depth First Traversal](#GP_DFS)
    - [Reverse a graph](#GP_Reverse)
    - [Connected components in undirected graph](#GP_ConnectedComponents)
    - [Strongly Connected Components in directed graph- Kosaraju’s algorithm](#GP_SCC)
    - [Find a mother vertex](#GP_FindMother)
    - [Check if  graph is strongly connected](#GP_CheckIfSCC)
    - [Dijkstra's Algorithm](#GP_Dijkstra)
    - [Bellman–Ford Algorithm](#GP_BellmanFord)
    - [Floyd Warshall Algorithm](#GP_FloydWarsahll)
    - [Shortest path in an unweighted graph](#GP_ShortestPathUnweighted)
    - [Shortest path in a Directed Acyclic Graph](#GP_ShortestPathDAG)
    - [Best First Search]
    - [A* Search Algorithm]
    - [Graph coloring - Chromatic Number](#GP_GraphColoring)
    - [m-Coloring Problem](#GP_mColoring)
    - [Detect a cycle in an undirected graph]
    - [Detect a cycle in an directed graph]
    - [Detect a negative cycle]
    - [Disjoint Union Find - Rank and Path Compression]
    - [Count all paths between a source and destination in a graph](#GP_CountAllSourceDestination)
    - [Print all paths between a source and destination in a graph](#GP_PrintAllSourceDestination)
    - [Minimum steps to reach target by Knight](#GP_KnightProblem)
    - [Minimum number of swaps required to sort an array](#GP_MinSwapsToSort)
    - [Minimum operations needed to convert x into y](#GP_MinOpsToConvert)
    - [Minimum cost path with Left, Right, Bottom and Up moves allowed]
    - [Stable marriage]
12. [Recursion and Backtracking](#Backtracking)
    - [Keys to backtracking](#R_BT_Keys)
    - [Standard structure for backtracking problems - Listing and counting and string concatenation strats]
    - [Generate paranthesis]
    - [Permutations - I and II]
    - [Next Permutation]
    - [Subsets - I and II]
    - [Combination sum - I and II, similar to coin change printing]
    - [Palindrome Partitioning]
    - [Palindrome Partitioning - II]
    - [Partition into k equal sum subsets and for subset equal sum k = 2]
    - [N Queens]
    - [N Queens - II]
    - [Restore IP Addresses]
    - [Sudoku Solver]
    - [Letter combinations of a Phone Number]
    - [Word search - I and II]
    - [Combinations]
13. [Dynamic Programming](#DynamicProgramming)
    - [Overlapping Subproblems](#DP_OverlappingSubproblems)
    - [Optimal Substructure](#DP_OptimalSubstructure)
    - [Tabulation vs Memoization](#DP_TabulationVsMemoization)
    - [Solving a DP Problem](#DP_SolvingDP)
    - [DP with Backtracking](#DP_BacktrackDP)
    - [2 Dimensional DP - Grids](#DP_2DimensionalGrids)
    - [DP on Merging Intervals](#DP_MergeIntervals)
    - [DP on Strings](#DP_Strings)
    - [DP for decision making (Knapsack)](#DP_Decision)
    - [Add knapsack description to the above link, 0/1 knapsack, unbounded knapsack, repititions allowed not allowed difference, convert 2d to 1d see first discussion of coin change 2, extended knapsack]
    - [Dp problems classification]
    - [Longest Integer Subsequence](#DP_LIS)
    - [Longest Common Subsequence](#DP_LCS)
    - [Unique Paths in a grid]
    - [Minimum sum path in a grid]
    - [Longest Common Substring and print it too]
    - [Longest Palindromic Subsequence]
    - [Longest Palindromic Substring and print it too]
    - [Edit Distance]
    - [Maximum Sum Subarray and print it too]
    - [Maximum sum subarray without adjacent elements]
    - [Buy and Sell Stock (k transactions)]
    - [Coin Change problem - cover both examples, and perfect squares and printint similar to combination sum, see first discussion of coin change 2]
    - [Word break - I, also add the version where you need to tell which words were selcted out of the dictionary]
    - [Word Break - II]
    - [Decode ways and print all]
    - [Number of Distinct Subsequences]
    - [Longest Artihmetic Sequence]
    - [Interleaving Strings]
    - [Jump game - I and II]
    - [Egg Drop Puzzle]
    - [Max Sum of Rectangle, Normal and No Larger than K and printing the answer]
    - [Maximal square containing only 1s]
    - [Maximal Rectangle containing only 1s, needs maximum rectangle in histogram as prereq]
    - [Number of Unique binary search trees]
    - [Palindrome Partitioning - II]
    - [Regular expression mathcing]
    - [Wildcard matching]
    - [Minimum cost tree from leaf values]
    - [Partition into two equal subset problem]
    - [Partition into two subsets with minimum difference]
    - [Last stone weight 2, normal knapsack and coin change 2 as well, compare with how coin change front and back iteration of j loop makes a difference to count allowed]
    - [Flip array]
    - [Trapping rain water]
14. [Bit Manipulation]
15. [Greedy Algorithms]
    - [Jump Game - I and II]
16. [Others]
    - [Square root decomposition]
    - [Segment trees]
    - [Trie]
    - [Union Find]
    - [Tree sets and usage, like maximum sum subarray with sum less than equal to k]
    - [Line Sweep Algo]
    - [Catalan Number]
    - [Add char to int and int to char and ascii shiz]

<a name="ReaderClass"></a>
## <p align="center"> Reader Class </p>
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
## <p align="center"> String Builder Printing </p>
Certain questions which require multiple print statements one after the another, may result in a TLE just because of the printing delay. faster printing can be achieved through StringBuilder. Use StringBuilder to form a big string of input by constantly appending smaller outputs and then print the entire string once. Saves time.
```java
StringBuilder sb = new StringBuilder();
sb.append("Printing content");
sb.append("Add a new line with backslash n \nlike this");
System.out.println(sb.toString());
```
<a href="#Contents">Back to contents</a>

<a name="Arrays"></a>
## <p align="center"> Arrays </p>
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

<a name="Arrays_PrefixSum"></a>
### Prefix Sum
Prefix sum is a method in which you calculate the sum of elements of an array upto a given index and store it in a different array. This process is done for all the indexes of the array.
```java
// Let input array be arr[] of size n

int[] prefixSum = new int[n];
prefixSum[0] = arr[0]; 
for(int i = 1; i < n; i++)
{
    prefixSum[i] = prefixSum[i-1] + arr[i];
}

// Now the prefix sum array has sum of elemnts of the array upto that index.
```
This method can be used in a variety of questions such as:
1. Range sum queries
2. Equilibrium index of an array
3. Range update queries

We will cover these problems later if needed.

<a href="#Contents">Back to contents</a>

<a name="Arrays_TipsAndTricks"></a>
### Tips and tricks for JAVA arrays
#### Direct sorting
```java
// For array list
Collections.sort(arrayListName);

// For array
Arrays.sort(arrayName);
```
#### Convert array to ArrayList and viceversa
```java
// ArrayList -> Array
arrayListName.toArray();

// Array to ArrayList
Arrays.asList(arrayName);

// ArrayList of ArrayList into 2d array
arrayListName.toArray(new int[size of outer parent array list][size of inner array lists]);
```
#### Comparator Sort
```java
// For arraylist
class myComparison implements Comparator<Object>
{
    @Override
    public int compare(Object a, Object b)
    {
        if(a.val > b.val)
        {
            return 1;
        }
        else if(a.val < b.val)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
Collections.sort(arrayListName, new myComparison());

// For array (2D arrays)
// Assume there is a 2D array of kind [[1,2], [2,3], [4,5], [5,6]]
// To sort this on the basis of first number of every inner []
Arrays.sort(arrayName, (i1, i2) -> Integers.compare(i1[0], i2[0]));
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

<a name="Arrays_InPlace"></a>
### In place operations to store two values in single position
If the maximum element of an array is known, pick any number, say value, greater than this maximum element. Now in order to make in place swaps, without the use of a temp variable, just add ((arr[i] % value) * value) to the element, say at index j, where you want to put arr[i]. Note, it is not necessry to put arr[i] at the new index. Any element less than value can be added.
This works in all cases as:
- For move involving an unchanged index to an unchanged index:
    - As value > maximum element of the array, initially any arr[i] % value = arr[i].
    - Now at new index, say index j, arr[j] = arr[j] + (arr[i] * value).
    - If arr[j] is now divided by value, it would give us the answer arr[i] as arr[j]/value = 0 and (arr[i] * value) / value = arr[i].
- For a move involving a previously changed index to an unchanged index:
    - Let the number at a particular index i be, arr[i] = arr[i] + (arr[j] * value), where the value if index j has also been added.
    - Now, the mod of arr[i] will always be equal to arr[i] itself as the number (arr[j] * value) % value = 0.
    - Hence, now when arr[i] % value is calculated, the problem then becomes similar to case where an unchanged value is moved to another unchanged value.

***Note: Only one time changed/unchanged indexes can be moved to unchanged indexes. No movements can be made to already changed indexes.***

<a href="#Contents">Back to contents</a>

<a name="Arrays_KadanesAlgo"></a>
### Kadane's Algorithm (Maximum sum contigous sub array)
- To find the maximum sum contigous sub-array we maintain two variables, a local sum and a global sum.
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

<a name="Arrays_MergeIntervals"></a>
### Merge Intervals in Arrays
In questions which require you to merge various intervals together, or find the coutn of overlapping intervals, the general method followed is as follows:
1. Make two seperate arrays, one with starting points of all intervals, one with ending points of all intervals.
2. Sort the two arrays
3. If end[i] > start[i+1], then an overlapping interval has been identified. The intervals may now be merged into one, that is start[i] to end[i+1] becomes one interval, or the count of overlapping intervals be increased.

<a href="#Contents">Back to contents</a>

<a name="Arrays_RSQuery"></a>
### Range sum query
The problem statement would be "Given an integer array nums, find the sum of the elements between indices i and j". A naive solution can be to calculate the sum in O(n) time for every time a query is given. This works fine in small number of queries. But what if, number of queries is also ~n. In that case for n queries total complexity would be O(n^2). This can be reduced to O(n) using prefix sum method.
```java
class NumArray
{
    int[] prefixSum = null;
    public NumArray(int[] nums)
    {
        int n = nums.length;
        prefixSum = new int[n+1];
        for(int i = 1; i <= n; i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int i, int j)
    {
        return prefixSum[j+1] - prefixSum[i];
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="Math"></a>
## <p align="center"> Math </p>
<a name="Math_SieveOfErast"></a>

### Sieve of Eratosthenes (Find prime numbers upto a given number)
Sieve of Eratosthenes is used to find prime numbers upto a given number N. The time complexity is O(N * log(log(N))).
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
- 0 and 1 are not prime numbers
- Prime numbers should be checked for divisibility only till sqrt(N) as no number greater than sqrt(N) would produce a factor that hasn't already been covered till sqrt(N).
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
When calculating a factor, if we check that whether or not a number divides another number, if it does, at the same time we have also found another factor that is the quotient of the division.
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
We know that a decimal number is converted into binary by dividing the number repeatedly by 2 until the quotient becomes 0. The binary number is represented by adding the remainder at every step to the answer so far.
```java
String decToBin(long n)
{
    StringBuilder str = new StringBuilder("");
    while(n > 0)
    {
        str.insert(0, n%2);
        n /= 2;
    }
    return str.toString();
}
```
#### From binary to decimal
```java
long binToDec(String s)
{
    long ans = 0;
    int len = s.length() - 1;
    long base = 1;
    while(len >= 0)
    {
    	if(s.charAt(len) == '1')
        {
            ans += base;
        }
        base *= 2;
        len--;
    }
    return ans;
}
```
<a href="#Contents">Back to contents</a>

<a name="Math_NCR"></a>
### Calculate nCr
To calculate nCr:
1. Find maximum between (n-r,r). Let the max be R and other value be r'.
2. Calculate factorial from R+1 to n. Let this be F.
3. Calculate factorial from 1 to r'. Let this be f'.
4. Divide F by f'. This is the answer.
5. Always calculate using long.

<a href="#Contents">Back to contents</a>

<a name="LinkedLists"></a>
## <p align="center"> Linked Lists </p>
A linked list is a data structure in which elements are not stored in contiguous locations and are linked to each other using pointers. Linked lists consists of nodes which store the value for the node and the link to the next node to which it is connected. The lists can be single directed or double directed lists.

Linked lists generally have a head which is the only directly accessible element of the list. The structure looks like Head -> Node 1 -> Node 2 -> Node3

<a name="LL_SinglyLinkedList"></a>
### Singly Linked List
A singly linked list means that every element is linked with only the next element in the forward direction. Hence, you may access the next element of a node but not the previous one.
```java
class LinkedList
{
    Node head = null;
}

class Node
{
    int value = null;
    Node next = null;
    
    public Node(int val, Node nex)
    {
        value = val;
        next = nex;
    }
    
    public Node(int val)
    {
        value = val;
    }
}
```
#### Insert Element
Linked list can have three types of insertions, namely, at the beginning, at the end and after a specific given node.
```java
// These functions are supposed to be a part of the Linked List class

// Swap current head with the new node. Link new node to prev head.
void insertAtBeginning(int x)
{
    Node temp = head;
    head = new Node(x);
    head.next = temp;
}

/* Iterate the list till the end. If the list is empty, make this node the head,
else link the last node of the list to the new node. */
void insertAtEnd(int x)
{
    Node temp = head;
    if(temp == null)
    {
        head = new Node(x);
        return;
    }
    while(temp.next!=null)
    {
        temp = temp.next;
    }
    Node newNode = new Node(x);
    temp.next = newNode;
}

/* Link 'node' to the new node. The previous next element of 'node'
would now be linked to the new node. In certain questions maybe the pointer
to the node would not be given but the value be shared. Iterate the list
to reach the node first and then follow the below process.*/
void insertAfter(Node node, int x)
{
    if(node == null)
    {
        return;
    }
    Node temp = node.next;
    Node newNode = new Node(x);
    newNode.next = temp;
    node.next = newNodee;
}
```
<a href="#Contents">Back to contents</a>

#### Delete Element
```java
// These functions are supposed to be a part of the Linked List class

/* This function deletes the node at position x. Only the head of the list
is given. WE first check if head is valid or not. Then we check if the node
to be deleted is the head. If yes, so we proceed by just changing the head.
If not, so we then iterate to reach the node previous to the one that is to be
deleted. Then link this current node to the next node of the node to be deleted.*/

//ALWAYS REMEMBER TO DELINK THE NODE TO BE DELETED.

Node deleteNode(Node head, int x)
{
    Node temp = head;
    if(temp == null)
    {
        return temp;
    }
    if(x == 1)
    {
        head = head.next;
        return head;
    }
    Node prev = temp;
    temp = temp.next;
    int count = 2;
    while(temp != null)
    {
        if(count == x)
        {
            prev.next = temp.next;
            // Delinking the node
            temp.next = null;
            temp = prev.next;
            break;
        }
        count++;
        prev = temp;
        temp = temp.next;
    }
    return head;
}
```
<a href="#Contents">Back to contents</a>

#### Print List
```java
public void printList(Node head)
{
    StringBuilder sbf = new StringBuilder("");
    while(head != null)
    {
        sbf.append(head.data + " ");
        head = head.next;
    }
    System.out.print(sbf.toString());
}
```
<a href="#Contents">Back to contents</a>

<a name="LL_Cycle"></a>
### Detect Cycle in a Linked List
Given a linked list head pointer, detect whether or not hte given linked list contains a cycle or not. A naive solution with O(n) space complexity and O(n) time complexity would be to use a HashMap to detect when a node is repeated. Instead we may use the two pointers method.

**Two pointers method:** We keep two pointers, one pointing to the head(slow pointer) and one to head.next(fast pointer). The slow pointer would be moving one step at a time, that is, slowPointer = slowPointer.next, while the fast pointer would move two steps at a time, fastPointer = fastPointer.next.next. The idea is that if a cycle exists, the two pointers would meet at some point. Now three cases arise:
1. N1 -> Fast -> Slow -> N2 : In this case in the next iteration Fast would meet slow.
2. N1 -> Fast -> N2 -> Slow -> N3 : In this case in the next iteration, the condition becomes N1 -> Fast -> Slow -> N2 and hence similar to case 1.
3. N1 -> Fast -> N2 -> N3 -> Slow -> N4 : In this case in the next iteration, the condition becomes N1 -> Fast -> N2 -> Slow -> N3 and hence similar to case 2.

Thus in a maximum of 3 loops in constant space a cycle can be detected. If a cycly doesn't exist the fast pointer would reach null and end the loop.
```java
public boolean detectLoop(Node head)
{
    if(head == null || head.next == null)
    {
        return false;
    }
    Node pointer1 = head;
    Node pointer2 = head.next;
    while(pointer1 != pointer2)
    {
        if(pointer1 == null || pointer2 == null || pointer2.next == null)
        {
            return false;
        }
        pointer1 = pointer1.next;
        pointer2 = pointer2.next.next;
    }
    return true;
}
```
<a href="#Contents">Back to contents</a>

<a name="LL_Reverse"></a>
### Reverse a linked list
To reverse a linked list, we start from the head and point it to null. The further links are modified in the following way:<br>
For every link Node1 -> Node2, we modify to make it Node2 -> Node1. Hence, everytime we reach a new node, we need access to the previous node as well. Thus the two things needed would be:
1. Point head to null.
2. Point every new node to its previous node

Also take note, that the final answer returned should be the new head of the reversed linked list, which is the last elelement of the original linked list.
```java
public ListNode reverseList(ListNode head)
{
    // Prev stores the previous node. This is null in case of head.
    ListNode prev = null;
    ListNode curr = head;
    while(curr!=null)
    {
        // Store the next element of the current node first, before
        // pointing the current node to it's previous element.
        ListNode temp = curr.next;
        curr.next = prev;
        
        // Set the new prev to the current element.
        prev = curr;
        
        // Set the new current to the next element which was stored in temp.
        curr = temp;
    }
    return prev;
}
```
<a href="#Contents">Back to contents</a>

<a name="LL_FindMid"></a>
### Find middle in a linked list
To find the middle element in a linked list simply use the two pointer appraoch. One pointer moves one step at a point, while the other moves two steps at a point. This way, when the fast pointer reaches the end, the slow reaches the middle.
```java
public Node findMid(Node head)
{
    // Routine check for empty list or single node list.
    if(head == null || head.next == null)
    {
        return head;
    }
    
    // Fast and slow pointer for splitting list in half.
    ListNode fast = head;
    ListNode slow = head;
    
    // We dont need to check for slow as fast is always ahead of it
    while(fast!=null && fast.next!=null)
    {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```
<a href="#Contents">Back to contents</a>

<a name="LL_MergeSorted"></a>
### Merge two sorted linked lists
The idea is similar to merging two sorted arrays. The key is to remember that the two input lists are already sorted indivudally. We simply iterate both the lists and compare the node values one by one. If Node1 < Node2, then append Node1 to the final answer and we move Node1 to Node1.next. The same is done for Node2 if Node2 <= Node1. As soon as either of the list1 or list2 reaches null, we append all the remaining nodes of the other list directly to the final answer.

An example would be as follows:<br>
List1 : 2 -> 4 -> 8 -> null<br>
List2 : 3 -> 6 -> 14 -> 17 -> null

<ins>Step 1</ins>:<br>
We compare 2 and 3.<br>
List1 : **2** -> 4 -> 8 -> null<br>
List2 : **3** -> 6 -> 14 -> 17 -> null<br>
As 2 < 3, we add 2 to the final answer and move 2 to 4.<br>
Answer: 2

<ins>Step 2</ins>:<br>
We compare 4 and 3.<br>
List1 : **4** -> 8 -> null<br>
List2 : **3** -> 6 -> 14 -> 17 -> null<br>
As 3 < 4, we add 3 to the final answer and move 3 to 6.<br>
Answer: 2 -> 3

<ins>Step 3</ins>:<br>
We compare 4 and 6.<br>
List1 : **4** -> 8 -> null<br>
List2 : **6** -> 14 -> 17 -> null<br>
As 4 < 6, we add 4 to the final answer and move 4 to 8.<br>
Answer: 2 -> 3 -> 4

<ins>Step 4</ins>:<br>
We compare 8 and 6.<br>
List1 : **8** -> null<br>
List2 : **6** -> 14 -> 17 -> null<br>
As 6 < 8, we add 6 to the final answer and move 6 to 14.<br>
Answer: 2 -> 3 -> 4 -> 6

<ins>Step 5</ins>:<br>
We compare 8 and 14.<br>
List1 : **8** -> null<br>
List2 : **14** -> 17 -> null<br>
As 8 < 14, we add 8 to the final answer and reach end of list 1.<br>
Answer: 2 -> 3 -> 4 -> 6 -> 8

<ins>Step 6</ins>:<br>
List1 : **null**<br>
List2 : **14** -> 17 -> null<br>
As we reach null in list1, we add all the nodes of list2 to answer directly<br>
Answer: 2 -> 3 -> 4 -> 6 -> 8 -> 14 -> 17 -> null

The code would be as folows:
```java
public ListNode mergeTwoLists(Node l1, Node l2)
{
    // temp1 and temp2 nodes to iterate list1 and list2 respectively.
    Node temp1 = l1;
    Node temp2 = l2;
    
    // We need a new node to store the final answer.
    Node answer = new ListNode(-1);
    
    // We iterate the final asnwer list using ret. If we would have done
    // this directly through the Node answer itself, we would have lost
    // track of the head of the answer list. We need to keep track of the
    // head to return it at the end.
    Node ret = answer;
    
    while(temp1 != null && temp2!= null)
    {
        if(temp1.val < temp2.val)
        {
            ret.next = temp1;
            temp1 = temp1.next;
        }
        else
        {
            ret.next = temp2;
            temp2 = temp2.next;
        }
        ret = ret.next;
    }
    
    if(temp1 != null)
    {
        ret.next = temp1;
    }
    
    if(temp2 != null)
    {
        ret.next = temp2;
    }
    
    // Return answer.next as answer is a dummy node with value 0 which
    // is not a part of either of the input lists.
    return answer.next;
}
```
<a href="#Contents">Back to contents</a>

<a name="LL_Sort"></a>
### Sort a linked list
Given a linked list, the task is to sort it. The idea used is of MergeSort and is similar to how it works for the arrays in general. We divide the list into two halves. Each half is individually sorted and then merged together again. As we have dsicussed splitting the list into two halves and merging two sorted lists above, I would not be discussing them again here. We directly look at the code:
```java
public Node sortList(Node head)
{
    // Routine check for empty list or single node list.
    if(head == null || head.next == null)
    {
        return head;
    }
    
    // Fast and slow pointer for splitting list in half.
    // A new pointer temp is introduced. Temp is used to store the
    // ending node of the first half of the list. As our aim is not
    // to just simply find the middle element, but to split the list
    // into two. Hence the first half of the list would need an ending
    // element and that would be temp.
    ListNode fast = head;
    ListNode slow = head;
    ListNode temp = slow;
    
    while(fast!=null && fast.next!=null)
    {
        temp = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    
    // Now temp.next is set to null as temp was the ending node of the first
    // half. As soon as we set temp.next = null, we have two lists a our hands.
    // One starts from head and ends at temp. The other starts from slow and
    // ends at fast.
    temp.next = null;
    
    // Individually sort the two lists.
    Node front = sortList(head);
    Node back = sortList(slow);
    
    // Merge the sorted lists.
    return mergeTwoLists(front,back);
}

public Node mergeTwoLists(Node l1, Node l2)
{
    Node temp1 = l1;
    Node temp2 = l2;
    Node answer = new ListNode(-1);
    Node ret = answer;
    while(temp1 != null && temp2!= null)
    {
        if(temp1.val < temp2.val)
        {
            ret.next = temp1;
            temp1 = temp1.next;
        }
        else
        {
            ret.next = temp2;
            temp2 = temp2.next;
        }
        ret = ret.next;
    }
    if(temp1 != null)
    {
        ret.next = temp1;
    }
    if(temp2 != null)
    {
        ret.next = temp2;
    }
    return answer.next;
}
```

<a href="#Contents">Back to contents</a>

<a name="LL_Intersect"></a>
### Intersection of two linked lists
Given 2 linked lists, your task would be to find the intersection point of the two lists if they intersect else the answer would be null.

**Intuition:** Try to understand the intuition point by point.
1. If the two lists intersect then after the point of intersection, the length of the remaining lists would be the same for both as the list would be common after that point.
2. Hence, any difference in length of the two lists, arises before the point of intersection.
3. Let us assume this difference in length to be 'i'. If we remove this difference in length by starting the smaller list from the 1st node and starting the longer list from the ith node, and then compare the nodes of the list while iterating them one by one, if an intersection exists, we will definitely find it before reach the end.

If you have understood the intuition, then task at hand now would be to identify this difference in length. So to do this we have the following two options:
1. Iterate both the lists till they reach the end. If lengths differ, one will reach the end faster. Count the nodes, the longer list takes to reach the end from this point onwards. This is the difference in length.
2. We actually would not need the difference in length in this question. What we actually need is to start iterating the longer list directly from the i'th node if 'i' is the difference in length. Hence, as soon as the pointer of the smaller list hits null, switch it's value to point to the head of the longer list. This way by the time the pointer of the longer list hits null, the first pointer would have iterated the longer list by 'i' steps. Then point the pointer of the longer list to head of the smaller list and start comparing nodes.

The code would be as follows:
```java
public Node getIntersectionNode(Node headA, Node headB)
{
    if(headA == null || headB == null)
    {
        return null;
    }
    Node pointer1 = headA;
    Node pointer2 = headB;
    boolean check1 = false;
    boolean check2 = false;
    while(pointer1!=pointer2)
    {
        pointer1 = pointer1.next;
        pointer2 = pointer2.next;
        if(pointer1 == null)
        {
            if(!check1)
            {
                check1 = true;
                pointer1 = headB;
            }
            else
            {
                return null;
            }
        }
        if(pointer2 == null)
        {
            pointer2 = headA;
        }
    }
    return pointer1;
}
```
<a href="#Contents">Back to contents</a>

<a name="LL_RemoveDuplicates"></a>
### Remove duplicates from a sorted list
Removing duplicates from a linked list can be a two way question. One type can be to simply remove al duplicates and keep only one occurence for every element. This case is is similar to first searching for a duplicate and then simply deleteing every deuplicate node. This can be achieved by keeping a previous pointer, which at every point is compared to the current pointer, and if found equa in value, we link the previous pointer to the current.next element and move ahead. The pseudocode would be as follows:
```java
// Set value of prev node to anything other than head.val.
// Let us assume 0 at this point
Node removeuplicates(Node head)
{
    Node prev = new Node(head.val + 1);
    Node curr = head;
    while(curr!=null)
    {
        if(curr.val == prev.val)
        {
            prev.next = curr.next;
        }
        else
        {
            prev = curr;
        }
        curr = curr.next;
    }
    return head;
}
```
A modified version of the question can be when you are asked to remove all duplicate nodes and keep only unique nodes, meaning, that in the list 1 -> 1 -> 2 -> 3, the answer would be 2 -> 3 and not 1 -> 2 -> 3. This can act as a sliding window question where we maintain three pointer, previous, current and next. If previous != current and current != next, only then would the current element be unique. The code would need simple trivial changes from the code above to work as follows:
```java
public ListNode deleteDuplicates(ListNode head)
{
    if(head == null || head.next == null)
    {
        return head;
    }
    ListNode answer = new ListNode(0);
    if(head.val == 0)
    {
        answer.val = 1;
    }
    ListNode ret = answer;
    ListNode prev = answer;
    ListNode curr = head;
    ListNode next = head.next;
    
    while(curr!=null && curr.next!=null)
    {
        if(prev.val != curr.val)
        {
            if(curr.val != curr.next.val)
            {
                ret.next = curr;
                ret = ret.next;
            }
        }
        prev = curr;
        curr = curr.next;
    }
    
    if(prev.val != curr.val)
    {
        ret.next = curr;
    }
    else
    {
        ret.next = null;
    }
    return answer.next;
}
```

<a href="#Contents">Back to contents</a>

<a name="LL_Double"></a>
### Doubly Linked Lists
A doubly linked list is different from a singly linked list that it holds two pointers both to the front and the end of the list. The comparison between a doubly linked list vs a singly linked list as follows:
1. Bidirectional traversal:<br> A doubly linked list due to presence of previous pointers can be traversed in reverse as well.

2. Easy deletion:<br> Deletion is easy as you have access to previous and next of every node.

3. Easy insertion before a node:<br> Again due to previous pointer, you can easily add a node in between.

4. More space:<br> Consumes twice the sapce as a singly linked list.

5. More complex operations:<br> The extra pointer is not always beneficial, as it makes simple operation complex as now you have to check two pointers at every instance for a list.

<a href="#Contents">Back to contents</a>

<a name="StackAndQueue"></a>
## <p align="center"> Stacks and Queues </p>

<a name="SQ_Stack"></a>
### Stacks
A stack is a linear data structure which follows a LIFO(Last In First Out) pattern. What this means is that can be inserted again and again into the stack but the only data that can be retrieved is the last element that has been inserted.

A stacks supports the following basic operations:
1. Push: To insert an element at the top of the stack
2. Pop: To remove the top element from the stack
3. Peek: To get the value of the top element of the stack
4. isEmpty: To check if the stack is empty or not

All the operations in a stack take place in O(1) time. A stack can be implemented either using arrays or linked lists.

#### Array implementation of Stack
Pros:
1. Easy to implement
2. Faster as no pointers

Cons:
1. Not dynamic in size
```java
class Stack
{
    // The stack can have a fixed maximum size as arrays are not dynamic
    static final int SIZE = 1000;
    // A pointer for the top value of the stack
    int top;
    int a[] = new int[SIZE];
  
    public Stack() 
    { 
        top = -1; 
    }
    
    public boolean isEmpty()
    {
        if(top < 0)
        {
            return true;
        } 
    }
    
    public boolean push(int x) 
    { 
        if (top >= (SIZE - 1))
        {
            return false; 
        }
        else
        {
            top++;
            a[top] = x; 
            return true; 
        } 
    } 
    
    public int pop() 
    { 
        if (top < 0)
        {
            return Integer.MIN_VALUE;
        } 
        else
        {
            int x = a[top];
            top--;
            return x; 
        }
    }
    
    public int peek() 
    {
        if (top < 0)
        { 
            return Integer.MIN_VALUE;
        }
        else
        {
            int x = a[top]; 
            return x; 
        } 
    } 
} 
```
<a href="#Contents">Back to contents</a>

#### Linked List implementation of Stack
Pros:
1. Dynamic in size, thus can expand

Cons:
1. Difficult to implement
2. Takes more memory due to pointers
```java
class Node
{
    int data; 
    Node next; 
    
    public Node(int data) 
    { 
        this.data = data; 
    }
}
    
class Stack
{
    Node root = null;
  
    public boolean isEmpty() 
    { 
        if (root == null)
        { 
            return true; 
        } 
        else
        {
            return false; 
        }
    } 
  
    public void push(int data) 
    { 
        Node newNode = new Node(data); 
  
        if (root == null)
        { 
            root = newNode; 
        } 
        else
        { 
            Node temp = root; 
            root = newNode; 
            newNode.next = temp; 
        }
    }
    
    public int pop() 
    { 
        int popped = Integer.MIN_VALUE; 
        if (root != null)
        {
            popped = root.data; 
            root = root.next; 
        } 
        return popped; 
    }
  
    public int peek() 
    { 
        if (root == null)
        { 
            return Integer.MIN_VALUE; 
        } 
        else
        { 
            return root.data; 
        } 
    } 
}
```
<a href="#Contents">Back to contents</a>

#### Inbuilt JAVA class for Stacks
All operations are O(1)
```java
 Stack<Integer> A = new Stack<Integer>();
 A.push(new Integer(newElement));
 A.pop();
 A.empty();
 A.size();
 A.peek();
 A.search(); // O(n) time
```
<a href="#Contents">Back to contents</a>

<a name="SQ_Queue"></a>
### Queues
A queue is very similar to a stack with the only difference being that the removal order is first in first out.

A queue supports the following basic operations:
1. Enqueue: To insert an element at the rear of the queue
2. Dequeue: To remove the first element from the queue
3. Front: To get the value of the first element of the queue
4. Rear: To get the value of the last element of the queue
5. isEmpty: To check if the stack is empty or not

All the operations in a queue take place in O(1) time. A queue can be implemented either using arrays or linked lists.

#### Array implementation of queue
```java
class Queue
{
	public int front;
	public int rear;
	public int size;
	// Capacity is different from size as size is number of elements
    // and capacity is the maximum size possible
	public int capacity;
	public int array[];

	public Queue(int cap)
	{
		capacity = cap;
		front = size = 0;
		rear = cap - 1;
		array = new int[capacity];
	}

	public boolean isFull()
	{
		if (size == capacity)
		{
			return true;
		}
		return false;
	}

	boolean isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
		return false;
	}

	/*
    The enqueue and dequeue functions are to be written with care. Unlike
    stack it is not the last element that has to be removed. The starting
    of the array has to be modified.
    Hence insertion and deletion are %capacity.
    */
	public void enqueue(int item)
	{
		if (this.size == this.capacity)
		{
			return;
		}
		rear = (rear + 1) % capacity;
		size++;
		array[rear] = item;
	}

	public int dequeue()
	{
		if (size == 0)
		{
			return Integer.MIN_VALUE;
		}
		int item = array[front];
		front = (front + 1) % this.capacity;
		size--;
		return item;
	}

	public int front()
	{
		if (size == 0)
		{
			return Integer.MIN_VALUE;
		}
		return array[front];
	}

	public int rear()
	{
		if (size == 0)
		{
			return Integer.MIN_VALUE;
		}
		return array[rear];
	}
}
```
<a href="#Contents">Back to contents</a>

#### Linked list implementation of queue
```java
class Queue
{
	Node front, rear;

	public Queue()
	{
		front = rear = null;
	}

	public void enqueue(int key)
	{
		Node temp = new Node(key);
		if (rear == null)
		{
			front = rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
	}

	public Node dequeue()
	{
		if (front == null)
		{
			return null;
		}
		Node temp = front;
		front = front.next;
		if (front == null)
		{
			rear = null;
		}
		return temp;
	}
	
	public Node front()
	{
		return front;
	}
	
	public Node rear()
	{
		return rear;
	}
}
```
<a href="#Contents">Back to contents</a>

#### Inbuilt JAVA interface for queue
All operation are O(1)
```java
Queue A = new LinkedList(); 
A.add(new Integer(newElement));
A.poll();
A.isEmpty();
A.size();
A.peek();
```
<a href="#Contents">Back to contents</a>

<a name="SQ_PQ"></a>
### Priority Queues
A priority queue is a type of a queue in which elements are removed on the basis of their priority. The item with the highest priority is the one which is always removed first. Priority queue can be directly implemented in java in the following way:
```java
PriorityQueue<Integer> A = new PriorityQueue<Integer>();
A.add(new Integer(newElement)); //O(logN)
A.poll(); //O(logN)
A.isEmpty(); //O(1)
A.size(); //O(1)
A.peek(); //O(1)
A.remove(Onject); //O(n)
```
<a href="#Contents">Back to contents</a>

#### Priority Queue with comparator in JAVA
A priority queue can be made for custom classes as well. An example for a class Pair would be as follows:
```java
// How to define a PriorityQueue for a custom class.
PriorityQueue<Pair> pQueue = new PriorityQueue<Pair>(new Comparison());

// Defining the comparator class for the queue
class Comparison implements Comparator<Pair>
{
    @Override
    public int compare(Pair p1, Pair p2)
    {
        if (p1.value > p2.value)
        {
            return 1;
        }
        else if(p1.value < p2.value)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

class Pair
{
    public int key;
    public int value;
    
    public Pair(int k, int v)
    {
        key = k;
        value = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="Graphs"></a>
## <p align="center"> Graphs </p>
A graphs is a 2D data structure which consists of nodes and edges. The nodes are the vertices of the graph and the edges are the lines/path connecting these vertices. The nodes in the graphs can be classes in themselves, containting information more than simply a single vaue, and the edges might represent connections between the structures.

Other than understanding concepts and solving questions based on graphs, we will also build a standard graph class which would support all the standard graph queries. We will build this class step by step as various subsections proceed.

<a name ="GP_Representations"></a>
### Representing a graph
A graph maybe represented as an adjaceny list or as an adjacency matrix.

#### Adjacency Matrix
The adjacency matrix represtation of the graph represetns the graph through a matrix. The matrix is of size V x V where V is the number of vertices. Each cell, (i,j) represents that whether a connection between the vertices, i and j exists or not. The adjacency matrix for an undirected graph will always be symmetrics. An undrected graph is a graph where movement on every edge is allowed in both directions. If the graph is weighted, the adjacency matrix, instead of keeping 1's and 0,s to denote presence or absence of edges, can instead use the weights of edges as entries to denote presence.

Adjacency matrix is used when the number of vertices are small and the task is related to identifying that whether or not an edge exists in a given graph. Seeing if an edge exists takes O(1) time, if the vertices to check between are known already.

The graph is represented usign a 2D array like int[][] graph.

#### Adjacency List
The adjacency list concept is different from the adjacency matrix in the way that it only stores the edges present, and does not have any storage to represent a non existent edge. As the name suggests, we store a list of nodes that a node is connected to, formign a list of list. The outer list, also known as the parent list, represents the starting vertices, and the inner list at every index 'i' of the outer list, represesnts the nodes that the node 'i' is connected to.

The structure is represtend like a ArrayList<ArrayList<Integer>> adj, where adj.get(i) is list of nodes connected to node 'i'.

Most of the remaining concepts covered are bsed on the adjacency list representation of graphs and hence we will now look at how to build an adjacency list represtation from scratch:
```java
class Graph
{
    // Adjacency list which is list of list
    ArrayList<ArrayList<Integer>> adj = null;
    // Number of vertices
    int V = 0;
    
    // Initialise the graph
    public Graph(int v)
    {
        // Input the number of vertices
        V = v;
        // Initialise adj for those many vertices
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }
    
    // Add an edge from v to u
    public void addEdge(int v, int u)
    {
        adj.get(v).add(u);
        // For undirected graphs, add reverse edge too
        adj.get(u).add(v);
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_BFS"></a>
### Breadth First Traversal
The BFS on a graph is very similar to the BFS on a tree. For those who haven't completed the section on trees above, BFS is a searching technique which helps you search through various nodes of a tree or a graph level by level. We begin with a starting index, root in case of trees, and then traverse all the nodes that can be reached from in one step and and add them in a queue. Then for all the nodes present in the queue we repeat the process, until the queue becomes empty. Why use a queue? The aim of a BFS search is to first visit all direct children of the node and then proceed with each child seperately. This can be achieved by maintaining a queue which follows a FIFO order and hence only when the processing of parents at the starting of the queue is completed, the subequent children are proccessed.

The difference between the BFS of a tree and that of a graph is that in graphs we need to maintain a visited array, to store the nodes which have been visited before. This is needed because unlike trees, graphs may contain cycles and without a visited array the search might end up in an infinite loop. We further build our graph class by adding the BFS functionality to it.
```java
class Graph
{
    // ASSUME PREVIOUS CODE OF GRAPH CLASS REMAINS UNCHANGED
        
    // Breadth first traversal
    public void BFS(int start)
    {
        /*
        Construct a visted array to avoid infinite loops
        Always remember to mark a node as visited as soon
        as you reach it.
        */
        boolean visited[] = new boolean[visited];
        
        /*
        Construct a queue to store incoming
        vertices for further processing
        */
        Queue<Integer> queue = new LinkedList<Integer>();
        
        /*
        We begin by adding the starting node
        to the queue and process the queue
        till it becomes empty, that is all nodes
        have been exhausted.
        */
        queue.add(start);
        visited[start] = true;
        int st = 0;
        
        /*
        The following loop runs till the queue becomes empty,
        that is till all of the nodes have been visted.
        */
        while(!queue.isEmpty())
        {
            // Remove the queue top, i.e the node to process
            st = queue.poll();
            
            // Process the node as you like. Here we print.
            System.out.println(st + " ");
            
            /*
            For all the nodes connected to 'st' add them
            to the queue so that they can be proccessed in
            the next level of te BFS iteration. Every node
            added to the queue. necessarily needs them to
            be marked as visited in the visited array. The
            adjacency list for node 'st' can be used to add
            the adjacent nodes of 'st' to queue.
            */
            for(int i = 0; i < adj.get(st).size(); i++)
            {
                int c = adj.get(st).get(i);
                if(!visited[c])
                {
                    visited[c] = true;
                    queue.add(c);
                }
            }
        }
    }
}
```
The above code for BFS only works in the case when no disconnected components are present. Disconnected components of a graph exist, when the entire graph is not reachable from a vertex. For example, 1 -> 2 -> 3 and 4 -> 5 -> 6 are two disconnected components of the same graph and if we call BFS only on node 1 then we would never know about the existence of nodes 4,5 and 6. To tackle this problem, we modify our BFS function by making a wrapper function which calls our inner BFS function for every unvisited node yet. For this, we also need to move our visited array to the wrapper class and send it as an argument to the main BFS function as now we also need to check visted nodes outside the main BFS function to call BFS on remaining unvisted nodes. We add a BFS_Util function and modify the BFS function to accomodate these cahnges.
```java
class Graph
{
    // ASSUME PREVIOUS CODE OF GRAPH CLASS REMAINS UNCHANGED
    
    // Wrapper function for BFS
    public void BFS_Util()
    {
        /*
        Construct a visted array to avoid infinite loops
        and to accomodate for disconnected components of
        the graph. Always remember to mark a node as
        visited as soon as you reach it.
        */
        boolean visited[] = new boolean[visited];
        
        /*
        Call the BFS function for every unvisted node
        present in the graph
        */
        for(int i = 0; i < adj.size(); i++)
        {
            if(!visited[adj.get(i)])
            {
                BFS(adj.get(i), visited);
            }
        }
    }
    
    // Breadth first traversal
    public void BFS(int start, boolean[] visited)
    {
        /*
        Construct a queue to store incoming
        vertices for further processing
        */
        Queue<Integer> queue = new LinkedList<Integer>();
        
        /*
        We begin by adding the starting node
        to the queue and process the queue
        till it becomes empty, that is all nodes
        have been exhausted.
        */
        queue.add(start);
        visited[start] = true;
        int st = 0;
        
        /*
        The following loop runs till the queue becomes empty,
        that is till all of the nodes have been visted.
        */
        while(!queue.isEmpty())
        {
            // Remove the queue top, i.e the node to process
            st = queue.poll();
            
            // Process the node as you like. Here we print.
            System.out.println(st);
            
            /*
            For all the nodes connected to 'st' add them
            to the queue so that they can be proccessed in
            the next level of te BFS iteration. Every node
            added to the queue. necessarily needs them to
            be marked as visited in the visited array. The
            adjacency list for node 'st' can be used to add
            the adjacent nodes of 'st' to queue.
            */
            for(int i = 0; i < adj.get(st).size(); i++)
            {
                int c = adj.get(st).get(i);
                if(!visited[c])
                {
                    visited[c] = true;
                    queue.add(c);
                }
            }
        }
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_DFS"></a>
### Depth First Traversal
DFS is also a searching algorithm which differs from BFS in the way that it searchs to the deepest level possible for a node first, before moving on to searching in the other children of the node. BFS searches all the children first and then proceeds to process children seperately. DFS instead processes the children to the deepst level first, then recurses back to proceed to other children.

Just like BFS, we use a wrapper function with a visted array to accomodate for disconnected components of a graph.
```java
class Graph
{
    // ASSUME PREVIOUS CODE OF GRAPH CLASS REMAINS UNCHANGED
    
    // Wrapper function for DFS
    public void DFS_Util()
    {
        /*
        Construct a visted array to avoid infinite loops
        and to accomodate for disconnected components of
        the graph. Always remember to mark a node as
        visited as soon as you reach it.
        */
        boolean visited[] = new boolean[visited];
        
        /*
        Call the DFS function for every unvisted node
        present in the graph
        */
        for(int i = 0; i < adj.size(); i++)
        {
            if(!visited[adj.get(i)])
            {
                DFS(adj.get(i), visited);
            }
        }
    }
    
    // Depth first traversal
    public void BFS(int start, boolean[] visited)
    {
        /*
        We begin by marking the starting node as
        visited.
        */
        visited[start] = true;
        
        // Process the node as you like. Here we print.
        System.out.println(start);
        
        /*
        The following loop runs for all the children of
        the node. For every unvisited child, we run the DFS
        function on it, to reach the deepest level first
        before processing the other children. The adjacency
        list for node 'start' can be used for iteration.
        */
        for(int i = 0; i < adj.get(start).size(); i++)
        {
            int c = adj.get(start).get(i);
            if(!visited[c])
            {
                DFS(c, visited);
            }
        }
    }
}
```
***NOTE: A key point to remember can be that in DFS, the node is marked as visited inside the loop that is once it has been reached and is being processed, on the other hand in BFS a node is marked as visited when it is being added to the queue for further processing.***

<a href="#Contents">Back to contents</a>

<a name="GP_Reverse"></a>
### Reverse a graph
Reversing a graph is simple. All you need to do is for every edge from u to v create an edge from v to u. Reversing a graph can be used to reverse the sinks of a graph. A sink is a point from where you cannot reach any other vertex of the graph.
```java
class Graph
{
    // ASSUME PREVIOUS CODE OF GRAPH CLASS REMAINS UNCHANGED
    
    // Reverse a graph
    public Graph getReverse() 
    { 
        Graph g = new Graph(V); 
        for (int v = 0; v < V; v++) 
        { 
            // Recur for all the vertices adjacent to this vertex 
            for(int i = 0; i < adj.get(v).size(); i++)
            {
                int c = adj.get(v).get(i);
                g.adj.get(c).add(v); 
            }
        } 
        return g; 
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_ConnectedComponents"></a>
### Connected Components in an Undirected Graph
Connected components are those components in an undirected graph in which all vertices can be reached from every other vertex. Connected componnets task in an undirected graph is trivial and requires us to just simply perform a BFS/DFS traversal on the graph on every unvisted node, and every new iteration of BFS/DFS outputs a new connceted component. The code is trivial and thus has been omitted out of explanation.

<a href="#Contents">Back to contents</a>

<a name="GP_SCC"></a>
### Strongly Connected Components - Kosaraju's Algorithm
A directed graph is strongly connected if there is a path between all pairs of vertices. A strongly connected component (SCC) of a directed graph is a maximal strongly connected subgraph. This means that within a strongly connected directed graph, if we can partition the graph in such a way that every partition in itself is strongly connected and that adding even a single node to any of these component graphs would result in making it not strongly connected.

The steps for the algorithm would be as follows:
1. Run DFS on the graph and as and when every node is completed, add it to a stack. When we do this, the node that gets completed first, gets added to the stack first. Hence, the node at the very bottom gets added first, that is all the sinks get added to stack first. 
2. Now we have a stack, the bottom of which is the node which gets completed first, and top is the node which gets completed last. Note, by a node getting completed we mean, DFS running for all its children.
3. Now we reverse the graph and create a transpose of the graph. Creating a transpose reverses the order of sinks and heads in the graph. The nodes that were sinks before, are now the heads and vice versa.
4. On the graph reversed, we run DFS one by one on the elements in the stack, till the stack is empty. For every time we run the DFS, we generate a new SCC.

As DFS and reversing a graph have bee covered before, writing the code for this algorithm is trivial and hence not being covered here. For details on the code please refer to: https://www.geeksforgeeks.org/strongly-connected-components/

<a href="#Contents">Back to contents</a>

<a name="GP_FindMother"></a>
### Find mother vertex
A mother vertex is defined as the vertex in the graph from which all other vertices in the graph can be reached. There may exist more than one mother vertices, and the aim is to find any one of them. Three cases arise for the graph:
1. Disconnected graphs: No mother vertex exists
2. Connected undirected graphs: All vertices are mother vertices
3. Connected directed graphs: To be found

One method can be to perform BFS/DFS on all vertices one by one to check that from which can we reach all end points. Time compexity would be O(Num vertices x Time for DFS/BFS) = O(V(V+E)).

Another way to solve the problem can be using the concept similar to finding strongly connected components. We run DFS from a given node in the graph and store in a stack the last finished nodes. Hence, the top of the stack would point to the node that finishes last. The node that finishes last will necessarily have to be the mother vertex if one exists, as had it not been a mother vertex, so it would have acted as a sink during the DFS traversal and ended before the mother vertex.

Using this concept, to check the existence of a mother vertex, we run DFS with storing nodes in stack as and when each node is completed. The top of the stack is then checked to be the mother vertex. Thsi is done using DFS on the top node. If DFS travels to all nodes, then it is the mother vertex else mother vertex does not exist.

To check during DFS that all nodes have been visited or not, we can apply either of the following two methods:
1. As a visted aray is maintained, once nodes are visited they are marked as true. Hence after one iteration of DFS from the top node in the stack, break and check whether or not all nodes are visited. If yes then it is the mother vertex, else it is not.
2. As the visisted array prevents us from visiting the same node once again, we can keep count of every time we reach a new node. When we reach a new node we do count++. This way if end count equals number of vertices then it is the mother vertex else it is not.

As the code requires just slight modifications to the code for the DFS traversal of a graph, we do not cover the code for this question here due to triviality.

<a href="#Contents">Back to contents</a>

<a name="GP_CheckIfSCC"></a>
### Check if a directed graph is strongly connected
To check that whether a directed graph is strongly connected or not, we use the conecpt similar to Kosaraju's algorithm for finding all SCC. if we find all SCCs and the number of SCCs is just one, then the graph is strongly connected. But the task here is only different in the meaning that we need to confirm that whther a single SCC covers the entire graph or not and need not find more than one SCC. We ca ndo this according to the following steps:
1. Marks all nodes unvisited.
2. Do DFS, if any node remains unvisited, then return false.
3. If above step did not return false, so reverse the graph.
4. Again do DFS from the same node. If if any node remains unvisited, then return false.
5. if above step did not return false, so return true.

<a href="#Contents">Back to contents</a>

<a name="GP_Dijkstra"></a>
### Dijkstra's Algorithm
Use Case:
- Shortest distance from one source to all destinations
- Weighted graph without negative weights

The algorithm for Dijkstra is a BFS inspired algorithm. The aim is to start BFS from the source vertex, and keep updating the distances of the nodes on each level. Instead of a normal queue, we use a priority queue in dijkstra BFS. The reason is that we always need the node with the shortest distance from the source at all time, as for the node at any level with the shortest distance, the distance from source would not change at any further levels. The distance is updated based on the formula:<br>
Distance of node from source = Distance of parent from source + Distance of node from parent

The time complexity is ((E+V)logV) = ElogV.

The distances are stored in a dist[] arrar. All the nodes with updated distances are added to the priority queue which is sorted on the basis of dstance from source, and their distances are updated in the dist[] arr. From the priority queue just like in BFS we pop the head and then do the same for the popped node. We update the distances of the nodes adjacent to the popped node on the basis of the distance of the popped node and add them to the priority queue. Once distance of all adjacent nodes of a popped node have been updated, the popped node is marked as complete. This can be done by either keeping a visited array or by maintaining a HashMap of completed nodes. The process continues till the priority queue becomes empty. At the end, the dist[] arr would hold the distance of each node from the source. Moreover, if the path to any vertex from the course needs to be stored, we can maintain a parent[] array. The parent array will hold the parent node of a vertex and to print the path, we may iterate the parent array until we hit the source. The parent array is updated along with the distance array. The parent of a neighbour who's distance is updated becomes the node that was popped out.

The steps of the algorithm would provide a better understanding of the funcitoning:
1. Start with the source, and add it to the prioirty queue. The distance of source from source is 0.
2. Now until the priority queue becomes empty, pop the head. If the head exists in the HashMap of completed elements, discard this element and move ahead. If it does not exist,  then use this popped node and also add it to the completed HashMap. This is done to ensure that once the distance of a node is finalized as mininimum distance till that vertex, no more further changes be allowed to it.
3. For the popped node, for every neighbour not already in the completed HashMap, check if the distance needs to be updated or not. Distance is updated only in the following condition:<br>
Let popped node be 'p'<br>
Let neighbour be 'n'<br>
Let source be 's'<br>
Distance updated only if dist[n] < dist[p] + Distance between 'p' and 'n', that is only if current distance of 'n' from 's' is less than sum of distance of 'n' from 'p' and distance of 'p' from 's'.<br>
If the distance is updated then add this node to the priority queue. Moreover, as the distance has been updated, so this means that the shortest way to reach 'n' is now through 'p' and hence we update the parent aray as follows:<br>
parent[n] = p;
4. Keep repeating the process until priority queue is empty. The final distance array would provide you with shortest distances and parent array would help in finding the path to a given vertex.

The code is as follows:
```java
class Graph
{
    // Distance and parent arrays
	int dist[];
    int parent[];
    // HashMap to store completed nodes
	HashMap<Integer, Integer> hMap;
    // Priority Queue for getting shortest distance Node
	PriorityQueue<Node> pQueue;
	int V;
	ArrayList<ArrayList<Node>> adj;

	public Graph(int v)
	{
		V = v;
		dist = new int[V];
        parent = new int[V];
		adj = new ArrayList<ArrayList<Node>>();
		for (int i = 0; i < V; i++)
		{
            // Initial distances are marked as infinite
			dist[i] = Integer.MAX_VALUE;
            // Initial parents are -1
            parent[i] = -1;
			adj.add(new ArrayList<Node>());
		}
		hMap = new HashMap<Integer, Integer>();
        // Priority queue sorted on the basis of distances
		pQueue = new PriorityQueue<Node>(new Comparison());
	}

	public void addEdge(int u, int v, int d)
	{
        // We add nodes along with the distance of the edge joining them
		adj.get(u).add(new Node(v, d));
        
        // For undirected graphs, add both directions
		adj.get(v).add(new Node(u, d));
	}
    
    // Code for dijkstra
	public void dijkstra(int src)
	{
        // Add source to pQueue
		pQueue.add(new Node(src, 0));
        
        // Mark distance of source as 0
		dist[src] = 0;
		while (!pQueue.isEmpty())
		{
            // Check if the head of the priority
            // queue is already completed or not.
            // If yes discard, else move ahead
			while (!pQueue.isEmpty() && hMap.containsKey(pQueue.peek().ind))
			{
				pQueue.poll();
			}
			if (pQueue.isEmpty())
			{
				break;
			}
            // Get the head of the priority queue
			Node node = pQueue.poll();
            
            // Node index value of head
			int st = node.ind;
            
            // Distance of head from source
			int dt = node.dis;
            
            // As this is the shortest distance node
            // available, mark it as completed and add
            // to hashmap.
			hMap.put(st, dt);
            
            // For all adjacent nodes
			for (int i = 0; i < adj.get(st).size(); i++)
			{
                // Get index value of adjacent node
				int c_ind = adj.get(st).get(i).ind;
                
                // Get possible distance of this node from source
                // Dist = Dist of parent + Dist from parent
				int c_dis = adj.get(st).get(i).dis + dt;
                
                // If this adjacent node is not already marked as completed
				if (!hMap.containsKey(c_ind))
				{
                    // If possible distance is smaller than current distance
					if (c_dis < dist[c_ind])
					{
                        // Add this element to priority queue
						pQueue.add(new Node(c_ind, c_dis));
                        
                        // Update distance
						dist[c_ind] = c_dis;
                        
                        // Update parent, as the parent for the shortest
                        // distance now is the popped node 'st'.
                        parent[c_ind] = st;
					}
				}
			}
		}
	}
    
    public ArrayList<Integer> pathToX(int x)
    {
        // Answer given as arraylist of nodes
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // Add the current element, as path will necessarily
        // include the current element even if path length is 1
        arr.add(x);
        
        // Check for element's parents, if element's parent is
        // not -1, that is element has a parent, add the parent
        // to the answer and then make element = parent and
        // repeat until parent becomes -1.
        while(parent[x] != -1)
        {
            arr.add(parent[x]);
            x = parent[x];
        }
        
        // As the path is added in reverse, reverse the array
        Collections.reverse(arr);
        return arr;
    }
}

// Node class to store node index and
// dist of the edge leading to this node
class Node
{
	int ind;
	int dis;

	public Node(int n, int d)
	{
		ind = n;
		dis = d;
	}
}

// Defining the comparator class for the queue
// Sort on basis of increasing distance
class Comparison implements Comparator<Node>
{
	@Override
	public int compare(Node p1, Node p2)
	{
		if (p1.dis > p2.dis)
		{
			return 1;
		}
		else if (p1.dis < p2.dis)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_BellmanFord"></a>
### Bellman–Ford Algorithm
Use Case:
- Shortest distance from one source to all destinations
- Weighted graph with negative weights, no negative weight cycles

Dijkstra does not work in case of negative weights being present in the graph. In case of negative weights, we can use Bellman Ford Algorithm to get the shortest distance from a source to all vertices and check for the presence of a negative weight cycle.

<ins>Fact-1</ins>: In a graph having v vertices, the maximum non cyclic path length can be v-1. Any path of length >= v, will definitely form a cycle.

<ins>Fact-2</ins>: In case of a cycle consisting of poistive edges only, iterating the path again and again will increase the total to infinite, whereas in case of cycles having a negative weight sum the cost can continue to keep on descreasing till negative infinite.

Using the above two facts we can visualize an algorithm, that builds all path lengths of paths upto length v-1, and when done, checks once again for shorter path lengths possible. If there is still a shorter path length possible, then a newgative weight cycle is present.

Steps:
1. Initialise distance and parent arrays.
2. We start finding shortest distances for paths of length 1 to paths of length v - 1. For v-1 times, for all the edges present in the graph, for each edge we check that for the edge u - > v, is it possible to get a distance smaller than current dist[v]. That is, dist[v] < dist[u] + length of u-v. If yes, so we update dist[v] and parent[v] as well.<br>
_The reason this step is done v-1 times is that, initially when all distances are infinite, the first iteration would confirm the shortest ditances of paths of length 1 from source. While other distances might have been updated too, but they may not necessarily be the shortest. On the second iteration, as paths of length 1 have already been finalized, so now paths of length 2 would be finalized, that is nodes which are just a single edge away from previously finalized nodes. Building up like this, in v-1 iterations, we can be sure that all non cyclic paths have been finalized to be the shortest possible paths._
3. Once paths have been finalized, run a final loop over all edges once again, checking that is it still possible to get a smaller path sum than the already finalized values. If true, that means that there is a negative weight cycle present, else there is no negative weight cycle and the path lengths finalized so far are correct.

Time complexity is O(EV).

Code:
```java
class Graph 
{
    // The graph is built be adding edges
    // Each index in the graph represents an edge (u, v, d)
    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    int V = 0;
    int dist[] = null;
    int parent[] = null;
    
    public Graph(int v)
	{
		V = v;
		dist = new int[V];
        parent = new int[V];
        for (int i = 0; i < V; i++)
		{
            // Initial distances are marked as infinite
			dist[i] = Integer.MAX_VALUE;
            // Initial parents are -1
            parent[i] = -1;
		}
	}

	public void addEdge(int u, int v, int d)
	{
        // Creating an edge
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // Edge starting
        arr.add(u);
        // Edge ending
        arr.add(v);
        // Edge distance
        arr.add(d);
        // Add edge to graph
        graph.add(arr);
	}
    
    // Return true if possible to get shortest paths
    // Return false if negative weight cycle is present
    public boolean BellmanFord(int src) 
    {
        // Distance of source is 0
        dist[src] = 0;
        
        // Run vertices - 1 times
        for(int v1 = 0; v1 < V; v1++)
        {
            // For every edge in the graph
            for(int i = 0; i < graph.size(); i++)
            {
                int u = graph.get(i).get(0);
                int v = graph.get(i).get(1);
                int d = graph.get(i).get(2);
                // Check if ditsnace of edge can be upated or not
                if(dist[v] > dist[u] + d)
                {
                    // If yes so pdate distance and parent
                    dist[v] = dist[u] + d;
                    parent[v] = u;
                }
            }
        }
        
        // Check for negative weight cycle
        // In a graph of v vertices, maximum non cyclic
        // path can be of length v-1. All paths of length v-1
        // have been computed in v-1 iterations above. If
        // the distance of a vertex still decreases then that
        // means we have a negative weight cycle.
        for(int i = 0; i < graph.size(); i++)
        {
            int u = graph.get(i).get(0);
            int v = graph.get(i).get(1);
            int d = graph.get(i).get(2);
            if(dist[v] != Integer.MAX_VALUE && dist[v] > dist[u] + d)
            {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Integer> pathToX(int x)
    {
        // Answer given as arraylist of nodes
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // Add the current element, as path will necessarily
        // include the current element even if path length is 1
        arr.add(x);
        
        // Check for element's parents, if element's parent is
        // not -1, that is element has a parent, add the parent
        // to the answer and then make element = parent and
        // repeat until parent becomes -1.
        while(parent[x] != -1)
        {
            arr.add(parent[x]);
            x = parent[x];
        }
        
        // As the path is added in reverse, reverse the array
        Collections.reverse(arr);
        return arr;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_FloydWarsahll"></a>
### Floyd Warshall Algorithm
Use Case:
- Shortest distance between all pairs of vertices
- Weighted graph with negative weights allowed

The task is to compute the shortest distances between every pair of vertices in the graph. The graph is directed and may contain negative weights as well. We calculate this using dp. The task is that for every vertice k, we calculate shortest path between i and j such that k is a vertex in the path. Hence, the steps would look like:
```
For every vertex k from 0 to (v-1)
    For every vertex i from 0 to (v-1)
        For every vertex j from 0 to (v-1)
            dist(i,j) = Math.min(dist(i,k) + dist(k,j))
```
Distance and parents are stored in a way similar to Dijkstra and Bellman Ford.
The input graph should be taken as an adjacency matrix, graph[][], where graph[i][j] = INF if an edge doesn't exist between i and j. Time complexity is O(V^3).

The code for the algorithm is as follows:
```java
public void floydWarshall(int graph[][]) 
{ 
    int dist[][] = new int[V][V];
    int parent[][] = new int[V][V];
    /*
    Initialize the solution matrix same as input graph matrix.
    This is because initial values of shortest distances are
    based on shortest paths with no intermediate vertex.
    */
    for (int i = 0; i < V; i++)
    {
        for (j = 0; j < V; j++)
        {
            dist[i][j] = graph[i][j];
            parent[i][j] = -1;
        }
    }
    
    // Intermediate vertices loop
    for (k = 0; k < V; k++)
    {
        // Source vertices loop
        for (i = 0; i < V; i++)
        {
            // Destination vertices loop
            for (j = 0; j < V; j++)
            {
                if (dist[i][k] + dist[k][j] < dist[i][j])
                {
                    dist[i][j] = dist[i][k] + dist[k][j];
                    parent[i][j] = k;
                }
            }
        }
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_ShortestPathUnweighted"></a>
### Shortest path in an unweighted graph

<a href="#Contents">Back to contents</a>

<a name="GP_ShortestPathDAG"></a>
### Shortest path in a Directed Acyclic Graph

<a href="#Contents">Back to contents</a>

<a name="GP_GraphColoring"></a>
### Graph coloring - Chromatic Number

<a href="#Contents">Back to contents</a>

<a name="GP_mColoring"></a>
### m-Coloring Problem

<a href="#Contents">Back to contents</a>

<a name="GP_CountAllSourceDestination"></a>
### Count all paths from source to destination in a graph
Counting all paths between two vertices is a backtracking problem on graphs. The methodoly is to follow the DFS pattern to reach the destination vertex, and every time you reach the destination, increase the count of number of ways.

Please note that this method works only for graphs which do not have cycles. If a graph has a cycle then infinite number of paths can be formed from source to destination as the cycle can be looped around infinite number of times. Hence, the input is valid only if it does not have any cycles, and hence this method of a modified DFS, does not require you to make checks for visited.

The code is as follows:
```java
class Graph
{
    // ASSUME PREVIOUS CODE OF GRAPH CLASS REMAINS UNCHANGED
    
    // Consider a global variable count to maintain count of paths
    int count = 0;
    
    // The wrapper function to call the recursive function
    public int countAll(int start, int dest)
    {
        countAll_Util(int s, int d);
        return count;
    }
    
    // Recursive function to count paths
    public void countAll_Util(int start, int dest)
    {
        // If current node meets the destination
        // Then increase count
        if(start == dest)
        {
            count++;
        }
        else
        {
            // For all the adjacent nodes of the current node
            // Call the recursive function again
            for(int i = 0; i < adj.get(start).size(); i++)
            {
                countAll_Util(adj.get(start).get(i), dest);
            }
        }
    }
}
```
For a graph containing a cycle, a modification can be that count all the paths to reach the destination, such that in a path, a node is encountered at most once. In this scenario, even after the presence of cycles, the question can be solved by maintaining a simple visited array to check when a node has been visited in a path. We illustrate this concept through the next question.
<a href="#Contents">Back to contents</a>

<a name="GP_PrintAllSourceDestination"></a>
### Print all paths from source to destination in a graph
Please complete the above section first and then proceed with this. We use the same DFS inspired algortihm to print the paths as well, by possibly storing all the paths in a List. Moreover, we consider that the graph may contain cycles, hence, we have a limit that the same node cannot be visited twice in any path. The code would be as follows:
```java
class Graph
{
    // ASSUME PREVIOUS CODE OF GRAPH CLASS REMAINS UNCHANGED
    
    // The wrapper function to call the recursive function
    public List<List<Integer>> countAll(int start, int dest)
    {
        // The list that will hold the final asnwer
        List<List<Integer>> ans = new ArrayList<>();
        
        // A boolean visited list to check nodes visited in a path
        boolean[] visited = new boolean[V];
        
        // The new ArrayList<Integer>() is the list for each
        // individual path
        countAll_Util(int s, int d, ans, new ArrayList<Integer>(), visited);
        return ans;
    }
    
    // Recursive function to store paths
    public void countAll_Util(int start, int dest, List<List<Integer>> ans, ArrayList<Integer> arr, boolean[] visited)
    {
        /*
        Mark the current node as visited and add it to the
        current path so far.
        */
        visited[start] = true;
        arr.add(start);
        
        // If current node meets the destination
        // then add the arr to ans
        if(start == dest)
        {
            ans.add(new ArrayList<>(arr));
        }
        else
        {
            /*
            For all the adjacent nodes of the current node
            which have not been visited yet, call the function
            on them again.
            */
            for(int i = 0; i < adj.get(start).size(); i++)
            {
                if(!visited[adj.get(start).get(i)])
                {
                    countAll_Util(adj.get(start).get(i), dest);
                }
            }
        }
        /*
        Mark the current node as not visited and remove
        it from the current path so far. This is done because
        now the current node has been completed and all the paths
        from this node have already been added to the asnwer.
        */
        visited[start] = false;
        arr.remove(arr.size() - 1);
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_KnightProblem"></a>
### Minimum steps to reach target by Knight
The question statement is as follows:<br>
Given a M x N board, a position at which a Knight(Chess piece) has been placed. Find the minimum number of steps the Knight need to reach a given destination.

This problem can be consdiered as a variation of the shortest path in an unweighted graph. The only difference would be, that instead of actually having adjacent nodes as an input in the graph, we would need to calculate them ourselves according to the rules of chess for a Knight's movement. Hence, the only movements allowed will be two steps up,down,right or left and then then one step perpendicular to it.

Running the BFS with these movements in mind, as we traverse level by level. At all times, the nodes on a level so far will have covered the same distance from the source. Hence, as soon as the destination is reached for the first time, the distance so far to the destination will be minimum and our search can end. The code is as follows:
```java
/*
Create a class cell to identify the position
of a cell and the distance from the source
*/
class cell
{
    int x;
    int y;
    int dis;
    
    public cell(int X, int Y, int Dis)
    {
        x = X;
        y = Y;
        dis = Dis;
    } 
} 

class Solution
{
    /*
    A method to validate that whether or not a cell
    lies inside the board. Hecne we check that the
    cell's cordinates should be within board limits.
    */
    public boolean isInside(int x, int y, int N)
    {
        if (x < 0 && x >= N && y < 0 && y >= N)
        {
            return false;
        }
        return true; 
    } 

    // Main method
    public int minStepToReachTarget(int start_x, int start_y, int dest_x, int dest_y, int N)
    {
        /*
        As we will have to select 8 different possible moves
        for the night, insetad of having 8 different if conditions,
        we can make two arrays, corresponding to the eight
        possible movement pairs. Hence, calling the next move
        can be like (start_x + dx[i], start_y + dy[i])
        */
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

        // The BFS queue
        Queue<cell> queue = new LinkedList<>();
        // The visited array to avoid visiting the same path in loops
        boolean visit[][] = new boolean[N][N]; 

        /*
        Add the starting cell to queue and mark it visited
        The starting cells is (start_x, start_y) with a distance
        of 0 from the source.
        */
        queue.add(new cell(start_x, start_y, 0));
        visit[start_x][start_y] = true;

        // Arbitrary node to be accessed inside loop
        Cell node = null;
        // Run loop till queue has elements
        while (!queue.isEmpty())
        {
            // Get topmost element from queue
            node = queue.poll();
            // if this is destination so return distance
            if (node.x == dest_x && node.y == dest_y)
            {
                return node.dis;
            }
            
            // Add all possible next destination to queue
            for (int i = 0; i < 8; i++)
            {
                // Next x and y cordinates
                int next_x = node.x + dx[i];
                int next_y = node.y + dy[i];
                
                /*
                Check for validity of the next cordinates
                and that they must not have been visited yet
                */
                if (isInside(next_x, next_y, N) && !visit[next_x][next_y])
                {
                    // Mark as visited
                    visit[x][y] = true;
                    /*
                    Add to queue. The new distance will be the distance of
                    current element that is the node, plus 1.
                    */
                    queue.add(new cell(next_x, next_y, node.dis + 1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_MinSwapsToSort"></a>
### Minimum swaps required to sort an array
The question requires you to find the minimum number of swaps needed to sort a given array. We use the process of cyclic swapping here. Let us look at the following example:

Original Array:<br>
7 1 0 5 4<br>
Sorted Array:<br>
0 1 4 5 7

We can notice that the minimum number of swaps needed would be 2. We may swap 7-4 and then 4-0, or we may swap 0-4 and then 7-0 or we may swap 7-0 and then 7-4. In all three possibilities, the maximum number of swaps needed is 2. To put this visualization on pen and paper, we can see the in the actual sorted array, the following connections are needed:
1. Element at index 0, goes to element at index 4.
2. Element at index 4, goes to element at index 2.
3. Element at index 2, goes to element at index 0.

This forms a cycle of swaps. It can be noticed that in a cycle of swaps of length k, the actual number of swaps needed will always be k-1, because as the swaps are cyclic, the last swap would have been performed in within the previous k-1 swaps.

Another example to illustrate the idea would be:

Original Array:<br>
2 4 3 1 8 5<br>
Sorted Array:<br>
1 2 3 4 5 8

Cycle 1:
1. Element at index 0, goes to element at index 1.
2. Element at index 1, goes to element at index 3.
3. Element at index 3, goes to element at index 0.

Cycle 2:
1. Element at index 2, goes to element at index 2.

Cycle 3:
1. Element at index 4, goes to element at index 5.
2. Element at index 5, goes to element at index 4.

Hence there are three cycles, which make (3-1) + (1-1) + (2-1) total swaps, that is 3 total swaps are needed.

To apply this idea we create a graph between the indexes where the elements are currently and the index where they should be at. And then calculate the summation of (cycle lengths - 1). The code is as follows:
```java
class Solution
{
    // The input is an array of length N
    public int minSwaps(int[] arr, int N)
	{
        // Construct a Graph, usign class similar to one learned above
	    Graph g = new Graph(N);
        // HashMap is used to store the original indexes of the values
	    HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
	    for(int i = 0; i < N; i++)
	    {
            // Add (element, original index) to HashMap
	        hMap.put(arr[i], i);
	    }
        // Sort the array to know the correct final indexes
	    Arrays.sort(arr);
	    for(int i = 0; i < N; i++)
	    {
            // Add an edge between the correct index and original index of an element.
	        g.addEdge(i, hMap.get(arr[i]));
	    }
        // Call the function to get the value of min swaps.
	    return g.minSwapsNeeded();
	}
}

class Graph
{
    static ArrayList<ArrayList<Integer>> adj = null;
    static int V = 0;
    
    public Graph(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }
    
    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
    }
    
    // Calculate minSwaps needed in the given graph
    public int minSwapsNeeded()
    {
        // Initialise count
        int count = 0;
        // Visited array to avoid infinite loops in the cycles
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            // For every non visited vertex so far
            if(!visited[i])
            {
                // Add (cycle length - 1) to total count
                count += (getCycleLength(i, visited) - 1);
            }
        }
        // Return total swaps
        return count;
    }
    
    // Use DFS approach to identify cycle length
    public static int getCycleLength(int curr, boolean[] visited)
    {
        // Current length initialised as 0
        int c = 0;
        // While we do not reach a previously visited node again
        while(!visited[curr])
        {
            // Mark current node as visited
            visited[curr] = true;
            // Get next node of current node
            curr = adj.get(curr).get(0);
            // Increase cycle length by 1
            c++;
        }
        // Return cycle length
        return c;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_MinOpsToConvert"></a>
### Minimum operations needed to convert x into y
The question requires you to convert a given number x into y in minimum steps possible and then report the count. You would be allowed only a certain number of operations. For example, lets say convert x into y, with operations allowed:
1. Multiply number by 2
2. Subtract 1 from number

In this scenario, the question becoems similar to the knight problem. The source and destination are knows with movements allowed only to numbers (a x 2) and (a - 1) if you are at 'a' currently. Hence, we use a BFS approach to calculate the minimum count. The code would be as follows:
```java
/*
Class value to hold the number and distance
*/
class cell
{
    int x;
    int dis;
    
    public cell(int X, int Dis)
    {
        x = X;
        dis = Dis;
    } 
} 

class Solution
{
    // Main method
    public int minStepToReachTarget(int start, int dest, int N)
    {
        // The BFS queue
        Queue<cell> queue = new LinkedList<>();
        // The visited hash map to avoid visiting the same number in loops
        HashMap<Integer, Integer> visited = new hashMap<Integer, Integer>(); 

        /*
        Add the starting cell to queue and mark it visited
        The starting cells is (start) with a distance
        of 0 from the source.
        */
        queue.add(new cell(start, 0));
        visited.add(start, start);

        // Arbitrary node to be accessed inside loop
        Cell node = null;
        // Run loop till queue has elements
        while (!queue.isEmpty())
        {
            // Get topmost element from queue
            node = queue.poll();
            // If this is destination so return distance
            if (node.x == dest)
            {
                return node.dis;
            }
            
            // Add all possible non visited destinations to queue
            int next_1 = node.x * 2;
            int next_2 = node.x - 1;
            if (!visited.containsKey(next_1))
            {
                // Mark as visited
                visited.add(next_1, next_1);
                /*
                Add to queue. The new distance will be the distance of
                current element that is the node, plus 1.
                */
                queue.add(new cell(next_1, node.dis + 1));
            }
            if (!visited.containsKey(next_2))
            {
                // Mark as visited
                visited.add(next_2, next_2);
                /*
                Add to queue. The new distance will be the distance of
                current element that is the node, plus 1.
                */
                queue.add(new cell(next_2, node.dis + 1));
            }
        }
        return Integer.MAX_VALUE;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="Backtracking"></a>
## <p align="center"> Recursion and Backtracking </p>
Backtracking is basically using recursion to solve problems that can have a divide and conquer approach applied to them. They key is that backtracking isn't just simple recursion but it is more of a trial and error recursion wherein solutions that fail are removed and those that work/pass are built further upon. For example, as we may see in a maze, that we might take certain routes which may not lead to the correct end point so we backtrack on that route to a certain point in time and then try a different route. We need not restart the entire process again and again.

Backtracking problems can generally be identified by words like
1. "Compute all/total .... where .... "
2. "Find all/total .... where .... "
3. "Generate all/total .... where .... "
4. "Print all/total .... where .... "
5. "Count all/total .... where .... "

that is, whenever the question demands you to exhaust all the possibilities under certain conditions, in almost all the cases a backtracking solution will exist. The solution might not garuantee the optimal answer, but will definitely exist with bcaktracking. 

<a name="R_BT_Keys"></a>
### Keys to backtracking
The three key concepts of backtracking are:
1. <ins>Choice</ins>: Decsisions to make, that is to make choices.
2. <ins>Constraints</ins>: Those choices are restricted on the basis of the question, and those conditions decide the validity of our choices.
3. <ins>Goal</ins>: Final target, maybe solve a maze, solve soduko, find minimum path or anything of this sort.

On the basis of these keys to backtracking, we can divide our process into steps as follows:
1. <ins>Identify, make and call a change</ins>:<br>What this basically means is that when we start with a decision base, we need to choose a decision to take and then change certain parameters wrt that decision.
2. <ins>Validate and/or recurse</ins>:<br>Once the decision has been taken, on the basis of the constraints provided by the question, we need to validate our decision. This validation can be on the basis of further recursive calls, or different 'if conditions' depending on the questions. Once validated, if needed, we recurse further to obtain an answer for this decision. In case due to the constrains of the question we believe that the path/choice chosen is invalid, we end the calls for that choice and go back to the step where we made that choice. Once we revert back to that step, we make a different choice if available, or return the expected answer in case of absence of new alternative choices.
3. <ins>Return/Undo the call</ins>:<br>The third key of backtracking as stated above is the goal. The goal is what helps us define the base conditions for our recursion function. If the call has reached the end state or the goal state then we return whatever value was expected to be returned at that state.

<a href="#Contents">Back to contents</a>

<a name="DynamicProgramming"></a>
## <p align="center"> Dynamic Programming </p>
Dynamic Programming solves complex problems that tend to take exponential time by dividing them into smaller subproblems and storing their results for use later on to calculate larger values. 

<a name="DP_OverlappingSubproblems"></a>
### Overlapping Subproblems
Recursive solutions where various base cases call the already calculated subproblems again and again result in exponential time complexities. Hence, if the solutions of the common subproblems are stored and used directly in O(1) time, the complexity of the entire problem is reduced by large. This solution works only when there is a overlapping subproblems property in the question.

One method to check this is to generally find a recurrence relation. A good point to note is that it is not necessary to solve the recurrence relation at hand. If the recurrence relation, calls the function itself and forms a recurrence tree with common elements, the overlapping subproblems property is satisfied. An example is fib(n) = fib(n-1) + fib(n-2).

<a href="#Contents">Back to contents</a>

<a name="DP_OptimalSubstructure"></a>
### Optimal Substructure
Optimal substructure property means that the results of the parents values should be directly computable ftome the optimal results of the child values. 

<a href="#Contents">Back to contents</a>

<a name="DP_TabulationVsMemoization"></a>
### Tabulation vs Memoization
Tabulation is when you follow a bottom's up approach to solving the problems. So for example if the recursion tree goes down to 15 levels so you start from the bottom calculating subproblems to build to the final answer. You generally do this by having an array say dp[n] and start from filling dp[0] -> dp[1] -> -> dp[n]. Used when it is necessary to solve all the possible subproblems for the final answer.

Memoization is a top down approach where you directly calculate for the final value but for every call you store the value of the subproblem such that if it is called again you can access the value directly. Generally values are stored in a hashmap. Used when it is not necessary to solve all the subproblems for reaching the final answer.

<a href="#Contents">Back to contents</a>

<a name="DP_SolvingDP"></a>
### Solving a DP Problem
The DP question solving can be divided into further smaller tasks (Just like DP XD):
1. State identification: A state in a DP problem can be defined as something that helps you identify at which subproblem have you reached in your dp. For example it can be dp[index], where index is used to identify the the current subproblem, that is the current level can be traced using the index. In a knapsack problem thsi would be the [index][weight] and hence the dp formed is of the type dp[index][weight]. Hence the state identifier should be a value or at max two that help you identify the current subproblem uniquely from others.
2. Relations between states: Find the recursive relations which defines your state(n) in terms of previously calculated values like n-1, n-2, ... and so on.
3. Choosing between tabulation and memoization: This choice should be made according to the differences explained in the above section.

Majority of the DP problems can be categorized into t

<a href="#Contents">Back to contents</a>

<a name="DP_BacktrackDP"></a>
### DP with Backtracking (Top-down approach)
In certain situations we might need to solve a question with backtracking. Backtracking has been explained in detail in the section before DP(<a href="#Backtracking">Backtracking</a>). Backtracking enables us to explore all outcomes and choose the best afterwards when directly going for a particular outcome or greedy/iterative solutions won't work.

Using recursion we might encounter the same problem again and again making the time complexity of backtracking solutions exponential. Hence, we combine backtracking with DP, which in general cases is known as the top down recursive approach.

Steps to follow to define a backtracking recursive DP solution:
1. Describe the problem as a recursive function. Steps to help decide the flow of the fucntion are explained in the backtracking section.
2. Try to maximize the use of local variables and minimize the use of global variables. What this means is that we should try to use minimum size possible table for the memoization. Instead of identifying a particular state using all the variables available, we should try to minimize the number of variables needed to identify a state uniquely from others.
3. Once state varibles are decided, use memoization to store and check values of smaller subproblems to avoid exponential time complexity.

<a href="#Contents">Back to contents</a>

<a name="DP_2DimensionalGrids"></a>
### 2 Dimensional DP - Grids
The grid problems can be broadly classified into three subcategories:
1. Find minimum cost path when a grid matrix is given.
2. Find number of ways to reach and ending point from the starting point travelling only in specified directions.
3. Find number of ways to reach and ending point from the starting point with obstructions.<br>
We will discuss them one by one:

#### Finding Minimum-Cost Path in a 2-D Matrix
The problem statement is that given a cost matrix cost[][] where cost[i][j] is the cost of visiting the cell (i,j), find minimum cost path from (0,0) to (x,y). Only movements allowed are right and down.

The recurrence relation can be formed as: MinCost(i,j) = Math.min(MinCost(i-1,j), MinCost(i,j-1)) + cost[i][j]

The base conditions for this recurrence relation would be:
1. MinCost(0,0) = cost[0][0]
2. MinCost(0,j) = MinCost(0,j-1) + cost[0][j] (For cells in topmost row)
3. MinCost(i,0) = MinCost(i-1,0) + cost[i][0] (For cells in leftmost column)

As the problem requires every cell to be accounted for, that is all the cells that can be possibly visited need to be checked, tabulation method would work better than the topdown memoization approach. Start building from (0,0) and build to (i,j).

The minimum cost path problem can have several variants for calculating the maximum/minimum costs, sums, values to reach a given target. The standard format for solving such questions can be:
```java
// PLEASE NOTE THIS IS A CODE DEPICTION OF THE PROCESS,
// NOT THE PSEUDOCODE FOR THE CODE TO BE ACTUALLY WRITTEN

// Cost function:
// cost[i] = min/max(cost[of all j's just one step before i]) + cost[i]

// Build upto target cell from the beginning
for (int i = 1; i <= target; i++)
{
    // Let CellsToReachI be the array having number of ways to reach Ith cell
    // CellsToReachI is of the format [i-1, i-2, i-3 and so on]
    
    // So for every way to reach cell i
    for (int j = 0; j < CellsToReachI.size(); j++)
    {
        // If the question involves a validity constraint,
        // use an if to check if cell is valid
        if (CellsToReachI[j] <= i)
        {
            // Solve for the problem at hand
            dp[i] = min(dp[i], dp[CellsToReachI[j]] + cost);
        }
    }
}
return dp[target]
```
<a href="#Contents">Back to contents</a>

#### Finding the number of ways to reach from a starting position to an ending position travelling in specified directions only
You would be given a 2D matrix. The task is to find the number of ways to reach (i,j) from (0,0). Only movements allowed are right and down.

The recurrence relation can be formed as: NumWays(i,j) = NumWays(i-1,j) + NumWays(i,j-1)<br>

The base conditions for this recurrence relation would be:
1. NumWays(0,0) = 1
2. NumWays(0,j) = 1 (For cells in topmost row)
3. NumWays(i,0) = 1 (For cells in leftmost column)

As the problem requires every cell to be accounted for, that is all the cells that can be possibly visited need to be checked, tabulation method would work better than the topdown memoization approach. Start building from (0,0) and build to (i,j).

In case of obstacles(cells where you cannot go) being present, the input matrix has entries like 0 and 1. Every 0 cell is visitable and every 1 cell is blocked. Certain modifications to the above process would then be needed.

The recurrence relation would be modified to:<br>
NumWays(i,j) = NumWays(i-1,j) + NumWays(i,j-1), if (i,j) is unblocked<br>
NumWays(i,j) = 0, if (i,j) is blocked<br>

The base conditions for this recurrence relation would be:
1. NumWays(0,0) = 1(if unblocked) else 0
2. NumWays(0,j) = NumWays(0, j-1) (For cells in topmost row)
3. NumWays(i,0) = NumWays(i-1, 0) (For cells in leftmost column)

This type of enumeration problem might have several variations like counting number of ways to achieve a sum, counting number of ways to achieve a target or reach a destination and so on. The standard method to solve such kinds off problems is as follows:
```java
// PLEASE NOTE THIS IS A CODE DEPICTION OF THE PROCESS,
// NOT THE PSEUDOCODE FOR THE CODE TO BE ACTUALLY WRITTEN

// NumWay function:
// numWays[i] = numWays[i-1] + numWays[i-2] + .... + numWays[i-k]

// Build upto target cell from the beginning
for (int i = 1; i <= target; ++i)
{
    // Let CellsToReachI be the array having number of ways to reach Ith cell
    // CellsToReachI is of the format [i-1, i-2, i-3 and so on]
    
    // So for every way to reach cell i
    for (int j = 0; j < CellsToReachI.size(); ++j)
    {
        // If the question involves a validity constraint,
        // use an if to check if cell is valid
        
        // For this question the constraint is obstacles hence,
        // we check if cell does not have an obstacle
        if (input[i] == 0)
        {
            // Solve for the problem at hand
            dp[i] += dp[CellsToReachI[j]];
        }
    }
}
return dp[target]
```
***NOTE: THE DP APPROACH TO SOLVING GRID QUESTIONS WORKS ONLY WHEN THE ANSWER FOR A CELL IN THE DP TABLE CAN BE EASILY CALCULATED USING THE PRECOMPUTED VALUES. HENCE, EVEN A SMALL MODIFICATION SUCH AS ALLOWING MOVEMENTS IN ALL 4 DIRECTIONS WOULD REQUIRE US TO CHANGE OUR APPROACH TO BFS(FOR MIN COST PATH) AND DFS/BACKTRACKING(FOR TOTAL PATHS).***

<a href="#Contents">Back to contents</a>

<a name="DP_MergeIntervals"></a>
### DP on Merging Intervals
Merging intervals DP questions will generally have a problem statement of the form, that, given a set of numbers find an optimal solution using the current number and the optimal values from the right and left sides.

The problem statement might not always be direct. It can be presented as a simple array with a target to achieve. The catch is that to achieve the target we should be able to identify that every step some values of the array are merged together(that is used up to get a new value) and the size of te array reduces as we move ahead. So for example, let the operation be adding elements, we might figure that our process look like this:<br>
[1, 2, 3, 4, 5] -> [1, 2, 3, 9] -> [3, 3, 9] -> [6, 9] -> [15]

The standard recurrence relation for such type of a problem would be:
```java
dp[i][j] = dp[i][k] + result[k] + dp[k+1][j]
// i and j are the starting and ending index of the intervals
// The final answer hence would be dp[0][length of array - 1]
```
The standard method to code dp problems by merging up intervals looks like:

```java
/*
Decide the window size of the interval. We build from window size 1 to the
entire array length as our window size.
*/
for(int l = 1; l<n; l++)
{
    /*
    For the chosen window size, we need to traverse the entire array in
    chunks of that size. For example if window size is 3, in an array of
    length 5, we move like:
    [0,2] -> [1,3] -> [2,4] -> [3,5]
    Therefore, we need to decide starting and ending indexes.
    For the starting index, we move from 0 to (n - window size).
    */
    for(int i = 0; i<n-l; i++)
    {
        /*
        j becomes our ending index. This is always equal to i + l.
        j(ending index) = i(starting index) + l(window size)
        */
        int j = i+l;
        
        /*
        For every value k between our starting and ending index,
        we divide the interval into partitions [i -> k-1], [k], [k+1 -> j].
        The partition may also be divded as [i -> k][k+1 -> j].
        */
        /*
        The partitioning strategy depends on the question. What this means
        is that to decide what to with the partitions and to decide where
        to make the partitions varries from question to question. In this
        example we assume we add the value from an array doSomething[].
        */
        for(int k = i; k<j; k++)
        {
            dp[i][j] = max(dp[i][j], dp[i][k] + doSomething[k] + dp[k+1][j]);
        }
    }
}
return dp[0][n-1]
```
<a href="#Contents">Back to contents</a>

<a name="DP_Strings"></a>
### DP on Strings
The general problem statement shared is given two or one string return some result. The result can be to find some subsequence or substring according to a condition or find the count of certain possible subsequences/substrings.

The common pattern followed for two string questions is:
```java
/*
The two strings are arranged in a character by character matrix s1 x s2.
i is for String 1
j is for String 2
We move ahead by comparing the two string character by character.
*/

// For every character in String 1
for (int i = 1; i <= n; i++)
{
    // For every character in String 2
    for (int j = 1; j <= m; j++)
    {
        if (s1[i-1] == s2[j-1])
        {
            dp[i][j] = /*Implement required changes here*/;
        }
        else
        {
            dp[i][j] = /*Implement required changes here*/;
        }
    }
}
```
The common pattern followed for a single string questions is:
```java
/*
The same string is arraned in the s1 x s1 matrix. The approach now
is to check the required conditions/validations for every
subsequence/substring of the string. To check for every substring,
we move the end point of our substring from 1 -> length of string,
and consider every starting point possible for each end point. Hence,
the substrings for string "abcde" would look like:
For end point a: a
For end point b: a->b, b
For end point c: a->c, b->c, c
For end point d: a->d, b->d, c->d, d
For end point e: a->e, b->e, c->e, d->e, e
*/

// We begin by choosing the end point
// Ranges from 1 to size of string.
for (int i = 1; i < n; i++)
{
    // Choose the starting point for the substring
    // Ranges from 0 to (end point - 1)
    for (int j = 0; i <= i; j++)
    {
        if (s[i] == s[j])
        {
            dp[i][j] = /*Implement required changes here*/;
        }
        else
        {
            dp[i][j] = /*Implement required changes here*/;
        }
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="DP_Decision"></a>
### DP for decision making (Knapsack)
The general statement for such type of problems is to decide the most optimal option from a given set. The task is to make an optimal choice from a given set at every instance or maybe just once.

The general approach is that given a choice, we have two options, to either make that choice or to ignore it.
1. If we make that choice, we calculate the best between the current option and the previous time where we ignored the choice
2. If we choose to ignore the choice now, we just choose the value from the previous time we made the choice.

Sample problems can be Knapsack, Buy and Sell Stock, House Robber etc.

```java
// KNAPSACK AND RELATED PROBLEMS TO BE ADDED HERE
```
<a href="#Contents">Back to contents</a>

<a name="DP_LIS"></a>
### Longest Integer Subsequence
The longest integer subsequence problem requires you to find the length of the longest increasing integer subsequence in an array. For example for the array [5, 8, 3, 7, 9, 1] the answer would be 3 and the subsequence would be [3, 7, 9]. Do note, the subsequence is not necessarily contiguous.

For every index, we store the length of the LIS upto that point such that the given element at the index is also included. We store this in an array of the form dp[n+1]. The final answer would be the maximum of all dp[i]. dp[i] is calculated by getting the max LIS of all elements upto the current index such that their ending element is smaller than the current element. Hence, for every i,
```java
dp[i] = 1 + Max(All dp[j] such that j < i and arr[j] is smaller than arr[i]).
```
Basic code:
```java
for(int i = 1; i < n; i++)
{
    int max = 0;
    for(int j = 0; j < i; j++)
    {
        if(A.get(j) < A.get(i))
        {
            if(dp[j] > max)
            {
                max = dp[j];
            }
        }
    }
    dp[i] = 1 + max;
}
````

The problem may have two variations as follows:
1. Longest decreasing subsequence: Simply change the comparison of getting values lesser than the current element so far to getting values greater than the current element so far.
2. Longest increasing followed by decreasing subsequence: Calculate LIS from the beginning and also LIS from the end. The LIS from the end acts as a decreasing subsequence of elements ahead in the list. For example, LIS from the back would mean that for dp[i] the value is the longest decreasing subsequence from i -> n instead of from 0 -> i. Then calculate the max of (FrontLIS + BackLIS for all i).

<a href="#Contents">Back to contents</a>

<a name="DP_LCS"></a>
### Longest Common Subsequence
The longest common subsequence problem requires you to find the length of the longest common subsequence between two given strings. For example for the inputs 'ABCDGH' and 'AEDFHR', the length would be 3, and the longest common subsequence would be 'ADH'.

As seen for string DP above, we store the two strings in character arrays say s1arr and s2arr and then make a dp table of the form dp[n+1][m+1]. The entry dp[i][j] would hold the value of the longest common subsequence until the s1[0..1] and s2[0..j] strings.

The recurrence relation can be defined as:
```java
/*
If the ith and jth characters in the strings are equal, then the length
of LCS increases by 1, as we have got one extra common character.
For this increase, we need the previous maximum value of the LCS where
these characters were not included.
*/
dp[i][j] = 1 + dp[i-1][j-1]

/*
If the ith and jth characters in the strings are not equal, then the length
of LCS does not increase and remains the same as the previous maximum value.
The previous maximum value will either be the maximum length LCS when character
from string 1 is included and from string 2 isn't, or when character from
string 2 is included and the one from string 1 isn't. For example, say if we
have reached a point "G" and "H" in the two strings, these characters would
not be the same. Hence we will check for the maximum between, "ABCDG"-"AEDF"
and "ABCD"-"AEDFH", that is values before the new characters were introduced.
*/
dp[i][j] = max(dp[i][j-1], dp[i-1][j])
```
Basic code:
```java
for(int i = 0; i < n; i++)
{
    for(int j = 0; j < m; j++)
    {
        if(s1arr[i] == s2arr[j])
        {
            dp[i+1][j+1] = 1 + dp[i][j];
        }
        else
        {
            dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
        }
    }
}
```
<a href="#Contents">Back to contents</a>
