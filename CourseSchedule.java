import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] prereq: prerequisites){
            graph.get(prereq[1]).add(prereq[0]);
            indegree[prereq[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<indegree.length; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int completedCourses = 0;
        while(!q.isEmpty()){
            int course = q.poll();
            completedCourses++;
            for(int neighbor : graph.get(course)){
                indegree[neighbor]--;

                if(indegree[neighbor]==0){
                    q.add(neighbor);
                }
            }
        }
        return numCourses==completedCourses;

        /*List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] prereq: prerequisites){
            graph.get(prereq[1]).add(prereq[0]);
        }                                           //dfs
        int[] visitStatus = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            if(visitStatus[i]==0){
                if(hasCycle(i, graph, visitStatus)){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean hasCycle(int i, List<List<Integer>> graph, int[] visitStatus){
        /*visitStatus[i] = 1;
        for(int neighbor : graph.get(i)){
            if(visitStatus[neighbor] == 1) return true;
                                                           //dfs with recurrsion
            if(visitStatus[neighbor] == 0){
                if(hasCycle(neighbor, graph, visitStatus)){
                    return true;
                }
            }

        }
        visitStatus[i] = 2;
        return false;*/

       /* Stack<Integer> stk = new Stack<>(); //dfs with stack
        stk.push(i);
        while(!stk.isEmpty()){
            int node = stk.peek();
            if(visitStatus[node]==0){
                visitStatus[node] = 1;
                for(int neighbor: graph.get(node)){
                    if(visitStatus[neighbor]==0){
                        stk.push(neighbor);
                    }else if(visitStatus[neighbor]==1){
                        return true;
                    }
                }
            }else{
                visitStatus[node]=2;
                stk.pop();
            }
        }
        return false;*/

    }
}