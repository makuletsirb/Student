public class Student {
    private String name;
    private int age; 
    public Student() {
        name = "No Name yet";
        age = 0;
    }
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayStudent(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
    }
    public static void main(String[] args) {
        Student cy = new Student("Ronan Pangilinan", 19);
        cy.displayStudent();
    }
}