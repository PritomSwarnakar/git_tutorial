@FunctionalInterface
interface M {
    public int mul(int i,int j);
}

public class Multi{
    public static void main(String[] args) {
        M m=(i,j)->(i*j);
        System.out.println(m.mul(10, 5));
    }
}