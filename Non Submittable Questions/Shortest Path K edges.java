// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/shortest-path-with-exactly-k-edges-in-a-directed-and-weighted-graph-set-2/
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

public class Main
{
    public static void main(String[] args)
    {
        // Number of vertices
        int n = 7;
        // Array of edges, where every edge is denoted as:
        // [Starting, ending, distance]
        // [u, v, d]
        int[][] edges =  {  { 0, 1, 1 },
        { 0, 2, 1 }, 
        { 0, 4, 1 }, 
        { 1, 3, 1 }, 
        { 1, 4, 1 },
        { 2, 5, 1 },
        { 2, 6, 1 },
        { 3, 4, 1 },
        { 4, 6, 1 },
        { 6, 5, 1 },  };
        // Path source
        int src = 0;
        // Path destination
        int dest = 5;
        // Exact edges allowed
        int k = 4;
        // Distance array
        int[] dist = new int[n];
        // Fill distacne array with +INF as initially all distances
        // are +INF when 0 edges are allowed
        for(int i = 0; i < n; i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        // Source is at 0 distance
        dist[src] = 0;
        // For the number of edges allowed
        for(int i = 1; i <= k; i++)
        {
            // The new distance array for the updated
            // path with exactly i edges allowed
            int[] newDist = new int[n];
            // Initialise all values with +INF as no path
            // with i edges exists until now
            for(int j = 0; j < n; j++)
            {
                newDist[j] = Integer.MAX_VALUE;
            }
            // So at this point newDist holds values for i edges,
            // and dist holds the values for i-1 edges allowed

            // For all edges in the graph
            for(int j = 0; j < edges.length; j++)
            {
                // u is start, v is end, d is dist of edge u-v
                int u = edges[j][0];
                int v = edges[j][1];
                int d = edges[j][2];
                // The new distance uptill point v, with at most
                // i edges allowed would be the minimum of distance
                // so far with i edges used, or the sum of length
                // of edge u-v and distance of u by using atmost i-1
                // edges. This situation is same as the Knapsack where
                // we decide to whether or not incude an edge in the path.

                // If u is reachable from source
                if(dist[u] != Integer.MAX_VALUE)
                {
                    newDist[v] = Math.min(newDist[v], dist[u] + d); 
                }
            }
            // Update the distance array for atmost i edges allowed
            dist = newDist;
        }
        System.out.println(dist[dest]);
    }
}
