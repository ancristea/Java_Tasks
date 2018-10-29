package Task1.SubTask7;

    public class Main {
        public static void main (String[] args) {
            Object[] obj = new Object[]{1, 2, 3.7, "abc", new Person("Olga", 20, "F"), "abc", 20, new Person("Ana", 19, "F")};

            ArrayModification arrayModification = new ArrayModification();

            for (Object o : obj) arrayModification.modify(o);

            System.out.println("Strings: " + arrayModification.getstringsFromComponents());
            System.out.println("Sum: " + arrayModification.getsumOfComponents());
            System.out.println("All men");
            for (Person person : arrayModification.getPeople())
                System.out.println(person);
        }

    }

