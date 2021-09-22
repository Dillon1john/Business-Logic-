package edu.citytech.cst.project.ds;

class Node<T extends Comparable<T>> {
    T value;
    int data;

    Node<T> leftChild;
    Node<T> rightChild;

     Node(T value){ this.value=value; }

    Node(int data){
         this.data = data;
         leftChild = null;
         rightChild = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
