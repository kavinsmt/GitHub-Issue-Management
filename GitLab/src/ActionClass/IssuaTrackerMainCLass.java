package ActionClass;

import java.util.ArrayList;
import java.util.Scanner;

import Pojo.Issue;
import middleware.HelpingCLassForIssueTracker;

public class IssuaTrackerMainCLass {
	public static void main(String[] args) {

		ArrayList<Issue> issueList = new ArrayList<Issue>();

		Issue issue1 = new Issue(1, "ram", "mani", "login is not working properly", "high", "new");
		Issue issue2 = new Issue(2, "kumar", "ram", "logout is not working properly", "medium", "In-progress");
		Issue issue3 = new Issue(3, "vani", "john", "home screen is not working properly", "high", "new");

		issueList.add(issue1);
		issueList.add(issue2);
		issueList.add(issue3);
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("***********************");
			System.out.println("GitLab Issue Managemnet");
			System.out.println("***********************");
			System.out.println();
			System.out.println("1. Raise an Issue");
			System.out.println("2. Update an Issue");
			System.out.println("3. Read all the Issue Sorted By Id");
			System.out.println("4. Read all the Issue Sorted By Assignee");
			System.out.println("5. Delete an Issue");
			System.out.println("6. LogOut");
			System.out.println();
			System.out.println("Enter the choice: ");

			String choiceString = scanner.nextLine();
			int choice = Integer.parseInt(choiceString);

			switch (choice) {
			case 1:
				HelpingCLassForIssueTracker.createNewIssue(issueList, scanner);
				break;
			case 2:
				HelpingCLassForIssueTracker.updateExistingIssue(issueList, scanner);
				break;
			case 3:
				HelpingCLassForIssueTracker.sortIssueById(issueList, scanner);
				break;
			case 4:
				HelpingCLassForIssueTracker.sortIssueByAssignee(issueList, scanner);
				break;
			case 5:
				HelpingCLassForIssueTracker.deleteIssueById(issueList, scanner);
				break;
			case 6:
				System.out.println("Thank You !!!");
				System.exit(0);
				break;
			}
		}
	}
}
