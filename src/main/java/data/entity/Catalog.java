package data.entity;

public class Catalog {
    private long id;
    private boolean popular;
    private boolean newRelease;
    private String genre;

    public Catalog(long id, boolean popular, boolean newRelease, String genre) {
        this.id = id;
        this.popular = popular;
        this.newRelease = newRelease;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public boolean isNewRelease() {
        return newRelease;
    }

    public void setNewRelease(boolean newRelease) {
        this.newRelease = newRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
