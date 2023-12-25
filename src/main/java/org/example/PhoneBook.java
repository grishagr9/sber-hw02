package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> book;

    public PhoneBook(){
        book = new HashMap<>();
    }

    public void add(String surname, String phone){
        if(book.containsKey(surname)){
            book.put(surname, book.get(surname)+"\n"+phone);
        }else{
            book.put(surname, phone);
        }
    }

    public String get(String surname){
        return book.get(surname);
    }
}
