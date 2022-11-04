package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncTest {

    public static void main(String [] args) {
        MyFunction2 f = (a, b) -> a > b ? a : b;

        //MyFunction3 f2 = () -> System.out.println();

        // etc.Student student = new etc.Student("김철수", 20);
        // etc.Student student2 = new etc.Student("나희도", 23);

        Student student = new Student("dd", 20);
        student.setName("김철수");

        int value = f.max(4, 7);
        System.out.println(value);

        List<String> strList = Arrays.asList("ccc", "aaa", "bbb");
        Collections.sort(strList, (s1, s2) -> s1.compareTo(s2));
        System.out.println(strList);


        Function<String, String> fstr = i -> i + "하십니까";
        String str = fstr.apply("안녕");
        System.out.println(str);
        System.out.println("이름 : " + student.getName() + " , " +"나이 : " + student.getAge());
        

        /* 함수형 패키지 */
        Supplier<Integer> random = () -> (int)(Math.random()*100) + 1;
        System.out.println(random.get());
        Consumer<Integer> consumer = i -> System.out.println(i + ",");
        consumer.accept(5);
        Function<Integer, Integer> func = i -> i*300;
        consumer.accept(func.apply(50));



    }
    
}

 class Student{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

@FunctionalInterface
interface MyFunction2 {
    int max(int a, int b);
}

@FunctionalInterface
interface MyFunction3 {
    void run();
}

