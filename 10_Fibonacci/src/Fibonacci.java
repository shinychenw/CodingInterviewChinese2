/**
 * @ClassName Fibonacci
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-23 17:13
 * @Version 1.0
 **/
public class Fibonacci {
    public Fibonacci() {
    }

    public int run(int n) {
        if(n == 1) {return 0;}
        if(n == 2) {return 1;}

        int a = 0, b = 1, c = 1;
        for(int i = 0; i < n - 3; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.run(40));
    }
}
