
package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("OM");
        list.add("NA");
        list.add("MCT");
        list.add("IC");
        list.add("BSSW");
        list.add("BSIS");
        list.add("BSAT");
        list.add("BSA");
        list.add("ACT");
        list.add("ABB");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        System.out.println("Courses:");
        for (String str: list) {
            System.out.println(str);
        }
        
    }
    
}
