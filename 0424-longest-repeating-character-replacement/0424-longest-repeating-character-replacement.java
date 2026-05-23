class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> map=new HashMap<>();


        int low=0;
        int high=0;
        int result=0;
              
        int max_count=0;


        int n=s.length();


        for(high=0;high<n;high++)
        {



            char ch =s.charAt(high);

            map.put(ch,map.getOrDefault(ch,0)+1);

            max_count =Math.max(max_count,map.get(ch));

     


            while((high-low+1)-max_count>k)
            {
                char left=s.charAt(low);

                map.put(left,map.get(left)-1);

                low++;

            }

            result=Math.max(result,high-low+1);


        }

        return result;

        
    }
}