public class AdjacencyMatrix {
    
    // Adjacency Matrix
    // An array to solve 1's / 0's to represent edges
    // # of rows = # of unique nodes
    // # of columns = # od unique nodes

    // Runtime Complexity to check an edge: O(1)
    // Space Complexity: O(v ^ 2)
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(3, 2));

        // Depth First Search
        // Pick a route, keep going
        // If you reach a dead end, or an already visited node, backtrack to a previous node with unvisited adjacent neighbours

        // graph.depthFirstSearch(4);

        // Breadth First Search
        graph.breadthFirstSearch(0);
    }
}
