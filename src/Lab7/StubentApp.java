package Lab7;

public class StubentApp {
    public static void main(String[] args) {

        //crate object of Student ciass
        Student std1 = new Student();

        std1.setName("Piyawat Phoemphun");
        std1.setPerson_id("12345665555");
        std1.setAge(21);

        displayDataOject(std1);

        Student std2 = new  Student();

        std2.setName("Nattapong");
        std2.setPerson_id("2222225555555");
        std2.setAge(20);

        displayDataOject(std2);

        Student std3 = new Student("Jirapa","333333333333",20);

        displayDataOject(std3);

        System.out.println(std3.toString());






    }

    private static void displayDataOject(Student std) {

        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());


    }
}
