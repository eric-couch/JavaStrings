//git add -A stages all changes
//git add . stages new files and modifications, without deletions
//git add -u stages modifications and deletions, without new files

public class LearningStrings {
    public static void main(String[] args) {
        String name = "James Eric Couch";
        System.out.println(name.indexOf("x"));
        // false
        System.out.println(name.indexOf("C"));
        // 5

        

        String[] names = name.split(" ");
        System.out.println(names[0]);


    }
}
