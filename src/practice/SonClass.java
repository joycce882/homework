package practice;

import pkg_1.ParentClass;

public class SonClass extends ParentClass{

    private String st2;

    int b;

    public SonClass(String st1,int a,String st2, int b) {

        super(st1,a);

        this.st2 = st2;

        this.b = b;

        System.out.println("调用SonClass的构造器");

    }

    public void display2(){

        System.out.println("执行display2()");

//System.out.println("st="+st1+",a="+a);

        System.out.println("st1="+this.getSt1()+",a="+this.getA());

        System.out.println("st2="+st2+",b="+b);



    }

    public static void main(String[] args) {

        boolean re;

        SonClass sc1 = new SonClass("史蒂文", 100, "罗伊斯", 200);

//sc1.testPrivate();
//
//sc1.testDefault();

        sc1.testProtected();

        sc1.testPublic();

        sc1.display1();

        sc1.display2();



        SonClass sc2 = new SonClass("弗洛伊德", 99, "琳达", 200);

        re=sc1.equals(sc2);

        System.out.println(re);



        SonClass sc3 = new SonClass("史蒂文", 100, "琳达", 300);

        re=sc1.equals(sc3);

        System.out.println(re);

    }

}