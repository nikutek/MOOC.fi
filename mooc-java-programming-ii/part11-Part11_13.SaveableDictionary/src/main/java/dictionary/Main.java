package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        dictionary.add("malpa", "monkey");
        dictionary.add("banan", "banana");

        System.out.println(dictionary.translate("malpa"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banan"));
        System.out.println(dictionary.translate("apple"));

        dictionary.save();
    }
}
