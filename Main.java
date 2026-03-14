import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudyTracker tracker = new StudyTracker();
        while (true) {
            System.out.println("\nStudy Tracker");
            System.out.println("1 Add Study Session");
            System.out.println("2 Show All Sessions");
            System.out.println("3 Show Total Study Time");
            System.out.println("4 Show Weak Subject");
            System.out.println("5 Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter subject: ");
                String subject = sc.nextLine();
                System.out.print("Enter minutes studied: ");
                int minutes = sc.nextInt();
                tracker.addSession(subject, minutes);
                System.out.println("Session added.");
            }
            else if (choice == 2) {
                tracker.showSessions();
            }
            else if (choice == 3) {
                System.out.println("Total Study Time: " + tracker.getTotalStudyTime() + " minutes");
            }
            else if (choice == 4) {
                System.out.println("Weak Subject: " + tracker.getWeakSubject());
            }
            else if (choice == 5) {
                System.out.println("Exiting program.");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
