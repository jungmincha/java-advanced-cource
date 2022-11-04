package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String , Student> hashMap = new HashMap<>();

        List<Location> list = new ArrayList<>();

        list.add(new Location("seoul", 101010, 202020));
        list.add(new Location("suwon", 201010, 302020));

        for(int i = 0 ; i <= list.size()-1 ; i ++){
            System.out.println(list.get(i).getCity());
            System.out.println(list.get(i).getLat());
            System.out.println(list.get(i).getLon());
        }

        hashMap.put("황기태", new Student("황기태", "java", 4, 100));
        hashMap.put("이재문", new Student("이재문", "안드로이드", 2, 80));

       // hashMap.get("황기태");
       // hashMap.get("이재문");


        for(String s : hashMap.keySet()){
           System.out.println(hashMap.get(s).getName());
           System.out.println(hashMap.get(s).getClassNum());
           System.out.println(hashMap.get(s).getAvgScore());
           System.out.println(hashMap.get(s).getMajor());
        }
    }
}
