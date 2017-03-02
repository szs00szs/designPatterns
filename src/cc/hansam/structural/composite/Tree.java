package cc.hansam.structural.composite;

/**
 * @author 时帅帅 945210972@qq.com
 * @version 创建时间：2016年9月3日 下午3:26:17
 */
public class Tree {
	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");

	}
}
