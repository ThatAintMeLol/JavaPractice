class Person {
    private int age;
    private String name;

    public Person(int _age) {
        this.age = _age;
    }

    public Person(int _age, String _name) {
        this.age = _age;
        this.name = _name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void celebrateBirthday() {
        ++this.age;
    }

    public void changeName(String newname) {
        this.name = newname; // Completes the changeName method
    }
}

class PersonTester {
    public static void main(String args[]) {
        Person matt = new Person(17, "Mathew Gross");
        System.out.println("Age before: " + matt.getAge());
        System.out.println(matt.getName());
        matt.celebrateBirthday();
        System.out.println("Age after: " + matt.getAge()); // Use getAge() to access age
    }
}
