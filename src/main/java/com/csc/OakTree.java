package com.csc;

public class OakTree  {
  public static void main(String[] args) {
    Squirrel cheeks = new Squirrel("Cheeks");
    Node nodeOne = new Node(cheeks);

    Squirrel squeaks = new Squirrel("Squeaks");
    Node nodeTwo = new Node(squeaks);

    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
    Node nodeThree = new Node(fluffybutt);

    nodeOne.set_left(nodeTwo);
    nodeOne.set_right(nodeThree);

    Node retrievedLeft = nodeOne.left(); // This should retrieve the left node
    Node retrievedRight = nodeOne.right(); // This should retrieve the right node

    System.out.println(retrievedLeft.squirrel.getName()); //should print squeaks
    System.out.println(retrievedRight.squirrel.getName()); //should print mr fluffy butt
  }
}
