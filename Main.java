
public class Main {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {

        DynamicArray<Student> students = new DynamicArray<>();

        students.add(new Student("Huy", 18));
        students.add(new Student("Gia", 20));
        students.add(new Student("Duong", 22));

        System.out.println("Student Array size: " + students.size()); // 3

        System.out.println("Student at index 0: " + students.get(0));
        System.out.println("Student at index 1: " + students.get(1));
        System.out.println("Student at index 2: " + students.get(2));

        System.out.println("Removed Student: " + students.remove(1));//Gia

        System.out.println("Size after remove: " + students.size()); // 2
        System.out.println("Student at index 1: " + students.get(1)); // Duong
    }
}
