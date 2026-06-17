package P16;

import java.util.Stack;
import java.util.Iterator;

public class LoopCollection16 {
    public static void main(String[] args) {
    Stack<String> fruits = new Stack<>();
fruits.push("Banana"); 
fruits.add("Orange"); 
fruits.add("Watermelon"); 
fruits.add("Leci"); 
fruits.push("Salak"); 


for (String fruit : fruits) { 
    System.out.printf("%s ", fruit); 
}
System.out.println("\n" + fruits.toString()); 

while (!fruits.empty()) { 
    System.out.printf("%s ", fruits.pop()); 
}
fruits.push("Melon"); 
fruits.push("Durian"); 
System.out.println(""); 

for (Iterator<String> it = fruits.iterator(); it.hasNext();) { 
    String fruit = it.next(); 
    System.out.printf("%s ", fruit); 
}
System.out.println("");


fruits.stream().forEach(e -> { 
    System.out.printf("%s ", e);
});
System.out.println("");


for (int i = 0; i < fruits.size(); i++) { 
    System.out.printf("%s ", fruits.get(i)); 
}

fruits.set(fruits.size() - 1, "Strawberry");
System.out.println("Setelah elemen terakhir diganti: " + fruits.toString());

fruits.add("Mango"); 
        fruits.add("guava"); 
        fruits.add("avocado"); 
        java.util.Collections.sort(fruits); 
        System.out.println("Setelah ditambah 3 buah & di-sorting: " + fruits.toString());
}
}