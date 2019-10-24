//git add -A stages all changes
//git add . stages new files and modifications, without deletions
//git add -u stages modifications and deletions, without new files

public class LearningStrings {
    public static void main(String[] args) {
        String name;
        name = "James Eric Couch";
//        System.out.println(name.indexOf("x"));
//        // false
//        System.out.println(name.indexOf("C"));
//        // 5
//        String newName;
//        newName = name.replace(" ", "-");
//        System.out.println(newName);
        // James-Eric-Couch

        String[] names = name.split(" ");
        for (int x = 0; x< names.length; x++) {
            System.out.print(names[x].substring(0, 1) + ". ");
        }
        // James

//        String badString = "  Eric Couch  ";
//        System.out.println(badString.trim());
//
//        System.out.println(name.toUpperCase());
//        // JAMES ERIC COUCH
//
//        System.out.println(name.substring(6, 10));
//
//        String playIt = "Play it, Sam. Play 'As Time Goes By.'";
//        String quote = playIt.substring (19, 35);
//        System.out.println(quote.length());

    }
}
