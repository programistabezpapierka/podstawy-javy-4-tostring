class Person {
    private int age;  
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name =name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
            .add("age=" + age)
            .add("name='" + name + "'")
            .toString();
    }
}
