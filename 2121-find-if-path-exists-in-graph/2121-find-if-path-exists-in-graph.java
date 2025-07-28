class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source==destination) return true;
        
        ArrayList<ArrayList<Integer>> alist=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            alist.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            alist.get(edges[i][0]).add(edges[i][1]);
            alist.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> que=new ArrayDeque<>();
        que.add(source);
        int removed=0;

        int[] used=new int[n+1];
        used[source]=1;
        
        while(!que.isEmpty()){
            removed=que.poll();
            for(int i: alist.get(removed)){
                if(used[i]==0) {
                    que.add(i);
                    used[i]=1;
                }
                if(i==destination) return true;
            }
        }
        return false;
    }
}