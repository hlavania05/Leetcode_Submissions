class Solution 
{
    StringBuilder smallest = null;
    public String smallestFromLeaf(TreeNode root) 
    {
        helper(root, "");
        return smallest.toString();
    }
    private void helper(TreeNode root, String s)
    {
        if(root==null)
        {
            return;
        }

        if(root.left==null && root.right==null)
        {
            s += (char)(97 + root.val);

            StringBuilder str = new StringBuilder(s);
            str.reverse();

            if(smallest == null)
                smallest = str;

            else if(str.compareTo(smallest) < 0)
                smallest = str;

            else
                return;
        }

        s += (char)(97 + root.val);

        helper(root.left, s);
        helper(root.right, s);
    }
}