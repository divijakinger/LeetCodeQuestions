class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,List<Integer>> adjList = getAdjList(edges);
                for (Integer key : adjList.keySet()){
            if (adjList.get(key).size()>1){
                return key;
            }
        }
        
        return -1;
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
}