import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int s = 0;
        while(i>0)
        {
            s=s+i%2;
            i/=2;
        }
        if(s==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
