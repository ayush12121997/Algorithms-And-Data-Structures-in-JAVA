// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/find-a-mother-vertex-in-a-graph/
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph(7);
        g.addEdge(0,2);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(4,1);
        g.addEdge(5,2);
        g.addEdge(5,6);
        g.addEdge(6,4);
        g.addEdge(6,0);
        g.DFS_Util();
        g.DFS_Util_Mother();
        if(g.count == 7)
        {
            System.out.println(g.stack.pop());
        }
        else
        {
            System.out.println(-1);
        }
    }
}

class Graph
{
    int V;
    ArrayList<ArrayList<Integer>> adj;
    Stack<Integer> stack;
    int count;
    
    public Graph(int v)
    {
        V = v;
        count = 0;
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        stack = new Stack<Integer>();
    }
    
    public void addEdge(int v, int u)
    {
        adj.get(v).add(u);
    }
    
    public void DFS_Util()
    {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                DFS(i, visited);
            }
        }
    }
    
    public void DFS(int src, boolean[] visited)
    {
        visited[src] = true;
        for(int i = 0; i < adj.get(src).size(); i++)
        {
            int c = adj.get(src).get(i);
            if(!visited[c])
            {
                DFS(c, visited);
            }
        }
        stack.push(src);
    }
    public void DFS_Util_Mother()
    {
        boolean[] visited = new boolean[V];
        DFS_Mother(stack.peek(), visited);
    }
    
    public void DFS_Mother(int src, boolean[] visited)
    {
        visited[src] = true;
        count++;
        for(int i = 0; i < adj.get(src).size(); i++)
        {
            int c = adj.get(src).get(i);
            if(!visited[c])
            {
                DFS_Mother(c, visited);
            }
        }
    }
}
