package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph1 {
    public static void main(String[] args) {
        String[][] allEdges = {{"TR", "start"}, {"xx", "JT"}, {"xx", "TR"}, {"hc", "dd"}, {"ab", "JT"}, {"hc", "end"}, {"dd", "JT"}, {"ab", "dd"}, {"TR", "ab"}, {"vh", "xx"}, {"hc", "JT"}, {"TR", "vh"}, {"xx", "start"}, {"hc", "ME"}, {"vh", "dd"}, {"JT", "bm"}, {"end", "ab"}, {"dd", "xx"}, {"end", "TR"}, {"hc", "TR"}, {"start", "vh"}};

        // Object of graph is created.
        Graph<String> graph = new Graph<String>();

        for (String[] edge : allEdges) {
            graph.addEdge(edge[0], edge[1], true);
        }

        Set<List<String>> paths = new HashSet<>();
        List<String> currentPath = new ArrayList<>();
        currentPath.add("start");
        getPaths(graph, paths, currentPath);

        System.out.println("Answer: " + paths.size());
    }

    private static void getPaths(Graph<String> graph, Set<List<String>> paths, List<String> currentPath) {
        String currentEdge = currentPath.get(currentPath.size() - 1);
        if (currentEdge.equals("end")) {
            paths.add(currentPath);
        } else {
            Set<String> destinations = graph.getDestinations(currentEdge);
            for (String destination : destinations) {
                if (destination.equals(destination.toUpperCase()) || !currentPath.contains(destination)) {
                    List<String> newPath = new ArrayList<>(currentPath);
                    newPath.add(destination);
                    getPaths(graph, paths, newPath);
                }
            }
        }
    }
}
