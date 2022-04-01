import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*i8t
 * 백준 1260 실버2 DFS와 BFS
 */
public class DFS와BFS {

    //정점의 개수, 간선의 개수, 탐색시작정점번호
    static int N,M,V;

    //인접 배열
    static int[][] adj;

    //방문 배열
    static boolean[] v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N =sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        adj= new int[N+1][N+1];

        //인접 배열 만들기
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a][b]=adj[b][a]=1;
        }

        //방문확인 배열
        v = new boolean[N+1];
        dfs(V);

        System.out.println();

        v = new boolean[N+1];
        bfs(V);


    }

    private static void dfs(int V) {
        v[V] = true;//방문처리
        System.out.print(V+" ");
        // 끝까지 돌았으면 끝내
        if(V==adj.length) return;

        for (int j = 1; j < adj.length; j++) {
            // 연결되어있고 방문한적 없을때 dfs호출
            if(adj[V][j]==1&&v[j]==false) dfs(j);
        }
    }

    private static void bfs(int V) {
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(V);
        v[V]=true;
        System.out.print(V+" ");

        while(!Q.isEmpty()) {
            int tmp = Q.peek();
            Q.poll();
            for (int i = 1; i < adj.length; i++) {
                //연결되어있고 방문하지 않은 정점
                if(adj[tmp][i]==1&&v[i]==false) {
                    Q.add(i);
                    v[i]=true;
                    System.out.print(i+" ");
                }
            }
        }
    }


}
