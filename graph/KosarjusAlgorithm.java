package Graph;
import java.util.Stack;

public class KosarjusAlgorithm{

    static Stack st = new Stack();
    static int flag=0;

    static void kosarjus(int graph[][] , boolean[] visited ,int source)
    {
            visited[source]=true;

            if(flag == 0){
            st.push(source);
            }


        for(int i=0;i<graph.length;i++)
        {
            if(visited[i]==false && graph[source][i]==1)
            {
                kosarjus(graph,visited,i);
            }
        }
    }
    public static void main(String []args)
    {
        int graph[][]= new int[6][6];
        boolean []visited = new boolean[6];

        graph[0][2]=1;
        graph[1][0]=1;
        graph[1][3]=1;
        graph[2][1]=1;
        graph[3][4]=1;
        graph[4][5]=1;
        graph[5][3]=1;

        int count =0;

        for(int i=0;i<4;i++)
        {
            if(visited[i] == false)
            {
                kosarjus(graph,visited,i);
            }
        }
    for(int i=0;i<visited.length;i++)
    {
        visited[i] = false;

    }
    flag=1;
    while(!st.empty())
    { 
        int node = (int)st.pop();
        if(visited[node] == true)
        {
            continue;
        }
        else   
        {
            kosarjus(graph,visited,node);
            count++;
        }

    }
    System.out.println("number of strongly components  :"+ count);


    }
}
