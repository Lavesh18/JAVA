package recursion.advanced;

public class printKeypadCombo {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void combo(String numStr,int idx,String combination)
    {
        //base case 
        if(idx==numStr.length())
        {
            System.out.println(combination);
            return;
        }
        char curr = numStr.charAt(idx);
        //check which number is pressed 
        //now in index check what are the characters 
        String mapping = keypad[curr-'0'];
        //run a loop in that string 
        for(int i=0;i<mapping.length();i++)
        {
            combo(numStr, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String numStr = "23";

        combo(numStr, 0, "");
    }
}
