import java.util.*;

public class Graph {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Добавляем ребра (двунаправленный граф)
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 2, 5);
        addEdge(graph, 3, 6);
        addEdge(graph, 3, 7);

        // Обход в глубину (DFS)
        System.out.print("DFS: ");
        dfs(graph, 1, new HashSet<>());
    }

    static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        if (visited.contains(node)) return;

        System.out.print(node + " ");
        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            dfs(graph, neighbor, visited);
        }
    }
}
