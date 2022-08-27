package cristian.study.algorithms.Trees;

import java.util.Arrays;

public class BinaryTreeArray {
    String[]  arr;
    int lastUsedIndex;

    public BinaryTreeArray(int size)
    {
        lastUsedIndex = 0;
        arr = new String[size+1];
    }

    public boolean isFull()
    {
        return (arr.length == lastUsedIndex);
    }

    public void insert(String value)
    {
        if (!isFull())
        {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Successfully inserted " + value + " into binary tree");
        }

        System.out.println("array is full, can not insert into binary tree");
    }

    public void preOrder(int index)
    {
        if ( index > lastUsedIndex)
        {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(2*index);
        preOrder(2*index+1);
    }

    public void inOrder(int index)
    {
        if (index > lastUsedIndex)
        {
            return;
        }
        inOrder(2*index);
        System.out.print(arr[index] + " ");
        inOrder(2*index+1);
    }

    public void postOrder(int index)
    {
        if (index > lastUsedIndex)
        {
            return;
        }

        postOrder(2*index);
        postOrder(2*index+1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder()
    {
        int index = 1;
        for (int i = 1; i <= lastUsedIndex; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int search(String value)
    {
        for (int i = 1; i <= lastUsedIndex ; i++)
        {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public void delete(String value)
    {
        int index = search(value);
        System.out.println(index);
        if (index == -1)
            return;
        else
        {
            arr[index] = arr[lastUsedIndex];
            lastUsedIndex--;

            System.out.println("Node with value "+ value + " has been successfully deleted");
        }
    }

    public void deleteBT()
    {
        try
        {
            arr = null;
            System.out.println("The tree has been deleted successfully");
        } catch (Exception e)
        {
            System.out.println("There was an error deleting the tree");
        }
    }
}
