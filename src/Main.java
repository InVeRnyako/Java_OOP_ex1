public class Main {

    public static void main(String[] args) {
        Tree testTree = new Tree();
        testTree.addPerson(new Person(1, "Тест Объект1"));
        testTree.addPerson(new Person(1, "Тест Объект2"));
        testTree.addPerson(new Person(3, "Тест Объект3"));
        // testTree.addPerson(new Person(1, "Тест Объект"));
        testTree.removePerson(1);
        System.out.println(testTree);
    }
}