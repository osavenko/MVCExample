package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        People people0 = new People("Albert", "Einstein", true);
        //People people1 = new People("Marie","Curie", false);
        ViewPeople view1 = new ViewPeople();

        ControlPeaple guiControl = new ControlPeaple(people0,view1);
        guiControl.startView();

        //System.out.println(people0);
        //System.out.println(people1);
    }
}
