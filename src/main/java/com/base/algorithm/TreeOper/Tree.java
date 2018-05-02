package com.base.algorithm.TreeOper;

/**
 * <p>树</p>
 *
 * @author kevin
 * @create 2018-05-02 11:37
 **/
public class Tree {
    private String cargo;
    private Tree left;
    private Tree right;

    public Tree(){}

    public Tree(String cargo) {
        this.cargo = cargo;
    }

    public Tree(String cargo, Tree left, Tree right) {
        this.cargo = cargo;
        this.left = left;
        this.right = right;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}
