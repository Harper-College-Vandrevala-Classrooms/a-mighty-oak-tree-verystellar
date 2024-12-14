package com.csc;

public class Node {
    Node left, right;
    Squirrel squirrel;

    Node(Node left, Node right, Squirrel squirrel) {
        this.left = left;
        this.right = right;
        this.squirrel = squirrel;
    }
    Node(Squirrel squirrel) {
        this.squirrel = squirrel;
        left = right = null;
    }
    void set_left(Node n){
        left = n;
    }
    void set_right(Node n){
        right = n;
    }
    Node left(){
        return left;
    }
    Node right(){
        return right;
    }
    Squirrel squirrel(){
        return squirrel;
    }
}
