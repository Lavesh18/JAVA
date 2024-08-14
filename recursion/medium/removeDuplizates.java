package recursion;

public class removeDuplizates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str,int idx , String newString)
    {
        //base case 
        if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a'])
        {
            removeDuplicates(str, idx+1, newString);
        }else{
            newString+=curr;
            map[curr-'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
        
    }
    public static void main(String[] args) {
        String str = "abbcbd";
        //we will create an array with mapiing of idx in alphabet 0 to 25
        //the array will be of boolean so all wil be initially false
        //so suppose if you do currchar - 'a' the you will get the index of the map and make it true
        //now if map index true then don't add to new string if not then add and then make map as true

        //Time Complexity O(n)
        removeDuplicates(str, 0, "");
    }
}
