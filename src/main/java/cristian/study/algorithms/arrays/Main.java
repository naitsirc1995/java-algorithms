package cristian.study.algorithms.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        SingleDimensionalArray myarr = new SingleDimensionalArray(3);

        myarr.insert(2,3);
        myarr.insert(1,1);
        myarr.insert(1,4);
        myarr.insert(0,2);
        myarr.insert(5,4);

        System.out.println("Array Traversal");
        myarr.traverseArray();

        System.out.println("Look for element");
        myarr.searchIntArray(1);

        // Now deleting a value
        myarr.deleteValue(0);
        myarr.traverseArray();


        // Now a two dimensional array

        String s2DArray[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));
    }

}
