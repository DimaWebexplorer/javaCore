package lr2;

public class OwnTask4 {
    public static class Person {
        private String name;
        private int age;
        private String sex;

        public Person(String name, int age, String sex) {
            if (age < 0) {
                throw new IllegalArgumentException("Age must be non-negative.");
            }
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Daniil", 30, "male");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Sex: " + person.getSex());
    }
}


