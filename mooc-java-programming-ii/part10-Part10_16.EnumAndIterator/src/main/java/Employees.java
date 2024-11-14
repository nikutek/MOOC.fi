
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Employees {

    private ArrayList<Person> emplyees = new ArrayList();

    public Employees() {
        emplyees = new ArrayList();
    }

    public void add(Person personToAdd) {
        emplyees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            emplyees.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = emplyees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
//        emplyees.stream()
//                .filter(person -> person.getEducation().equals(education))
//                .forEach(person -> System.out.println(person));

        Iterator<Person> iterator = emplyees.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = emplyees.iterator();
        ArrayList<Person> toBeDeleted = new ArrayList<>();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
//                   emplyees.remove(nextInLine);
                toBeDeleted.add(nextInLine);
            }
        }
        for (Person p : toBeDeleted) {
            emplyees.remove(p);
        }
    }
}
