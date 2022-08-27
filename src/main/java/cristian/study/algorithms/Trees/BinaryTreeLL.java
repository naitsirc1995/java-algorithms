package cristian.study.algorithms.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL()
    {
        this.root = null;
    }

    public void preOrderTraversal(BinaryNode node)
    {
        if (node == null)
        {
            return;
        }
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrder(BinaryNode node)
    {
        if (node == null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node)
    {
        if (node == null)
        {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder()
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null)
            {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null)
            {
                queue.add(presentNode.right);
            }
        }
    }

    public void search(String value)
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value)
            {
                System.out.println("the value " + value + " was found in the tree");
                return;
            } else
            {
                if (presentNode.left != null)
                {
                    queue.add(presentNode.left);
                }

                if (presentNode.right != null)
                {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value " +  value +  " was not found in the tree");
        return;
    }


}