package dsa.intrermediate2;

import java.util.ArrayList;

public class TreeDataStructure {
    public static void main(String[] args) {
        System.out.println("harsh");
    }

    /**
     * Given a binary tree, return the inorder traversal of its nodes' values.
     * <p>
     * NOTE: Using recursion is not allowed.
     */
    private static ArrayList list = new ArrayList();

    public static ArrayList q1Recursion(TreeNode A) {
        inorderTraversal(A);
        return list;
    }

    public static void inorderTraversal(TreeNode A) {
        if (A == null)
            return;
        inorderTraversal(A.left);
        list.add(A.val);
        inorderTraversal(A.right);
    }

    public static ArrayList q1Normal(TreeNode A) {
        TreeNode current, node;
        ArrayList<Integer> res = new ArrayList<>();
        current = A;
        while (current != null) {
            if (current.left == null) {
                res.add(current.val);
                current = current.right;
            } else {
                node = current.left;
                while (node.right != null && !current.equals(node.right))
                    node = node.right;

                if (node.right == null) {
                    node.right = current;
                    current = current.left;
                } else {
                    current = node.right;
                    node.right = null;
                    res.add(current.val);
                    current = current.right;
                }
            }
        }
        return res;
    }


    public static ArrayList q2Normal(TreeNode A) {
        TreeNode current, node;
        ArrayList<Integer> res = new ArrayList<>();
        current = A;
        while (current != null) {
            if (current.left == null) {
                res.add(current.val);
                current = current.right;
            } else {
                node = current.left;
                while (node.right != null && !current.equals(node.right))
                    node = node.right;

                if (node.right == null) {
                    node.right = current;
                    current = current.left;
                } else {
                    current = node.right;
                    node.right = null;
                    res.add(current.val);
                    current = current.right;
                }
            }
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}