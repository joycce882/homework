package employ;

public class Employee {
    String name;
    int age;
    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
//        System.out.println("有参构造器");
    }
     void info()
    {
        System.out.println("下面是员工信息：");
        System.out.println("姓名："+name+"，年龄："+age);
    }
}
class Manager extends Employee
{
    int pay;
    String offer;
    public Manager(String name,int age,int pay,String offer){
        super(name, age);
        this.pay = pay;
        this.offer = offer;

    }
     void info() {
        super.info();
        System.out.println("薪水为："+pay+"，职位是："+offer);

    }
    void manage()
    {
        System.out.println("这是一个管理方法");
    }
}
class Worker extends Employee{
    String department;
    int pay;
    public Worker(String name,int age,String department,int pay)
    {
        super(name,age);
        this.department = department;
        this.pay = pay;
    }
    void info()
    {
        super.info();
        System.out.println("所属部门是："+department+"，薪水为："+pay);
    }
}
