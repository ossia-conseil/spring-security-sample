package com.ossia.tests;

import java.util.ArrayList;
import java.util.List;

public class StringInliningTest {

    private static enum Types {A, B, C};
    private static class User {};

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //list.add(new User());

        String test1 = "test1";
        test1.intern();
        list.add(test1);

        list.add("test2");
        
        list.add("test1");
    }

}
