public class ProductOfNumbers
{
    public static int prodOfDigits(int N)
    {
        if (N/10 == 0)
            return N;
        else
            return (N%10) * prodOfDigits(N/10);
    }
}
