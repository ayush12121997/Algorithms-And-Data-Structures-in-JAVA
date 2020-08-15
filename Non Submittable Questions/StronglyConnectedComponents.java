//
public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph(5);
        g.addEdge(0,2);
        g.addEdge(2,1);
        g.addEdge(1,0);
        g.addEdge(0,3);
        g.addEdge(3,4);
        g.DFS_Util();
        g.printSCC();
    }
}

class Graph
{
    ArrayList<ArrayList<Integer>> adj = null;
    int V = 0;
    Stack<Integer> stack = new Stack<Integer>();

    public Graph(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int v, int u)
    {
        adj.get(v).add(u);
    }

    public void DFS_Util()
    {
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                DFS(i, visited);
            }
        }
    }

    public void DFS(int start, boolean[] visited)
    {
        visited[start] = true;
        for(int i = 0; i < adj.get(start).size(); i++)
        {
            int c = adj.get(start).get(i);
            if(!visited[c])
            {
                DFS(c, visited);
            }
        }
        stack.push(start);
    }

    public void DFS_SCC(int start, boolean[] visited)
    {
        visited[start] = true;
        System.out.print(start + " ");
        for(int i = 0; i < adj.get(start).size(); i++)
        {
            int c = adj.get(start).get(i);
            if(!visited[c])
            {
                DFS_SCC(c, visited);
            }
        }
    }

    public Graph reverseGraph()
    {
        Graph g = new Graph(V);
        for(int i = 0; i < adj.size(); i++)
        {
            for(int j = 0; j < adj.get(i).size(); j++)
            {
                g.addEdge(adj.get(i).get(j), i);
            }
        }
        return g;
    }

    public void printSCC()
    {
        Graph g = reverseGraph();
        boolean[] visited = new boolean[V];
        while(!stack.isEmpty())
        {
            int src = stack.pop();
            if(!visited[src])
            {
                g.DFS_SCC(src, visited);
            }
            System.out.println();
        }
    }
}
