package SelfLearning;

import java.io.BufferedReader;
import java.io.FileReader;

	//Java Program for Constructor with This keyword
public class Employer {
	public int id;
	public String cName;
	public double dSalary;
	
	public Employer(int id, String cName, double dSalary) {
		this.id = id;
		this.cName = cName;
		this.dSalary = dSalary;
		
	}

	public static void main(String[] args) throws Exception {
		Employer[] e = new Employer[4];
		
		FileReader fr = new FileReader("Employee.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		String[] inputArr;
		int num=0;
		
		while((line=br.readLine())!=null) {
			inputArr = line.split(",");
			e[num] = new Employer(Integer.valueOf(inputArr[0]), inputArr[1], Double.valueOf(inputArr[2]));
			num++;
		}
		fr.close();
		br.close();
		
		for(int i = 0; i<e.length;i++) {
			System.out.println(e[i].id + " and " + e[i].cName + " and " + e[i].dSalary);
		}

	}

}
