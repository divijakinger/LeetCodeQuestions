class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        
        Arrays.sort(buses);
        Arrays.sort(passengers);
        Set<Integer> set = new HashSet<>();
        int ans=0,j=0;
        for(int i=0;i<buses.length;i++){
            int c = 0;
            while(j<passengers.length && c<capacity && passengers[j]<=buses[i]){
                c++;
                if(!set.contains(passengers[j]-1)){
                    ans=passengers[j]-1;
                }
                set.add(passengers[j]);
                j++;
            }
            if(c<capacity && !set.contains(buses[i])){
                ans = Math.max(ans,buses[i]);
            }
        }
        return ans;
    }
}