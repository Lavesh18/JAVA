package recursion.advanced;

public class placeTilesOfSize {
    public static int countpaths(int n,int m)
    {
        //base case 
        //so suppose if n==m then there will be only 2 ways either horizontal all or vertical all
        //if n<m then only one way all horizontal cause vertical is not possible
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        //when you do vertical then for n remaining will be n-m
        //when you do horizontally then for n remaining will be n-1 cause tile is 1*m
        int verticalPaths = countpaths(n-m, m);

        int horizontallPaths = countpaths(n-1, m);


        return verticalPaths+horizontallPaths;
    }
    public static void main(String[] args) {
        //place tiles of size 1*m in a floor of size n*m
        //need number of ways
        
        int n = 2;
        int m = 2;

        System.out.println(countpaths(n, m));
    }
}
