package com.company;
/*
 *@author Nico McFarlane
 *@Student ID 7001811
 *@version 1.0 (10/18/2021)                                                        */
public class Node {
    int ID;
    String name;
    String address;
    String contact;

    Node left;
    Node right;

    Node(int ID, String name, String address, String contact){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
}
