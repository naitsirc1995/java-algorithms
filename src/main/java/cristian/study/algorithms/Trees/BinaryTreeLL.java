package cristian.study.algorithms.Trees;

import javax.management.Query;
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


    public void insert(String value)
    {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();

        if (root == null)
        {
            root = newNode;
            System.out.println("The node with " + newNode.value + " has been successfully inserted into the tree");
            return;
        }

        queue.add(root);

        while (!queue.isEmpty())
        {
            BinaryNode presentNode = queue.remove();

            if (presentNode.left == null)
            {
                presentNode.left = newNode;
                System.out.println("The node with value " + newNode.value + " has been successfully inserted");
                break;
            } else if (presentNode.right == null)
            {
                presentNode.right = newNode;
                System.out.println("The node with value " + newNode.value + " has been successfully inserted");
                break;
            } else
            {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }


        }
    }

    public BinaryNode getDeepestNode()
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        BinaryNode presentNode = null;
        queue.add(root);
        while (!queue.isEmpty())
        {
            presentNode = queue.remove();
            if (presentNode.left != null) queue.add(presentNode.left);
            if (presentNode.right != null) queue.add(presentNode.right);
        }

        return presentNode;
    }

    public void deleteDeepestNode()
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        BinaryNode previousNode, presentNode = null;
        queue.add(root);

        while (!queue.isEmpty())
        {
            previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.left == null)
            {
                previousNode.right = null;
            } else if (presentNode.right == null)
            {
                presentNode.left = null;
            } else
            {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }


    public void deleteNode(String value)
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value)
            {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node with value " + value + " has been successfully deleted");
                return;
            }

            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
        System.out.println("Node with value "+ value + " was never found");
    }

    public void deleteBT()
    {
        root = null;
        System.out.println("The binary tree has been successfully deleted");
    }

}