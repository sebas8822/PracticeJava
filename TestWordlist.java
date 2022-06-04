public class TestWordlist {

    public static void main(String[] args) {
        WordList list1 = new WordList(5);

        list1.addWord("sebas");
        list1.addWord("1");
        list1.addWord("2");
        list1.addWord("canson");
        list1.addWord("4");
        list1.addWord("it will be no added");

        System.out.println(list1);
        System.out.println(list1.findWord("canson"));

        WordList list2 = new WordList(0);

        list2.addWord("sebas");
        list2.addWord("1");
        list2.addWord("2");
        list2.addWord("canson");
        list2.addWord("4");
        list2.addWord("it will be no added");

        System.out.println(list2);
        System.out.println(list2.findWord("canson"));

        WordList list3 = new WordList();

        list3.addWord("sebas");
        list3.addWord("1");
        list3.addWord("2");
        list3.addWord("canson");
        list3.addWord("4");
        list3.addWord("it will be no added");

        System.out.println(list3);
        System.out.println(list3.findWord("canson"));


    }


}
