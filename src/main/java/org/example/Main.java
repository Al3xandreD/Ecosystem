package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Frog mafrog=new Frog(30, 10, 10);
        Fly mafly=new Fly(25,10,30);
        Ecosys monecosys=new Ecosys(50,50,3,100, 20);

//        String a=mafrog.toString();
//        System.out.println(a);
//
//        String b= mafly.toString();
//        System.out.println(b);

        String c=monecosys.toString();
        System.out.println(c);
        }
    }