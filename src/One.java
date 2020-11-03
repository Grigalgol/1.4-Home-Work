import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = in.nextInt();
        a=a>>i; a=a<<i;
        System.out.println(a);
    }
}
