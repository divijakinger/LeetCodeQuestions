class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length==0) return source==destination;

        boolean[] visited = new boolean[n];
        for (boolean x:
             visited) {
            x = false;
        }

        Map<Integer,List<Integer>> adjList = getAdjList(edges);

        return dfs(source,destination,visited,adjList);
    }
    
    Map<Integer, List<Integer>> getAdjList(int[][] edges){
        Map<Integer,List<Integer>> map = new HashMap<>();

         for (int i = 0; i < edges.length; i++) {
             List<Integer> listNode0 = map.getOrDefault(edges[i][0], new ArrayList<Integer>());
             listNode0.add(edges[i][1]);
             map.put(edges[i][0],listNode0);
             List<Integer> listNode1 = map.getOrDefault(edges[i][1], new ArrayList<Integer>());
             listNode1.add(edges[i][0]);
             map.put(edges[i][1],listNode1);
         }

         return map;
     }
    
    boolean dfs(int source, int destination,boolean[] visited, Map<Integer,List<Integer>> adjList){
        if (source==destination){
            return true;
        }

        visited[source] = true;

        List<Integer> list = adjList.getOrDefault(source,new ArrayList<Integer>());

         for (int connectedNode: list) {
             if (!visited[connectedNode]){
                 if (dfs(connectedNode,destination,visited,adjList)){
                    return true;
                 }
             }
         }

         return false;
     }
}