// PLEASE TAKE A LOOK AT THE QUESTION HERE:
// https://www.geeksforgeeks.org/the-knights-tour-problem-backtracking-1/
// AS THE QUESTION DOES NOT HAVE A SUBMISSION OPTION HENCE THE CODE HAS BEEN WRITTEN AND STORED HERE

public class Main
{
    static int[][] board;
    public static void main(String[] args)
    {
        int N = 7;
        board = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        int[] di_x = { 2, 2, -2, -2, 1, 1, -1, -1};
        int[] di_y = { 1, -1, 1, -1, 2, -2, 2, -2};
        visited[0][0] = true;
        if(KinghtsTour(visited, 0, 0, di_x, di_y, 1, N))
        {
            printTour(board);   
        }
        else
        {
            System.out.println(-1);
        }
    }
    
    public static boolean KinghtsTour(boolean[][] visited, int x, int y, int[] di_x, int[] di_y, int count, int size)
    {
        board[x][y] = count;
        if(count == size*size)
        {
            return true;
        }
        for(int i = 0; i < 8; i++)
        {
            int new_x = x + di_x[i];
            int new_y = y + di_y[i];
            if(isInside(new_x, new_y, size) && !visited[new_x][new_y])
            {
                visited[new_x][new_y] = true;
                if(KinghtsTour(visited, new_x, new_y, di_x, di_y, count + 1, size))
                {
                    return true;
                }
                visited[new_x][new_y] = false;
            }
        }
        return false;
    }
    
    public static void printTour(int[][] board)
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

    public static boolean isInside(int x, int y, int N)
    {
        if(x < 0 || x >= N || y < 0 || y >= N)
        {
            return false;
        }
        return true;
    }
}
