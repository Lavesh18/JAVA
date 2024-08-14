package recursion;

public class firstOccurenceAndLastOccurence {
    public static int first = -1;
    public static int last = -1;
    
    public static void findOccurence(String str,int idx,char elem)
    {
        //base case 
        if(idx == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == elem)
        {
            if(first == -1)
            {
                first = idx;
            }
            else{
                last = idx;
            }
        }

        findOccurence(str, idx+1, elem);
    }
    public static void main(String[] args) {
        //elem coming first and last index
        String ex = "abaacbdh";


        findOccurence(ex, 0, 'a');

        


    }
}
