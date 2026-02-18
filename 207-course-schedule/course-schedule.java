class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj_ver=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            adj_ver.add(new LinkedList<>());

        }
        int ind[]=new int[numCourses];
        for(int[] nei:prerequisites){
            int source=nei[1];
            int dest=nei[0];
            adj_ver.get(source).add(dest);
            ind[dest]++;

        }
        Queue<Integer> q=new LinkedList<>();
        int numCourses_completed=0;
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int cur_course=q.poll();
            numCourses_completed++;
            for(int nei_course:adj_ver.get(cur_course)){
                ind[nei_course]--;
             if(ind[nei_course]==0){
                q.offer(nei_course);
             }
            }
        }
return (numCourses_completed==numCourses);

    }
}