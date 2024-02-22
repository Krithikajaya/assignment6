package assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		List<String> company = new ArrayList();
		company.add("hcl");
		company.add("wipro");
		company.add("aspire");
		company.add("tcs");
		
		System.out.println(company);
		Collections.sort(company);
		int n= company.size()-1;
		for(int i=n;i>=0;i--) {
		System.out.println(company.get(i));
		}
	}

}
