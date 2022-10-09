package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments = new ArrayList<Enrolment>();
    private String name;
    private int program;
    private String[] streams;

	public Student(String zid, String name, int program, String[] streams) {
        this.zid = zid;
        this.name = name;
        this.program = program;
        this.streams = streams;
    }

    public boolean isEnrolled(CourseOffering offering) {
        /*for (Enrolment enrolment : enrolments) {
            if (enrolment.getOffering().equals(offering)) {
                return true;
            }
        }

        return false;*/
        boolean isEnrolled = enrolments.stream().anyMatch(e -> offering.equals(e.getOffering()));
        return isEnrolled;

    }

    public void setGrade(Grade grade) {
        /*for (Enrolment enrolment : enrolments) {
            if (enrolment.getOffering().equals(grade.getOffering())) {
                enrolment.setGrade(grade);
            }
        }*/
        enrolments.stream()
            .filter(e -> e.getOffering().equals(grade.getOffering()))
            .findAny().ifPresent(e -> e.setGrade(grade));
    }

    public void addEnrolment(Enrolment enrolment) {
        enrolments.add(enrolment);
    }

    public List<Enrolment> getEnrolments() {
        return enrolments;
    }

    public String getZid() {
        return zid;
    }

    public void setZid(String zid) {
        this.zid = zid;
    }

    public void setEnrolments(ArrayList<Enrolment> enrolments) {
        this.enrolments = enrolments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProgram() {
        return program;
    }

    public void setProgram(int program) {
        this.program = program;
    }

    public String[] getStreams() {
        return streams;
    }

    public void setStreams(String[] streams) {
        this.streams = streams;
    }

    public int getStreamLen() {
        return streams.length;
    }
    
}
