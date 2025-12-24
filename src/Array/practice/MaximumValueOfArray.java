package Array.practice;
class Maximum{
    int p;
    void greatestNo(){
        int[]arr = {1,5,3};
        p = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if( p < arr[i])
            {
                p = arr[i];
            }
        }
        System.out.println("greatest no. is "+p);
    }

}
public class MaximumValueOfArray {
    static void main(String[] args) {
        Maximum object = new Maximum();
        object.greatestNo();
    }
}
