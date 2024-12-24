package com.nj.simple;
import java.util.*;

public class FindClosestValueInBstSolution1  {
    public static void main(String[] args) {
        // System.out.println();

        BST root = new FindClosestValueInBstSolution1.BST(10);
        root.left = new FindClosestValueInBstSolution1.BST(5);
        root.left.left = new FindClosestValueInBstSolution1.BST(2);
        root.left.right = new FindClosestValueInBstSolution1.BST(5);
        root.left.left.left = new FindClosestValueInBstSolution1.BST(1);
        root.right = new FindClosestValueInBstSolution1.BST(15);
        root.right.left = new FindClosestValueInBstSolution1.BST(13);
        root.right.left.right = new FindClosestValueInBstSolution1.BST(14);
        root.right.right = new FindClosestValueInBstSolution1.BST(22);
        int target=12;

        System.out.println(findClosestValueInBst(root,12));
    }

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBSTHelper(tree, target, tree.value);
    }

    public static int findClosestValueInBSTHelper(BST tree, int target, int closest) {
//10 t=12
        BST currentNode = tree;
        while (currentNode != null) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                return closest;
            }

        }
        return closest;
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