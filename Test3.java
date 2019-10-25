import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        //nextInt 得到的数字范围是[0,bound)
        int toGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入一个数字(1--100)");
            int num = scanner.nextInt();
            if (num < toGuess){
                System.out.println("低了");
            }
            if (num > toGuess){
                System.out.println("高了");
            }else {
                System.out.println("good~");
            }
        }
    }
}
