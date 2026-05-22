class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int max_len=0;
        int n=s.length();


        HashMap<Character,Integer>map=new HashMap<>();

        for(high=0;high<n;high++)
        {
            char ch=s.charAt(high);

            map.put(ch,map.getOrDefault(ch,0)+1);


            while(map.get(ch)>1)
            {

                char leftchar=s.charAt(low);

                map.put(leftchar,map.get(leftchar)-1);

                low++;


            }



            max_len=Math.max(max_len,high-low+1);







        }

        return max_len;

        
    }
}