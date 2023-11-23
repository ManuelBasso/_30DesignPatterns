//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
// tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
public class BuilderPerson {

    public String firstName;
    public String lastName;
    public int age;
    public String address;

    public BuilderPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public BuilderPerson setAge(int age) {
        this.age = age;
        return this;
    }

    public BuilderPerson setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
