package String;
public class ReveseTheSentance {
    static void main(String[] args) {
        String str = "I am an online educator";
        String ans ="";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                sb.append(str.charAt(i));
            }
            else
            {
                sb.reverse();
                ans += sb;
                ans +=" ";
                 sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
