class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        //EXACTLY SAME LIKE BINARY SEARCH BUT JUST RETURN START IN THE END
        int start = 0;
        int end = letters.length-1;

        while (start <= end){

            //find the middle element
            //int mid = (start + end)/2;
            //there might be a possibility that start + end will give you an error thus
            int mid = (start + (end - start)/2);
            if (target < letters[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        // logic for returning the first element when target is greater than the last
        return letters[start % letters.length];
    }
}