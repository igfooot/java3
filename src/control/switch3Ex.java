package control;

import java.util.Scanner;

public class switch3Ex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bio = in.nextLine();
        String kind = "";
        if (bio.equals("호랑이") || bio.equals("사자")){
            kind = "포유류";
        } else if (bio.equals("독수리") || bio.equals("참새")){
            kind = "조류";
        }
        System.out.printf("%s는 %s입니다. \n", bio, kind);
        System.out.println("동물의 이름을 입력하세요");
        switch(bio) {
            case "호랑이":
            case "사자":
                kind = "포유류";
                break;
            case "독수리":
            case "참새":
                kind = "조류";
                break;
            default:
                kind = "해당없음";
                break;
        }
        System.out.printf("%s는 %s입니다. \n", bio, kind);
    }
}
