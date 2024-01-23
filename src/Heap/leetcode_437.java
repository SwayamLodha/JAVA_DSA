package Heap;

public class leetcode_437 {
	public static void main(String[] args) {}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int pathSum(TreeNode root, int targetSum) {
		if (root == null)
			return 0;
		int root_sum = countnumberofpath(root, targetSum);
		int left = pathSum(root.left, targetSum);
		int right = pathSum(root.right, targetSum);
		return root_sum + left + right;
	}

	public int countnumberofpath(TreeNode root, int targetsum) {
		if (root == null)
			return 0;
		int ans = 0;
		if (targetsum - root.val == 0)
			ans++;
		ans = ans + countnumberofpath(root.left, targetsum - root.val);
		ans = ans + countnumberofpath(root.right, targetsum - root.val);
		return ans;
	}
}
