# <p align="center"> Data Structures and Algorithms (JAVA) </p>

### 990

<a name="Contents"></a>
## <p align="center"> Table of contents </p>
1. [Reader class](#ReaderClass)
2. [Faster printing using String Builder](#Printing)
3. [Arrays(Searching, Sorting and Miscellaneous)](#Arrays)
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
	- [Randomly shuffle an array - Fisher Yates Algorithm]
	- [Two Sum - Random Array]
	- []
4. [Sliding Window and Two Pointers](#SlideWindow_TwoPointer)
	- [Introduction](#SWTP_Introduction)
	- [Sliding Window Template - String pattern questions](#SWTP_StringTemplate)
	- [Sliding Window Maximum]
	- [Sliding Window Median]
	- [Find all anagrams in a string]
	- [Remove duplicates from sorted array]
	- [Remove duplicates from sorted array - II]
	- [Remove element]
	- [Longest Substring Without Repeating Characters]
	- [Minimum Window Substring]
	- [Permutation in String]
	- [Substring with Concatenation of All Words]
	- [Trapping rain water]
	- [Container with maximum water]
	- [Dutch National Flag Algorithm / Sort colors]
	- [Longest substring with at most K distinct characters]
	- [Subarrays with atmost K different integers]
	- [Subarrays with K different integers]
	- [Subarrays with product less than K]
	- [Longest substring with at least K repeating characters]
	- [Two Sum - Sorted Array]
	- []
5. [Math](#Math)
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
6. [String]
    - [Java String workarounds (Substring, toCharArray, charAt)]
    - [Learn KMP robin karp and stuff]
7. [Linked Lists](#LinkedLists)
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
8. [Stacks and Queues](#StackAndQueue)
    - [Stacks](#SQ_Stack)
    - [Queues](#SQ_Queue)
    - [Priority Queues](#SQ_PQ)
	- [Tree sets](#SQ_TreeSet)
	- [Deque]
	- [Maximum sum subarray with sum less than equal to k for above treeset]
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
	- [Sliding Window Maximum]
9. [Heaps and Maps]
10. [Trees](#Trees)
	- [Introduction](#TR_Intro)
	- [Tree traversals](#TR_Traversal)
	- [Find postorder traversal from given inorder and preorder](#TR_PostorderFromPreAndInorder)
	- [Find all possible binary trees with given Inorder Traversal](#TR_AllPossibleBTFromInorder)
	- [Binary tree level order traverssal](#TR_LOTraversal)
	- [Binary tree zigzag traversal - Level order in spiral](#TR_ZZTraversal)
	- [Binary tree reverse level order traversal](#TR_RLOTraversal)
	- [Binary tree reverse level order traversal - List of levels]
	- [Binary tree diagnoal traversal](#TR_DTraversal)
	- [Deletion in a binary tree](#TR_DeleteAndReplace)
	- [Recursion in a tree](#TR_Recursion)
	- [Delete leaf nodes with value as x](#TR_DeleteLeafNodes)
	- [Remove nodes on root to leaf paths of length < K](#TR_DeleteNodesLessLength)
	- [Remove all nodes which don’t lie in any path with sum>= k](#TR_DeleteNodesLessSum)
	- [Construct binary tree from array representation](#TR_ArrayToBT)
	- [Convert a given tree to its Sum Tree](#TR_TreeToSumTree)
	- [Convert a Binary Tree to DLL](#TR_BTToDLL)
	- [Lowest Common Ancestor in a Binary Tree](#TR_LCAInBT)
	- [Diameter of Binary Tree](#TR_DiameterTree)
	- [Diameter of a nary tree]
	- [Minimum height trees]
	- [Height of Binary Tree](#TR_HeightTree)
	- [Serialize and Deserialize a Binary Tree](#TR_SerializeDeserializeBT)
	- [Symmetric Tree](#TR_SymetricTree)
	- [Construct Binary Tree from String with bracket representation](#TR_TreeFromBracket)
	- [Construct String with bracket representation from Binary Tree](#TR_BracketFromTree)
	- [Binary Search Tree](#TR_BST)
	- [Construct BST from given pre-order traversal](#TR_ConstructBSTFromPreOrder)
	- [Binary Tree to Binary Search Tree](#TR_BTreeToBST)
	- [Sorted linked list and array to BST](#TR_SortedLLToBST)
	- [Lowest Common Ancestor in a Binary Search Tree](#TR_LCAInBST)
	- [Binary Tree Maximum Path Sum]
	- [Kth Smallest Element in a BST]
	- [Distribute Coins in Binary Tree]
	- [Validate BST - Inorder sorted, Check recursively]
	- [Binary Tree Cameras]
	- [Path Sum - II]
	- [Path Sum - III]
	- [Longest Univalue Path]
	- [Storing a tree in it's array foramt]
	- [Maximum width of binary tree]
	- [Binary tree right side view]
	- [Sum of distances in tree]
	- []
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
	- [Topological Sorting](#GP_TopoSort)
	- [Shortest path in a Directed Acyclic Graph](#GP_ShortestPathDAG)
    - [Graph coloring - Chromatic Number](#GP_GraphColoring)
    - [m-Coloring Problem](#GP_mColoring)
	- [Prim's Minimum Spanning Tree](#GP_PrimsMST)
    - [Minimum cost to connect all cities](#GP_MinCostConnectCities)
    - [Disjoint Union Find - Rank and Path Compression](#GP_DSU)
    - [Detect a cycle in an directed graph](#GP_CycleDirected)
	- [Detect a cycle in an undirected graph](#GP_CycleUndirected)
    - [Count all paths between a source and destination in a graph](#GP_CountAllSourceDestination)
    - [Print all paths between a source and destination in a graph](#GP_PrintAllSourceDestination)
    - [Minimum steps to reach target by Knight](#GP_KnightProblem)
    - [Minimum number of swaps required to sort an array](#GP_MinSwapsToSort)
    - [Minimum operations needed to convert x into y](#GP_MinOpsToConvert)
    - [Minimum cost path with Left, Right, Bottom and Up moves allowed](#GP_MinCost4Directions)
	- [Number of triangles in a graph](#GP_NumTriangles)
	- [Minimize Cash Flow among a given set of friends](#GP_MinCashFlow)
	- [Rotting oranges](#GP_RottingOranges)
	- [Find similar contacts in contact list (Accounts Merge)](#GP_SimilarContacts)
	- [Knight's tour problem - Visit each cell in a grid atleast once](#GP_KnightsTour)
	- [Rat in a maze - II (All 4 directions)](#GP_RatInMazeII)
	- [Shortest path + Count all paths with exactly k edges in a graph](#GP_ShortestPathWithExactlyKEdges)
	- [Shortest path with upto k edges in a graph - Djikstra and Bellman Ford]
	- [Dungeon Game]
	- [Unique Paths III]
	- [Redundant Connection]
	- [Redundant Connection II]
	- [Couple holding hands]
	- [K-Similar Strings]
	- [Similar String Groups]
	- [Cheapest flights within K stops]
	- [Critical Connections in a Network - Can also be used to group cycles together with same numbers]
	- [Longest increasing path in a matrix]
	- [Course Schedule I and II]
	- [Time needed to inform all employees]
	- [Friend Circles]
	- [Flood fill algorithm]
	- [Number of Islands]
	- [Surrounding regions]
	- [Maximum area of island]
	- []
    - [Stable marriage]
    - [Best First Search]
    - [A* Search Algorithm]
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
    - [Add knapsack description to the above link, 0/1 knapsack, unbounded knapsack, repititions allowed not allowed difference for converting 2d to 1d]
	- [Convert 2d to 1d see first discussion of coin change 2, extended knapsack]
    - [DP problems classification]
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
	- [Ones and zeroes]
    - [Partition into two equal subset problem]
    - [Partition into two subsets with minimum difference]
	- [Number of subsets with sum < K or sum > K or sum = K]
    - [Last stone weight 2, normal knapsack(2D) and coin change 2(1D) as well, compare with how coin change front and back iteration of j loop makes a difference to count allowed]
    - [Flip array]
    - [Trapping rain water]
	- [Partition Array for Maximum Sum]
14. [Bit Manipulation]
15. [Greedy Algorithms]
    - [Jump Game - I and II]
16. [Tips and Tricks]
	- [List<List> instantiation]
	- [Array tips and tricks from the array section]
	- [TreeSet vs Priority Queue]
	- [HashMap vs HashSet]
	- [Character, String and Integer interchange among themselves]
	- [How to take mid by avoiding overflow]
	- [Input sizes for various complexities]
	- [Integer.compare(a,b)]
	- [Reverse comaparator]
	- [Number of continous subarrays fromed in array of length n = n + n-1 + n-2 + n-3 and so on. The number of all possible subarrays of an array of size N is N * (N + 1)/2. Used in 'Subarrays with k different integers']
17. [Others]
    - [Square root decomposition]
    - [Segment trees]
    - [Trie]
    - [Line Sweep Algo]
    - [Catalan Number]

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

<a name="SlideWindow_TwoPointer"></a>
## <p align="center"> Sliding Window and Two Pointers Technique </p>
<a name="SWTP_Introduction"></a>
### Introduction
#### Sliding Window Algorithm
Sliding Window Algorith is a very popular problem solving techinque used in questions generally involving contigous array/string operations. The algo can help convert nested for loops into a single resulting in a O(N) complexity instead of O(N^2).

The idea is to select a window of say size k. The window depicts the range of elements that we can have in access at a time for a particular operation. We then iterate this entire window of size k over the array by adding elements from the front and removing those form the back. This way in O(N) time in a single iteration elements in groups of k can be iterated over.

For example if the task is to find the **maximum sum contigous subarray where the subarray size is atmost 3**. Once method to do it would be for every index i in the array, check if the array from i to i + k forms the answer we need.
```java
int maxSum = 0;
int currSum = 0;
for(int i = 0; i < n-k; i++)
{
    currSum = 0;
    for(int j = 0; j < k; j++)
    {
        currSum += arr[i+j];
    }
    maxSum = Math.max(maxSum, currSum);
}
```
The above method sovles our problem in O(NK) time.

We can potentially do better by instead of iterating over every element for k times, we can create a window of size k and calculate its sum by moving the window forward. Initialy the window lies from 0 to k. We clculate the sum in this. Now as we move forward, the window lies from 1 to k+1 and then from 2 to k+2 until we iterate till n-k to n. Now when moving forward we need not calculate the entire window sum from sratch in O(1) time. We can instead do this by adding the incoming index in the window and subtracting the first index of the window. For example when moving from 0->k to 1->(k+1), we can simply just add arr[k+1] and subtract arr[0] from current sum. This has been illustrated below:
1. We compute the sum of first k elements out of n terms using a linear loop and store the sum in variable maxSum.
2. Then we will iterate linearly over the array till it reaches the end and simultaneously keep track of maxSum.
3. To get the current sum of block of k elements just subtract the first element from the previous currSum and add the next element to it.
```java
int maxSum = 0;
int currSum = 0;
for(int i = 0; i < k; i++)
{
    currSum += arr[i];
}
maxSum = currSum;
for(int i = k; i < n; i++)
{
    currSum += arr[i] - arr[i-k];
    maxSum = Math.max(maxSum, currSum);
}
```
Hence, now we can solve our problem in O(N) time. This is known as the Sliding Window Technique.

#### Two Pointer Technique
Two pointers is really an easy and effective technique which is typically used for searching pairs in a sorted array or when we search in a window which can change length from either side. Let us consider an example. Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X. A naive method would be two compare every pair in O(N^2) time.

A faster way to achieve this is using two pointers. We take two pointers, one representing the first element and other representing the last element of the array, and then we add the values kept at both the pointers. If their sum is smaller than X then we shift the left pointer to right or if their sum is greater than X then we shift the right pointer to left, in order to get closer to the sum. We keep moving the pointers until we get the sum as X. The algorithm basically uses the fact that the input array is sorted. We start the sum of extreme values (smallest and largest) and conditionally move both pointers. We move left pointer i when the sum of A[i] and A[j] is less than X. We do not miss any pair because the sum is already smaller than X. Same logic applies for right pointer j.

<a href="#Contents">Back to contents</a>

<a name="SWTP_StringTemplate"></a>
### Sliding Window Template - String pattern questions
Many sliding window questions can involve strings. The questions regarding strings are generalyl related to finding contigous patterns under certain conditions in a parent string. In such type of questions the following pattern can be utilized to solve the questions. Let us assume that the question at hand is to find the starting indexes of all anagrams of a pattern in a string.
```java
public class Solution
{
    public List<Integer> slidingWindowTemplateForStrings(String original, String pattern)
    {
        // Create a result List to store the results
        // This can be any object or data structure suitable
        // for storng the results needed.
        List<Integer> result = new ArrayList<Integer>();

        // If pattern is longer than string itself,
        // then no answer exists so return empty result
        if(pattern.length()> original.length())
        {
            return result;
        }

        // Create a HashMap to store the count of the characters
        // in the pattern.
        // Key: Character in pattern; Value: Count of character
        Map<Character, Integer> patternMap = new HashMap<Character, Integer>();
        // Character array for the String pattern
        char[] patternArray = pattern.toCharArray();

        for(int i = 0; i < patternArray.length; i++)
        {
            char c = patternArray[i];
            // If character exists so increase count of character
            if(patternMap.containsKey(c))
            {
                patternMap.put(c, patternMap.get(c) + 1);
            }
            // If character does not exist so add it with count 1
            else
            {
                patternMap.put(c, 1);
            }
        }

        // The size of the HashMap patternSize is the total number
        // of unique characters in the String pattern. It acts as a
        // counter to remaining unmatched characters in the pattern.
        int counter = patternMap.size();

        // The begin pointer and end pointer to mark the range of
        // the sliding window
        int start = 0;
        int end = 0;

        // Current length of substring which matches the target
        int len = Integer.MAX_VALUE; 

        // Loop until the end of the original string is reached
        while(end < original.length())
        {
            // Current ending character
            char c = original.charAt(end);

            // The value in the patternMap that is the count of every
            // character in the pattern would act as a buffer when
            // matching characters with the original string. With every
            // match the buffer size would reduce by 1 until no more
            // characters are available to match.

            // If the current character exists in the pattern
            if(patternMap.containsKey(c))
            {
                // As we have got a match with the pattern, the number
                // of times we can further match this same character
                // is reduced by 1.
                patternMap.put(c, patternMap.get(c)-1);

                // If the buffer size has reached 0, we mean we have
                // completed matching the given character of the pattern
                // and hence number of remaining uncompleted characters
                // is reduced by 1. The condition to check for counter
                // reduction might be different for different questions.
                if(patternMap.get(c) == 0)
                {
                    counter--;
                }
            }

            // Move the window end to the next character
            end++;

            // If all characters of the pattern have been matched so check
            // if the condition according to the question are satisfied or
            // not to modify the result.
            while(counter == 0)
            {
                // First character of the sliding window
                char tempc = original.charAt(start);

                // IMPORTANT:
                // CHECK FOR SATISFACTORY CONDITIONS ACCORDING TO THE
                // QUESTION TO MODIFY THE RESULT HERE. AS OF NOW LET US
                // ASSUME THAT TASK AT HAND IS TO FIND THE STARTING
                // INDEXES OF ALL ANAGRAMS OF THE PATTERN IN THE ORIGINAL
                // STRING. SO WE CHECK IF THE PART THAT COMPLETELY MATACHES
                // ALL CHARACTERS OF THE PATTERN IS OF THE SAME LENGTH AS
                // PATTERN OR NOT. AS IF LENGTH IS NOT SAME IT WONT BE AN
                // ANAGRAM.
                if(end - start == pattern.length())
                {
                    result.add(start);
                }

                // If the character is a part of the mathcing, that is
                // character is present in the pattern
                if(patternMap.containsKey(tempc))
                {
                    // Increase the buffer size for the given character
                    // as we would be moving the start of the window to the
                    // next element. Hence, this character would now not be
                    // a part of the mathcing and thus the pattern would
                    // have a new unmatched character again
                    patternMap.put(tempc, patternMap.get(tempc) + 1);
                    // If pattern has a new unmatched character increase the
                    // counter value
                    if(patternMap.get(tempc) > 0)
                    {
                        counter++;
                    }
                }

                // Decrease the window size by incrementing the start pointer
                start++;
            }
        }
        return result;
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
    	ans += base*Integer.parseInt(String.valueOf(s.charAt(len)));
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

<a name="SQ_TreeSet"></a>
### Tree Set
A tree set is a better version of priority queue. It can be used as a double sided priority queue. It can also take in a customized comparator just like PriorityQueue. The reason it is preferred over priorityqueue is that it has a O(logN) remove element complexity.

Treeset does not allow duplicate values. TreeSet is basically an implementation of a self-balancing binary search tree like a Red-Black Tree. Therefore operations like add, remove, and search take O(log(N)) time. The reason is that in a self-balancing tree, it is made sure that the height of the tree is always O(log(N)) for all the operations. Therefore, this is considered as one of the most efficient data structure in order to store the huge sorted data and perform operations on it. However, operations like printing N elements in the sorted order takes O(N) time.
```java
TreeSet<Pair> trSet = new TreeSet<Pair>(new Comparison());
trSet.add(new Pair()); //O(Log n)
trSet.remove(Object o); //O(Log n)
trSet.first() // O(1)
trSet.last() // O(1)
trSet.pollFirst() //O(Log n)
trSet.pollLast() //O(Log n)
trSet.size() //O(1)
trSet.isEmpty() //O(1)

// Defining the comparator class for the TreeSet
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

<a name="Trees"></a>
## <p align="center"> Trees </p>

<a name ="TR_Intro"></a>
### Introduction
Trees are heirarchical data structure and hence differ from linked lists, arrays, stacks and queues in functionality as they are all linear data structures. The topmost node of a tree is called the root. In a connection between the nodes, that is when an edge in the tree connects two nodes, the ndoe where the edge begins is called a parent node, and where the edge ends is called the child node. Moreover, in trees, there are no back edges, that means edges are pssobile only from a higher level to a lower level. Nodes which do not have any children are called leaf nodes.

A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child. Binary trees provide moderate access and modification speeds. The operation search, delete, insert are all O(n) in a binary tree.
```java
// Node class to represent nodes in the tree
class Node
{
    // Value of the node
    int key;
    // Left and right children are also nodes
    Node left = null;
    Node right = null;

    public Node(int value)
    {
        key = value;
    }
	
	public Node(int value, Node r, Node l)
    {
        key = value;
		right = r;
		left = l;
    }
}

// Class for binary tree
class BinaryTree
{
    // All we need is the root of the tree
    // to run any algorithm on the tree
    Node root = null;
    
    public BinaryTree(int key)
    {
        root = new Node(key);
    }
}
```
Properties of a binary tree:
1. The maximum number of nodes in a binary tree at a level 'l' is 2^l. Root is level 0.
2. Maximum number of nodes in a binary tree of height 'h' is 2^h – 1. Root is at height 1.
3. In a binary tree with N nodes, minimum height possible is Log(N+1).
4. In binary tree where every node has 0 or 2 children, number of leaf nodes is always one more than nodes with two children.
5. A full binary tree is one in which all nodes have either 0 or 2 children. This means that all nodes other than leaves have 2 children.
6. A complete binary tree is a tree where in only the last level is allowed to be incomplete and that all the nodes in the last level are to as left as possible.

<a href="#Contents">Back to contents</a>

<a name ="TR_Traversal"></a>
### Tree traversals
There are three types of tree traversals:
1. Inorder: Inorder traversal is when the left subtree of a node is listed first, then the node and then the right subtree of the node. Both left and right subtrees are also listed in inorder fashion.
2. Preorder: Prorder traversal is when the node is listed first, then the left subtree of the node and then the right subtree of the node. Both left and right subtrees are also listed in preorder fashion.
3. Postorder: Postorder traversal is when the left subtree of a node is listed first, then the right subtree of the node and then the node at the end. Both left and right subtrees are also listed in postorder fashion.
```java
        1
      /   \
     2     3
    / \     \
   4   5     6
            /
           7
```
For the tree above the traversal would be as follows:
1. Inorder: 4 2 5 1 3 7 6
2. Preorder: 1 2 4 5 3 6 7
3. Postoreder: 4 5 2 7 6 3 1

These tree traversals can be achieved using recursion and stacks. The idea in both the approaches is similar and has been implemented below:
```java
// INORDER TRAVERSAL - RECURSIVE
class Solution
{
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return ans;
        }
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }
}

// INORDER TRAVERSAL - ITERATIVE STACK
class Solution
{
    public List < Integer > inorderTraversal(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // Current element is root
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty())
        {
            // Traverse till extreme left and
            // keep adding to stack
            while (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            // At this point top of stack is current extreme left element
            // We pop the head, and then add it to the asnwer
            // The new head would now be the parent of the popped element
            curr = stack.pop();
            ans.add(curr.val);
            // We set the current element to the right child of the
            // popped element
            // If the right child exists, then in the next iteration
            // it would come to the top of the stack
            curr = curr.right;
        }
        return ans;
    }
}

// PREORDER TRAVERSAL - RECURSIVE
class Solution
{
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return ans;
        }
        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ans;
    }
}

// PREORDER TRAVERSAL - ITERATIVE STACK
class Solution
{
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // Current element is root
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty())
        {
            // We move to the extreme left, but while doing so
            // we add all the parent nodes to ans as in preorder
            // the parent comes before the left and right children
            while (curr != null)
            {
                ans.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            }
            // When the extreme left is reached,
            // all parents and left nodes so far
            // have been added.
            // We start popping the stack now and
            // shift current to the right element of
            // the popped node.
            curr = stack.pop();
            curr = curr.right;
        }
        return ans;
    }
}

// POSTORDER TRAVERSAL - RECURSIVE
class Solution
{
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return ans;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }
}

// POSTORDER TRAVERSAL - ITERATIVE STACK
class Solution
{
    // Ides used here is that for the normal preorder traversal
    // the format is ROOT LEFT RIGHT
    // If we modify this format to be ROOT RIGHT LEFT and then
    // reverse the output it would become LEFT RIGHT ROOT and hence
    // create postorder traversal.
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // Current element is root
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty())
        {
            // We move to the extreme right(right first preorder),
            // but while doing so we add all the parent nodes
            // to the answer as in preorder the parent comes
            // before the children
            while (curr != null)
            {
                res.add(curr.val);
                stack.push(curr);
                curr = curr.right;
            }
            // When the extreme right is reached,
            // all parents and right nodes so far
            // have been added.
            // We start popping the stack now and
            // shift current to the left element of
            // the popped node.
            curr = stack.pop();
            curr = curr.left;
        }
        // As the ans currently is a ROOT RIGHT LEFT preorder,
        // we reverse it to produce LEFT RIGHT ROOT postorder
        Collections.reverse(res);
        return res;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_PostorderFromPreAndInorder"></a>
### Find postorder traversal from given inorder and preorder
The questions is that given in-order and pre-order traversal of a binary tree, can we output the postorder traversal for the same. The question can be solved recursively, by using the pre-order traversal to decide roots and the inorder subtree to decide elements of the left and right subtrees for each root.
We know that inorder follows the format Left Root Right and preorder follows the format ROOT LEFT RIGHT. Hence, the first element of the preorder will be the root of the tree, and in the inorder, elements to the left of the root will be left subtree and those to right will be from right subtree. For example,<br>
Inorder = { 4, 2, 5, 1, 3, 6 }<br>
Preorder = { 1, 2, 4, 5, 3, 6 }<br>
Hence, from the preorder the root of the tree would be 1, and from the inorder the elements of the left subtree would be { 4, 2, 5 } and those of the right subtree would be { 3, 6 }.

Now solving for the left subtree, moving on to the next root element in the preorder, we know that 2 would be the root of the subtree, and the subtree as obtained from inorder is { 4, 2, 5 }. We repeat the same process again to get new left and right subtrees as { 4 } and { 5 } respectively and the root from preorder as 2.

This process can be repeated recursively to complete the entire tree. Now to solve the question, we can either build the tree first and then print the postorder traversal of the tree, or instead we can get the postorder traversal directly while building the tree as shown in the code below:
```java
class Solution
{
    // Index for keeping track of root element in preOrder
    static int pIndex = 0;

    // Return postOrder
    public static ArrayList<Integer> findPostOrder()
    {
        int[] inOrder = { 4, 2, 5, 1, 3, 6 };
        int[] prOrder = { 1, 2, 4, 5, 3, 6 };
        int n = inOrder.length;
        // HashMap to store the index of elements in inOrder
        HashMap<Integer, Integer> inMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            // Fill HashMap
            inMap.put(inOrder[i], i);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        findPostOrderUtil(inMap, prOrder, ans, 0, n);
        return ans;
    }

    // Input is given as HashMap, the preOrder traversal,
	// final asnwer arraylist and the starting and ending points of subtrees
    public static void findPostOrderUtil(HashMap<Integer, Integer> inMap, int[] prOrder, ArrayList<Integer> ans, int start, int end)
    {
        // If start is same as end, this means that epmty subtree
        // has been reached. So do nothing.
        if(start == end)
        {
            return;
        }
        // The value of the root for the subtree
        int value = prOrder[pIndex];
        // The index of root in inOrder
        // Everything right to this index forms right subtree
        // Everything left to this index forms left subtree
        int rootIndex = inMap.get(value);
        
        // Move preOrder index to next root
        pIndex++;
        // Solve for left subtree
        findPostOrderUtil(inMap, prOrder, ans, start, rootIndex);
        // Solve for right subtree
        findPostOrderUtil(inMap, prOrder, ans, rootIndex+1, end);
        // As it is PostOrder, the actuall root is added after
        // left and right subtrees are added.
        ans.add(value);
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_AllPossibleBTFromInorder"></a>
### Find all possible binary trees with given Inorder Traversal
The task is to find all possible tree formations from a given inorder traversal. We output the trees as their preorder traversals.

We from all possbile inorder traversal trees recursively by selecting all elements as root once and by forming left and right subtrees from elements to the left and right of selected root respectively.

The code is as foolows:
```java
class Solution
{
    public static void findAllTrees()
    {
        int[] inOrder = { 4, 5, 7, 8 };
        ArrayList<Node> ans = findAllTreesUtil(inOrder, 0, inOrder.length);
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(preOrderTraversal(ans.get(i)));
        }
    }

    // Input is the inOrder traversal, and starting and ending point of subtree
    // Output is the list of root nodes for all the trees formed
    public static ArrayList<Node> findAllTreesUtil(int []inOrder, int start, int end)
    {
        // List of root nodes
        ArrayList<Node> ans = new ArrayList<Node>();
        // If the starting and ending elements
        // are same then this means we have reached
        // the null children.
        if(end == start)
        {
            // Add null as the subtree root.
            ans.add(null);
            return ans;
        }
        // For all elements from start to end
        // we make every element root once
        for(int i = start; i < end; i++)
        {
            // List of roots of all left subtrees with
            // element 'i' as parent root
            ArrayList<Node> leftTrees = findAllTreesUtil(inOrder, start, i);
            // List of roots of all right subtrees with
            // element 'i' as parent root
            ArrayList<Node> rightTrees = findAllTreesUtil(inOrder, i+1, end);
            // For all left subtrees possible
            for(int j = 0; j < leftTrees.size(); j++)
            {
                // For all right subtrees possible
                for(int k = 0; k < rightTrees.size(); k++)
                {
                    // Create node with 'i' as root
                    Node n = new Node(inOrder[i]);
                    // Add left and right subtree
                    n.left = leftTrees.get(j);
                    n.right = rightTrees.get(k);
                    // Add this node to the list of all trees with elements
                    // from start to end
                    ans.add(n);
                }
            }
        }
        return ans;
    }

    // Simple preorder traversal for output
    public static ArrayList<Integer> preOrderTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while(curr != null || !stack.isEmpty())
        {
            while(curr != null)
            {
                ans.add(curr.value);
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            curr = curr.right;
        }
        return ans;
    }
}

// Class node for forming the tree
class Node
{
    int value = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        value = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_LOTraversal"></a>
### Binary tree level order traverssal
The level order traversal for a tree is when we list nodes of the tree level by level starting from the left to right. The code is trivial and is a simple implementation of BFS on a tree where we add the nodes to a queue. For ever y node in queue, we pop the head, add the popped nodes left and right child to queue respectively and then print the popped head. This is repeated till the queue becomes empty. This way all nodes on a particular level are treated first before their children.
```java
class Solution
{
    public static ArrayList<Integer> levelOrderTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node curr = null;
        while(!queue.isEmpty())
        {
            curr = queue.poll();
            if(curr.left != null)
            {
                queue.add(curr.left);
            }
            if(curr.right != null)
            {
                queue.add(curr.right);
            }
            ans.add(curr.value);
        }
        return ans;
    }   
}

// Class node for forming the tree
class Node
{
    int value = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        value = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_ZZTraversal"></a>
### Binary tree zigzag traversal - Level order in spiral
The zigzag level traversal is a modification of the simple level order traversal. For every lternate level we need to change the order of printing from left to right to right to left. This can achived in O(n) time using two different stacks. The approach is as foolows:
1. Create two empty stacks, say A and B, add all nodes of level 1, that is the root, to A.
2. Now pop elements from stack A and add them to the answer, and for every popped elemnt, push the right and left child of the node to stack B. Now as the right and left child were pushed in order, therefore stack B has left child at top and right child below in the stack. Hence, <ins>stack B</ins> would represent a <ins>Left to Right</ins> printing pattern.
3. For every node in stack B, now pop the head and add it to the answer. For every popped head, add the left and right children to stack A. This way, now when <ins>stack A</ins> is popped it will result in a <ins>Right to Left</ins> oredering.
4. Repeat the process above till both stacks become empty and return the final result.

In short, we alternatively add level to different stacks, One stack follows a push right before left order and the other follows a push left before right order. This way, when popping, alternate orders are followed.
```java
class Solution
{
    public static ArrayList<Integer> levelOrderTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Node> stackA = new Stack<Node>();
        Stack<Node> stackB = new Stack<Node>();
        stackA.push(root);
        while(!stackA.isEmpty() || !stackB.isEmpty())
        {
            Node temp = null;
            while(!stackA.isempty())
            {
                temp = stackA.pop();
                ans.add(temp.data);
                if(temp.right != null)
                {
                    stackB.push(temp.right);
                }
                if(temp.left != null)
                {
                    stackB.push(temp.left);
                }
            }
            while(!stackB.isempty())
            {
                temp = stackB.pop();
                ans.add(temp.data);
                if(temp.left != null)
                {
                    stackA.push(temp.left);
                }
                if(temp.right != null)
                {
                    stackA.push(temp.right);
                }
            }
        }
        return ans;
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_RLOTraversal"></a>
### Binary tree reverse level order traversal
Here we are required to print the level order traversal of a tree in reverse order. This means that the last elvel should be printed first and then the second last and so on, with the root being printed last.

This can be achieved using a stack. Values added to stack are put in a LIFO order that is the element put in last would be taken out first. o if for every level we were to put values in a right to left order till the very last level, we would eventually be pulling out values in left to right order starting from the last level. This is exactly what is needed. For example for three below:
```java
          1
        /   \
       2     3
      / \     \
     4   5     6
              /
             7
```
The stack would be filled like this by traversing the tree level by level from right to left:
1 3 2 6 5 4 7
The stack when popped would result in output similar to reverse printing level from left to right:
7 4 5 6 2 3 1
```java
class Solution
{
    public static ArrayList<Integer> levelOrderTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node n = null;
        while(!queue.isEmpty())
        {
            n = queue.poll();
            stack.push(n);
            if(n.right != null)
            {
                queue.add(n.right);
            }
            if(n.left != null)
            {
                queue.add(n.left);
            }
        }
        while(!stack.isEmpty())
        {
            // System.out.print(stack.pop().data + " ");
            ans.add(stack.pop().data);
        }
        return ans;
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_DTraversal"></a>
### Binary tree diagnoal traversal
The question is to print the tree in a digaonal order. This means that levels are decided diagonally. The root and all it's right nodes form level 1, the second level is root's left node and the left nodes of all the right nodes of root and so on. Example:
```java
           1
         /   \
        2     3
       / \     \
      4   5     6
               / \
              7  10
```
In the above tree,<br>
The first level would be: 1 3 6 10<br>
The second level would be: 2 5 7<br>
The third level would be: 4<br>

For a better explanation of the problem statement refer to this image: https://media.geeksforgeeks.org/wp-content/uploads/d1-1.png

This question can be solved recursively by adding nodes to a map of different diagonal levels. Let us consider we have a hashmap of the form HashMap<Integer, ArrayList<Integer>>, where the key is the level number and the value which is the array list is list of nodes on that diagonal level. So our task now is that for each level, we add values to the list in the following way:
1. For the element on that level, add the element to the list of that level.
2. Add the right node of the element to the same level as the element.
3. Add the left node of the element to the next level as the element.
4. Repeat the process for the right and left nodes of the element.
	
The code is as follows:
```java
class Solution
{    
    public static void diagonalTraversal(Node root)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, ArrayList<Integer>> hMap = new HashMap<Integer, ArrayList<Integer>>();
        diagonalTraversalUtil(hMap, 0, root);
        for(int i = 0; i < hMap.size(); i++)
        {
            ans.add(hMap.get(i));
        }
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }

    public static void diagonalTraversalUtil(HashMap<Integer, ArrayList<Integer>> hMap, int dist, Node node)
    {
        if(node == null)
        {
            return;
        }
        ArrayList<Integer> arr = hMap.get(dist);
        if(arr == null)
        {
            arr = new ArrayList<Integer>();
            arr.add(node.data);
        }
        else
        {
            arr.add(node.data);
        }
        hMap.put(dist, arr);
        diagonalTraversalUtil(hMap, dist + 1, node.left);
        diagonalTraversalUtil(hMap, dist, node.right);
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```

<a href="#Contents">Back to contents</a>

<a name ="TR_DeleteAndReplace"></a>
### Deletion in a binary tree
Given a binary tree, delete a node from it by making sure that tree shrinks from the bottom (i.e. the deleted node is replaced by bottom most and rightmost node).

This can be achieved by a three traversal process:
1. Traversing the tree and then storing the deepest rightmost node in the tree.
2. We then find the node to be deleted and swap the values of the deepest node and the node to be deleted.
3. We the find the parent of the deepest rightmost node and replace the deepest rightmost node with null.
```java
class Solution
{
    public Node deletionBT(Node root, int key)
    {
        Node rightMost = null;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            rightMost = queue.poll();
            if(rightMost.left != null)
            {
                queue.add(rightMost.left);
            }
            if(rightMost.right != null)
            {
                queue.add(rightMost.right);
            }
        }
        Node toDelete = null;
        queue.add(root);
        while(!queue.isEmpty())
        {
            toDelete = queue.poll();
            if(toDelete.data == key)
            {
                break;
            }
            if(toDelete.left != null)
            {
                queue.add(toDelete.left);
            }
            if(toDelete.right != null)
            {
                queue.add(toDelete.right);
            }
        }
        int temp = rightMost.data;
        toDelete.data = temp;
        rightMost.data = key;
        Node parent = null;
        queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            parent = queue.poll();
            if(parent.data == key)
            {
                root = null;
                break;
            }
            if(parent.left != null)
            {
                if(parent.left.data == key)
                {
                    parent.left = null;
                    break;
                }
                else
                {
                    queue.add(parent.left);
                }
            }
            if(parent.right != null)
            {
                if(parent.right.data == key)
                {
                    parent.right = null;
                    break;
                }
                else
                {
                    queue.add(parent.right);
                }
            }
        }
        return root;
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_Recursion"></a>
### Recursion in a tree
As a rule one may follow:
1. If recursion is to build the tree, follow a preOrder format, that is create the root first and then add children.
2. If recursion is to delete the nodes of a tree then follow the postOrder format that is delete the children first and ony then the parent.
3. If recursion is to neither build a tree nor delete nodes, but to replicate the structure of thee tree such as convert tree to linked list/ convert tree to array/ serializing a tree, always follow the preOrder format.

<a href="#Contents">Back to contents</a>

<a name ="TR_DeleteLeafNodes"></a>
### Delete leaf nodes with value as x
Given a binary tree and a target integer x, delete all the leaf nodes having value as x. Also, delete the newly formed leaves with the target value as x.

This question differs form the previous one in the manner that it is not just the leaf node that is to be deelted, but recursively all ndoes that satisfy the condition have to be deleted until no node satisfies the given condition. This introduces a new type of tree node deletion problems, where we need to delete nodes recursively until no remaining nodes satsify the deletion condition.

We solve such type of problems by following a post order traversal for deletion. The reason we follow a post order traversal is because it is necessary to delete the child elements of a node first before considering the removal of the node. If we follow a normal BFS traversal of the tree we would need to traverse the entire tree again and again for checking leaves, instead if we follow a post order traversal, if the leaves are deleted and we reach the root, the root automatically becomes the leaf and can be checked side by side.

The code is as follows:
```java
class Solution
{
    public static Node deleteLeafNodesX(Node root, int x)
    {
        return removeShortPathNodesUtil(root, x);
    }

    public static Node deleteLeafNodesXUtil(Node root, int x)
    {
        if(root == null)
        {
            return null;
        }
        root.left = deleteLeafNodesXUtil(root.left, x);
        root.right = deleteLeafNodesXUtil(root.right, x);
        if(root.left == null && root.right == null && root.data == x)
        {
            return null;
        }
        return root;
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_DeleteNodesLessLength"></a>
### Remove nodes on root to leaf paths of length < K
Given a Binary Tree and a number k, remove all nodes that lie only on root to leaf path(s) of length smaller than k. If a node X lies on multiple root-to-leaf paths and if any of the paths has path length >= k, then X is not deleted from Binary Tree. In other words a node is deleted if all paths going through it have lengths smaller than k.
```java
class Solution
{
    public static Node removeShortPathNodes(Node root, int k)
    {
        // Utility recursive function
        // Input is root, current level or root and
        // the minimum length needed
        return removeShortPathNodesUtil(root, 1, k);
    }

    public static Node removeShortPathNodesUtil(Node node, int cuurHeight, int k)
    {
        // If node is null so return null
        if (node == null)
        {
            return null;
        }
        // Set left child of node recursively
        // If left subtree satisfies the property needed
        // then left child will remain same else it will
        // be null
        // Increase height by 1 before calling recursive function
        node.left = removeShortPathNodesUtil(node.left, cuurHeight + 1, k);
        // Do same for right child
        node.right = removeShortPathNodesUtil(node.right, cuurHeight + 1, k);
        // If both children are null, so check if the current node itself
        // satisfies the condition or not
        if (node.left == null && node.right == null && cuurHeight < k)
        {
            // If not return null
            return null;
        }
        return node;
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_DeleteNodesLessSum"></a>
### Remove all nodes which don’t lie in any path with sum>= k
Given a binary tree, a complete path is defined as a path from root to a leaf. The sum of all nodes on that path is defined as the sum of that path. Given a number K, you have to remove all nodes which don’t lie in any path with sum>=k. The question is similar to previous one and follows the same approach.
```java
class Solution
{
    public static Node removeLessSum(Node root, int sum)
    {
        return removeLessSumUtil(root, 0, sum);
    }

    public static Node removeLessSumUtil(Node root, int curr, int sum)
    {
        
        if(root == null)
        {
            return root;
        }
        root.left = removeLessSumUtil(root.left, curr + root.data, sum);
        root.right = removeLessSumUtil(root.right, curr + root.data, sum);
        if(root.left == null && root.right == null && root.data + curr < sum)
        {
            return null;
        }
        return root;
    }
    
    public static void print(Node root)  
    {  
        if (root != null)  
        {  
            print(root.left);  
            System.out.print(root.data + " ");  
            print(root.right);  
        }  
    }
}

// Class node for forming the tree
class Node
{
    int data = 0;
    Node right = null;
    Node left = null;

    public Node(int v)
    {
        data = v;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_ArrayToBT"></a>
### Construct binary tree from array representation
Given an array that represents a tree in such a way that array indexes are values in tree nodes and array values give the parent node of that particular index (or node). The value of the root node index would always be -1 as there is no parent for root. Construct the standard linked representation of given Binary Tree from this given representation.

For exmaple for the array { 1, 5, 5, 2, 2, -1, 3 } the tree would look like:
```java
          5
        /  \
       1    2
      /    / \
     0    3   4
         /
        6 
```
We can solve this problem in a simple iterative manner. All we would need is to store the nodes that we create along the way. Lets say we have a map that stores the array index as key and the node for that index as the value for the hashmap key. Let us say the input array is called parent[].
1. Traverse the parent[] array element by element. For every index check if the map contains the index. If map does not contain the index 'i', then create node for 'i' and add it to the map. The node would have the value as i (Node n = new Node(i)). If map already contained index 'i' then move to next element.
2. If the parent[i] was -1, in that case make sure you also mark the root to be equal to map.get(i).
3. If the parent[i] was not -1, then search for the parent's index in the map. If the parent's index does not exist, so create the parent index's node and add the child element node to its left subchild. Else if the parent's index node exists already so check for a vacant child node and add the child element there.

The code is as follows:
```java
class Solution
{
    public static Node createTree(int[] parent)
    {
        int n = parent.length;
        Node root = null;
        HashMap<Integer, Node> hMap = new HashMap<Integer, Node>();
        for(int i = 0; i < n; i++)
        {
            Node newNode = null;
            if(!hMap.containsKey(i))
            {
                newNode = new Node(i);
                hMap.put(i, newNode);
            }
            else
            {
                newNode = hMap.get(i);
            }
            if(parent[i] == -1)
            {
                root = newNode;
            }
            else if(!hMap.containsKey(parent[i]))
            {
                Node p = new Node(parent[i]);
                p.left = newNode;
                hMap.put(parent[i], p);
            }
            else
            {
                Node p = hMap.get(parent[i]);
                if(p.left == null)
                {
                    p.left = newNode;
                }
                else
                {
                    p.right = newNode;
                }
            }
        }
        return root;
    }

    public static void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_TreeToSumTree"></a>
### Convert a given tree to its sum tree
Given a Binary Tree where each node has positive and negative values. Convert this to a tree where each node contains the sum of the left and right sub trees in the original tree. The values of leaf nodes are changed to 0.

If original tree is:
```java
                  10
               /      \
             -2        6
           /   \      /  \ 
         8     -4    7    5
```
It would become:
```java
                 20=4-2+12+6
               /      \
           4=8-4     12=7+5
           /   \      /  \ 
         0      0    0    0
```
Note that once a child takes values from the sum of leaf nodes, its original value is still considered when calculating sum for parent node.

This is a very trivial question that can be solved recursively. For every node we store its orgiinal value and then update the value as sum of left and right subtrees. Then, the new value + original value are returned in further recursive calls. We basically follow a bottoms up building approach recursively. Steps:
1. Do a traversal of the given tree. In the traversal, store the old value of the current node.
2. Recursively call for left and right subtrees.
3. Change the value of current node as sum of the values returned by the recursive calls

The code is as follows:
```java
class Solution
{
    public void toSumTree(Node root)
    {
        sumTree(root);
    }
    
    public int sumTree(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int value = root.data;
        root.data = sumTree(root.left) + sumTree(root.right);
        return root.data + value; 
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_BTToDLL"></a>
### Convert a Binary Tree to DLL
We can covnert a binary tree to its DLL representation very easily. A DLL is a doubly linked list and a binary tree node can be represented as a DLL node by simply putting the DLL previous as binary tree's left and DLL's next as binary tree's right. This way a BTree can be converted into a DLL easily.
```java
             10
          /      \
         2        6
       /   \     /  \ 
      8     4   7    5
```
For the tree above converting it into a DLL ould have the following process.
1. First add root, 10.<br>
DLL: 10
2. Now, the left element is 2 and right is 6. So link them accordingly.<br>
DLL: 2 <--> 10 <--> 6
3. For, 2, we connect it to 8 and 4 recursively.<br>
DLL: 8 <--> 2 <--> 4 <--> 10 <--> 6
4. Repeat same process fro children of 6.<br>
DLL: 8 <--> 2 <--> 4 <--> 10 <--> 7 <--> 6 <--> 5

Looking deeper into the algorithm discussed, we can notice that simlpy getting the inorder traversal of the tree and then froming a DLL out of it would do trick. The code is trivial and hence not covered in detail.

<a href="#Contents">Back to contents</a>

<a name ="TR_LCAInBT"></a>
### Lowest Common Ancestor in a Binary Tree
Given a binary tree (not a binary search tree) and two values say n1 and n2, write a program to find the least common ancestor.

If say only one of the elemments exist in the tree, in that case the lowest common ancestor would be the respective element itself.

We traverse the tree starting form the root and look for the given elements in the left and right subtrees recursively. The node which has one element in its right subtree and one in its left subtree is the LCA. If no such node exists then following three conditions might be possible:
1. Root is one of the elements. In this case, root is the answer.
2. Only one element is present. In this case, the element present is the answer.
3. None of the elements are present. In this case, the answer is null.
```java
class Solution
{
    public static Node lowestCommonAncestor(Node root, int n1, int n2)
    {
        // If given element is null so return null
        if(root == null)
        {
            return null;
        }
        // If the element matches either of the given inputs
        // return the element itself
        if(root.data == n1 || root.data == n2)
        {
            return root;
        }
        // If the elements are present in left subtree
        // the this value 'left' would hold a node
        // else the function call will return null
        Node left = lca(root.left, n1, n2);
        // If the elements are present in right subtree
        // the this value 'right' would hold a node
        // else the function call will return null
        Node right = lca(root.right, n1, n2);
        // If both left and right are not null
        // then this node is our answer as its
        // left and right subtrees have the values
        if(left != null && right != null)
        {
            return root;
        }
        // If only left is not null, then left is the
        // answer as only one element is present
        if(left != null)
        {
            return left;
        }
        // If only right is not null, then right is the
        // answer as only one element is present
        else
        {
            return right;
        }
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```

Another method to do this can be we find and store the path to both the nodes in the tree. If only one node is found the the other node automatically becomes the answer. Else, both the paths will initially have certain number of common elements. The element, just before the first different element is the LCA.

<a href="#Contents">Back to contents</a>

<a name ="TR_DiameterTree"></a>
### Diameter of Binary Tree
The diameter of a tree is the number of nodes on the longest path between two leaves in the tree. Our task is to find the diameter given the root.

We can achieve this by simple recursive tree traversal by recursively checking at each node for the following:
1. Length of maximum path length in subtree rooted at node, such that node is necessarily included.
2. Diameter in left subtree of node.
3. Diameter in right subtree of node.

The diameter for the node would be the maximum of the above three options fo any node. We repeat this process recursively for all the nodes. To implement this algorithm we take the following steps:
1. Maintain a global variable as 'answer' that represents our diameter.
2. For any node on which we are, get the maximum path length including the node. This is equal to height of left subtree of node + height of right subtree of node + 1 for the node itself.
3. Now this maximum path might form the new largest diameter so we check for the maximum of current 'answer' and the new maxlegnth at given node. The max of the two form the new 'answer'.
4. The above steps are ventualy repeted in recursive calls, giving us the final diameter as the value of the variable 'answer'.
```java
class Solution
{
    static int ans = 0;
    public static int diameter(Node root)
    {
        ans = 0;
        getHeight(root);
        return ans;
    }
    
    public static int getHeight(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_HeightTree"></a>
### Height of Binary Tree
Given a binary tree, find its height. Height of a binary tree with only the root element is 1. The code is very simple and similar to the previous problem of following the diameter. The height of any node will be equal to 1 + maximum of height of left subtree and height of right subtree.
```java
class Solution
{
    int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_SerializeDeserializeBT"></a>
### Serialize and Deserialize a Binary Tree
Serialization means to store the structure of something in a format different and simpler than the structure itself. Here serialization of tree means converting it into an array format and deserialization would mean reconstructing the tree from the serialized array.

There are various scenarios that can be encoutered for serializing trees:
1. **If given Binary Tree is Complete Tree:** A Binary Tree is complete if all levels are completely filled except possibly the last level and all nodes of last level are as left as possible. In this case level order traversal is sufficient to store the tree. We know that the first node is root, next two nodes are nodes of next level, next four nodes are nodes of 2nd level and so on.
2. **If given Binary Tree is Full Tree:** A full binary tree is where every node has either 0 or 2 children. It is easy to serialize such trees as every internal node necessarily has 2 children. We can simply store preorder traversal of the tree with every null node being denoted by a special value, say -1. This way even when desrializing every time we would encounter -1 we would know we do not need to add a new node and move to the next element in order.
3. **If the tree is neither full nor complete:** To serialize the tree we can use both inorder and preorder traversals of the tree as we can build the tree back using the two. This method eventually requires O(2N) space and O(2N) complexity for both serialization and desrialization. We can speed this up by converting the preorder traversal of the tree to match the one as mentioned in point 2, that is that of a full tree. Every time we encounter a null node as the child of a node in our preorder traversal, we add '-1' to the preorder traversal answer. This way in a single iteration and approximately O(N) space we can store the serialized array and similarly in O(N) space and time we can covnert the arrray back into the tree as discussed in step two. The process is depicted in detail in the code below:
```java
class Solution
{
    // A pointer for the preOrder array used in
    // deserialization
    static int p = 0;

    // serialization function. Exactly same as the preOrder traversal
    // except for the line where we add '-1' for null nodes.
    public static ArrayList<Integer> serializeTree(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while(curr != null || !stack.isEmpty())
        {
            // The node curr is not null here
            while(curr != null)
            {
                ans.add(curr.data);
                stack.push(curr);
                curr = curr.left;
            }
            // When we reach this point we know now we have either traversed
            // to a null node, or the node curr was originally null itself
            // and never entered into the above while loop. In either of the
            // cases we would add '-1' to our preOrder traversal. We would do
            // this because if ndoe was not originally null, then this means
            // we have reached a null left child of some parent. And if the
            // node was already null then it means it was the null right child
            // of some parent.
            ans.add(-1);
            curr = stack.pop();
            curr = curr.right;
        }
        return ans;
    }

    // Input is the serialized preOrder array
    public static Node deserializeTree(ArrayList<Integer> arr)
    {
        // Set initial pointer of the preOrder array as 0.
        p = 0;
        return deserializeTree(arr);
    }

    // Input is the serialized preOrder array
    // Remember preOrder format is ROOT, LEFT, RIGHT
    public static Node deserializeTreeUtil(ArrayList<Integer> arr)
    {
        // If pointer has crossed array size or the pointer pointed to
        // a null node so we return null
        if(arr.size() <= p || arr.get(p) == -1)
        {
            // As it might be possible pointer points to a null node
            // and not necessarily has crossed the array length, so we
            // need to increase it for further iterations
            p++;
            return null;   
        }
        // Node root is initialized with value in the preOrder array
        Node root = new Node(arr.get(p));
        // Pointer is moved forward to next node
        p++;
        // We know that from preOrder fromat, the next node is left child
        // Now the pointer points to the next node in the preOrder array
        // and hence the desrialized left subtree would be added to root.left
        root.left = deserializeTree(arr);
        // When the above recursive call completes, the pointer would have
        // itself reached the point of the right child of the original node.
        // Hence we dont need to increase its value again.
        root.right = deserializeTree(arr);
        // Return the root, this return tree's root in case of first
        // call and the root's of subtrees in case of recursive calls.
        return root;
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_SymetricTree"></a>
### Symmetric Tree
Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.

We simply need to iterate both the normal version and mirrored version of the tree together and check that whether or not nodes at every point are same. The code is easy to understand and hence detailed explanations of the workings have been opted out.
```java
class Solution
{
    public boolean isSymmetric(Node root)
    {
        // Add the root two times to the queue. We will
        // add nodes in such a saw as if we are traversing
        // the tree normalyl and its mirror side by side. 
        // Hence root is added twice as in both normal
        // and mirrored iteration, root comes first.
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty())
        {
            // Get two heads
            Node t1 = queue.poll();
            Node t2 = queue.poll();
            // If both heads null so move to next
            if (t1 == null && t2 == null)
            {
                continue;
            }
            // If either one is null so return false
            // as not equal
            if (t1 == null || t2 == null)
            {
                return false;
            }
            // If values dont match so return false
            if (t1.val != t2.val)
            {
                return false;
            }
            // Now in normal iteration we would put first
            // head's left and hence in mirrored it's opposite
            // would be right of the other head.
            queue.add(t1.left);
            queue.add(t2.right);
            // Now when we put right of first head. its opposite
            // would be the left of second head.
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_TreeFromBracket"></a>
### Construct Binary Tree from String with bracket representation
Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. Output the tree in it's preorder form. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the root’s value and a pair of parenthesis contains a child binary tree with the same structure.

An example would be:
```java
Input : "4(2(3)(1))(6(5))"
Output : 4 2 3 1 6 5
Explanation :
           4
         /   \
        2     6
       / \   / 
      3   1 5   
```
We can solve this question recursively by building the root first and then recursively building the left and right child and repeating the process until all nodes have been created. The process is simple:
1. If string is empty, return null else the first number of string forms the root.
2. If the next character in string is '(' then that means root has a left child. Iterate the string to the point where you find a closing bracket for the original '('. This can be done easily using stack.<br>
Once the closing brackt has been found, call the recursive function again for the string between opening and closing brackets. The subtree formed would be the left subtree of the root.
3. If the next character in string is '(' after the last ')' for the left subtree, then that means root has a right child as well. Iterate the string to the point where you find a closing bracket for the original '(' of the right child. This can be done easily using stack.<br>
Once the closing brackt has been found, call the recursive function again for the string between opening and closing brackets. The subtree formed would be the right subtree of the root.
4. Once both the children have been checked, return the root.

NOTE: If the left child is null and right child is not null then representation is of the form rootNode()(leftChild). Instead, if right child is null and left is not null then empty brackets are not used, and is represented as rootNode(leftChild).
```java
class Solution
{
    public Node convertToBinaryTree(String s)
    {
        return convertToBinaryTreeUtil(s.toCharArray(), 0);
    }

    public Node convertToBinaryTreeUtil(char[] arr, int start)
    {
        // Check for empty string or end of string
        if(arr.length == 0 || start >= arr.length)
        {
            return null;
        }
        // Create root with first character
        Node root = new Node(Integer.parseInt(Character.toString(arr[start])));
        // Index that denotes the ending bracket position
        int leftIndex = -1;
        // Check if left child exists
        if(arr[start + 1] == '(')
        {
            leftIndex = start + 1;
        }
        else
        {
            return root;
        }
        // Stack to check parentheses
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        // Iterate till the point we find valid closing bracket
        while(!stack.isEmpty())
        {

            leftIndex++;
            if(arr[leftIndex] == ')')
            {
                stack.pop();
            }
            else if(arr[leftIndex] == '(')
            {
                stack.push(1);
            }
        }
        // If closing bracket is just after the opening bracket,
        // it means left child is null
        if(leftIndex == start + 2)
        {
            root.left = null;
        }
        else
        {
            // Recursively call for left subtree, with root at start + 2
            // start + 1 is '(', hence start + 2
            root.left = convertToBinaryTreeUtil(arr, start + 2);
        }
        // Index denoting ending bracket position for right tree
        int rightIndex = leftIndex;
        if(arr[rightIndex + 1] == '(')
        {
            rightIndex++;
        }
        else
        {
            return root;
        }
        stack.push(1);
        // Iterate to find valid ending for right subtree
        while(!stack.isEmpty())
        {

            rightIndex++;
            if(arr[rightIndex] == ')')
            {
                stack.pop();
            }
            else if(arr[rightIndex] == '(')
            {
                stack.push(1);
            }
        }
        // Recursively call for right subtree, with root at leftIndex + 2
        // leftIndex + 1 is '(', hence leftIndex + 2
        root.right = convertToBinaryTreeUtil(arr, leftIndex + 2);
        return root;
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_BracketFromTree"></a>
### Construct String with bracket representation from Binary Tree
You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way. The null node needs to be represented by empty parenthesis pair "()" if only left child is null and omitted if both children are null or if only the right child is null.
```java
       1
     /   \
    2     3
     \  
      4 

Output: "1(2()(4))(3)"
```
We follow the recursive process similar to the previous question:
1. If root is not null so add the root nodes data to the String 'main'.
2. If left and right child are null return main as answer.
3. Initialise String 'left' as "()" and String 'right' as "". The reason 'left' is not empty is because if right child is not null, we would need to represnt a null left child as "()".
3. Recursively check for right and left subtrees if they are not null.
4. Finally return 'main' + 'left' + 'right'.
```java
class Solution
{
    public String convertToBracketString(Node root)
    {
        return convertToBracketStringUtil(root);
    }

    public String convertToBracketStringUtil(Node root)
    {
        if(root == null)
        {
            return "";
        }
        String main = Integer.toString(root.data);
        String left = "()";
        String right = "";
        if(root.left == null && root.right == null)
        {
            return main;
        }
        if(root.left != null)
        {
            left = "(" + convertToBracketStringUtil(root.left) + ")";
        }
        if(root.right != null)
        {
            right = "(" + convertToBracketStringUtil(root.right) + ")";
        }
        return main + left + right;
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_BST"></a>
### Binary Search Tree
Binary Search Tree, is a node-based binary tree which has the following properties:
1. The left subtree of a node contains only nodes with values lesser than the root's value.
2. The right subtree of a node contains only nodes with values greater than the root's value.
3. The left and right subtree each must also be a binary search tree. There must be no duplicate nodes.

The above properties of Binary Search Tree provide an ordering among keys so that the operations like search, minimum and maximum can be done fast. If there is no ordering, then we may have to compare every key to search a given key.

**Searching:**<br>
Searching in a BST is similar to binary search in an array. At every step we reduce the current search space to n/2. In a binary tree as we know elements are smaller in the left subtree and bigger in the right subtree, we can search accordingly.

**Insertion:**<br>
Insertion in a BST is modified version of searching. We basically search for the value we wish to insert and as soon as we reach a null node we insert the value at the position of the null node. We do this because while searching if we reach a null ndoe, that means, the value if present was expected to be at that position. Hence, we insert it there.

**Deletion:**<br>
Deletion in binary tree can have the following 4 cases:
1. <ins>The node to be deleted is leaf node</ins>: Simply make the leaf node null.
2. <ins>The node to be deleted has only one child</ins>: Replace the child with the node value. Delete the new child now, which is the original node.
3. <ins>The node has 2 children</ins>: In this case as the BST needs to be arranged in a particular manner that is left subtree should have smaller elements and right subtree should have greater elements, we replace the node with either the biggest element of the left subtree or the smallest element of the right subtree. And then delete the node from the new replaced position.
4. <ins>The node to be deleted does not exist</ins>: In this case the tree is returned as it is.
```java
class Solution
{
    public boolean search(int x, Node root)
    {
        if(root == null)
        {
            return false;
        }
        else if(root.data == x)
        {
            return true;
        }
        else if(x < root.data)
        {
            return search(x, root.left);
        }
        else
        {
            return search(x, root.right);
        }
    }

    public void insert(int x, Node root)
    {
        if(root == null)
        {
            root = new Node(x);
        }
        if(x > root.data)
        {
            insert(x, root.right);
        }
        if(x < root.data)
        {
            insert(x, root.left);
        }
    }

    public static Node deleteNode(Node root, int x)
    {
        if(root == null)
        {
            return null;
        }
        if(x == root.data)
        {
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            else
            {
                Node minNode = root.right;
                int min = minNode.data;
                while(minNode != null)
                {
                    min = minNode.data;
                    minNode = minNode.left;
                }
                root.data = min;
                root.right = deleteNode(root.right, min);
            }
        }
        else if(x > root.data)
        {
            root.right = deleteNode(root.right, x);
        }
        else
        {
            root.left = deleteNode(root.left, x);
        }
        return root;
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_ConstructBSTFromPreOrder"></a>
### Construct BST from given pre-order traversal
Given preorder traversal of a binary search tree, construct the BST. To construct a binary tree from  given preOrder traversal, we can use a simple method based on the BST property of left subtree having values smaller than root and right subtree having values bigger than the root.

For any preOrder traversal we know that the first value is the root of the tree. So we use the first value of the preOrder to make the root. Now we know that further on, the values in left subtree will be in range from (-Infinity, root) and in right subtree will be from (root, +Infinity). So the next value that we get in preOrder would be the root of the leftsubtree or the right subtree depending on the range to which it belongs. This method can be used recursively to build the entire BST by modifying the range for the left and right subtrees of every node according to their respective root's values.

The process would be as follows:
1. Initialize the range as (-Infinity, +Infinity). Let us call this range (min, max). Maintain a global index preIndex for iterating the preOrder array.
2. The first value in preOrder definitely lies in this range and forms the root. Now, in preOrder as the format is ROOT LEFT RIGHT, we build the left subtree first followed by the right subtree.
3. Increment the golbal variable preIndex to point to the next element in preOrder and call the function recursively for the left subtree in range(min, root.data).
4. For the right subtree call the function in range (root.data, max). Remember, as the variable preIndex is globally defined, when the call for the left subtre finishes, preIndex automatically points to the right subtree's root and we need not increment it.
3. Repeat this process until preIndex >= preOrder array's size.
```java
class Solution
{
    int preIndex = 0;

    public Node constructBST(int[] preOrder)
    {
        return constructBSTUtil(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE, preOrder.length);
    }

    public Node constructBSTUtil(int[] preOrder, int min, int max, int size)
    {
        if(preIndex >= size)
        {
            return null;
        }
        Node root = null;
        int val = preOrder[preIndex];
        if(val > min && val < max)
        {
            root = new Node(val);
            preIndex++;
            root.left = constructBSTUtil(preOrder, min, val, size);
            root.right = constructBSTUtil(preOrder, val, max, size);
        }
        return root;
    }

    public void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_BTreeToBST"></a>
### Binary Tree to Binary Search Tree
Given a Binary Tree, convert it to a Binary Search Tree. The conversion must be done in such a way that keeps the original structure of Binary Tree.

To convert a binary tree to a binary search tree, we can first get the inOrder traversal of the binary tree and sort it. This sorted array would be the inorder traversal of the BST. Now we iterate the binary tree in inOrder fashion once again, and replace the values of the nodes according to the sorted array.
```java
class Solution
{
    public Node convertBTreeToBST(Node root)
    {
        // Inorder traversal of Binary Tree
        ArrayList<Integer> arrInOrder = new ArrayList<Integer>();
        Node node = root;
        Stack<Node> stack = new Stack<Node>();
        Node curr = node;
        while(curr != null || !stack.isEmpty())
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            arrInOrder.add(curr.data);
            curr = curr.right;
        }

        // Sort the inOrder array
        Collections.sort(arrInOrder);
        
        // Build tree again according to sorted array
        int index = 0;
        curr = root;
        stack = new Stack<Node>();
        while(curr != null || !stack.isEmpty())
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            curr.data = arrInOrder.get(index);
            index++;
            curr = curr.right;
        }

        return root;
    }

    public void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_SortedLLToBST"></a>
### Sorted linked list/array to BST
The process for both is similar. Find the middle element's index. This becomes the root. Recursively create left subtree and right subtree from the left and right half of list/array respectively. Note that the tree has to be a balanced tree that is the difference in height of the any two leaf nodes shoulbe be <= 1.

The code for linked list has been described below. For a linked list find the middle element is always O(N) and doing it repeatedly is time consuming. Hecne we make a time-space tradeoff and convert the linked list to an array in O(N) time and then use this array to build the BST.
```java
class Solution
{
    public Node convertLLToBST(LinkedListNode head)
    {
        // Convert LinkedList to ArrayList
        // This ArrayList as sorted would be the inOrder
        // traversal of the binary search tree
        ArrayList<Integer> arrInOrder = new ArrayList<Integer>();
        while(head != null)
        {
            arrInOrder.add(head.data);
            head = head.next;
        }

        // Convert this array into BST
        return convertLLToBSTUtil(arrInOrder, start, end);

    }

    public Node convertLLToBSTUtil(ArrayList<Integer> arr, int start, int end)
    {
        if(arr.size() == 0 || start > end)
        {
            return null;
        }
        int mid = start + (end-start)/2;
        int val = arr.get(mid);
        Node root = new Node(val);
        root.left = convertLLToBSTUtil(arr, start, mid-1);
        root.right = convertLLToBSTUtil(arr, mid + 1, end);
        return root;
    }

    public void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}

class LinkedListNode
{
    int data;
    LinkedListNode next;

    public LinkedListNode(int x)
    {
        data = x;
        next = null;
    }

    public LinkedListNode(int x, LinkedListNode n)
    {
        next = n;
        data = x;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name ="TR_LCAInBST"></a>
### Lowest Common Ancestor in a Binary Search Tree
Given values of two values n1 and n2 in a Binary Search Tree, find the Lowest Common Ancestor (LCA). You may assume that both the values exist in the tree.

We recursively traverse the BST. If a node's value is greater than both n1 and n2 then our LCA lies in the left subtree of the node. If it's is smaller than both n1 and n2, then LCA lies in the right subtree. Otherwise, either the node is equal to either of n1 and n2 or the node has a value which is greater than one and lesser than one of n1 and n2. In both cases, the node itself is the LCA.

Note, the above algorithm assumes that the elements are always present in the BST. If the elements might or might not be present, the process is exactly same a sthe one for a normal binary tree.
```java
class Solution
{
    public Node LCAinBST(Node root, int x, int y)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data > x && root.data > y)
        {
            return LCAinBST(root.left, x, y);
        }
        if(root.data < x && root.data < y)
        {
            return LCAinBST(root.right, x, y);
        }
        return root;
    }
}

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int x)
    {
        data = x;
        left = null;
        right = null;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="Graphs"></a>
## <p align="center"> Graphs </p>
A graph is a 2D data structure which consists of nodes and edges. The nodes are the vertices of the graph and the edges are the lines/path connecting these vertices. The nodes in the graphs can be classes in themselves, containting information more than simply a single vaue, and the edges might represent connections between the structures.

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
BFS is a searching technique which helps you search through various nodes of a tree or a graph, level by level. We begin with a starting index, root in case of trees, and then traverse all the nodes that can be reached from it in one step and and add them in a queue. Then for all the nodes present in the queue we repeat the process, until the queue becomes empty. Why use a queue? The aim of a BFS search is to first visit all direct children of the node and then proceed with each child seperately. This can be achieved by maintaining a queue which follows a FIFO order and hence only when the processing of parents at the starting of the queue is completed, the subequent children are proccessed.

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
***NOTE: A key point to remember can be that in DFS, the node is marked as visited when it has been reached and is being processed. On the other hand, in BFS, a node is marked as visited before it is processed, at the time of adding it to the queue itself.***

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

As DFS and reversing a graph have been covered before, writing the code for this algorithm is trivial and hence not being covered here. For details on the code please refer to: https://www.geeksforgeeks.org/strongly-connected-components/

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
To check that whether a directed graph is strongly connected or not, we use the conecpt similar to Kosaraju's algorithm for finding all SCC. if we find all SCCs and the number of SCCs is just one, then the graph is strongly connected. But the task here is only different in the meaning that we need to confirm that whether a single SCC covers the entire graph or not and need not find more than one SCC. We can do this according to the following steps:
1. Mark all nodes unvisited.
2. Do DFS, if any node remains unvisited, then return false.
3. If above step did not return false, so reverse the graph.
4. Again do DFS from the same node. If if any node remains unvisited, then return false.
5. If above step did not return false, so return true.

We can make the following observations from this and the previous three questions:
1. Connected components can be found simply by doing a DFS on every unvisited node.
2. Strongly connected componenets are found by reversing the graph and doing DFS on the original heads before the sinks. This way DFS for a head ends by forming a SCC for itself.
3. For checking if entire graph is SCC or not, first check if a single DFS reaches all nodes. If yes, so reverse the graph and once again repeat the DFS on the same node. If true both times so graph is a SCC.
4. Mother vertex cn be found by checking reachability of a vertex to all others. Instead of repeating it for every vertex, find the topmost head by DFS. Then rub DFS on this head. If this head is not the mother vertex then mother vertex does not exist.

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
            // End loop if all vertices included
            if(hMap.size() == V)
            {
                return;
            }
            
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
**NOTE: As prioirity queue does not provide optimal time for deleting nodes, we used a hashmap to checks for duplicate values in the priority queue. We can alternatively use a TreeSet instead which has O(logN) complexity for both add and remove functionalities.**

<a href="#Contents">Back to contents</a>

<a name="GP_BellmanFord"></a>
### Bellman–Ford Algorithm
Use Case:
- Shortest distance from one source to all destinations
- Weighted graph with negative weights, no negative weight cycles
- Detect negative weight cycles

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
        for(int v1 = 0; v1 < V-1; v1++)
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
            dist[i][j] = graph[i][j]; // Assuming graph[i][j] is infinity in case of no path
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
Use case:
- Shortest path from one source to all destinations
- Unweighted graph, can be cyclic/acyclic both

The idea is to use a modified version of BFS instead of Dijkstra. As we do not have any weights attatched, the BFS can run in O(V + E) time as a priority queue won't be needed. The remaining basic steps are simialr to Djikstra for storing and updating distances and parents.

The code is as follows:
```java
class Graph
{
    // Distance and parent arrays
    int dist[];
    int parent[];
    int V;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int v)
    {
        V = v;
        dist = new int[V];
        parent = new int[V];
        adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++)
        {
            // Initial distances are marked as infinite
            dist[i] = Integer.MAX_VALUE;
            // Initial parents are -1
            parent[i] = -1;
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
        
        // Only for undirected graph
        // adj.get(v).add(u);
    }
    
    // Code for BFS
    public void BFS(int src)
    {
        // Add source to Queue
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[V];
        
        // Mark distance of source as 0
        dist[src] = 0;
        // Add source to queue
        queue.add(src);
        // Mark soruce as visisted
        visited[src] = true;
        // Arbitrary node
        int node = 0;
        while (!queue.isEmpty())
        {
            // Get the head of the queue
            node = queue.poll();
            
            // For all adjacent nodes
            for (int i = 0; i < adj.get(node).size(); i++)
            {
                // Get index value of adjacent node
                int c_ind = adj.get(node).get(i);
                // If index not visited before
                if(!visited[c_ind])
                {
                    // Update dist, parent and visited
                    dist[c_ind] = dist[node] + 1;
                    parent[c_ind] = node;
                    visited[c_ind] = true;
                    // Add to queue
                    queue.add(c_ind);
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
```
<a href="#Contents">Back to contents</a>

<a name="GP_TopoSort"></a>
### Topological Sorting
Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge from u to v, vertex u comes before v in the ordering. Topological Sorting for a graph is not possible if the graph is not a DAG. In short, an ordering of a graph in which all parents are listed before their children is colled topological sort.

Topological Sorting is mainly used for scheduling jobs from the given dependencies among jobs. This means that for example lets say job A needs job B to be finsihed first and job C needs job A to be finsished first so a topological sort of dependencies would print B A C, meaning that complete job B first, then A then C.

Topological sort can be easily implemented using DFS. In DFS, we process a vertex and then recursively call DFS for its adjacent vertices. In topological sorting, we need to process a vertex only after its adjacent vertices have been processed. Hence, the only change in DFS needed would be to store a node after DFS has been called for its adjacent nodes. The complexity is the same as DFS, that is O(E+V).

We achieve this by maintaint a stack and one by one add vertices when they have been completed. This way, all child vertices are added to stack before the parent vertex. Hence, when actually printing the stack the parents would be printed first followed by the children.

The code is as follows:
```java
class Graph
{
    // Number of vertices
    int V = 0;
    // Adjaceny ist
    ArrayList<ArrayList<<Integer>> adj = null;

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
        // As it is TopoSort, graph is necessarily directed
        adj.get(u).add(v);
    }

    public void topoSort()
    {
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[V];

        for(int i = 0; i < v; i++)
        {
            if(!visited[i])
            {
                topoSort_Util(stack, visited, i);
            }
        }

        // Print stack for topoSort
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

    public void topoSort_Util(Stack<Integer> stack, boolean[] visited, int s)
    {
        visited[s] = true;
        for(int i = 0; i < adj.get(s).size(); i++)
        {
            int c = adj.get(s).get(i);
            if(!visited[c])
            {
                topoSort_Util(stack, visited, c);
            }
        }
        // Add node to stack only when all adjacent nodes have
        // been processed
        stack.push(s);
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_ShortestPathDAG"></a>
### Shortest path in a Directed Acyclic Graph
The shortest path in a DAG can be easily found using topological sort. We know that topological sort will give us an ordering where parents are necessarily placed before children. So as to say any graph is converted into the form of a linear ordering like A -> B -> C -> D. In such an ordering of say n elements, 1 -> 2 -> .. k .. -> n-1 -> n, if we have the source in shortest distance path as some elemnt k, we would know that all elements, from 1 to (k-1) will be at a distance of infinity as they would not be reachable. Furthermore, moving from k to k+1 and so on till n, we can keep updating minimum distances, as we would know that if k goes to k+1 and k+1 goes to n, then minimum distance till n will necessarily be sum of distance from k to k+1 and from k+1 to n.

A visual representation of the idea can be taken from the following link where in the source is the node s and the given graph is a topoligcal ordered graph: https://media.geeksforgeeks.org/wp-content/uploads/shortestpathsteps.png

Hence the algortihm would be:
1. Represent the graph as a topologically sorted graph.
2. Mark distance of source index as 0 and all others as infinity.
3. Begining from first vertex in topo sorted graph, move till the end, updating all adjacent vertexes for each node you are on.

The cod would be as follows:
```java
class Graph
{
    // Number of vertices
    int V = 0;
    // Adjaceny ist
    ArrayList<ArrayList<Node>> adj = null;
    // Stack for TopoSort
    Stack<Integer> stack = new Stack<Integer>();
    // Distance array
    int[] distance = null;

    public Graph(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Node>>();
        distance = new int[V];
        for(int i = 0; i < V; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            adj.add(new ArrayList<Node>());
        }
    }

    public void addEdge(int u, int v, int d)
    {
        // As it is TopoSort, graph is necessarily directed
        adj.get(u).add(new Node(v, d));
    }

    public void topoSort()
    {
        boolean[] visited = new boolean[V];

        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                topoSort_Util(visited, i);
            }
        }
    }

    public void topoSort_Util(boolean[] visited, int s)
    {
        visited[s] = true;
        for(int i = 0; i < adj.get(s).size(); i++)
        {
            Node c = adj.get(s).get(i);
            if(!visited[c.ind])
            {
                topoSort_Util(visited, c.ind);
            }
        }
        // Add node to stack only when all adjacent nodes have
        // been processed
        stack.push(s);
    }

    // Function for shortest path in toposorted graph
    public void calculateShortestPath(int src)
    {
        // Update distance of source
        distance[src] = 0;
        // From head of stack
        while(!stack.isEmpty())
        {
            // Get head
            int c = stack.pop();
            // If head is not at infinite distance from source
            // The first element would be the source itself to
            // satisfy the condition
            if(distance[c] != Integer.MAX_VALUE)
            {
                // For all adjacent vertices of head
                for(int i = 0; i < adj.get(c).size(); i++)
                {
                    // Update minimum distance for those nodes
                    Node inner = adj.get(c).get(i);
                    distance[inner.ind] = Math.min(distance[inner.ind], distance[c] + inner.dis);
                }
            }
        }
    }
}

// Class node for graph
class Node
{
    int ind = 0;
    int dis = 0;

    public Node(int i, int d)
    {
        ind = i;
        dis = d;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_GraphColoring"></a>
### Graph coloring - Chromatic Number
Graph coloring is a technique in which you are needed to color the vertices of a graph in such a way that no two adjacent vertices have the same color. The minimum number of colors needed to achieve this is called the chromatic number of the graph. The basic greedy algo to get to an answer can suggest the upperbound on the number of colors needed. The algo is:
1. Color first vertex with color A.
2. For the remaining vertices: Choose the lowest numbered color available that hasn't been used in the adjacent vertices. In case no such already available color is present, so add a new color to the list of colors.

The code would be as follows:
```java
class Graph
{
    // Coloring holds the color for all nodes
    int[] coloring;
    // Colors holds list of all available colors
    boolean[] colors;
    int V;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int v)
    {
        V = v;
        coloring = new int[V];
        colors = new boolean[V];
        adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++)
        {
            // Initial colors assigned are none
            coloring[i] = -1;
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
        // Only for undirected graph
        adj.get(v).add(u);
    }
    
    // Code for coloring
    public void applyColoring()
    {
        // Mark first node with 0 color
        coloring[0] = 0;
        
        // For all other nodes
        for(int i = 1; i < V; i++)
        {
            // Make all colors available initially
            Arrays.fill(colors, true);
            
            // For all adjacent vertices of current node
            for (int j = 0; j < adj.get(i).size(); j++)
            {
                // Get index value of adjacent vertex
                int c_ind = adj.get(i).get(j);
                // If index has been colored before
                if(coloring[c_ind] != -1)
                {
                    // Mark color as unavailable
                    colors[coloring[c_ind]] = false;
                }
            }
            
            // For all colors in colors list
            for(int j = 0; j < V; j++)
            {
                // If color is available
                if(colors[j])
                {
                    // Use this color
                    coloring[i] = j;
                    break;
                }
            }
        }
    }
}
```
A very common application of coloring can be when similar related people/items have to be sought into different groups. For example, course scheduling such that courses with common students do not have classes at the same time, or exam scheduling, or where say people are to be divided into two groups on the basis of people liking/hating each other and so on. The process is to connect the related items and then try to color the graph in different adjacent colors.

We may also use it to check if a graph is bipartite or not. If graph is 2 colorable it is bipartite.

<a href="#Contents">Back to contents</a>

<a name="GP_mColoring"></a>
### m-Coloring Problem
The m coloring problem is similar to finding the chromatic number of a graph in terms of the way it is formulated in code. The question asks you to tell whether or not a graph can be colored using m colors at most such that no two adjacent vertices have the same color. If yes, then also output the coloring selected.

We can apply a simple standard backtracking approach here, that is, assign the smallest numbered color available to a node such that it doesn't clash with colors of neighbours. If with this assignment of color, the remaining graph can be properly colored as well, then return true, else backtrack and retry with a different available color. If in any of the permutations the entire graph has been colored, so return true and end, else return false when all options have been exhausted without a suitable permutation. The code is as follows:
```java
class Graph
{
    // Coloring holds the color for all nodes
    int[] coloring;
    int V;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int v)
    {
        V = v;
        coloring = new int[V];
        colors = new boolean[V];
        adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++)
        {
            // Initial colors assigned are none
            coloring[i] = -1;
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
        // Only for undirected graph
        adj.get(v).add(u);
    }
    
    // Code for coloring
    public boolean applyColoring_Util(int v, int m)
    {
        // If have completed the last node
        if(v == V)
        {
            return true;
        }
        // For all colors avaialable
        for(int i = 0; i < m; i++)
        {
            // Check if color can be used, that is
            // not has been used by neibours
            boolean check = true;
            for(int j = 0; j < adj.get(v).size(); j++)
            {
                // Check with neighbours color
                if(coloring[adj.get(v).get(j)] == i)
                {
                    check = false;
                    break;
                }
            }
            // If no neighbours use this color
            if(check)
            {
                // Assign this color to v
                coloring[v] = i;
                // If with this coloring graph completes
                if(applyColoring_Util(v+1, m))
                {
                    return true;
                }
                // If coloring fails, remove color
                coloring[v] = -1;
            }
        }
        return false;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_PrimsMST"></a>
### Prim's Minimum Spanning Tree
Given a connected and undirected graph, a spanning tree of that graph is a subgraph that is a tree and connects all the vertices together. There can be multiple spanning trees for a single graph. A minimum spanning tree (MST) for a weighted, connected and undirected graph is a spanning tree with weight less than or equal to the weight of every other spanning tree. The eight of a spanning tree is defined as the sum of weights of all edges included in the spanning tree. A MST  will always have V-1 edges.

Spannign trees can be used for finding the minimum cost of connecting various cities or points through roads such that every city is accessible from every other city and cost of building roads is minimum.

The algorithm for calculating the MST is exactly similar to how we calculate the shortest path using djikstra. The steps are:
1. Pick a source vertex and create a hashset to store finalized vertices and a priority queue sorted on the basis of distance from the source to store upcoming vertices.
2. For the source vertex, select all adjacent vertices which are not already present in the hashset and update their distances. Add these vertices with updated shortest distances from course in the priority queue. Distance of a vertex = Math.min(Distance of vertex, Distance of parent from source + Distance of vertex from parent)
3. Repeat step 2 until either the queue becomes empty or the hashset size is equal to V.
4. During step 2, make sure to maintain a distance and parent array to store the final information regarding distances between two nodes in MST and the parent child connections for the tree.

The code is exactly like Djikstra and hence wont be covered here. Time complexity is O(ElogV).

<a href="#Contents">Back to contents</a>

<a name="GP_MinCostConnectCities"></a>
### Minimum cost to connect all cities
The question is to find the minimum cost of connecting all cities with roads such that every city is reachable form every other city. This is a very straigh forward application of a MST and can easily be implemented using the Djikstra algorithm as discussed above in Prims MST section. As the code has been covered already and is trivial, it won't be repeated here. Please refer to Djikstra for the implementation.

Also as the task is to not only find the MST but calculate the minimum cost, once our parent array is ready, we need to check for every edge between, parent[i] to i and add the weight of the edge to the answer.

<a href="#Contents">Back to contents</a>

<a name="GP_DSU"></a>
### Disjoint Union Find - Rank and Path Compression
Disjoint data structures are data structures which are used to store things in groups. We can easily create groupings for various items and then use our find and union methods on these groupings to check whether two items are in the same group or not and to put two groups together respectively.

We use a method called find by path compression and union by rank. Please visit the following two links first, before reading the code provided:
1. https://www.geeksforgeeks.org/union-find/
2. https://www.geeksforgeeks.org/union-find-algorithm-set-2-union-by-rank/
```java
// DSU class
class DSU
{
    // Array to hold subsess : A subest is basically
    // information regarding an elements parent group
    // and it's rank
    Subset[] subsets = null;
    // Number of elements in our DSU
    int n = 0;

    public DSU(int a)
    {
        n = a;
        subsets = new subsets[n];
        for(int i = 0; i < n; i++)
        {
            // Initialise every subset as it's own parents
            subsets[i] = new Susbet(i);
        }
    }

    // UNion of two subsets for element x and y
    public void union(int x, int y)
    {
        // Parents of x and y
        int xRoot = find(x);
        int yRoot = find(y);
        // If rank of parent of x is more than rank of
        // parent of y, so change parent of y to x
        if(subsets[xRoot].rank > subsets[yRoot].rank)
        {
            subsets[yRoot].parent = xRoot;
        }
        // If rank of parent of y is more than rank of
        // parent of x, so change parent of x to y
        else if(subsets[xRoot].rank < subsets[yRoot].rank)
        {
            subsets[xRoot].parent = yRoot;
        }
        // If ranks are same so change parent of x to y and
        // increase rank of y
        else
        {
            subsets[xRoot].parent = yRoot;
            subsets[yRoot].rank++;
        }
    }

    public int find(int x)
    {
        if (subsets[x].parent != x)
        {
            subsets[x].parent = find(subsets[x].parent);
        }
        return subsets[x].parent;
    }
}

class Subset
{
    // Each element of class Subset will have a parent
    // and a rank. Parent is used to identify grouping.
    // Items with same parents belng to same groups.
    // Rank is used to speed up the process of union and
    // find. Basically, using rank, we can choose the shorten
    // the trees formed by our DSU. Calling union and find
    // using path compression and union by rank, we are able to
    // flatten the tree as much as possible.
    int parent = 0;
    int rank = 0;

    public Subset(int p)
    {
        parent = p;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_CycleDirected"></a>
### Detect a cycle in an directed graph
Detecting a cycle in a directed graph is easy. All it requires you to do is to run DFS on the graph and if you ever encounter a visited node in a DFS run then return true as it forms a cycle. Look into "Course Scheduling I and II" for a cycle checking directed graph implementation within topological sorting code.

<a href="#Contents">Back to contents</a>

<a name="GP_CycleUndirected"></a>
### Detect a cycle in an undirected graph
Detecting a cycle in an undirected graph is trickier than doing it for a directed graph. Remember, that in undirected graphs, edges are always added in both directions, hence for every child node you will always find the parent as already visited and hence the direct method of finding an already visited node would not work. Rather the exact fact that a parent is always visited is utilized, in such a way that if we find a visited node other than the parent, we return true.

The code is as follows:
```java
class Graph
{
    int V;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    // Code for checking Cycle
    public boolean checkCycle()
    {
        // Visited array
        boolean[] visited = new boolean[V];
        for(int i = 0, i < V; i++)
        {
            // If node is not visisted
            if(!visited[i])
            {
                // Check for cycle
                // Send parent value as -1 for head vertex
                if(checkCycleUtil(visited, i, -1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCycleUtil(boolean[] visited, int i, int u)
    {
        // Mark ith node as visited
        // u is the parent of ith node
        visited[i] = true;
        // For all adjacent vertices of i
        for(int j = 0; j < adj.get(i).size(); j++)
        {
            int c = adj.get(i).get(j);
            // If adjacent vertex not visited
            if(!visited[c])
            {
                // Check for cycle further
                return checkCycleUtil(visited, c, i);
            }
            else
            {
                // If visited so make sure not parent
                if(c != u)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
```
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

<a name="GP_MinCost4Directions"></a>
### Minimum cost path with Left, Right, Bottom and Up moves allowed
The question is a modification of the min cost path in grid where movements allowed were bottom and right. Now all 4 directional movements are allowed. Hence, we cannot use DP here. Instead, we have following options:
1. If the graph is unweighted, that one cell means cost of 1 then we use BFS to search for target and as soon as we find the target we return.
2. If the graph is weighted, we can check if it has negative weights or not. If not, use Djikstra.
3. If graph is weighted and has negative weights, we may choose to use Bellman Ford.

For our question, let us assume that the conditions for Djikstra are satisfactory. So in order to build our solution as the input is a grid and not a graph, we modify our algorithm to accomodate for this variation. In grid questions, requiring graph algorithms, we build a new class to represent the cell in a grid as a vertex in the graph. We generally need not build the entire graph using this new class, rather as and when the next cell of grid needs to be accessed, we build a new object of our class with required values. A demonstration can be seen in the following implementation for this question, where the class cell represents the cell in the grid, with x cordinate, y cordinate and the distance of the cell from source thus far.
```java
class Solution
{
    public static int calculateShortestPath(int[][] cost, int src_x, int src_y, int dest_x, int dest_y, int n, int m)
    {
        // Distance and parent arrays
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                distance[i][j] = Integer.MAX_VALUE;
            }
        } 
        // Visited/Completed array
        boolean[][] visited = new boolean[n][m];
        // PriorityQueue for our djikstra
        PriorityQueue<Cell> pQueue = new PriorityQueue<Cell>(new Comparison());
        // Add source
        pQueue.add(new Cell(src_x, src_y, cost[src_x][src_y]));
        // Distacne of source is 0
        distance[src_x][src_y] = cost[src_x][src_y];
        // Till priority queue becomes empty
        while(!pQueue.isEmpty())
        {
            Cell c = null;
            // Check if the head of queue is already visited
            while(!pQueue.isEmpty() && visited[pQueue.peek().x][pQueue.peek().y])
            {
                // If yes so remove
                pQueue.poll();
            }
            // Get latest head with shortest distance
            c = pQueue.poll();
            int x = c.x;
            int y = c.y;
            int d = c.dis;
            // If destination so break
            if(x == dest_x && y == dest_y)
            {
                return d;
            }
            // Mark as visited
            visited[x][y] = true;
            // Check the next to be visited nodes
            // (x+1, y), (x-1, y), (x, y+1), (x, y-1)
            if(isInside(x+1, y, n, m) && !visited[x+1][y])
            {
                if(distance[x+1][y] > d + cost[x+1][y])
                {
                    distance[x+1][y] = d + cost[x+1][y];
                    pQueue.add(new Cell(x+1, y, distance[x+1][y]));
                }
            }
            if(isInside(x-1, y, n, m) && !visited[x-1][y])
            {
                if(distance[x-1][y] > d + cost[x-1][y])
                {
                    distance[x-1][y] = d + cost[x-1][y];
                    pQueue.add(new Cell(x-1, y, distance[x-1][y]));
                }
            }
            if(isInside(x, y+1, n, m) && !visited[x][y+1])
            {
                if(distance[x][y+1] > d + cost[x][y+1])
                {
                    distance[x][y+1] = d + cost[x][y+1];
                    pQueue.add(new Cell(x, y+1, distance[x][y+1]));
                }
            }
            if(isInside(x, y-1, n, m) && !visited[x][y-1])
            {
                if(distance[x][y-1] > d + cost[x][y-1])
                {
                    distance[x][y-1] = d + cost[x][y-1];
                    pQueue.add(new Cell(x, y-1, distance[x][y-1]));
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    // Check if cell (x,y) is inside matrix
    public static boolean isInside(int x, int y, int n, int m)
    {
        if(x < 0 || x >= n || y < 0 || y >= m)
        {
            return false;
        }
        return true;
    }
}

// Class node for graph
class Cell
{
    int x = 0;
    int y = 0;
    int dis = 0;

    public Cell(int a, int b, int d)
    {
        x = a;
        y = b;
        dis = d;
    }
}

// Comparator for prioirty Queue
class Comparison implements Comparator<Cell>
{
    @Override
    public int compare(Cell c1, Cell c2)
    {
        if(c1.dis > c2.dis)
        {
            return 1;
        }
        else if(c1.dis < c2.dis)
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

<a name="GP_NumTriangles"></a>
### Number of triangles in a graph
The task is to find the number of traingles in a directed/undirected graph. It is simple to do so by taking all pairs of three vertices present in the graph and checking them for forming triangles.

In undirected graphs, every triangle will be counted 6 times, like say triangle name is ABC, so it will be counted as:
1. ABC
2. ACB
3. BCA
4. BAC
5. CBA
6. CAB

In directed graphs, a triangle say ABC, will be counted only three times as it has the following variations becaus of the direction of edges mattering:
1. ABC
2. BCA
3. CAB

Hence, the final count in case of undirected graph is total triangles/6 and that for directed graphs is total triangles/3.
```java
class Graph
{
    int V = 0;
    // Use hashmap as we just want to know whether an
    // edge exists or not. Can preferable use adjacency
    // matrix as well. 
    ArrayList<HashMap<Integer, Integer>> adj = null;

    public Graph(int v)
    {
        V = v;
        adj = new ArrayList<HashMap<Integer, Integer>>();
        for(int i = 0; i < V, i++)
        {
            adj.add(new HashMap<Integer, Integer>());
        }
    }

    public void addEdge(int u, int v)
    {
        adj.get(u).put(v,v);
        // For undirected only
        adj.get(v).put(u,u);
    }

    public int countTriangles()
    {
        int count = 0;
        // Check for all pairs of three vertices
        // We may run loops like
        // i : (0, n)
        // j : (i + 1, n)
        // k : (j + 1, n)
        // for undirected graphs only and then not return
        // count divided 6. This is because in undirected
        // graphs, order does not matter for checking. 
        for(int i = 0; i < V; i++)
        {
            for(int j = 0; j < V; j++)
            {
                for(int k = 0; k < V; k++)
                {
                    if(adj.get(i).containsKey(j) && adj.get(j).containsKey(k) && adj.get(k).containsKey(i))
                    {
                        count++;
                    }
                }
            }
        }
        // For undirected graphs:
        return count/6;
        // For directed graphs:
        // return count/3;
    }
}
```
<a href="#Contents">Back to contents</a>
	
<a name="GP_MinCashFlow"></a>
### Minimize Cash Flow among a given set of friends
The questions statement is that "Given a number of friends who have to give or take some amount of money from one another. Design an algorithm by which the total cash flow among all the friends is minimized."

We can approach the question by thinking about money lending among friends. If freind A owes friend B and C, 200 rupees each, and friend B owes friend C 400 rupees, and we may directly ask A to pay 400 rupees to C and B pays C only 200 rupees. This way instead of 3 transacions, we need only two transactions. The same idea needs to be implemented for n number of friends.

We can develop a greedy approach for this quetion. Among the group of friends, there will always be a person with the maximum and minimum profit. Indirectly, there will always be someone who gets the maximum money and someone who pays the most. We select these two people, and transfer Min(MaxProfit, MaxDebt) from person with maximum dept to person with maximum profit. This ways, either of the two would have been freed from the remaining transactions. We then recur for remaining people. So in short, all we need to do is:
1. Maintain a list at all times having the current maximum profit and minimum profit.
2. Pay Min(MaxProft, MinProfit) from guy with MinProfit to guy with MaxProfit.
3. Repeat the process.

This can be achieved using TreeSet in java, to maintain a two ended priority queue and using graphs to store the input and output. The code being trivial has been opted out. For further details on topic understanding, please refer to: https://www.geeksforgeeks.org/minimize-cash-flow-among-given-set-friends-borrowed-money/. Do note that the implementation on GFG is different from the one advised above in terms of code, but has the same algorithm.

<a href="#Contents">Back to contents</a>

<a name="GP_RottingOranges"></a>
### Rotting oranges
The questions is as follows:
In a given grid, each cell can have one of three values:
1. The value 0 representing an empty cell;
2. The value 1 representing a fresh orange;
3. The value 2 representing a rotten orange.<

Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.

Now to solve this problem, this can be seen as a modification of the shortest distance in unweighted graph problem. The reason this is considered an unweighted graph is because the cost of moving to a moveable cell is jsut 1, that is 1 minute.

The modification that we make to our BFS call would be that in case we encounter a cell with value 0, we do not proceed any further, and in case we encounter a cell with value 1, we plus the distance so far(time taken to rot) by 1.

The code is as follows:
```java
class Solution
{
    public int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        if(n == 0)
        {
            return 0;
        }
        int m = grid[0].length;
        int freshCount = 0;
        Queue<Cell> queue = new LinkedList<Cell>();
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == 1)
                {
                    freshCount++;
                }
                else if(grid[i][j] == 2)
                {
                    queue.add(new Cell(i, j, 2, 0));
                    visited[i][j] = true;
                }
            }
        }
        if(freshCount == 0)
        {
            return 0;
        }
        Cell cell = null;
        int[] move_x = { 1, -1, 0 ,0 };
        int[] move_y = { 0, 0, 1, -1 };
        while(!queue.isEmpty())
        {
            cell = queue.poll();
            int x = cell.x;
            int y = cell.y;
            int type = cell.type;
            int time = cell.time;
            if(type == 1)
            {
                freshCount--;
            }
            if(freshCount == 0)
            {
                return time;
            }
            for(int i = 0; i < 4; i++)
            {
                int x_new = x + move_x[i];
                int y_new = y + move_y[i];
                if((type == 1 || type == 2) && isInside(x_new, y_new, n, m) && !visited[x_new][y_new])
                {
                    if(grid[x_new][y_new] == 1)
                    {
                        queue.add(new Cell(x_new, y_new, 1, time + 1));
                        visited[x_new][y_new] = true;
                    }
                }
            }
        }
        return -1;
    }
    
    public boolean isInside(int x, int y, int n, int m)
    {
        if(x < 0 || x >= n || y < 0 || y >= m)
        {
            return false;
        }
        return true;
    }
}

class Cell
{
    int x = 0;
    int y = 0;
    int type = 0;
    int time = 0;
    
    public Cell(int a, int b, int ty, int ti)
    {
        x = a;
        y = b;
        type = ty;
        time = ti;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_SimilarContacts"></a>
### Find similar contacts in contact list (Accounts Merge)
The question gives us a list of lists. Each inner list, is of the following format:<br>
<Name, Email1, Email2 .... Emailn><br>
Note: The number of values in each inner list might varry, the only constant is atleast one email ID and necessarily the name.<br>

The task is that given such a list of list, merge all contacts having common Email IDS and output a joined list with merged contacts. In the list of merged contacts for every inner list, make sure the emails are in lexographically sorted order.<br>
Note: Two people with the same name might not necessarily have the same emails, whereas two people with same emails will necessarily have the same names.

To get a better look at the question description, refer to: https://leetcode.com/problems/accounts-merge/

We can solve this problem using the union find algorithm. As we are required to merge similar contacts together, union find using DSU seems a perfect fit over here. Now, we shall see the requirements for the DSU union find algorithm:
1. We should be able to define individual subsets, preferable using integers.
2. The task should to be merge these subsets.

The second requirement is met as seen in question description. For the first requirement, we can modify the input taken. For every email ID that we read, we can assign a unique ID to ech new Email using a hashMap and then combine IDs of the same person together. This way all Email names would be converted into integers and the union and find methods of DSU would work on integers instead of working on strings.

So now let us look at the final algorithm:
1. For the input, create two hashmaps.
	- <ins>Email to Name</ins>: Maps the email to the name of the person. Do not need to check for overlapping insertions, as if the same email repeats, from the qeustion description we know the same name will be used.
	- <ins>Email to ID</ins>: ID here is an integer ID. Maps email to integer ID. This is needed so that we can use these IDs in our DSU instead strings. Ensure not to overwrite already included emails, as an ID assigned to an email once should remain the same. Also, for every email in the same list, that is for every email beloning to the same person in the initial list, we call union on the first email for that person and all the others. This way, say a person has 5 emails, two in one list and three in another, in which there is one common one. So we get the following scenario:<br>
	For 1st list of the person, EMail A and Email B are unioned. [A, B]<br>
	For the 2nd list, lets say Email A is common so now the unions would for the set [A, B, C]<br>
2. So using this process, we are able to form a DSU for the emails and their owners. Now for every email in our second hashmap(Email to integer ID), we find the parent of that email and form a list of emails for vvery parent. Sort each of these list lexographically.
3. Once we have got a list for every parent emailid, we use the first element of every list to find the name of the owner of the email from our frist hashmap(email to name) and add the name to their respective email lists.

Here is the code:
```java
class Solution
{
    public List<List<String>> accountsMerge(List<List<String>> accounts)
    {
        DSU dsu = new DSU();
        HashMap<String, String> emailToName = new HashMap<String, String>();
        HashMap<String, Integer> emailToID = new HashMap<String, Integer>();
        int id = 0;
        int n = accounts.size();
        for (int i = 0; i < n; i++)
        {
            List<String> innerAccount = accounts.get(i);
            String name = innerAccount.get(0);
            for(int j = 1; j < innerAccount.size(); j++)
            {
                String email = innerAccount.get(j);
                emailToName.put(email, name);
                if(!emailToID.containsKey(email))
                {
                    emailToID.put(email, id);
                    id++;
                }
                dsu.union(emailToID.get(innerAccount.get(1)), emailToID.get(email));
            }
        }

        HashMap<Integer, List<String>> ans = new HashMap();
        for (String email: emailToID.keySet())
        {
            int index = dsu.find(emailToID.get(email));
            if(ans.containsKey(index))
            {
                ans.get(index).add(email);
            }
            else
            {
                ans.put(index, new ArrayList<String>());
                ans.get(index).add(email);
            }
        }
        for(List<String> joinedEmails: ans.values())
        {
            Collections.sort(joinedEmails);
            joinedEmails.add(0, emailToName.get(joinedEmails.get(0)));
        }
        return new ArrayList(ans.values());
    }
}

class DSU
{
    Subset[] subsets;
    public DSU()
    {
        subsets = new Subset[10001];
        for (int i = 0; i <= 10000; i++)
        {
            subsets[i] = new Subset(i);
        }
    }
    
    public int find(int x)
    {
        if (subsets[x].parent != x)
        {
            subsets[x].parent = find(subsets[x].parent);
        }
        return subsets[x].parent;
    }
    
    public void union(int x, int y)
    {
        int xRoot = find(x);
        int yRoot = find(y);
        if(subsets[xRoot].rank > subsets[yRoot].rank)
        {
            subsets[yRoot].parent = xRoot;
        }
        else if(subsets[xRoot].rank < subsets[yRoot].rank)
        {
            subsets[xRoot].parent = yRoot;
        }
        else
        {
            subsets[xRoot].parent = yRoot;
            subsets[yRoot].rank++;
        }
    }
}

class Subset
{
    int parent = 0;
    int rank = 0;
    
    public Subset(int p)
    {
        parent = p;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_KnightsTour"></a>
### Knight's tour problem - Visit each cell in a grid atleast once
The problem asks you to check that is it possible that a Knight placed on a board of size N x N, cover all the cells on the board, visiting each cell atmost once. Printing the board would be benefetial to confirm the answer.

This can be solved easily using backtracking. The idea is to use a DFS based approach in backtracking. For every cell we are own we try all the possibilities till we get the corect final answer. If a possibility is wrong we reverse back and change the possibility. If the cell we are on runs out of possibilities we directly return false.

The algorithm is the basic backtracking approach that from the starting cell (0,0) we try to move in all possible valid Knight movement directions and increase the total cell's filled count by 1. We then repeat the process, until we reach the totoal count to be N x N (positive base case) or if we run out of options for a particular cell (negative base case). The code is as follows:
```java
class Solution
{
    public boolean KnightsTour(int N)
    {
        int[][] board = new int[N][N];
        int[] di_x = { 2, 2, -2, -2, 1, 1, -1, -1};
        int[] di_y = { 1, -1, 1, -1, 2, -2, 2, -2};
        board[0][0] = 1;
        if(KnightsTourUtil(board, 0, 0, di_x, di_y, 1, N))
        {
            printTour(board);
        }
        return false;
    }

    public boolean KnightsTourUtil(int[][] board, int x, int y, int[] di_x, int[] di_y, int count, int N)
    {
        if(count == N*N)
        {
            return true;
        }
        for(int i = 0; i < 8; i++)
        {
            int next_x = x + di_x[i];
            int next_y = y + di_y[i];
            if(isInside(next_x, next_y, N) && board[next_x][next_y] == 0)
            {
                board[next_x][next_y] = count + 1;
                if(KnightsTourUtil(board, next_x, next_y, di_x, di_y, count + 1, N))
                {
                    return true;
                }
                board[next_x][next_y] = 0;
            }
        }
        return false;
    }

    public void printTour(int[][] board)
    {
        int N = board.length;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(board[i][j] > 99)
                {
                    System.out.print(board[i][j] + "  ");    
                }
                else if(board[i][j] > 9)
                {
                    System.out.print(board[i][j] + "   ");    
                }
                else
                {
                    System.out.print(board[i][j] + "    ");
                }
            }
            System.out.println();
        }
    }

    public boolean isInside(int x, int y, int N)
    {
        if(x < 0 || x >= N || y < 0 || y >= N)
        {
            return false;
        }
        return true;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_RatInMazeII"></a>
### Rat in a maze - II (All 4 directions)
Rat in a Maze - I problem is very basic. It is exactly similar to the DP problem involving a grid with some obstacles and you are needed to find the minimum cost path from the top left to the bottom right of the grid. This problem is covered in the section <a href="#DP_2DimensionalGrids">DP for 2D grids</a>.

We tackle an advanced version of the problem here. We say that movement is allowed in all four directions Up(U), Down(D), Left(L) and Right(R). The gird has certain cells that can be visited marked by 1 and certain cells that are blocked, marked by 0. The task is to output a sorted list of all possible paths to reach the bottom right of the grid from the top left.

Instead of using dynamic programming, we need a graph based backtracking soltion here. Reasons:
1. <ins>Why not dynamic programming?</ins><br>
Because dynamic programming depends on previously computed values, and for movements in 4 directions, previous values would not be available.
2. <ins>Why graphs?</ins><br>
If we imagine the grid as a graph where all the visitable cells are connected with edges and the cells he ce form the nodes, the question becomes similar to a graph traversal that to find a path to reach a given node from a source. This is a very typical DFS problem. We apply DFS on the source cell, have 4 adjacent cells(U, D, L and R) and then for each reachable adjacent cell we recurse til lwe reach the final answer and find a path.
3. <ins>Why backtracking?</ins><br>
As we are needed to find all paths till the destination, we do not stop at finding the first path, which is what the DFS normally does, that as soon as we reach the target, we stop. Instead, when we reach the end, we add the current path to answer and then recurse/travel back to the previous node and try the next available option and check if a new path can be formed. This way after every path found, until newer options are available to traverse we keep on looking for more.

The algortithm is a very trivial backtracking algorithm and has been implemented below.
```java
class Solution
{
    public static ArrayList<String> printPath(int[][] m, int n)
    {
        ArrayList<String> ans = new ArrayList<String>();
        int[] di_x = { 1, -1, 0, 0 };
        int[] di_y = { 0, 0, 1, -1 };
        String[] di_s = { "D", "U", "R", "L"};
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        if(m[0][0] == 0)
        {
            return ans;
        }
        ratInMazeUtil(m, 0, 0, "", ans, di_x, di_y, di_s, visited);
        Collections.sort(ans);
        return ans;
    }

    public static void ratInMazeUtil(int[][] grid, int x, int y, String directions, ArrayList<String> ans, int[] di_x, int[] di_y, String[] di_s, boolean[][] visited)
    {
        int N = grid.length;
        if(x == N - 1 && y == N - 1)
        {
            ans.add(directions);
        }
        else
        {
            for(int i = 0; i < 4; i++)
            {
                int next_x = x + di_x[i];
                int next_y = y + di_y[i];
                String next_s = di_s[i];
                if(isInside(next_x, next_y, grid) && !visited[next_x][next_y])
                {
                    visited[next_x][next_y] = true;
                    ratInMazeUtil(grid, next_x, next_y, directions + next_s, ans, di_x, di_y, di_s, visited);
                    visited[next_x][next_y] = false;
                }
            }
        }
    }

    public static boolean isInside(int x, int y, int[][] grid)
    {
        int N = grid.length;
        if(x < 0 || x >= N || y < 0 || y >= N || grid[x][y] == 0)
        {
            return false;
        }
        return true;
    }
}
```
<a href="#Contents">Back to contents</a>

<a name="GP_ShortestPathWithExactlyKEdges"></a>
### Shortest path + Count all paths with exactly k edges in a graph
**<ins>For count of paths</ins>:**<br>
The question states that in a given graph/grid, count all the paths with exactly k edges from a given source to a destination. The approach one mght immediately think of is backtracking. Yes, the question is solvable using backtracking but with an exponential complexity of O(V^k).

Instead, we may choose to use dynamic programming. Using a 3D array, the dynamic programming solution becomes very easy and intuitive. We try to build all paths from length 0 to k, in the input graph in a bottom's up manner. We follow the following process:
```java
// The dp array will be of the form [Source][Destination][NumEdges] storing the count
// of total paths from 'Source' vertex to 'Destination' vertex with 'NumEdges' edges

// For number of edges 'e' in the path (from 0 to k)
//   For every vertex 'u' marking start of path (from 0 to V)
//     For every vertex 'v' marking end of path (from 0 to V)
//       For every vertex 'a' adjacent to source 'u' (from 0 to V)
//         num paths from 'u' to 'v' with 'e' edges += num paths from 'a' to 'v' with 'e-1' edges 
```
As we can see there are three loops for length V and one loop for length k. Hence the time complexity becomes O(V^3 x k). This is significantly faster than the backtracking solution. The code has been commented for further explanation.
```java
class Solution 
{
    // Function to calculate and return count
    // Input is graph[][], source u, destination v, edges k, vertices v
    public int countwalks(int graph[][], int u, int v, int k, int V)
    {
        // DP array to store [Source][Destination][NumEdges]
        int count[][][] = new int[V][V][k+1];
        // For number of edges ranging from 0 to k
        for (int e = 0; e <= k; e++)
        {
            // For source from 0 to V-1
            for (int i = 0; i < V; i++)
            {
                // For destination from 0 to V-1
                for (int j = 0; j < V; j++)
                {
                    // If number of edges is 0
                    // Then path exists if source = destination
                    if (e == 0 && i == j)
                    {
                        count[i][j][e] = 1;
                    }
                    // If number of edges is 1
                    // Path exists if a direct edge exists
                    if (e == 1 && graph[i][j]!=0)
                    {
                        count[i][j][e] = 1;
                    }
                    // If number of edges is more than 1
                    if (e > 1)
                    {
                        // For all vertices from 0 to V-1
                        for (int a = 0; a < V; a++)
                        {
                            // Check adjacent vertice of i by checking for edge
                            // If edge exists from i to a
                            if (graph[i][a]!=0)
                            {
                                // New count of paths from i to j is
                                // Old count + Count of paths from a to j using
                                // 1 less edge
                                // Hence,
                                // count(i,j,e) = count(i,j,e) + count(a,j,e-1)
                                count[i][j][e] += count[a][j][e-1];
                            }
                        }
                    }
                }
            }
        }
        // return count from vertex u to vertex v with k edges
        return count[u][v][k];
    }
}
```
**<ins>For shortest path</ins>:**<br>
The above part can have a variation to find the shortest path from the source to the destination with exactly k edges instead of counts of all paths. We use the similar dp approach with just defining a new value to be represented by the dp array.
```java
// The dp array will be of the form [Source][Destination][NumEdges] storing the min
// length of path from 'Source' vertex to 'Destination' vertex with 'NumEdges' edges

// For number of edges 'e' in the path (from 0 to k)
//   For every vertex 'u' marking start of path (from 0 to V)
//     For every vertex 'v' marking end of path (from 0 to V)
//       For every vertex 'a' adjacent to source 'u' (from 0 to V)
//         if there is a path from 'a' to 'v' using 'e-1' edges
//           path from 'u' to 'v' with 'e' edges = Min of (previous path, path from 'a' to 'v' with 'e-1' edges) 
```
The code is as follows:
```java
class Solution 
{
    // Function to calculate and return the minimum distance
    // Input is graph[][], source u, destination v, max edges k, vertices v
    public int shortestPath(int graph[][], int u, int v, int k, int V)
    {
        // DP array to store the distance of path belong ing to
        // [Source][Destination][Max edges used]
        int dist[][][] = new int[V][V][k+1];
        // For number of edges ranging from 0 to k
        for (int e = 0; e <= k; e++)
        {
            // For source from 0 to V-1
            for (int i = 0; i < V; i++)
            {
                // For destination from 0 to V-1
                for (int j = 0; j < V; j++)
                {
                    // Initial distance before calculationg is infinite
                    dist[i][j][e] = Integer.MAX_VALUE;
                    // If number of edges is 0
                    // Then path exists if source = destination
                    // And as source = destination, min path is 0
                    if (e == 0 && i == j)
                    {
                        dist[i][j][e] = 0;
                    }
                    // If number of edges is 1
                    // Path exists if a direct edge exists
                    // If yes, so path length is 1 as 1 edge
                    if (e == 1 && graph[i][j]!=-1)
                    {
                        dist[i][j][e] = 1;
                    }
                    // If number of edges is more than 1
                    if (e > 1)
                    {
                        // For all vertices from 0 to V-1
                        for (int a = 0; a < V; a++)
                        {
                            // 1. Check adjacent vertice of i by checking for edge
                            // 2. Check that it should not be a self loop, that is i != a
                            // 3. Check a should not be j itself as that is base case
                            // 4. Check there exists a path from a to j
                            if (graph[i][a]!=-1 && i != a && j!=a && dist[a][j][e-1] != Integer.MAX_VALUE)
                            {
                                // New distance of path from i to j with
                                // atmost k edges is minimum of distance
                                // before and the sum of (distance from i to a)
                                // and (distance from a to j using one less edge)
                                // Hence,
                                // dist(i,j,e) = Min(dist(i,j,e), dist(i,j,e) + dist(a,j,e-1))
                                dist[i][j][e] = Math.min(dist[i][j][e], dist[a][j][e-1] + graph[i][a]);
                            }
                        }
                    }
                }
            }
        }
        // return distance from vertex u to vertex v with atmost k edges
        return dist[u][v][k];
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
***NOTE: THE DP APPROACH TO SOLVING GRID QUESTIONS WORKS ONLY WHEN THE ANSWER FOR A CELL IN THE DP TABLE CAN BE EASILY CALCULATED USING THE PRECOMPUTED VALUES. HENCE, EVEN A SMALL MODIFICATION SUCH AS ALLOWING MOVEMENTS IN ALL 4 DIRECTIONS WOULD REQUIRE US TO CHANGE OUR APPROACH TO BFS(FOR MIN COST PATH) AND DFS/BACKTRACKING(FOR TOTAL PATHS/ CHECKING EXISTENCE OF A PATH).***

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
