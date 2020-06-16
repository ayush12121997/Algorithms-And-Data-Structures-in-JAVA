# Data Structures and Algorithms (JAVA)

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
    - [Bucket Sort]
    - [Count Sort]
    - [Quick Sort]
    - [Sorting using Comparator]
    - [Binary Search](#Arrays_BinarySearch)
    - [Kadane's Algorithm](#Arrays_KadanesAlgo)
    - [Kadane's Algorithm for maximum product]
    - [Merge two sorted arrays in O(n1+n2) time]
    - [Merge two sorted arrays in O(1) space](#Arrays_MergeTwo)
    - [Store two values in a single index](#Arrays_InPlace)
    - [Finding single element in array of pairs](#Arrays_FindSingle)
    - [Prefix Sum]
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
    - [Plaindrome Integer]
5. [String]
    - [Java String workarounds]
    - [Find all permutations of a String]
6. [Linked Lists](#LinkedLists)
    - [Singly Linked List](#LL_SinglyLinkedList)
    - [Detect a cycle in a linked list](#LL_Cycle)
    - [Reverse a linked list]
    - [Find the middle element of a linked list]
    - [Merge two sorted linked lists](#LL_MergeSorted)
    - [Sort a linked list](#LL_Sort)
    - [Intersection of 2 linked lists](#LL_Intersect)
7. [Stacks and Queues]
8. [Heaps and Maps]
9. [Hashing]
10. [Trees]
    - [Traversal take from leetcode]
11. [Recursion and Backtracking]
12. [Dynamic Programming](#DynamicProgramming)
    - [Overlapping Subproblems](#DP_OverlappingSubproblems)
    - [Optimal Substructure](#DP_OptimalSubstructure)
    - [Tabulation vs Memoization](#DP_TabulationVsMemoization)
    - [Solving a DP Problem](#DP_SolvingDP)
    - [DP with Backtracking](#DP_BacktrackDP)
    - [2 Dimensional DP - Grids](#DP_2DimensionalGrids)
    - [DP on Merging Intervals](#DP_MergeIntervals)
    - [DP on Strings](#DP_Strings)
    - [DP for decision making](#DP_Decision)
    - [Standard Problems](#DP_StandardProblems)
        - [Longest Integer Subsequence](#DP_LIS)
        - [Longest Common Subsequence](#DP_LCS)
        - [Edit Distance]
        - [Coin change where repetitions matter and where repetitions dont matter(Difference is in loops calling)]
        - [Distinct subsequences]
        - [Number of ways to draw N non-intersecting chords in a circle]
        - [Numbers of length N and value less than K]
13. [Graphs]
14. [Bit Manipulation]
15. [Greedy Algorithms]
16. [Others]
    - [Square root decomposition]
    - [Segment trees]
    - [Priority Queues and Comparators]
    - [Catalan Numbers]
    - [Line Sweep Algo]
    - [Union Find]

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
Certain questions which require multiple print statements one after the another, may result in a TLE just because of the printing delay. faster printing can be achieved through StringBuilder. Use StringBuilder to form a big string of input by constantly appending smaller outputs and then print the entire string once. Saves time.
```java
StringBuilder sb = new StringBuilder();
sb.append("Printing content");
sb.append("Add a new line with backslash n \nlike this");
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

<a name="Math_NCR"></a>
### Calculate nCr
To calculate nCr:
1. Find maximum between (n-r,r). Let the max be R and other value be r'.
2. Calculate factorial from R+1 to n. Let this be F.
3. Calculte factorial from 1 to r'. Let this be f'.
4. Divide F by f'. This is the answer.
5. Always calculate using long.

<a href="#Contents">Back to contents</a>

<a name="LinkedLists"></a>
## Linked Lists
A linked list is a data structure in which elements are not stored in contigous locations and are linked to each other using pointers. Linked lists consists of nodes which store the value for the node and the link to the next node to which it is connected. The lists can be single directed or double directed lists.

Linked lists generally have a head which is the only directly accessible element of the list. The structure looks like Head -> Node 1 -> Node 2 -> Node3

<a name="LL_SinglyLinkedList"></a>
### Singly Linked List
A singy linked list means that every element is linked with only the next element in the forward direction. Hence, you may access the next element of a node but not the previous one.
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
deleted. Then link this current node to the next node of the node to be deleted.
ALWAYS REMEMBER TO DELINK THE NODE TO BE DELETED. */
Node deleteNodeAtX(Node head, int x)
{
    Node temp = head;
    if(temp == null)
    {
        return temp;
    }
    if(x == 1)
    {
        head = temp.next;
        return head;
    }
    int count = 1;
    while(temp != null)
    {
        if(count == x-1)
        {
            Node val = temp.next.next;
            temp.next.next = null;
            temp.next = val;
            break;
        }
        count++;
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

<a name="LL_MergeSorted"></a>
### Merge two sorted linked lists
The idea is similar to merging two sorted arrays. The key is to remember that the two input lists are already sorted indivudally. We simply iterate both the lists and compare the node values one by one. If Node1 < Node2, then append Node1 to the final answer and we move Node1 to Node1.next. The same is done for Node2 if Node2 <= Node1. As soon as either of the list1 or list2 reaches null, we append all the remaining nodes of the other list directly to the final answer.

An example would be as follows:<br>
List1 : 2 -> 4 -> 8 -> null<br>
List2 : 3 -> 6 -> 14 -> 17 -> null

Step 1:<br>
We compare 2 and 3.<br>
List1 : **2** -> 4 -> 8 -> null<br>
List2 : **3** -> 6 -> 14 -> 17 -> null<br>
As 2 < 3, we add 2 to the final answer and move 2 to 4.<br>
Answer: 2

Step 2:<br>
We compare 4 and 3.<br>
List1 : **4** -> 8 -> null<br>
List2 : **3** -> 6 -> 14 -> 17 -> null<br>
As 3 < 4, we add 3 to the final answer and move 3 to 6.<br>
Answer: 2 -> 3

Step 3:<br>
We compare 4 and 6.<br>
List1 : **4** -> 8 -> null<br>
List2 : **6** -> 14 -> 17 -> null<br>
As 4 < 6, we add 4 to the final answer and move 4 to 8.<br>
Answer: 2 -> 3 -> 4

Step 4:<br>
We compare 8 and 6.<br>
List1 : **8** -> null<br>
List2 : **6** -> 14 -> 17 -> null<br>
As 6 < 8, we add 6 to the final answer and move 6 to 14.<br>
Answer: 2 -> 3 -> 4 -> 6

Step 5:<br>
We compare 8 and 14.<br>
List1 : **8** -> null<br>
List2 : **14** -> 17 -> null<br>
As 8 < 14, we add 8 to the final answer and reach end of list 1.<br>
Answer: 2 -> 3 -> 4 -> 6 -> 8

Step 6:<br>
List1 : **null**<br>
List2 : **14** -> 17 -> null<br>
As we reach null in list1, we add all the nodes of list2 to answer directly<br>
Answer: 2 -> 3 -> 4 -> 6 -> 8 -> 14 -> 17 -> null


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

<a name="DynamicProgramming"></a>
## Dynamic Programming
Dynamic Programming solves complex problems that tend to take exponential time by divding them into smaller subproblems and storing their results for use later on to calculate larger values.

<a name="DP_OverlappingSubproblems"></a>
### Overlapping Subproblems
Recursive solutions where various base cases call the already calculated subproblems again and again result in exponential time complexities. Hence, if the solutions of the common subproblems are stored and used directly in O(1) time, the complexity of the entire problem is reduced by large. This solution works only when there is a overlapping suproblems property in the question.

One mehod to check this is to generally find a recurrence realation. A good point to ntoe is that it is not necessary to solve the recurrence relation at hand. If the recurrence relation, calls the function itself and forms a recrrence tree with common elements, the overlapping subproblems property is satisfied. An example is fib(n) = fib(n-1) + fib(n-2).

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
### DP with Backtracking
In certain situations we might need to solve a question with baktracking. Backtracking enables us to explore all outcomes and choose the best later on when directly going for a particular outcome or greedy solution wont work. Also backtracking might be requried to check whether or not certain outcome in the grid has been traversed before.

Using recursion we might encounter the same problem again and again making the time complexity of backtracking solutions exponential. Hence at this point DP comes into place.

Steps to follow to define a backtracking recursive DP solution using memoization:
1. Describe the problem as a recursive function.
2. The function should necessarily have a return statement. The return statement in most cases will be selecting an optimal solution from a bunch of recursive subproblem calls.
3. All non-local variables should be read only variables inside the function. Any computations should be done using local variables only.
4. Use memoization to  store and check values of smaller subproblems.
5. Minimize the variables used in recursive calls as much as possible. Aim to calculate the values needed inside the function.

<a href="#Contents">Back to contents</a>

<a name="DP_2DimensionalGrids"></a>
### 2 Dimensional DP - Grids
The grid problems can be broadly classified into three subcategories:
1. Find minimum cost path when a grid matrix is given.
2. Find number of ways to reach and ending point from the starting point travelling only in specified directions.
3. Find number of ways to reach and ending point from the starting point with obstructions.<br>
We will discuss them one by one:

#### Finding Minimum-Cost Path in a 2-D Matrix
The problem statement is that given a cost matrix cost[][] where cost[i][j] is the cost of visitng the cell (i,j), find minimum cost path from (0,0) to (x,y). Only movements allowed are right and down.

The recurrence relation can be formed as: MinCost(i,j) = Math.min(MinCost(i-1,j), MinCost(i,j-1)) + cost[i][j]

The base conditions for this recurrence relation would be:
1. MinCost(0,0) = cost[0][0]
2. MinCost(0,j) = MinCost(0,j-1) + cost[0][j] (For cells in topmost row)
3. MinCost(i,0) = MinCost(i-1,0) + cost[i][0] (For cells in leftmost column)

As the problem requires every cell to be accounted for, that is all the cells that can be possibly visited need to be checked, tabulation method would work better than the topdown memoization approach. Start building from (0,0) and build to (i,j).

The minimum cost path problem can have several variants for calculating the maximum/minimum costs, sums, values to reach a given target. The standard format for solving such questions can be:
```java
// cost[i] = min/max(cost[of all j's just one step before i]) + cost[i]

// Build to target from the beginning
for (int i = 1; i <= target; i++)
{
    // For every valid way to reach current cell or state
    // CellsToReachI is of the format [i-1, i-2, i-3 and so on]
    for (int j = 0; j < CellsToReachI.size(); j++)
    {
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

This type of enumeration problem might have several variations like counting number of ways to achieve a sum, counting number of ways to achieve a target or rech a destination and so on. The standard method to solve such kinds off problems is as follows:
```java
// numWays[i] = numWays[i-1] + numWays[i-2] + .... + numWays[i-k]

// Build to target from the beginning
for (int i = 1; i <= target; ++i)
{
    // For every valid way to reach current cell or state
    // CellsToReachI is of the format [i-1, i-2, i-3 and so on]
    for (int j = 0; j < CellsToReachI.size(); ++j)
    {
        if (CellsToReachI[j] <= i)
        {
            // Solve for the problem at hand
            dp[i] += dp[CellsToReachI[j]];
        }
    }
}
return dp[target]
```
<a href="#Contents">Back to contents</a>

<a name="DP_MergeIntervals"></a>
### DP on Merging Intervals
Merging intervals DP questions will generally have a problem statement of the form, that, given a set of numbers find an optimal solution using the current number and the optimal values from the right and left sides.

The problem statement might not always be direct. It can be presented as a simple array with a traget to achieve. The catch is that to achieve the target we should be able to identify that every step some values of the array are merged together(that is used up to get a new value) and the size of te array reduces as we move ahead. So for example, let the operation be adding elements, we might figure that our process look like this:<br>
[1, 2, 3, 4, 5] -> [1, 2, 3, 9] -> [3, 3, 9] -> [6, 9] -> [15]

The standard recurrence relation for such type of a problem would be:
```java
dp[i][j] = dp[i][k] + result[k] + dp[k+1][j]
// i and j are the starting and ending index of the intervals
// The final answer hence would be dp[0][length of array - 1]
```
The array result[] is in most cases a precalculated array that is decided on the basis of the problem statement. It can be anything ranging from the max/min value of the intervals, cost of the intervals, sum of the intervals or anything.
The code looks like:
```java
// Decide the window size ofthe interval. We build from window 1 to the entire array length as the window.
for(int l = 1; l<n; l++)
{
    // Decide the starting index of the window. We move from 0 to the (n - window size) index.
    for(int i = 0; i<n-l; i++)
    {
        // j becomes our ending index. This is always equal to i(starting index) + l(window size)
        int j = i+l;
        // For every value k between our starting and ending index,
        // we divide the interval into partitions i- > k, k, k -> j
        for(int k = i; k<j; k++)
        {
            dp[i][j] = max(dp[i][j], dp[i][k] + result[k] + dp[k+1][j]);
        }
    }
}
return dp[0][n-1]
```
<a href="#Contents">Back to contents</a>

<a name="DP_Strings"></a>
### DP on Strings
The general problem statement shared is given two or one string return some result. The result can be to find some subsequencesubstring according to a condition or find the count of certain possible subsequences/substrings.

The common pattern followed for two string questions is:
```java
// The two strings are arranged in a character by character matrix s1 x s2.
// i is for String 1
// j is for String 2

// For every character in String 1
for (int i = 1; i <= n; i++)
{
    // For every character in String 2
    for (int j = 1; j <= m; j++)
    {
        if (s1[i-1] == s2[j-1])
        {
            dp[i][j] = /*Condition to run*/;
        }
        else
        {
            dp[i][j] = /*Condition to run*/;
        }
    }
}
```
The common pattern followed for a single string questions is:
```java
// The same string is arraned in the s1 x s1 matrix.
// The approach now is to check for length of substrings/subsequences. This forms a sliding window for length of substring/subsequence.

// We begin from window of size 1 and increase till size of string.
for (int l = 1; l < n; l++)
{
    // For all indexes from 0 to n - window size, we choose our starting index.
    for (int i = 0; i < n-l; i++)
    {
        // Ending index is the starting index + window size.
        int j = i + l;
        if (s[i] == s[j])
        {
            dp[i][j] = /*Condition to run*/;
        }
        else
        {
            dp[i][j] = /*Condition to run*/;
        }
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="DP_Decision"></a>
### DP for decision making
The general statement for such type of problems is to decide the most optimal option from a given set. The task is to make an optimal choice from a given set at every instance or maybe just once. Sample problems can be Knapsack, Buy and Sell Stock, House Robber etc.

The general approach is that given a choice, we have two options, to either make that choice or to ignore it. If we make that choice, we calculate the best between the current option and the previous time where we ignroed the choice, and vice verse, if we choose to ignroe the choice now, we calculate the best between the current option and the previous time we made the choice.

```java
// Let i be the set of values available to us
// Let j be the set of choices available, that we may choose to take or ignore. The set of choices can be more than just simple binary choices like choose or leave. For example as seen in Knapsack.

// For every value available
for (int i = 1; i < n; i++)
{
    // For every choice available
    for (int j = 1; j <= k; ++j)
    {
        // If we choose to select the choice
        dp[i][j] = max({dp[i][j], dp[i-1][j] + arr[i], dp[i-1][j-1]});
        // If we choose to ignore the choice
        dp[i][j-1] = max({dp[i][j-1], dp[i-1][j-1] + arr[i], arr[i]});
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="DP_StandardProblems"></a>
### Standard Problems
<a name="DP_LIS"></a>
#### Longest Integer Subsequence
The longest integer subsequence problem requires you to find the length of the longest increasing integer subsequence in an array. For example for the array [5, 8, 3, 7, 9, 1] the answer would be 3 and the subequence would be [3, 7, 9]. Do note, the subsequence is not necessarily contigous.

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
1. Longest decreasing subsequence: Simply change the comaprison of getting values lesser than the current element so far to getting values greater than the current element so far.
2. Longest increasing followed by decreasing subsequence: Calculate LIS from the beginning and also LIS from the end. The LIS from the end acts as a decreasing subsequence of elements ahead in the list. For example, LIS from the back would mean that for dp[i] the value is the longest decreasing subsequence from i -> n instead of from 0 -> i. Then calculate the max of (FrontLIS + BackLIS for all i).

<a href="#Contents">Back to contents</a>

<a name="DP_LCS"></a>
#### Longest Common Subsequence
The longest common subsequence problem requires you to find the length of the longest common subsequence between two given strings. For example for the inputs 'ABCDGH' and 'AEDFHR', the length would be 3, and the longest common subsequence would be 'ADH'.

As seen for string DP above, we store the two strings in character arrays say s1arr and s2arr and then make a dp table of the form dp[n+1][m+1]. The entry dp[i][j] would hold the value of the longest comon subsequence until the s1[0..1] and s2[0..j] strings.

The recurrence realtion can be defined as:
```java
/* If the ith and jth characters in the strings are equal, then the length of LCS increases by 1,
as we have got one extra common character. For this increase, we need the previous maximum value
of the LCS where these characters were not included. */
dp[i][j] = 1 + dp[i-1][j-1]

/* If the ith and jth characters in the strings are not equal, then the length of LCS does not
increase and remains the same as the previous maximum value. The previous maximum value will
either be the maximum length LCS when character from string 1 is included and from string 2
isn't, or when character from string 2 is included and the one from string 1 isn't. For example,
say if we have reached a point "ABCD" and "AEDF" in the two strings, the next characters would
not be the same. Hence we will check for the maximum between, "ABCDG"-"AEDF" and "ABCD"-"AEDFH",
that is values just before the new character was introduced. */
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
