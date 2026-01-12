package com;
import java.util.ArrayList;
public class ListService {
	public int getListSize() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        return list.size();
    }
}
