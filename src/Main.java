import java.time.Year;

public class Main {
    // В проекте с гениалогическим древом подумайте и используйте интерфейсы.
    // Дополнить проект методами записи в файл и чтения из файла.
    // Для этого создать отдельный класс и реализовать в нем нужные методы.
    // Для данного класса сделайте интерфейс, который и используйте в своей
    // программе.

    public static void main(String[] args) {
        Tree testTreeSave = testTree();
        testTreeSave.saveData();
        Tree testTreeRead = new Tree();
        testTreeRead.readData();
        System.out.println(testTreeRead.showAll());
    }

    public static Tree testTree() {
        Tree testTree = new Tree();
        testTree.addPerson(new Person(0, "Михаил Федорович", Year.of(1613), Year.of(1645)));
        testTree.addPerson(new Person(1, "Евдокия Стрешнева"));
        testTree.addPerson(new Person(2, "Мария Милославская"));
        testTree.addPerson(new Person(3, "Алексей Михайлович", Year.of(1645), Year.of(1676)));
        testTree.addParent(3, 0);
        testTree.addParent(3, 1);

        testTree.addPerson(new Person(4, "Наталья Нарышкина"));
        testTree.addPerson(new Person(5, "Федор Алексеевич", Year.of(1676), Year.of(1682)));
        testTree.addParent(5, 2);
        testTree.addParent(5, 3);

        testTree.addPerson(new Person(6, "Иван V", Year.of(1682), Year.of(1696)));
        testTree.addPerson(new Person(7, "Софья Алексеевна", Year.of(1682), Year.of(1689)));
        testTree.addParent(7, 2);
        testTree.addParent(7, 3);

        testTree.addPerson(new Person(8, "Евдокия Лопухина"));
        testTree.addPerson(new Person(9, "Петр I", Year.of(1682), Year.of(1725)));
        testTree.addParent(9, 3);
        testTree.addParent(9, 4);

        return testTree;
    }
}