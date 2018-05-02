package com.base.algorithm.TreeOper;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-02 11:39
 **/
public class TreeWrapper {
    /**
     * 中序遍历
     * @param tree
     * @return
     */
    public static void getInOrderResult(Tree tree){
        if(tree==null){
            return ;
        }
        String result = tree.getCargo().toString();

        getInOrderResult(tree.getLeft());
        System.out.print(result);
        getInOrderResult(tree.getRight());
    }

    /**
     * 前序遍历
     * @param tree
     * @return
     */
    public static void getPreOrderResult(Tree tree){
        if(tree==null){
            return ;
        }
        String result = tree.getCargo().toString();

        System.out.print(result);
        getPreOrderResult(tree.getLeft());
        getPreOrderResult(tree.getRight());
    }

    /**
     * 后序遍历
     * @param tree
     * @return
     */
    public static void getPostOrderResult(Tree tree){
        if(tree==null){
            return ;
        }
        String result = tree.getCargo().toString();

        getPostOrderResult(tree.getLeft());
        getPostOrderResult(tree.getRight());
        System.out.print(result);
    }
}
