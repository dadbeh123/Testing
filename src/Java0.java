import java.util.Scanner;

import static java.lang.System.out;

public class Java0 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        if (N == 6) out.println(X);
        else if (N == 0) out.println(20);
        else out.println(Math.max(X - N, 0));
    }
}
