//package sample;
//
//public class Hello {
//    public static void main(String[] args) {
//        System.out.println("hello, world");
//    }


/**
 *  Hello sample class
 *  main-method
 *  hello 를 출력하는 프로그램
 */
public class Hello {
    public static void main(String[] args) {
        char zero = '0';
        char three = 3 + '0';
        int i = '3' - '0';
        String str3 = 3.0 + "";
        double d3 = Double.parseDouble(str3);
        double res = d3 + 10;
        char c = "30".charAt(1);
        double result = (double) 7 / 4; // double 을 자동 항변환 전에 넣어줘야 정확한 수가 나온다.
        System.out.println("result = " + result);
        System.out.printf("i = %d and double d3 = %4.1f\n",i, d3);
    }
}

// 식별자 안에는  + - 를 쓰면 안된다
// 자바 키워드를 사용하면 안된다
// 길이에는 제한이 없다




