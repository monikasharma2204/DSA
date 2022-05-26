package Graph;

public class GraphConnectedOrNot {
    static void connectedCheck(int graph[][], boolean []visited, int src)
    {
        visited[src] = true;
    
        for(int i =0; i<graph.length;i++)
        {
        if(visited[i] = false   &&  graph[src][i]==1 )
        {
            connectedCheck(graph, visited, i);
        }
        }
    }
    public static void main(String[] args) {
        boolean visited[] = new boolean[5];
        int graph[][] = new int[5][5];

        graph[0][1] = 1;
       // graph[0][2]  = 1;

      // graph[1][0]=1;
      graph[1][2] = 1;
    
      //  graph[2][0] = 1;
        graph[2][3] = 1;
        graph[4][3]=1;


        connectedCheck(graph,visited,0);
        for(int i= 0; i<visited.length; i++)
        {
            if(visited[i]== false)
            {
                System.out.println("not coonected");
                return;
            }
        }
        System.out.println(" coonected graph");
       

    }
}

    
    
