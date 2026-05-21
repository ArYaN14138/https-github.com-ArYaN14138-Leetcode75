class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int high=0;
        int max_len=0;

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(high=0;high<n;high++)
        {

            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);

            //shrink the window

            while(freq.size()>2)
            {
                int lowfruit=fruits[low];

                freq.put(lowfruit,freq.get(lowfruit)-1);


                if(freq.get(lowfruit)==0)
                {
                    freq.remove(lowfruit);

                   

                }
                 low++;

           

            }
                max_len=Math.max(max_len,high-low+1);

                  


        }
          return max_len;
    
}}