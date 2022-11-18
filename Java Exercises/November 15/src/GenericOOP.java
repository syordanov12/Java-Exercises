public class GenericOOP {
    public static void main(String[] args) {
        Doggo dogOne = new Doggo();
        dogOne.setAge(5);

        dogOne.bark();
        int dogAge = dogOne.getAge();

        System.out.println("The dogs age is " + dogAge);
    }
}
