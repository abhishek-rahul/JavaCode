package cc;

class Tree
{
    private static void traverseDiagonal(Node root, SortedMap <Integer,ArrayList<Integer>> mp,
     int level)
     {
        if(root==null)
            return ;
        int num = root.data;
        if(!mp.containsKey(level))
        {
           mp.put(level,new ArrayList<Integer>()); 
        }
        mp.get(level).add(num);
        traverseDiagonal(root.left,mp,level+1);
        traverseDiagonal(root.right,mp,level);
        
        
     }
     public ArrayList<Integer> diagonal(Node root)
      {
        SortedMap <Integer,ArrayList<Integer>> mp = new TreeMap<Integer,ArrayList<Integer>>();
          ArrayList<Integer> ans = new ArrayList<Integer>();
                  traverseDiagonal(root,mp,0);
          
        for (SortedMap.Entry<Integer, ArrayList<Integer>> e: mp.entrySet()) {
            //System.out.println(e.getKey());
            //List<Integer> tempList = e.getValue() ;
            //System.out.println(e.getValue());
            ans.addAll(e.getValue());
        }
           //add your code here.SSS
        return ans;
           //return new ArrayList<Integer>();
      }
}