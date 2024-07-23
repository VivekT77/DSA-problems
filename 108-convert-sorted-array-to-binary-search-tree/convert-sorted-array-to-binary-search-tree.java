/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n= nums.length;
        if(n==0){       
            return null;
        }
        return help(nums,0,n-1);
    }

    public TreeNode help(int[] nums,int start,int end){   //to convert the array into BT find mid 
        if(start>end){          // and assign it as root & then do BS for left and right subtree
            return null;        
        }

        int mid =(start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums,start,mid-1);
        root.right = help(nums,mid+1,end);
        return root;
    }
}