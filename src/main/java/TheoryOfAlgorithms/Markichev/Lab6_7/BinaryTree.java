/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab6_7;

public class BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }
    
    public void mirrorTree(Node root) {
        if(null == root) {
            return;
        }
        mirrorTree(root.left);
        mirrorTree(root.right);
        Node swapNode = root.left;
        root.left = root.right;
        root.right = swapNode;
        return;
    }
    
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < (int)current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > (int)current.data) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    
    public void add(int value) {
        root = addRecursive(root, value);
    }
    
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == (int)current.data) {
            return true;
        } 
        return value < (int)current.data
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }
    
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
}

