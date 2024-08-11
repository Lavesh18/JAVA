package bit;

public class clearBit {
    public static void main(String[] args) {
        //clear the 3rd bit (pos=2) of a number 0101
        // remember clear is to make bit 0



        //procedure 
        //1) bit mask
        //2) AND with NOT

        int n = 5;
         int pos = 2;

         int bitMask = ~(1<<pos);

        int newNumber = bitMask & n;

        System.out.println(newNumber);
         //how to get not of binary using this ~



    }
}
