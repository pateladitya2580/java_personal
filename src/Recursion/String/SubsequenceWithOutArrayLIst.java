package Recursion.String;

public class SubsequenceWithOutArrayLIst {
    static void printSSQ(String s , String currAns)
    {
        //base case
        if(s.length() == 0 )
        {
            System.out.println(currAns);
            return;
        }
        char a  = s.charAt(0);
        String remainingString = s.substring(1);
        printSSQ(remainingString, currAns + a);
        printSSQ(remainingString,currAns);

    }
    static void main(String[] args) {
        String s = "abc";
        printSSQ(s,"");
    }
}
//lecture 35