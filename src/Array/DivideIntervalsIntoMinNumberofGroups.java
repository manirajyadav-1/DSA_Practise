package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DivideIntervalsIntoMinNumberofGroups {
    public static int divideIntervals(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] interval : intervals){
            int start = interval[0], end = interval[1];

            if(!pq.isEmpty() && pq.peek() < start){
                pq.poll();
            }
            pq.add(end);
        }
        return pq.size();
    }
    public static void main(String[] args) {
        int[][] intervals = {{5,10},{6,8},{1,5},{2,3},{1,10}}; // output = 3
        System.out.println(divideIntervals(intervals));
    }
}
