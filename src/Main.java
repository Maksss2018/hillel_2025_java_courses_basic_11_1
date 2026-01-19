//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var personBob = new Person("Bob",25,"driver");
    var personJane = new Person("Jane",28,"manager");
    var personJohn = new Person("John",38,"developer");
    Person[] arrayOfPersons = {personJohn, personBob, personJane};

    for(Person person : arrayOfPersons) {
        person.getInformation();
    }

    System.out.print("===============================\n");
    System.out.print("John getting new profession\n");
    personJohn.setNewProfession("web-developer");
    personJohn.getInformation();
    System.out.print("===============================");
}
