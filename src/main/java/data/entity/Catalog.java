package data.entity;

public class Catalog {
    private long id;
    private String programming;
    private String detective;
    private String fantastic;

    public Catalog(long id, String programming, String detective, String fantastic) {
        this.id = id;
        this.programming = programming;
        this.detective = detective;
        this.fantastic = fantastic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getDetective() {
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    public String getFantastic() {
        return fantastic;
    }

    public void setFantastic(String fantastic) {
        this.fantastic = fantastic;
    }
}