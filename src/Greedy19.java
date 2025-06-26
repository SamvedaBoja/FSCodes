public class Greedy19 {
}
/*
Given an array of points where points[i] = [xi, yi] represents a point on the
X-Y plane and an integer k, return the k closest points to the origin (0, 0).
The distance between two points on the X-Y plane is the Euclidean distance
(i.e., √(x1 - x2)2 + (y1 - y2)2).
You may return the answer in any order. The answer is guaranteed to be
unique (except for the order that it is in).

Sample Testcase:1
----------------------------
input=3
1 3
5 -2
-1 4
2
output=[-1, 4]
[1, 3]


Sample Testcase:2
----------------------------
input=2
1 3
-2 2
1
output=[-2, 2]

Explanation:
---------------------------
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just
[[-2,2]].

 */
/*
import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int []> q = new PriorityQueue<>((a,b)->Double.compare(distance(b),distance(a)));

        for(int []point:points){
            q.offer(point);
            if(q.size()>k){
                q.poll();
            }
        }

        int [][]result = new int[k][2];
        for(int i=0;i<k;i++){
            result[i]=q.poll();
        }
        return result;
    }
    private double distance(int[] point){
        return Math.pow(point[0],2) + Math.pow(point[1],2);
    }
}

 */