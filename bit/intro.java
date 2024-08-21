package bit;

public class intro {
    public static void main(String[] args) {
        //get => want to know at any index bit 
        //set=>want to set any bit make it as 1 
        //clear=>want to make it as 0
        //update=> update any bit



        //get bit
        //n=0101 = 5

        // we calculate bit from right always 

        //process = bit mask (1<<i) and then AND Operation
        //ques=>get the 3rd bit (pos=3) of a number n (m= 0101)

        //that means in bit mask 0001 << 3 that is 1000
        // now perform AND with n that is  0 0 0 0 


        int n = 5;

        int pos = 2;

        int bitMask = 1<<2;

        if((bitMask & n)==0)
        {
            System.out.println("bit is zero");
        }
        else
        {
            System.out.println("bit is 1");
        }
    }
}
