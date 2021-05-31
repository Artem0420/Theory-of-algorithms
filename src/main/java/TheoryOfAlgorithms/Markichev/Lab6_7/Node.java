/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab6_7;

class Node<T extends Comparable<?>> {
    Node<T> left;
    Node<T> right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}
