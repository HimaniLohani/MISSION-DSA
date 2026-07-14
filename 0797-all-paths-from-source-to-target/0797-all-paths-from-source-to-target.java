class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<Integer> path = new ArrayList<>();

        dfs(0, graph, path);

        return result;
    }

    private void dfs(int node, int[][] graph, List<Integer> path) {

        // Add current node
        path.add(node);

        // If target reached
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
        } else {

            // Visit all neighbors
            for (int next : graph[node]) {
                dfs(next, graph, path);
            }
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}