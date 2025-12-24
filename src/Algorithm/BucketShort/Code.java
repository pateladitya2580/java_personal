package Algorithm.BucketShort;
import java.util.ArrayList;
import java.util.Collections;
public class Code {
    static void bucketSort(float []arr)
    {
        int n  = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        // empty bucket create ki
        for(int i = 0 ; i<buckets.length;i++)
        {
            buckets[i] =new ArrayList<Float>() ;
        }
        // empty buket me value add
        for (int i = 0 ; i< n;i++)
        {
            int bucketIndex = (int)arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        // sort
        for(int i = 0 ; i< buckets.length;i++)
        {
            Collections.sort(buckets[i]);
        }
        //merge
        int index = 0;
        for(int i = 0 ; i < buckets.length;i++)
        {
            ArrayList<Float>currentBucket = buckets[i];
            for(int j = 0 ; j < currentBucket.size();j++ )
            {
                arr[index++] = currentBucket.get(j);
            }
        }
    }
    static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        for (float val : arr) {
            System.out.print(val + " ");
        }
    }
}
