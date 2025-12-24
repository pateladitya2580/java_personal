package Array.practice;
class Sum {
    void additionOfArray()
    {
        int []arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0 ; i < arr.length;i++ )
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
public class SumOfArray {
    static void main(String[] args) {
        Sum object = new Sum();
        object.additionOfArray();
    }
}
