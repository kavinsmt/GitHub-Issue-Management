package Sorters;

import java.util.Comparator;

import Pojo.Issue;

public class SortByAssgineeComparation implements Comparator<Issue>{

	@Override
	public int compare(Issue issue1, Issue issue2) {
		return issue1.getAssignee().compareTo(issue2.getAssignee());
	}
	

}
