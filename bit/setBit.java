package bit;

public class setBit {
    public static void main(String[] args) {
        //for set we have to perform OR

        //covert n = 5 to n=7 using bit 
        //so 0101 to 0111 
        //or set the second bit position (pos=1) of a number

        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
