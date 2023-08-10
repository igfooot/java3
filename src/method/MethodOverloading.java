package method;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(1,2 ));
        System.out.println(sum(1, 2, 3));
    }


    static int sum(int i, int j) {
        return i + j;
    }


    static int sum(int i, int j, int k) {
        return i + j + k;
    }

    static long sum(long i, long j, long k) {
        return i + j + k;
    }

}
