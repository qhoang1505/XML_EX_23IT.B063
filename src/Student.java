public class Student {
    private String fullname;
    private int age;
    private double gpa;
    private String phonenumber;

    public Student(String name, int age, double gpa, String phonenumber) {
        this.fullname = name;
        this.age = age;
        this.gpa = gpa;
        this.phonenumber = phonenumber;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
