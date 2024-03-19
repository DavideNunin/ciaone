import java.util.Random;
public class Ciaone {
    public static void main(String args[]) {
        System.out.println("ciaone");
        System.out.println(Ciaone.fib(3));
        for(int i=0;i<1000000;i++) {
            System.out.println(Ciaone.random_number(4, 12));
        }
    }
    private static int fib(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            return Ciaone.fib(n-1)+Ciaone.fib(n-2);
        }
    }
    private static int random_number(int a, int b){
        Random rand = new Random();
        int res = rand.nextInt();
        if (res <0) res=res*(-1);
        res = res%(b-a+1);
        res +=a;
        return res;
    }
}
