package bit;

public class updateBit {
    public static void main(String[] args) {
        //update the 2nd bit (pos=1)  of a number n to 1 n = 0101

        //see if want to make 0 then it is clear 
        // if want to make 1 then it is set


        int n = 10;
        int pos = 2;

        int oper = 1;

        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
