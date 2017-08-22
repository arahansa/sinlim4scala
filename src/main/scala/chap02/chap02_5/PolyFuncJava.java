package chap02.chap02_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PolyFuncJava<T> {

    int findFirst(List<T> as, Predicate<T> p){
        return IntStream.range(0, as.size())
                .filter(n-> p.test(as.get(n)))
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        Predicate<Integer> a = n-> n==2;
        System.out.println(new PolyFuncJava<Integer>().findFirst(Arrays.asList(1,3,2,4,5), a));
        System.out.println(new PolyFuncJava<String>().findFirst(Arrays.asList("g,a,test".split(",")), n-> n.equals("test")));
        System.out.println(new PolyFuncJava<String>().findFirst(Arrays.asList("g,a,test".split(",")), n-> n.equals("5")));
    }
}
