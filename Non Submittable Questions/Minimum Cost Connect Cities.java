// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/minimum-cost-connect-cities/
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph(5);
        g.addEdge(0,1,1);
        g.addEdge(0,2,2);
        g.addEdge(0,3,3);
        g.addEdge(0,4,4);
        g.addEdge(1,2,5);
        g.addEdge(1,4,7);
        g.addEdge(2,3,6);
        g.Dijkstra(0);
        System.out.println(g.SUM);
    }
}

class Graph
{
    int V;
    int SUM;
    ArrayList<ArrayList<Node>> adj;
    int[] dist;
    int[] parent;
    
    public Graph(int v)
    {
        V = v;
        SUM = 0;
        adj = new ArrayList<ArrayList<Node>>();
        dist = new int[V];
        parent = new int[V];
        for(int i = 0; i < V; i++)
        {
            adj.add(new ArrayList<Node>());
            dist[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }
    }
    
    public void addEdge(int u, int v, int d)
    {
        adj.get(u).add(new Node(v, d));
        adj.get(v).add(new Node(u, d));
    }
    
    public void Dijkstra(int src)
    {
        dist[src] = 0;
        PriorityQueue<Node> pQueue = new PriorityQueue<Node>(new Comparison());
        HashSet<Integer> MST = new HashSet<Integer>();
        pQueue.add(new Node(src, 0));
        while(!pQueue.isEmpty())
        {
            while(!pQueue.isEmpty() && MST.contains(pQueue.peek().ind))
            {
                pQueue.poll();
            }
            if(pQueue.isEmpty())
            {
                return;
            }
            Node n = pQueue.poll();
            int u = n.ind;
            int d = n.dist;
            MST.add(u);
            if(MST.size() == V)
            {
                return;
            }
            for(int i = 0; i < adj.get(u).size(); i++)
            {
                Node c = adj.get(u).get(i);
                int c_ind = c.ind;
                int c_dis = c.dist + d;
                if(!MST.contains(c_ind) && dist[c_ind] > c_dis)
                {
                    pQueue.add(new Node(c_ind, c_dis));
                    // SUM is supposed to store the sum of all the edges included in the
                    // MST as the final answer.
                    
                    // Everytime we update an edge, it means we have to perform two steps:
                    // STEP 1:
                    // REMOVE THE PREVIOUSLY ADDED EDGE ENDING AT c_ind
                    // For this we check if c_ind had a parent or not. If not, then this
                    // is the first time an edge ending at c_ind is added. If a parent
                    // exists, then distance of c_ind at that moment would be:
                    // dist[c_ind] = Distance of parent from source (dist[parent[c_ind]])
                    //                          +
                    //               Distance between parent and c_ind
                    // We need to subtract Distance between parent and c_ind which can be
                    // calculated as:
                    // Distance between parent and c_ind = dist[c_ind] - dist[parent[c_ind]]
                    if(parent[c_ind] != -1)
                    {
                        SUM -= dist[c_ind] - dist[parent[c_ind]];
                    }
                    
                    // STEP 2:
                    // ADD NEW EDGE DISTANCE ENDING AT c_ind
                    SUM += c.dist;
                    
                    dist[c_ind] = c_dis;
                    parent[c_ind] = u;
                }
            }
        }
    }
}

class Node
{
    int ind;
    int dist;
    
    public Node(int u, int d)
    {
        ind = u;
        dist = d;
    }
}

class Comparison implements Comparator<Node>
{
    @Override
    public int compare(Node p1, Node p2)
    {
        if (p1.dist > p2.dist)
        {
            return 1;
        }
        else if (p1.dist < p2.dist)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
