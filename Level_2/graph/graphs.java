import java.util.ArrayList;
public class graphs {
    public static class Edge {
        int u = 0;
        int v = 0;
        int w = 0;

        Edge() {

        }

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    
    public static void main(String[] args) {
        constructGraph();
    }

    public static void constructGraph() {
        int n = 7;
        for (int i = 0; i < n; ++i) {
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(1, 2, 10);
        addEdge(3, 2, 10);
        addEdge(3, 4, 2);
        addEdge(4, 5, 2);
        addEdge(4, 6, 3);
        addEdge(5, 6, 8);
        System.out.println();
        display();
    }


    public static void addEdge(int u, int v, int w) {
        if (u < 0 || v < 0 || u >= graph.size() || v >= graph.size())
            return;

        graph.get(u).add(new Edge(v, w));
        graph.get(v).add(new Edge(u, w));
    }

    public static void display() {
        for (int i = 0; i < graph.size(); ++i) {
            System.out.print(i + " -> ");
            for (Edge e: graph.get(i)) {
                System.out.print("(" + e.v + ", " + e.w + ")");
            }
            System.out.println();
        }
    }

    public static void searchEdge(int u, int v) {
        int uIdx = -1;
        int vIdx = -1;
        for (int i = 0; i < graph.get(u).size(); ++i) {
            if (graph.get(u).get(i) == v) {
                uIdx = i;
                break;
            }
        }
    }

    public static void removeEdge(int u, int v) {
        
    }
}