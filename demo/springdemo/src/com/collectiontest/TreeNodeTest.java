package com.collectiontest;

import com.bean.TreeNode;
import com.bean.TreeRoot;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/6 下午2:33
 * @version 1.0
 */
public class TreeNodeTest {
    public static void main(String[] args) {
        int[] arrays = {2, 3, 1, 4, 5};
        TreeRoot root = new TreeRoot();
        for (int value : arrays) {
            createTree(root, value);
        }
        preTraverseBTree(root.getTreeRoot());
    }

    public static void createTree(TreeRoot treeRoot, int value) {
        if (treeRoot.getTreeRoot() == null) {
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        } else {
            //获取根节点值
            TreeNode tempRoot = treeRoot.getTreeRoot();
            //当前值与根值进行对比
            while(tempRoot != null){
                if (value > tempRoot.getValue()) {
                    //继续判断右节点是否有值
                    if (tempRoot.getRightTreeNode() == null) {
                        //直接插入
                        tempRoot.setRightTreeNode(new TreeNode(value));
                        return;
                    } else {
                        //获取右节点值
                        tempRoot = tempRoot.getRightTreeNode();
                    }
                } else {
                    //继续判断左节点是否有值
                    if (tempRoot.getLeftTreeNode() == null) {
                        //直接插入
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    } else {
                        //获取左节点值
                        tempRoot = tempRoot.getLeftTreeNode();
                    }
                }
            }

        }
    }

    /**
     * 中序遍历
     * @param rootTreeNode  根节点
     */
    public static void inTraverseBTree(TreeNode rootTreeNode) {

        if (rootTreeNode != null) {

            //访问左节点
            inTraverseBTree(rootTreeNode.getLeftTreeNode());

            //访问根节点
            System.out.println(rootTreeNode.getValue());

            //访问右节点
            inTraverseBTree(rootTreeNode.getRightTreeNode());
        }
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
