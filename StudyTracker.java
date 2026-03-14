import java.util.ArrayList;
public class StudyTracker {
    ArrayList<StudySession> sessions = new ArrayList<>();
    public void addSession(String subject, int minutes) {
        StudySession session = new StudySession(subject, minutes);
        sessions.add(session);
    }
    public void showSessions() {
        if (sessions.isEmpty()) {
            System.out.println("No study sessions recorded.");
            return;
        }
        for (StudySession s : sessions) {
            System.out.println("Subject: " + s.subject + " Minutes: " + s.minutes);
        }
    }
    public int getTotalStudyTime() {
        int total = 0;
        for (StudySession s : sessions) {
            total = total + s.minutes;
        }
        return total;
    }
    public String getWeakSubject() {
        if (sessions.isEmpty()) {
            return "No data available";
        }
        int min = sessions.get(0).minutes;
        String weak = sessions.get(0).subject;
        for (StudySession s : sessions) {
            if (s.minutes < min) {
                min = s.minutes;
                weak = s.subject;
            }
        }
        return weak;
    }
}
