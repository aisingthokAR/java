package constructorExample;
import java.util.Scanner;
public class Result {
    private int roll, age;
    private String name, address, faculty;
    private double totalmarks, precentage;

    public Result() {
        this.roll = 0;
        this.age = 0;
        this.name = "sing";
        this.address = "colony";
        this.faculty = "nepali";
        this.totalmarks = 0.0;
        this.precentage = 0.0;
    }
    public Result(int r,int a){
        this.roll=r;
        this.age=a;
    }
    public Result(String n, String ad, String f){
        this.name=n;
        this.address=ad;
        this.faculty=f;
    }
    public Result(double t, double p){
        this.totalmarks=t;
        this.precentage=p;
    }
    public int getRoll() {
        return this.roll;
    }
    public int getAge() {
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getFaculty() {
        return this.faculty;
    }

    public double getTotalmarks() {
        return this.totalmarks;
    }

    public double getPrecentage() {
        return this.precentage;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("enter roll");
        int roll = scanner.nextInt();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("enter name");
        String name = scanner1.nextLine();
        System.out.println("enter address");
        String address = scanner1.nextLine();
        System.out.println("enter faculyty");
        String faculty= scanner1.nextLine();
        System.out.println("enter total marks");
        double totalmarks= scanner.nextDouble();
        System.out.println("enter precentage");
        double precentage = scanner1.nextDouble();


        Result result = new Result();
        Result result1= new Result(roll, age);
        Result result2 =new Result(name, address, faculty);
        Result result3= new Result(totalmarks, precentage);


        System.out.println("displaying default value");
        System.out.println("roll="+result.getRoll());
        System.out.println("age="+result.getAge());
        System.out.println("name="+result.getName());
        System.out.println("address="+result.getAddress());
        System.out.println("faculty="+result.getFaculty());
        System.out.println("totalmarks="+result.getTotalmarks());
        System.out.println("precentage="+result.getPrecentage());


        System.out.println("displaying parameterized value");
        System.out.println("roll="+result1.getRoll());
        System.out.println("age="+result1.getAge());
        System.out.println("name="+result2.getName());
        System.out.println("address="+result2.getAddress());
        System.out.println("faculty="+result2.getFaculty());
        System.out.println("totalmarks="+result3.getTotalmarks());
        System.out.println("precentage="+result3.getPrecentage());
    }
}