package entities.enums;

public enum WorkerLevel {
	JUNIOR,
	MID_LEVEL,
	SENIOR
}
//////////////////////////////////////////
package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Department {
	private String name;
	
	public Department(String name) {		//Construtor
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(Date date, Double valuePerHour, Integer hours){ ///Construtor
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getValuePerHour(){
		return valuePerHour;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Integer getHours(){
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}


public class Workers {
	private String name;
	private WorkerLevel level;
	private Double  baseSalary;
	
	//ASSOCIAÇÕES//
	
	private Department department; // Um worker tem um department
	private List<HourContract> contracts = new ArrayList<>();
	//Um worker tem vários contratos, então esses vários vou ter que representar como uma lista
	
	// **** ///
	
	public Worker (String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;				//Construtor com tudo menos o que é lista, por que já instanciei ela acima por padrão
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	//Quando tenho uma composição tem muitos (que é uma lista), eu não incluo ele no construtor
	
	//Aqui eu coloco meus getters e setters, não coloquei por preguiça mesmo... kjakaka
	
	//*MÉTODOS DA CLASSE*//
	
	public void addContract(HourContract contract) {
		contracts.add(contract)
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract)
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract)
	}
	
	public void income(int year, int mounth) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) { 
				sum += c.totalValue;
			}
		}
		return sum
	}
}



//////////////////////////////////////////////////////////////
package application;

public class Program {
	public static void main(String[] args) {
		
	}
}