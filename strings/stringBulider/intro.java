package strings.stringBulider;

public class intro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("lavesh");

        //particular index
        System.out.println(sb.charAt(2));


        //set char at index

        sb.setCharAt(4, 'T');
        System.out.println(sb);

        //insert any character

        sb.insert(0, "tony");

        System.out.println(sb);


        // delete character

        sb.delete(2, 3);
        System.out.println(sb );

        //append is at last

        sb.append('t');
        System.out.println(sb);

    }
}
