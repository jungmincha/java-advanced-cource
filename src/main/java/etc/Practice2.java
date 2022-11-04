package etc;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

    public static void main(String args []) {

        Practice2 obj = new Practice2();    
        obj.repeatMe("sun", "ogu", "hs", "jm");
    }
    public void repeatMe(String name, String name2 ,String name3 , String name4) {

        String[] arr = {name, name2, name3, name4};

        List<String> arr3 = new ArrayList<>();
        for(String str : arr){
            arr3.add(str);
        }
        System.out.println(arr3);
    }  
}


// package main

// import "fmt"

// func repeatMe(name ...string) {
//    fmt.Println(name)
// }

// func main() {
//    repeatMe("sun", "ogu", "hs", "jm")
// }