public class Ciaone {
    void main() {
        System.out.println("ciaone");
        System.out.println(Ciaone.fib(3));
    }
    private static int fib(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            return Ciaone.fib(n-1)+Ciaone.fib(n-2);
        }
    }
}
