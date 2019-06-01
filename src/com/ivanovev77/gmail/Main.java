package com.ivanovev77.gmail;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
        list.add("gamma");
        System.out.println(list);
        Iterator<String>iter =list.iterator();
        while (iter.hasNext()){
            String string=iter.next();
            System.out.println(string);
        }
    }
}
