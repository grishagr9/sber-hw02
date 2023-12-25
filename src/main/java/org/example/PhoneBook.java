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
        if(book.containsKey(surname)){
            Set<String> set = book.get(surname);
            set.add(phone);
            book.put(surname, set);
        }else{
            Set<String> set = new HashSet<>();
            set.add(phone);
            book.put(surname, set);
        }
    }

    public String get(String surname){
        return book.get(surname).toString();
    }
}
