// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/number-of-triangles-in-directed-and-undirected-graphs/
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(3,1);
        g.addEdge(3,2);
        System.out.println(g.countTriangles());
    }
}

class Graph
{
    int V;
    // HashSet helps us save time when all that is required is to just check that
    // whether or not an edge exists from a given starting vertex to an ending
    // vertex. 
    // We could have alternatively used an adjacency matrix as well for this purpose.
    ArrayList<HashSet<Integer>> adj;
    
    public Graph(int v)
    {
        V = v;
        adj = new ArrayList<HashSet<Integer>>();
        for(int i = 0; i < V; i++)
        {
            adj.add(new HashSet<Integer>());
        }
    }
    
    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
        // Bidirectional edges for undirected graphs only
        adj.get(v).add(u);
    }
    
    public int countTriangles()
    {
        int count = 0;
        // For first vertex of triangle - A
        for(int i = 0; i < V; i++)
        {
            // For second vertex of triangle - B
            for(int j = 0; j < V; j++)
            {
                // For third vertex of triangle - C
                for(int k = 0; k < V; k++)
                {
                    // Check if the edges AB, BC and AC can be formed or not
                    // That is check if i-j, j-k and k-1 can be formed or not
                    if(adj.get(i).contains(j) && adj.get(j).contains(k) && adj.get(k).contains(i))
                    {
                        // If yes so new triangle found
                        count++;
                    }
                }
            }
        }
        // If undirected so return count/6
        // If directed so return count/3
        return count/6;
    }
}
