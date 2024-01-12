package com.cetin.data;

import java.util.Stack;
//push    O(1)  son indis ekle.         Memory'de adresi belli olan son slot'a ekleme yapilir.
//pop     O(1)  son indis cikar.        Memory'de adresi belli olan son slot'tan çıkarma yapilir.
//peek    O(1)  son indis gösterilir.   Memory'de adresi belli olan son slot gosterilir.

// LIFO'a gore calisan prensip.
// Sadece sona ekle ve sondan sil.
public class StackEx {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.add('c');
        stack.add('d');

        System.out.println("-----------------PEEK----------------------------");

        System.out.println(stack.peek());

        System.out.println("-----------------LIST-------------------------");

        System.out.println(stack);

        System.out.println("------------------POP---------------------------");

        stack.pop();
        System.out.println(stack);

        System.out.println("------------------PEEK---------------------------");

        System.out.println(stack.peek());

        System.out.println("-------------------ADD X to stack.size()  SEARCH B--------------------------");

        stack.add(stack.size(), 'x');
        System.out.println(stack.search('b'));

        System.out.println("-------------------PEEK--------------------------");

        System.out.println(stack.peek());

        System.out.println("--------------------forEachRemaining-------------------------");
        stack.elements().asIterator().forEachRemaining(System.out::println);

        System.out.println("---------------------LIST------------------------");
        System.out.println(stack);

        System.out.println("----------------------FIRST ELEMENT-----------------------");
        System.out.println(stack.firstElement());

    }
}
