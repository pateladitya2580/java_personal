package Loop.PracticeQuestion;

public class HolloRectangle {
    static void main(String[] args) {
        int row = 5;
        int colum = 5;
        for(int i = 1;i<=row;i++)
        {
            for(int j = 1;j<=colum;j++)
            {
                if(i==1||i ==row||j==1||j==colum)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
