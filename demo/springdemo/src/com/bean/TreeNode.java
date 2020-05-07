package com.bean;

/**
 *
 * @package com.bean
 * @author baiyutao
 * @date 2020/5/6 下午2:03
 * @version 1.0
 */
public class TreeNode {
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;
    private int value;

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode(int value){
        this.value = value;
    }
}
