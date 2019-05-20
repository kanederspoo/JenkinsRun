package com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.AfterMethod;

public class NewTest {
	@Test
	public void f() {
		// System.out.println("Prateek");

		String[] str = new String[3];

		str[0] = "spoo";
		str[1] = "momo";
		str[2] = "mereprateek";

		List<String> ar = Arrays.asList(str);
		System.out.println(ar.contains("spoo"));

		String[] sr = (String[]) ar.toArray();

//System.out.println(str);

		TreeSet ts = new TreeSet();

		ts.add(1);
		ts.add(2);
		ts.add(3);

		Iterator itr = ts.iterator();

		while (itr.hasNext()) {
			Object i = itr.next();
			// System.out.println(i.toString());
		}

		for (Object in : ts) {
			System.out.println(in.toString());

		}

		Object[] objArray = ts.toArray();

		for (int index = 0; index < objArray.length; index++) {// System.out.println(objArray[index]);

		}
	}

	@BeforeMethod
	public void beforeMethod() {
		// System.out.println("hi");
	}

	@AfterMethod
	public void afterMethod() {
		// System.out.println("spoorthi");
	}

}
