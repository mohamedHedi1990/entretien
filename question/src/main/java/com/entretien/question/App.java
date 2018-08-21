package com.entretien.question;
import javax.xml.bind.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	
    	/*AA aa = new AA();
    	aa.var_a="a_salut";
    	AA aaa = (BB) aa;
    	aaa.var_a="salut  aaaa";
    	System.out.println(aa.var_a);
    	aaa.print();
    	
    	
    	
    	Test t = new Test(5,6);
    	System.out.println("value is "+t.x);
    	
    	AParent aa = new BChild();
    	System.out.println("hhhhh  "+aa.getMessage());
    	
    	String s1= new String ("test");
    	String s2= new String ("test");
    	
    	System.out.println(s1.equals(s2));*/
    	
    	
    	
    	JAXBContext contexte2 = JAXBContext.newInstance(B.class);
    	Marshaller marchaller2 = contexte2.createMarshaller();
    	
    	marchaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	
    	A a = new B();
    	a.setFoo("foo value");
    	marchaller2.marshal(a, System.out);
       // System.out.println( "Hello World!" );
    	
    	/*Child child = new Child();
    	child.setFoo("foo value");
    	child.setBar("bar value");
    	
    	marchaller2.marshal(child, System.out);*/
    }
}
