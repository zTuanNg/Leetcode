package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _797 {
    public static void main(String[] args) {

        int[][] graph = {{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(graph));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        int end = graph.length - 1;
        List<List<Integer>> paths = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        stack.push(new ArrayList<>(){{add(0);}});
        while(!stack.isEmpty()){
            List<Integer> path = stack.pop();
            Integer currentNode = (Integer) path.get(path.size() - 1);

            if(currentNode == end){
                paths.add(path);
                continue;
            }

            int[] connectedNode = graph[currentNode];
            for(int i = 0; i < connectedNode.length; i++){
                List<Integer> list = new ArrayList<>(path);
                list.add(connectedNode[i]);
                stack.push(list);
            }
        }
        return paths;

    }
}
