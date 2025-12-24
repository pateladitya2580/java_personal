package Loop.PracticeQuestion;

public class TriangularPatern {
    static void main(String[] args) {
        int row = 4;
        int coloum = 4;
        for (int i = 1 ; i <= row ;i++)
        {
            for(int j = 1 ; j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*
//**
//***
//****