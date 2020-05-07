package com.collectiontest;

import com.bean.TreeNode;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/6 下午2:03
 * @version 1.0
 */
public class TreeTest {
    public static void main(String[] args) {
        //根节点-->10
        TreeNode treeNode1 = new TreeNode(10);

        //右孩子-->20
        TreeNode treeNode3 = new TreeNode(20);

        //左孩子-->9
        TreeNode treeNode2 = new TreeNode(9);



        //20的左孩子-->15
        TreeNode treeNode4 = new TreeNode(15);

        //20的右孩子-->35
        TreeNode treeNode5 = new TreeNode(35);
        treeNode1.setLeftTreeNode(treeNode2);
        treeNode1.setRightTreeNode(treeNode3);
        treeNode3.setLeftTreeNode(treeNode4);
        treeNode3.setRightTreeNode(treeNode5);
        preTraverseBTree(treeNode1);
    }

    /**
     * 先序遍历
     * @param rootTreeNode  根节点
     */
    public static void preTraverseBTree(TreeNode rootTreeNode) {

        if (rootTreeNode != null) {

            //访问根节点
            System.out.println(rootTreeNode.getValue());

            //访问左节点
            preTraverseBTree(rootTreeNode.getLeftTreeNode());

            //访问右节点
            preTraverseBTree(rootTreeNode.getRightTreeNode());
        }
    }







}
