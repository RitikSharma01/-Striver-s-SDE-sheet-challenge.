public static int findDuplicate(ArrayList<Integer> arr, int n){

        Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();       

       for(Integer i: arr)

       {           

               if(hMap.containsKey(i))

               {               

                       hMap.put(i,hMap.get(i)+1);            

               }            

             else{                

                          hMap.put(i,1);            

                   }        

       }       

      int x = 0;        

     for(Map.Entry<Integer,Integer> m: hMap.entrySet())

    {            

                if(m.getValue() > 1)

              {               

                       x = m.getKey();           

               }      

     }        

     return x;   

 }