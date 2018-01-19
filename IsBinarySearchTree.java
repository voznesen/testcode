public class IsBinarySearchTree {

  /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

  The Node class is defined as follows:*/
  class Node {
      int data;
      Node left;
      Node right;
   }

  boolean checkBST(Node root) {
    if (root == null) {
      return true;
    }
    if (root.left != null && root.data < root.left.data) {
      return false;
    }
    if (root.right != null && root.data > root.right.data) {
      return false;
    }
    if (! checkBST(root.left) || ! checkBST(root.right)) {
      return false;
    }
    return true;
  }
}