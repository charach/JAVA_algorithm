package naver;

public class Main {

    final Integer aa;
    Main(){
        aa = 33;
    }

    static{
        System.out.println("hihi");
    }


    public static void main(String[] args) {
        
        int[][] ary= new int[4][6];
        System.out.println(ary.length);
        System.out.println(ary[0].length);
    }

}
