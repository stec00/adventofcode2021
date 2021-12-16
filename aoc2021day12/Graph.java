package day12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Graph<T> {
    // We use Hashmap to store the edges in the graph
    private Map<T, Set<T>> map = new HashMap<>();

    // This function adds a new vertex to the graph
    public void addVertex(T s) {
        map.put(s, new HashSet<T>());
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(T source,
                        T destination,
                        boolean bidirectional) {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    public Set<T> getDestinations(T source) {
        return map.get(source);
    }
}
