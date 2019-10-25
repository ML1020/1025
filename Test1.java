public class Test1 {
    public static int BF(){
        int num = 100;
        while (num < 200){
            if (num % 3 == 0){
                System.out.println(num);
                break;
            }
            num ++;
        }
        return num;
    }

    public static int BA1(){
        int num = 100;
        while (num < 200){
            if (num % 3 == 0){
                System.out.println(num);
            }
            num ++;
        }
        return num;
    }

    public static int BA2(){
        int num = 100;
        while (num < 200) {
            if (num % 3 != 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num ++;
        }
        return num;
    }

    public static void main(String[] args) {
        BF();
        System.out.println("===========");
        BA1();
        System.out.println("===========");
        BA2();
    }
}
