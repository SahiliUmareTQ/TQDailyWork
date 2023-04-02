package com.vector;

import java.util.Comparator;

import com.customarraylist.Student;

public class IdComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {

		if (s1.getId() == s2.getId())
			return 0;
		else if (s1.getId() > s2.getId())
			return 1;
		else
			return -1;

	}

}
