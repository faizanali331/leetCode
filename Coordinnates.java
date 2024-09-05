import java.util.Comparator;
import java.util.PriorityQueue;

class Coordinates {
    public class Store{
        float distance;
        int[]pt;
        Store(float distance, int[]pt){
            this.distance = distance;
            this.pt = pt;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        Comparator<Store> distanceCom = new Comparator<Store>(){
            public int compare(Store s1, Store s2){
                return Float.compare(s1.distance, s2.distance);
            }
        };

        PriorityQueue<Store> pq = new PriorityQueue<>(distanceCom);


        for(int i=0; i<points.length; i++){
            int[] pt = new int[2];
            pt[0] = points[i][0];
            pt[1] = points[i][1];
            float distance = (float)Math.sqrt(Math.pow(pt[0], 2)+Math.pow(pt[1], 2));
            pq.add(new Store(distance, pt));
        }
        int i = 0;
        int[][] result = new int[k][2];

        while(!pq.isEmpty() && i<k){
            result[i] = pq.poll().pt;
            i++;
        }
        return result;
    }
}