// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/minimize-cash-flow-among-given-set-friends-borrowed-money/
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph(3);
        g.addEdge(0,1,1000);
        g.addEdge(0,2,2000);
        g.addEdge(1,2,5000);
        g.minCashFlow();
    }
}

class Graph
{
    int V;
    // graph[i][j] would hold the value that person i had to
    // pay to person j initially
    int[][] graph;
    // ans[i][j] would hold the value that person i had to
    // pay to person j after minimizing cash flow
    int[][] ans;
    
    public Graph(int v)
    {
        V = v;
        graph = new int[V][V];
        ans = new int[V][V];
    }
    
    public void addEdge(int u, int v, int a)
    {
        // u pays v amount equal to a
        graph[u][v] = a;
    }
    
    public void minCashFlow()
    {
        // amount[i] would hold the net profit for every person i
        // Net profit of i:
        // (Amount i gets from j - Amount i pays to j) for all j
        int[] amount = new int[V];
        
        // For every person i
        for(int i = 0; i < V; i++)
        {
            // For every person j
            for(int j = 0; j < V; j++)
            {
                amount[i] += (graph[j][i] - graph[i][j]);
            }
        }
        minCashFlow_Util(amount);
        displayAnswer();
    }
    
    public void minCashFlow_Util(int[] amount)
    {
        // Find the index of maximum profit
        int max = 0;
        for(int i = 0; i < V; i++)
        {
            if(amount[i] > amount[max])
            {
                max = i;
            }
        }
        // Find the index of minimum profit, that is maximum debt
        int min = 0;
        for(int i = 0; i < V; i++)
        {
            if(amount[i] < amount[min])
            {
                min = i;
            }
        }
        // If both profit and debt are 0, then it means that transactions
        // have been settled
        if(amount[max] == 0 && amount[min] == 0)
        {
            return;
        }
        // As MinProfit will always be a -ve value, we have to convert it
        // to positive to consider it as MaxDebt. 
        int MaxDebt = -amount[min];
        int MaxProfit = amount[max];
        // If MaxDebt to be paid is less than MaxProfit to be earned
        if(MaxProfit > MaxDebt)
        {
            // Transfer MaxDebt amount from person in debt to person in profit
            amount[min] += MaxDebt;
            amount[max] -= MaxDebt;
            // Add this transaction to answer graph
            ans[min][max] = MaxDebt;
        }
        // If MaxDebt to be paid is more than MaxProfit to be earned
        else
        {
            // Transfer MaxProfit amount from person in debt to person in profit
            amount[min] += MaxProfit;
            amount[max] -= MaxProfit;
            // Add this transaction to answer graph
            ans[min][max] = MaxProfit;
        }
        minCashFlow_Util(amount);
    }
    
    public void displayAnswer()
    {
        for(int i = 0; i < V; i++)
        {
            for(int j = 0; j < V; j++)
            {
                System.out.print(ans[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
