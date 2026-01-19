public class Person {
    private String name;
    private int age;
    private String profession;
    public Person ( String personName, int personAge, String personProfession) {
        this.name = personName;
        this.age = personAge;
        this.profession = personProfession;
    }
    public void getInformation (){
        String  templateForOutput = """
              ім'я: %s, вік: %d, професія: %s;
             """;
        System.out.printf(templateForOutput,name,age,profession);
    }
    public void setNewProfession (String newProfession) {
        this.profession = newProfession;
    }
}
