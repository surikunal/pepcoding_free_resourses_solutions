#include <iostream>
#include <vector>
using namespace std;

class Edge {
    public:
    int u = 0;
    int v = 0;
    int w = 0;

    Edge() {

    }

    Edge(int v, int w) {
        this->v = v;
        this->w = w;
    }

    Edge(int u, int v, int w) {
        this->u = u;
        this->v = v;
        this->w = w;
    }
};

int n = 7;
vector<vector<Edge *>> graph(n, vector<Edge *>());

void addEdge(int u, int v, int w) {
    if (u < 0 || v < 0 || u >= graph.size() || v >= graph[0].size())
        return;

    graph[u].push_back(new Edge(v, w));
    graph[v].push_back(new Edge(u, w));
}

void display() {
    for (int i = 0; i < n; ++i) {
        
    }
}

void constructGraph() {
    addEdge(0, 1, 10);
    addEdge(0, 3, 10);
    addEdge(1, 2, 10);
    addEdge(2, 3, 40);
    addEdge(3, 4, 2);
    addEdge(4, 5, 2);
    addEdge(4, 6, 3);
    addEdge(5, 6, 8);

    display();
    cout << endl;
}

void solve() {
    constructGraph();
}

int main(int args, char** argv) {
    solve();
    return 0;
}