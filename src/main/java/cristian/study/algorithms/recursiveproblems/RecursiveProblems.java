package cristian.study.algorithms.recursiveproblems;



public class RecursiveProblems {

    public static void main( String[] args )
    {
        RecursiveProblems recursiveProblems = new RecursiveProblems();

        System.out.printf("The sum of the digits of 132 would be %d\n", recursiveProblems.sumofDigits(132) );
        System.out.printf("Now, notice that the 2³ = %d\n", recursiveProblems.power(2,3));
        System.out.printf("Now, notice that the gcd of 4,8 would be %d\n",recursiveProblems.gcd(4,8));
        System.out.printf("Now, notice that the conversion to binary of 10 would be %d\n",recursiveProblems.decimalToBinary(10));
    }

    /*
    *Lets bein with the following problem, you want to find the sum of digits for any number, something like this.
    * sumofDigits(132) = 1+3+2 = 6
    *
    *  */
    public int sumofDigits(int n)
    {
        if (n <= 0)
        {
            return 0;
        } else
        {
            return n%10 + sumofDigits(n/10);
        }
    }


    /*
    * Now how to calculate the power of a number using recursion*/

    public int power(int base, int exp)
    {
        if (exp < 0)
        {
            return 1/power(base,-exp);
        }
        if (exp == 0)
        {
            return 1;
        } else
        {
            return base * power(base,exp-1);
        }
    }

    /*
    * Now the next problem will be about understanding how to find the gcd of two numbers.
    *
    * The most important is the following. Notice that Euclides does the following.
    *
    * gcd(a,0) = a
    * gcd(a,b) = gcd(b, a%b)
    *
    * That's the main idea
    * */

    public int gcd(int a,int b)
    {
        if (a < 0 || b < 0 )
        {
            return -1;
        }
        if (b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b , a%b);
        }
    }



    /*
    * Now, the next problem would be to convert a decimal to binary, here's a possible solution*/

    public int decimalToBinary(int n)
    {
        if (n < 0)
        {
            return -1;
        }
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return n%2 + 10*decimalToBinary(n/2);
        }
    }





}