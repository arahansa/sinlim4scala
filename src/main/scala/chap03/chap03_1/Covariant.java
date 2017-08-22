package chap03.chap03_1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lucas.choi on 2017. 8. 18..
 *
 * 배열은 공변자료형 Object[] <- String[]
 *
 * 공변자료형과
 * 불변자료형..
 */
public class Covariant {

    public static void readList(List<Object> list){
        list.forEach(n-> System.out.println("n : "+n));
    }

    public static void main(String[] args) {

        List<String> a = Arrays.asList("1", "2");
        //Covariant.readList(a); 타입이 맞지 않아 에러. 불변자료형

        Object[] objects = new String[10]; // 공변자료형
        // List<Object> objectList = new ArrayList<String>(); // 불변자료형

    }
}
