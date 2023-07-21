import java.util.Scanner;

public class HelpFromSam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int target=scanner.nextInt();
        System.out.println(findMinHelp(target));
    }
    public static int findMinHelp(int target)
    {

        int sam=1;
        int score =1;
        while (score<target)
        {
            score*=2;
            if(score>target)
            {
                score/=2;
                score++;
                sam++;
            }
        }
        return sam;
    }
}
