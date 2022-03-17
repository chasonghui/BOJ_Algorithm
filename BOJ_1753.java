import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
2022.03.17
백준 : 1753 최단경로
 */
class Node implements Comparable<Node>{
    int end, weight;

    public Node(int end, int weight){
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }
}
public class BOJ_1753 {
    static int V;//정점의 개수
    static int E;//간선의 개수
    static int K;//시작 정점
    static int dist[];//가중치 저장
    static ArrayList<ArrayList<Node>> adj;
    static final int infi=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        K = sc.nextInt();

        //정점크기 만큼 인접리스트 생성
        adj = new ArrayList<>();
        for (int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }

        //가중치 배열 무한대로 초기화
        dist = new int[V+1];
        Arrays.fill(dist,infi);

        //간선의 개수 만큼
        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            //단방향으로 생성
            adj.get(a).add(new Node(b,c));
        }

        //시작 정점을 넣어줌
        dijkstra(K);

        for (int i = 1; i < V+1; i++) {
            if(dist[i]==infi) System.out.print("INF");
            else System.out.println(dist[i]);
        }
    }

    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] check = new boolean[V+1];//정점크기맨큼
        pq.add(new Node(start,0));
        dist[start]=0;

        while(!pq.isEmpty()){
            Node now = pq.poll();
            if(check[now.end]==true) continue;
            check[now.end]=true;

            for(Node n : adj.get(now.end)){
                if(dist[n.end]>=dist[now.end]+n.weight){
                    dist[n.end]=dist[now.end]+n.weight;
                    pq.add(new Node(n.end, dist[n.end]));
                }
            }

            }

        }
    }

