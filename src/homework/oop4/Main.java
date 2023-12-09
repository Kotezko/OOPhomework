package homework.oop4;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LlList<String> llList = new LlList<>();
        llList.addLast("qwe");
        llList.addLast("qwe");
        llList.addLast("qwe");
        llList.addLast("qwe");
        llList.add("232");
        llList.addFirst("332");

        llList.addLast("asd");
        System.out.println(llList.size()); //работает корректно
        //System.out.println(llList.getByIndex(0));
        System.out.println(llList.getLast()); // работает
        System.out.println(llList.getFirst()); //работает
        llList.print(llList.size()); //почему-то выдает ошибку если делать с головы
                                    // к хвосту, от хвоста к голове работает.







    }
}

