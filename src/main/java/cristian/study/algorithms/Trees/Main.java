package cristian.study.algorithms.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)
    {
        TreeNode drinks = new TreeNode("drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");

        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");

        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);

        cold.addChild(wine);
        cold.addChild(beer);

        System.out.println(drinks.print(0));
        System.out.println("\n");
        System.out.println("We are now going to work with binary trees");
        BinaryNode N1 = new BinaryNode();
        BinaryNode N2 = new BinaryNode();
        BinaryNode N3 = new BinaryNode();
        BinaryNode N4 = new BinaryNode();
        BinaryNode N5 = new BinaryNode();

        N1.value = "N1";
        N1.left = N2;
        N1.right = N3;

        N2.value = "N2";
        N2.left = N4;
        N2.right = N5;

        N3.value = "N3";
        N3.left = null;
        N3.right = null;

        N4.value = "N4";
        N4.left = null;
        N4.right = null;


        N5.value = "N5";
        N5.left = null;
        N5.right = null;

        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
        binaryTreeLL.root = N1;

        binaryTreeLL.preOrderTraversal(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.inOrder(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.postOrder(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.levelOrder();
        System.out.println();
        binaryTreeLL.search("N7");
    }


}