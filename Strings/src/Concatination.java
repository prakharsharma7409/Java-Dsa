public class Concatination {
    public static void printLetters (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        String startName = "Prakhar";
        String lastName = "Sharma";
        String fullName = startName + " " + lastName;
        //System.out.println(fullName + " ");
       printLetters(fullName);

    }
}