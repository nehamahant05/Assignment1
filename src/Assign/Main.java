package Assign;

import example.inheritance.Child3;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     LocalDate objDate= LocalDate.now();
     System.out.println("Date---"+objDate);

     EnumExample ex=EnumExample.AAA;
     System.out.println(ex);

     for(EnumExample var: EnumExample.values())
     {
      System.out.println(var);
     }
        ConstructorDemo demo=new ConstructorDemo(10,20);
        LeapYear objleap=new LeapYear();
       String str= objleap.leapyear(2004);
        System.out.println(str);
        MultiTable mulObj=new MultiTable();
        mulObj.table(3);
        Alphabets.alphabet();
        RandomNumber.randomNumber();
        demo.addNumber();

        InheritanceChild1 objChild=new InheritanceChild1();
        Child2 objChild2=new Child2();
        System.out.println( "Addition of number=="+objChild.add(3,4,5));
        System.out.println("subtraction=="+objChild.sub(5,2));

        System.out.println("Addition of 2 number with sub=="+objChild2.add(2,3,1));

        Child3 obj3=new Child3();
        System.out.println("Division=="+obj3.div(4,2));

        System.out.println("multi="+obj3.multi(3,4));

        InheritanceChild1.staticExample();
        Child3.staticExample();

        TernaryOperator objTernary=new TernaryOperator();
        objTernary.greaterNumber(4,5);

        ArrayExample.arrayExample();


        /////

        InnerClassExample objOuter=new InnerClassExample();

        InnerClassExample.InnerExample objInner=objOuter.new InnerExample();

        System.out.println(objInner.x+" ---"+ objOuter.s);
    }


}