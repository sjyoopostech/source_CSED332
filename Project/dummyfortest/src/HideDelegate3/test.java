package HideDelegate3;

class Test {
    Person john = new Person();
    Person manager = john.getDepartment().getManager();
}