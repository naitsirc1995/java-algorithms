package cristian.study.algorithms.arrays;

public class TwoDimensionalArray {

    int arr[][] = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns)
    {
        this.arr = new int[numberOfRows][numberOfColumns];

        for (int i = 0 ; i < numberOfRows; i++)
        {
            for (int j = 0; i < numberOfColumns; i++)
            {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void inserValueInTheArray(int row,int col, int value)
    {
        try
        {
            if (arr[row][col] == Integer.MIN_VALUE)
            {
                arr[row][col] = value;
                System.out.println("The Value is successfully inserted");
            } else
            {
                System.out.println("The cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void accessCell(int row, int col)
    {
        System.out.println("\nAccessing Row#"+row+", Col#"+col);
        try
        {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index for 2D Array");
        }
    }

    public void traverse2DArray()
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; row < arr[0].length ; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
        }

        System.out.println();
    }

    public void searchingValue(int value)
    {
        for (int row = 0; row < arr.length ; row++)
        {
            for (int col = 0; col < arr.length ; col++)
            {
                if (arr[row][col] == value)
                {
                    System.out.println("Value was found in row "+ row + " and column " + col);
                }
            }
        }

        System.out.println("Value was not found");
    }

    public void deleteValueFromArray(int row, int col)
    {
        try
        {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Successfully Deleted element at row " + row + " and col " + col);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("This index is not valid for array");
        }
    }
}
