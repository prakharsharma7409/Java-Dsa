public class Comparison {
    public static void main (String[]ars){
        String s1 = "Prakhar";
        String s2 = "Prakhar";
        String s3 = new String("Prakhar");
        if (s1 == s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
        /*if (s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }*/
        if (s1.equals(s3)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
}
