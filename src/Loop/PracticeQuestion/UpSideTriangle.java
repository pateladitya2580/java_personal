package Loop.PracticeQuestion;

public class UpSideTriangle {
    static void main(String[] args) {
        int row = 4;
        int colum = 4;
        for(int i = 1 ; i<= row;i++)
        {
            for(int j =1 ;j<=((colum+1)-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//****
//***
//**
//*