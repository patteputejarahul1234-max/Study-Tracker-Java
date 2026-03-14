import java.util.ArrayList;
public class StudyTracker {
  ArrayList<StudySession> sessions = new ArrayList<>();
  public void addSession(String subject, int minutes) {
    sessions.add(new StudySession(subject, minutes));
  }
  public int getTotalStudyTime() {
    int total=0;
    for(StudySession s : sessions) {
      total=total+s.minutes;
    }
    return total;
  }
}
