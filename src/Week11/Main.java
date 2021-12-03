package Week11;

public class Main {
    public static void main(String[] args) throws Exception {
        MindfulDictionary dict = new MindfulDictionary("C:/Users/Chris/IdeaProjects/java_chris/src/com/example/dictionary/words.txt");
        dict.load();

        dict.add("tietokone", "computer");

        System.out.println(dict.translate("tietokone"));
        System.out.println(dict.translate("computer"));

        // using the dictionary

        dict.save();
    }
}
