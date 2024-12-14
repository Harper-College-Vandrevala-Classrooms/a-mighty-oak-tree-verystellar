package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree tree;

  @BeforeEach
  void setUp() {
    tree = new OakTree();
  }

  @Test
  void itWorks() {
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
    Node nodeFour = new Node(cheeks);

    assertEquals(retrievedLeft.squirrel.getName(), squeaks.getName());
    assertEquals(retrievedRight.squirrel.getName(), fluffybutt.getName());
    assertEquals(nodeFour.left(), null);


  }
}
