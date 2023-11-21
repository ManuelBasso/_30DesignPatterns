public class Main {
    public static void main(String[] args) {

        BuilderPerson builder = new BuilderPerson("Manuel", "Basso");
        builder.setAge(33);
        builder.setAddress("via di qua");
        Person person1 = builder.build();
        System.out.println(person1);

        BuilderPerson builder2 = new BuilderPerson("Pinco", "Pallo");
        Person person2 = builder2.build();
        System.out.println(person2);
    }
}