/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab6_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePrinter {
    private static String result;

    public String getPrintedTree() {
        return result;
    }
    
    public static <T extends Comparable<?>> String printNode(Node<T> root) {
        result = "";
        int maxLevel = BinaryTreePrinter.maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
        return result;
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BinaryTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BinaryTreePrinter.printWhitespaces(firstSpaces);

        List<Node<T>> newNodes = new ArrayList<Node<T>>();
        for (Node<T> node : nodes) {
            if (node != null) {
                result += node.data;
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                result += " ";
            }

            BinaryTreePrinter.printWhitespaces(betweenSpaces);
        }
        result += "<br/>";

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BinaryTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BinaryTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    result += "/";
                else
                    BinaryTreePrinter.printWhitespaces(1);

                BinaryTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    result += "\\";
                else
                    BinaryTreePrinter.printWhitespaces(1);

                BinaryTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }
            result += "<br/>";
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            result += " ";
    }

    private static <T extends Comparable<?>> int maxLevel(Node<T> node) {
        if (node == null)
            return 0;

        return Math.max(BinaryTreePrinter.maxLevel(node.left), BinaryTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
}

