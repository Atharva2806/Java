//15. Number In Word
//Write a method called printNumberInWord. The method has one parameter number which is the whole number.
// The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter
//number is 0, 1, 2, .... 9 or other for any other number including negative numbers.

public class NumberInWord
{
    public static void printNumberInWord(int number)
    {
        switch(number)
        {
            case 0-> System.out.println("Zero");
            case 1-> System.out.println("One");
            case 2-> System.out.println("Two");
            case 3-> System.out.println("Three");
            case 4-> System.out.println("Four");
            case 5-> System.out.println("Five");
            case 6-> System.out.println("Six");
            case 7-> System.out.println("Seven");
            case 8-> System.out.println("Eight");
            case 9-> System.out.println("Nine");
            default-> System.out.println("Other");

        }
    }
}
