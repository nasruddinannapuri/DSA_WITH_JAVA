package Greedy;

import java.util.*;

public class JobSequencingProblem {

    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
            }
    } 
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        // descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("Max jobs: "+seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i) + " ");
            }
            System.out.println();
    }
    
}
