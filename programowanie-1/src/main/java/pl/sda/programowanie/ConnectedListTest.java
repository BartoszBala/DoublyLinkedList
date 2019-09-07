package pl.sda.programowanie;

import HomeWork.ConnectedList;

public class ConnectedListTest {
    public static void main(String[] args) {
        HomeWork.ConnectedList<String> list = new ConnectedList<String>();
        list.add("pierwszy");
        list.add("drugi");
        list.add("trzeci");
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.size());


    }
}
