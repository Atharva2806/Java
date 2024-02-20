//9. Centimeter Conversion
//
//Write a method convertToCentimeters which converts and returns Centimeters of the given input.
//
//User calling: convertToCentimeters(5, 8) ==> 5 feet and 8 inches
//User calling: convertToCentimeters(68) ==> 68 inches


//1 inch = 2.54 cm
//1 foot = 12 inches;
public class LengthUnit
{
    public double convertToCentimeters(int feet,int inch)
    {
        double cm=0;
        cm=(feet*30.48)+(inch*2.54);
        return cm;

    }
    public double convertToCentimeters(int inch)
    {
        double cm=0;
        cm=inch*2.54;
        return cm;
    }

}
