package day12;

import java.util.*;

public class Graph2 {
    public static void main(String[] args) {
        String[][] allEdges = {{"TR", "start"}, {"xx", "JT"}, {"xx", "TR"}, {"hc", "dd"}, {"ab", "JT"}, {"hc", "end"}, {"dd", "JT"}, {"ab", "dd"}, {"TR", "ab"}, {"vh", "xx"}, {"hc", "JT"}, {"TR", "vh"}, {"xx", "start"}, {"hc", "ME"}, {"vh", "dd"}, {"JT", "bm"}, {"end", "ab"}, {"dd", "xx"}, {"end", "TR"}, {"hc", "TR"}, {"start", "vh"}};
        //String[][] allEdges = {{"start", "A"}, {"start", "b"}, {"A", "c"}, {"A", "b"}, {"b", "d"}, {"A", "end"}, {"b", "end"}};

        // Object of graph is created.
        Graph<String> graph = new Graph<String>();

        for (String[] edge : allEdges) {
            graph.addEdge(edge[0], edge[1], true);
        }

        Set<List<String>> paths = new HashSet<>();
        List<String> currentPath = new ArrayList<>();
        currentPath.add("start");
        getPaths(graph, paths, currentPath);
        System.out.println("Paths: " + paths);

        System.out.println("Answer: " + paths.size());
    }

    private static void getPaths(Graph<String> graph, Set<List<String>> paths, List<String> currentPath) {
        String currentEdge = currentPath.get(currentPath.size() - 1);
        if (currentEdge.equals("end")) {
            paths.add(currentPath);
        } else {
            Set<String> destinations = graph.getDestinations(currentEdge);
            for (String destination : destinations) {
                boolean isSmall = destination.equals(destination.toLowerCase());
                if (!isSmall
                        || !currentPath.contains(destination)
                        || (isSmall && !destination.equals("start") && !destination.equals("end") && !smallTwice(currentPath))) {
                    List<String> newPath = new ArrayList<>(currentPath);
                    newPath.add(destination);
                    getPaths(graph, paths, newPath);
                }
            }
        }
    }

    private static boolean smallTwice(List<String> currentPath) {
        for (String edge : currentPath) {
            if (edge.equals(edge.toLowerCase()) && Collections.frequency(currentPath, edge) > 1) {
                return true;
            }
        }
        return false;
    }
}
