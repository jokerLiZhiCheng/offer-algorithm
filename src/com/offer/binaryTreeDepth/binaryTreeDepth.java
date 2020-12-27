package com.offer.binaryTreeDepth;

import com.offer.model.TreeNode;

public class binaryTreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lval=TreeDepth(root.left);
        int rval=TreeDepth(root.right);
        return lval>rval ? lval+1 : rval+1;
    }
}
