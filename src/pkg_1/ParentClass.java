package pkg_1;

import java.util.Objects;

public class ParentClass{

    private String st1;

    int a;



    public String getSt1() {

        return st1;

    }

    public void setSt1(String st1) {

        this.st1 = st1;

    }

    public int getA() {

        return a;

    }

    public void setA(int a) {

        this.a = a;

    }

    public ParentClass() {

        System.out.println("调用ParentClass的默认构造器");

    }

    public ParentClass(String st1, int a) {

        this.st1 = st1;

        this.a = a;

        System.out.println("调用ParentClass的有参构造器");

    }

    private void testPrivate(){

        System.out.println("调用ParentClass的testPrivate");

    }

    void testDefault(){

        System.out.println("调用ParentClass的testDefault");

    }

    protected void testProtected(){

        System.out.println("调用ParentClass的testProtected");

    }

    public void testPublic(){

        System.out.println("调用ParentClass的testPublic");

    }

    public void display1(){

        System.out.println("执行display1()");

        System.out.println("st1="+st1+",a="+a);

    }

    public boolean equals(ParentClass p){

        return Objects.equals(p.getSt1(), this.st1) && p.a == this.a;

    }

}


