package cristian.study.algorithms.arrays;

public class SingleDimensionalArray {

    int arr[] = null;

    public SingleDimensionalArray(int sizeOfArray)
    {
        arr = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location,int valueToBeInserted)
    {
        try{
            if (arr[location] == Integer.MIN_VALUE)
            {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else
            {
                System.out.println("The cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access array");
        }
    }


    public void traverseArray()
    {
        try
        {
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.print("\n");
        } catch (Exception e)
        {
            System.out.println("Array no longer exists");
        }
    }

    public void searchIntArray(int valueToBeSearched)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == valueToBeSearched)
            {
                System.out.println("Value is found at index of " + i);
                return;
            }
        }
        System.out.println("Value is not found");
    }

    public void deleteValue(int valueToBeDeleted)
    {
        try
        {
            arr[valueToBeDeleted] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The value that is provided is not in the range of array");
        }
    }
}
