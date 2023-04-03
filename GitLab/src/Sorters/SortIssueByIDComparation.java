package Sorters;

import java.util.Comparator;

import Pojo.Issue;

public class SortIssueByIDComparation  implements Comparator<Issue>{

	@Override
	public int compare(Issue issue1, Issue issue2) {
		
		if(issue1.getId()==issue2.getId())
			return 0;
		else if(issue1.getId() > issue2.getId())
			return 1;
		else
			return -1;		
		
	}

}
