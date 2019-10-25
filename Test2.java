public class Test2 {
    public static int Sum(){
        int sum = 0;
        for (int num = 1;num <= 100;num ++){
            sum += num;
        }
        System.out.println(sum);
        return sum;
    }

    public static int Jc5(){
        int result = 1;
        for (int num = 1;num <= 5;num++){
            result *= num;
        }
        System.out.println(result);
        return result;
    }

    public static int JcSum5(){
        int result = 1;
        int sum = 0;
        for (int num = 1; num <= 5; num++) {
            result *= num;
            sum += result;
        }
        System.out.println(sum);
        return 0;
    }

    //方法的定义，定义中涉及的参数成为形参
    public static int factor(int num){
        int result = 1;
        for (int i =1;i <= num;i++){
            result *= i;
        }
        return result;
    }
    public static int JcSum(){
        int sum = 0;
        for (int i = 1;i <= 5 ;i++){
            //方法的调用，涉及的参数成为实参
            sum += factor(i);
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Sum();
        System.out.println("======");
        Jc5();
        System.out.println("======");
        JcSum5();
        System.out.println("======");
        JcSum();
    }
}
