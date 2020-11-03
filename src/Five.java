import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = in.nextInt();
        a=a&(1<<i)-1;
        System.out.println(a);
    }
}