package String;

public class Insertion {
    public static void main(String[] args) {
        String str="GeekGeeks";

        int k=4;

        StringBuilder sb=new StringBuilder(str);
        sb.append("everywhere");
        sb.insert(k,"For");
        String modifiedString = sb.toString();

        System.out.println("Inserted String :"   +modifiedString);

        char ch='E';
        str=str.substring(0,6) + ch + str.substring(7);

        System.out.println(str);




    }
}
