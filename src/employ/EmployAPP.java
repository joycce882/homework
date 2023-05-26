package employ;

public class EmployAPP {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("张生泽",20);
        e1.info();
        Manager e2 = new Manager("谭洋",20,10000,"大经理");
        e2.info();
        e2.manage();
        Worker e3 = new Worker("陈颖荣",19,"创新部",20000);
        e3.info();
    }


}
