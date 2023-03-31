import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

// Дерево должно хранить в себе список людей и методы по работе с этим списком,
// например добавление нового человека или поиск человека по имени.
// Нет автоматизации процессов, например если известна мать, то можно сделать выводы о многих родственных связях
public class Tree {
    private HashSet<Person> personsData;
    private HashMap<Integer,Integer> kidOfMap;

    public static Person findPersonByName(HashSet<Person> inputTree, String nameInput) {
        for (Person person : inputTree) {
            if (person.getFullName().contains(nameInput))
                return person;
        }
        return null;
    }

    public HashSet<Person> getPersonsData() {
        return personsData;
    }

    public void setPersonsData(HashSet<Person> personsData) {
        this.personsData = personsData;
    }

    public void addPerson(Person newPerson) {
        if (newPerson == null)
            return;
        personsData.add(newPerson);
    }

    // public void addParent(Integer kidId, Integer parentId){
    //     if (personsData.contains(kidId) && personsData.contains(parentId)) {
            
    //     }
    // }

    public void removePerson(Integer indexToRemove){
        personsData.remove(indexToRemove); // <- Не работает, распишем.
        // for (Person person : personsData) {
        //     if (person.getId().equals(indexToRemove)){
        //         personsData.remove(person);
        //         break;
        //     }
        // }
        
    }

    public Tree(HashSet<Person> inputPersons, HashMap<Integer,Integer> inputConnections){
        this.personsData = inputPersons;
        this.kidOfMap = inputConnections;
    }

    public Tree(){
        this(new HashSet<>(), new HashMap<>());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        String prefix = "";
        for (Person person : personsData) {
            output.append(prefix);
            output.append(person);
            prefix = ", ";
        }
        return output.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tree)) {
            return false;
        }
        Tree tree = (Tree) o;
        return Objects.equals(personsData, tree.personsData) && Objects.equals(kidOfMap, tree.kidOfMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personsData, kidOfMap);
    }

}
