package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> book;

    public PhoneBook(){
        book = new HashMap<>();
    }

    public void add(String surname, String phone){
        if(!book.containsKey(surname)){
            book.put(surname, new HashSet<>());
        }
        book.get(surname).add(phone);
    }

    public String get(String surname){
        return book.get(surname).toString();
    }

    public void print(){
        for (var item:book.keySet()) {
            System.out.println(item + " " + book.get(item));
        }
    }
}
