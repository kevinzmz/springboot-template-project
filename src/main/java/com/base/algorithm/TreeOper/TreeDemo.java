package com.base.algorithm.TreeOper;

/**
 * <p>树遍历</p>
 *
 * @author kevin
 * @create 2018-05-02 11:41
 **/
public class TreeDemo {
    public static void main(String[] args) {
        Tree tree = new Tree("1");
        Tree treeleft = new Tree("2");
        Tree treeright = new Tree("3");
        Tree treerl = new Tree("4");
        Tree treerr = new Tree("5");

        treeright.setLeft(treerl);
        treeright.setRight(treerr);
        tree.setLeft(treeleft);
        tree.setRight(treeright);

        TreeWrapper.getPreOrderResult(tree);
        System.out.println();
        TreeWrapper.getInOrderResult(tree);
        System.out.println();
        TreeWrapper.getPostOrderResult(tree);

        Tree onetree = new Tree("1");
        Tree onetreel = new Tree("2");
        Tree onetreer = new Tree("3");
        Tree onetreell = new Tree("4");
        Tree onetreelr = new Tree("5");

        onetree.setLeft(onetreel);
        onetree.setRight(onetreer);
        onetreel.setLeft(onetreell);
        onetreel.setRight(onetreelr);

        System.out.println();
        TreeWrapper.getPreOrderResult(onetree);
        System.out.println();
        TreeWrapper.getInOrderResult(onetree);
        System.out.println();
        TreeWrapper.getPostOrderResult(onetree);
    }
}
