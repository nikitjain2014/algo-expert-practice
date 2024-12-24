package com.nj.simple;

public class FindClosestValueInBstSolution2 {
    public static void main(String[] args) {
        // System.out.println();

        FindClosestValueInBstSolution2.BST root = new FindClosestValueInBstSolution2.BST(10);
        root.left = new FindClosestValueInBstSolution2.BST(5);
        root.left.left = new FindClosestValueInBstSolution2.BST(2);
        root.left.right = new FindClosestValueInBstSolution2.BST(5);
        root.left.left.left = new FindClosestValueInBstSolution2.BST(1);
        root.right = new FindClosestValueInBstSolution2.BST(15);
        root.right.left = new FindClosestValueInBstSolution2.BST(13);
        root.right.left.right = new FindClosestValueInBstSolution2.BST(14);
        root.right.right = new FindClosestValueInBstSolution2.BST(22);
        int target=12;
int closest=findClosestValueInBST(root,5);
      System.out.println(closest);
    }
    public static int findClosestValueInBST(FindClosestValueInBstSolution2.BST root, int target){
        int closestValue=999999999;
        FindClosestValueInBstSolution2.BST currentNode=root;
        while(currentNode!=null){

            if(Math.abs(closestValue- currentNode.value)>Math.abs(currentNode.value-target)){
                closestValue= currentNode.value;
            }
            if(currentNode.value>target){
                currentNode=currentNode.left;
            }
            else if(currentNode.value==target){
                return closestValue;
            }
            else{
                currentNode=currentNode.right;
            }

        }

        return closestValue;
    }

    static class BST {
        public int value;
        public FindClosestValueInBstSolution2.BST left;
        public FindClosestValueInBstSolution2.BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
