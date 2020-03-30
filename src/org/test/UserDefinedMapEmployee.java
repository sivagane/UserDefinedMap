package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserDefinedMapEmployee {
public static void main(String[] args) {
	Map<Integer, Employee>hmp=new HashMap<>();
	Employee emp1=new Employee(101,"siva",9750364952l,"Pudhucherry","8/9/1990","13/12/2019","sivag918@gmail.com","male",50000.25);
	Employee emp2=new Employee(102,"ganesh",8248877248l,"Pudhucherry","8/9/1990","13/12/2019","sivag918@gmail.com","male",50000.25);
	Employee emp3=new Employee(103,"Jegan",9047755611l,"Chennai","5/4/1985","13/12/2019","jegan@gmail.com","male",50000.25);
	Employee emp4=new Employee(104,"Divya",8754693214l,"Chennai","23/9/1990","13/12/2019","divya@gmail.com","female",50000.25);
	Employee emp5=new Employee(105,"Arumugam",9994762589l,"Pudhucherry","25/3/1961","13/12/2019","arumugam@gmail.com","male",50000.25);
	Employee emp6=new Employee(106,"Usha",9750355489l,"Pudhucherry","22/8/1962","13/12/2019","usha@gmail.com","female",50000.25);
	Employee emp7=new Employee(107,"Abirami",9546123785l,"Pudhucherry","1/11/1994","13/12/2019","abirami@gmail.com","female",50000.25);
	Employee emp8=new Employee(108,"Aaradhana",7895623145l,"Chennai","1/11/2004","13/12/2019","aaradhana@gmail.com","female",50000.25);
	Employee emp9=new Employee(109,"Ashwanth",8874521369l,"Pudhucherry","2/6/2009","13/12/2019","ashwanth@gmail.com","male",50000.25);
	Employee emp10=new Employee(110,"Mani",9745698721l,"Pudhucherry","5/2/1995","13/12/2019","mani@gmail.com","male",50000.25);

	hmp.put(emp1.getEmpId(), emp1);
	hmp.put(emp2.getEmpId(), emp2);
	hmp.put(emp3.getEmpId(), emp3);
	hmp.put(emp4.getEmpId(), emp4);
	hmp.put(emp4.getEmpId(), emp5);
	hmp.put(emp6.getEmpId(), emp6);
	hmp.put(emp7.getEmpId(), emp7);
	hmp.put(emp8.getEmpId(), emp8);
	hmp.put(emp9.getEmpId(), emp9);
	hmp.put(emp10.getEmpId(), emp10);
	
	Set<Map.Entry<Integer, Employee>>en=hmp.entrySet();
	for (Map.Entry<Integer, Employee> emp : en) {
		System.out.println(emp.getKey());
		Employee employee=emp.getValue();
		employee.display();
	}
	
}
}
