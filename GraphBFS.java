import java.util.LinkedList;

/**
 * Created by evoznesensky on 1/17/18.
 */
public class GraphBFS {

  private int V; // number of verticies
  private LinkedList<Integer> adj[]; // adjacents

  public GraphBFS(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < V; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  void BFS(int s) {
    boolean[] visited = new boolean[V];

    LinkedList<Integer> queue = new LinkedList<Integer>();
    queue.add(s);
    visited[s] = true;

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");

      for (Integer n : adj[s]) {
        if (visited[n] == false) {
          queue.add(n);
          visited[n] = true;
        }
      }
    }

  }

  public static void main(String[] args) {
    GraphBFS g = new GraphBFS(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(2, 0);
    g.addEdge(3, 3);
    g.addEdge(2, 3);
    g.addEdge(1, 2);

    g.BFS(2);
  }
}
