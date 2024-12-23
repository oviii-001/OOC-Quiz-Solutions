package Quiz_4;

import java.util.ArrayList;
import java.util.Collections;

public class Ques_2 {
    public static void main(String[] args) {

        ArrayList<String> capstoneProjectGroup = new ArrayList<>();
        capstoneProjectGroup.add("Mike");
        capstoneProjectGroup.add("Mina");
        capstoneProjectGroup.add("Rasel");
        capstoneProjectGroup.add("Rony");
        capstoneProjectGroup.add("Jack");

        ArrayList<String> oopProjectGroup = new ArrayList<>();
        oopProjectGroup.add("Jack");
        oopProjectGroup.add("Rasel");
        oopProjectGroup.add("Tony");
        oopProjectGroup.add("Mike");
        oopProjectGroup.add("Mina");

        Collections.sort(capstoneProjectGroup);
        Collections.sort(oopProjectGroup);

        System.out.println("Sorted Capstone Project Group: " + capstoneProjectGroup);
        System.out.println("Sorted OOP Project Group: " + oopProjectGroup);

        if (capstoneProjectGroup.equals(oopProjectGroup)) {
            System.out.println("Both groups consist of the same students.");
        } else {
            System.out.println("The groups have different students.");
        }

        if (capstoneProjectGroup.contains("Alice") || oopProjectGroup.contains("Alice")) {
            System.out.println("Alice is a member of one of the groups.");
        } else {
            System.out.println("Alice is not a member of either group.");
        }
    }
}


