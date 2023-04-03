package middleware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Pojo.Issue;
import Sorters.SortByAssgineeComparation;
import Sorters.SortIssueByIDComparation;

public class HelpingCLassForIssueTracker {

	public static void createNewIssue(ArrayList<Issue> issueList, Scanner scanner) {
		// Creating a new Issue
		System.out.println("Enter the total number of Issues: ");
		String tot = scanner.nextLine();
		int total = Integer.parseInt(tot);

		for (int i = 0; i < total; i++) {

			System.out.println("Enter the issue " + (i + 1) +" Id");
			String ids = scanner.nextLine();
			int id = Integer.parseInt(ids);
			Issue e = findTheIssue(issueList, id);
			if((e)!=null) {
				System.out.println("This Id is already taken");
				break;
			}

			System.out.println("Enter the issue " + (i + 1) +" Assignee");
			String assignee = scanner.nextLine();

			System.out.println("Enter the " + (i + 1) +" Reportee");
			String reportee = scanner.nextLine();
			
			System.out.println("Enter the issue " + (i + 1) +" Description");
			String description = scanner.nextLine();
			
			System.out.println("Enter the issue " + (i + 1) +" Severity (Low / Medium / High)");
			String severity = scanner.nextLine();
			
			System.out.println("Enter the issue " + (i + 1) +" Status (New / InProgress / Completed)");
			String status = scanner.nextLine();

			Issue issue = new Issue(id, assignee, reportee, description, severity, status);
			issueList.add(issue);
			
			System.out.println("\"Successfully raised an Issue !\"");
			System.out.println(issue.toString());
		}
	}

	public static void updateExistingIssue(ArrayList<Issue> issueList, Scanner scanner) {
		// Update a Issue
		System.out.println("Enter the ID number of an Issue to be Updated");
		String ids = scanner.nextLine();
		int id = Integer.parseInt(ids);
		
		System.out.println("1. ID");	
		System.out.println("2. Assignee");	
		System.out.println("3. Reportee");	
		System.out.println("4. Description");
		System.out.println("5. Severity");
		System.out.println("5. Status");	
		
		System.out.println("Please Select the feild that need to be Updated: ");
		String choice = scanner.nextLine();
		int option = Integer.parseInt(choice);
		
		switch(option) {
		case 1:{
			Issue e=findTheIssue(issueList, id);
			System.out.println("The Old ID is: "+e.getId());
			System.out.println("Enter the new value: ");
			String newid = scanner.nextLine();
			int newID = Integer.parseInt(newid);
			Issue e1 = findTheIssue(issueList, newID);
			if((e1)!=null) {
				System.out.println("This Id is already taken");
				break;
			}else {
				e.setId(newID);;
				System.out.println("Id is updated !!!");
				break;
			}
		}
		case 2:{
			Issue e=findTheIssue(issueList, id);
			System.out.println("The Old Assignee is: "+e.getAssignee());
			System.out.println("Enter the new value: ");
			String assignee = scanner.nextLine();
			e.setAssignee(assignee);
			System.out.println("Assignee is updated !!!");
			break;
		}
		case 3:{
			Issue e=findTheIssue(issueList, id);
			System.out.println("The Old Reportee is: "+e.getReportee());
			System.out.println("Enter the new value: ");
			String reportee = scanner.nextLine();
			e.setReportee(reportee);
			System.out.println("Reportee is updated !!!");
			break;
		}
		case 4:{
			Issue e=findTheIssue(issueList, id);
			System.out.println("The Old Description is: "+e.getDescription());
			System.out.println("Enter the new value: ");
			String description = scanner.nextLine();
			e.setDescription(description);
			System.out.println("Description is updated !!!");
			break;
		}
		case 5:{
			Issue e=findTheIssue(issueList, id);
			System.out.println("The Old Severity is: "+e.getSeverity());
			System.out.println("Enter the new value: ");
			String severity = scanner.nextLine();
			e.setSeverity(severity);
			System.out.println("Severity is updated !!!");
			break;
		}
		case 6:{
			Issue e=findTheIssue(issueList, id);
			System.out.println("The Old Status is: "+e.getStatus());
			System.out.println("Enter the new value: ");
			String status = scanner.nextLine();
			e.setStatus(status);
			System.out.println("Status is updated !!!");
			break;
		}
		default:{
			System.out.println("Enter a Valid Option ");
			break;
		}
		}
	}
		

	public static void sortIssueById(ArrayList<Issue> issueList, Scanner scanner) {
		// Sort a Issue By Id
		Collections.sort(issueList, new SortIssueByIDComparation());
		System.out.println(issueList.toString());
	}

	public static void sortIssueByAssignee(ArrayList<Issue> issueList, Scanner scanner) {
		// Sort a Issue By Assignee
		Collections.sort(issueList, new SortByAssgineeComparation());
		System.out.println(issueList.toString());
	}

	public static void deleteIssueById(ArrayList<Issue> issueList, Scanner scanner) {
		// Delete an Issue
		System.out.println("Enter Id number of Issue to delete:");
		String ids = scanner.nextLine();
		int id = Integer.parseInt(ids);
		Issue e = HelpingCLassForIssueTracker.findTheIssue(issueList, id);
		
		issueList.remove(e);
		System.out.println("Succecsfuly Deleted !!!");
		
	}
	public static Issue findTheIssue(ArrayList<Issue> issueList,int id) {
		Issue targetIssue = null;
		for (Issue e : issueList) {
			int currentID = e.getId();
			if (currentID == id) {
				targetIssue = e;
				break;
			}
		}
		return targetIssue;
	}
}
