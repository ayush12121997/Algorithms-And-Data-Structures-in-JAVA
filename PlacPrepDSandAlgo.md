# Placement Preparation Data Structures and Algorithms

<a name="Contents"></a>
## Table of contents
1. [Reader Class](#ReaderClass)
2. [Square Root](#SquareRoot)

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

<a name="SquareRoot"></a>
## Square Root
```java
Math.sqrt(n);
```
<a href="#Contents">Back to contents</a>
