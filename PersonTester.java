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
        this.name = newname;
    }
}

class PersonTester {
    public static void main(String args[]) {
        Person prsn = new Person(9999, "Person");
        System.out.println("Age before: " + prsn.getAge());
        System.out.println(prsn.getName());
        prsn.celebrateBirthday();
        System.out.println("Age after: " + prsn.getAge());
    }
}
