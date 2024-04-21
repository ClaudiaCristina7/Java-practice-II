public class PrimitiveEX1 {
    public static void main(String[] args){

        //FIX ERRORS IN THE CODE

        int intValue1= 1;
       // int intValue2 = 5.1; Wrong value, as it is an Int type not Float
        int intValue2 = 5;

        long longValue1 = 150000;
        //long longValue2 = 10000000000000000000000000000000000L; - number too large
        long longValue2 = 1000000000000000000L;

        float floatValue1 = 1.3f;
        //float floatValue2 = 23.123123; Number not marked as a float
        float floatValue2 = 23.123123F;

        double doubleValue1 = 2.5d;
        double doubleValue2 = 123.443423;

        boolean booleanValue1 = true;
        // boolean booleanValue2 = 5; wrong value attributed. It can only be True or False
        boolean booleanValue2 = false;

        char charValue1 = 'a';
        //char charValue2 = 67c; Wrong value - Char type can only have one character, between quotation marks
        char charValue2 = 'c';

        System.out.println(intValue1);
        System.out.println(intValue2);
        System.out.println(longValue1);
        System.out.println(longValue2);
        System.out.println(floatValue1);
        System.out.println(floatValue2);
        System.out.println(doubleValue1);
        System.out.println(doubleValue2);
        System.out.println(booleanValue1);
        System.out.println(booleanValue2);
        System.out.println(charValue1);
        System.out.println(charValue2);
    }

}
