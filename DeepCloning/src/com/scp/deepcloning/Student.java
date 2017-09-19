package com.scp.deepcloning;
	class Subject{
		private String name;

		public String getname() {
			return name;
		}

		public void setName(String n) {
			name=n;
		}
		public Subject(String n){
			name=n;
		}
	}
	public class Student implements Cloneable {
		private String name;
		private Subject subj;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Subject getSubj() {
			return subj;
		}
		
		public Student(String n,String sub)
		{
			name=n;
			subj=new Subject(sub);
		}
	public Object clone(){
		Student s=new Student(name, subj.getname());
		return s;
		}
	  }
	


