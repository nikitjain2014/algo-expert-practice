package com.nj.simple;

public class BstNodeDepthSolution1 {

    public static void main(String[] args){
        BstNodeDepthSolution1.BST root = new BstNodeDepthSolution1.BST(10);
        root.left = new BstNodeDepthSolution1.BST(5);
        root.left.left = new BstNodeDepthSolution1.BST(2);
        root.left.right = new BstNodeDepthSolution1.BST(5);
        root.left.left.left = new BstNodeDepthSolution1.BST(1);
        root.right = new BstNodeDepthSolution1.BST(15);
        root.right.left = new BstNodeDepthSolution1.BST(13);
        root.right.left.right = new BstNodeDepthSolution1.BST(14);
        root.right.right = new BstNodeDepthSolution1.BST(22);
    System.out.println("Binary Tree Depth Sum:"+bstNodeDepthSum(root));
    }

    static int depthHelper(BST root,int depth){
        if(root==null) return 0;
        return depth+depthHelper(root.left,depth+1)+depthHelper(root.right,depth+1);
    }

    static int bstNodeDepthSum(BstNodeDepthSolution1.BST root){
        int depthSum=0;
        depthSum=depthHelper(root,depthSum);

        return depthSum;
    }
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
