package Task1.SubTask7;

import Task1.SubTask7.Person;

import java.util.ArrayList;

public class ArrayModification {

        private String stringsFromComponents = "";
        private Double sumOfComponents = 0D;
        private ArrayList<Person> people = new ArrayList<Person>();

        public String getstringsFromComponents() {
            return stringsFromComponents;
        }

        public Double getsumOfComponents() {
            return sumOfComponents;
        }

        public ArrayList<Person> getPeople() {
            return people;
        }

        public void modify (Object obj) {
            if (obj instanceof String) modify((String) obj);
            if (obj instanceof Integer)modify((Integer) obj);
            if (obj instanceof Double) modify((Double) obj);
            if (obj instanceof Person) modify((Person) obj);
        }

        public void modify(String s) {
            stringsFromComponents += s;
        }

        public void modify(Integer n) {
            sumOfComponents += n;
        }

        public void modify(Double n) {
            sumOfComponents += n;
        }

        public void modify(Person p) {
            people.add(p);
        }
    }

