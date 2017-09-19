package com.scp.deepcloning;
public class ClassTest {
public static void main(String a[]){
	
Student s1 = new Student("Priya","Maths");{
System.out.println("Original Object "+s1.getName()+"-"+s1.getSubj().getname());
//clone
Student s2=(Student)s1.clone();
System.out.println("Clonable Object "+s2.getName()+"-"+s2.getSubj().getname());
s1.setName("Priya");
s1.getSubj().setName("Maths");
System.out.println("Original Object After Updated:"+s1.getName()+"-"+s1.getSubj().getname());
System.out.println("Cloned Object After Updating original obj:"+s2.getName()+"-"+s2.getSubj().getname());
	}

}
}