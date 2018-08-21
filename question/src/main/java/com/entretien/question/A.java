package com.entretien.question;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class A {

	@XmlElement
	private String foo;
	
	private String boo="boo";

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
	
	
}
