package cristian.study.algorithms.bigONotation;

public class BigOInterviewQuestions {

    public static void main(String[] args)
    {
        BigOInterviewQuestions bigoInstantiation = new BigOInterviewQuestions();

        int[] array = {1,2,3,4};

        bigoInstantiation.spofArray(array);
    }

    public void spofArray(int[] array)
    {
        int sum = 0;
        int prod = 1;

        for (int i = 0; i < array.length ; i++)
        {
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++)
        {
            prod *= array[i];
        }

        System.out.printf("The sum of all elements in the array would be %d and the product would be %d\n",sum,prod);
    }
}
