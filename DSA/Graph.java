import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    
    ArrayList<Node> nodes;
    ArrayList<LinkedList<Node>> aList;
    int[][] matrix;

    
    Graph() {
        aList = new ArrayList<>();
    }

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int [size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
        // LinkedList<Node> currentList = new LinkedList<>();
        // currentList.add(node);
        // aList.add(currentList);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
        // LinkedList<Node> currentList = aList.get(src);
        // Node dstNode = aList.get(dst).get(0);
        // currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }
        // LinkedList<Node> currentList = aList.get(src);
        // Node dstNode = aList.get(dst).get(0);
        // for (Node node: currentList) {
        //     if(node == dstNode) {
        //         return true;
        //     }
        // }
        // return false;
    }
    
    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        // for (LinkedList<Node> currentList : aList) {
        //     for (Node node : currentList) {
        //         System.out.print(node.data + " --> ");
        //     }
        //     System.out.println();
        // }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for(int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
        return;
    }

    public void breadthFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0) {
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}