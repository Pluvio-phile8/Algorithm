/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;
/**
 *
 * @author User
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void visit(Node p){
        if (p == null) return;
        System.out.println(p.info + " ");
    }
    
    //return a Node which has a key = given key in the tree p
    public Node search(Node p, int key){
        if (p == null) return null;
        if (p.info == key) return p;
        else if (p.info > key) return search(p.left, key);
        else return search(p.right, key);
    } 
    
    //insert a key x to the tree
    public void insert(int x){
        Node p = new Node(x);
        Node f = null, q = root;
        while (q != null){
            if(p.info == x) {
                System.out.println("Key cannot be duplicated...");
                return;
            }
            if (q.info < x) {
                f = q;
                q = q.right;
            } else {
                f = q;
                q = q.left;
            }
            
        }
        if (f == null) root = p;
        else if (p.info > f.info) f.right = p;
        else f.left = p;
    }
    //preorder the tree
    public void preOrder(Node p){
        if (p == null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    //postorder the tree
    public void postOrder(Node p){
        if (p == null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    //inorder the tree
    public void inOrder(Node p){
        if (p == null) return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    
}
