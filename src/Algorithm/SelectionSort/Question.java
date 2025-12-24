package Algorithm.SelectionSort;

public class Question {
    static void sort(String []fruits)
    {
        int n = fruits.length;
        for(int i = 0 ; i < n ; i++)
        {
            int minIndex = i;
            for(int j = i+1 ; j<n;j++)
            {
                if(fruits[j].compareTo(fruits[minIndex])<0)
                {
                    minIndex = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[minIndex];
            fruits[minIndex] = temp;
        }
    }
    static void main(String[] args) {
        String []fruits = {"kiwi","apple","papaya","mango"};
        sort(fruits);
        for(String i: fruits)
        {
            System.out.print(i+" ");
        }
    }
}
