class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        
        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        int s, e;
        int i=0;
        while(i < intervals.length){
            s = intervals[i][0];
            e = intervals[i][1];
            
            if(s <= end)
                end = Math.max(e, end);
            else{
                ans.add(new int[]{start, end});
                start = s;
                end = e;
            }
            i++;
        }
        
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}