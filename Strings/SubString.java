public class SubString {
    public static String subString (String str , int si , int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }
    public static void main (String[]args){
        //Substring
        String str = "HelloWorld";
        //System.out.println(str.substring(0,5)); only this line to do whole operation
        System.out.println(subString(str,0,5));

    }
}
