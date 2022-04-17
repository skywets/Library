package data.entity;

public class Education {
    private long id;
    private String elematrySchool;
    private String secondrySchool;
    private String higherEducation;

    public Education(long id, String elematrySchool, String secondrySchool, String higherEducation) {
        this.id = id;
        this.elematrySchool = elematrySchool;
        this.secondrySchool = secondrySchool;
        this.higherEducation = higherEducation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getElematrySchool() {
        return elematrySchool;
    }

    public void setElematrySchool(String elematrySchool) {
        this.elematrySchool = elematrySchool;
    }

    public String getSecondrySchool() {
        return secondrySchool;
    }

    public void setSecondrySchool(String secondrySchool) {
        this.secondrySchool = secondrySchool;
    }

    public String getHigherEducation() {
        return higherEducation;
    }

    public void setHigherEducation(String higherEducation) {
        this.higherEducation = higherEducation;
    }
}
