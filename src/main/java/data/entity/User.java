package data.entity;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private long id;
    private String login;
    private String password;
    private Date registryDate;
    private long educationId;
    private String name;
    private String country;
    private String language;
    private String education;
    private LocalDate birthday;


    public User(long id, String login, String password, Date registryDate, long educationId, String name, String country,
                String language, String education, LocalDate birthday) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.registryDate = registryDate;
        this.educationId = educationId;
        this.name = name;
        this.country = country;
        this.language = language;
        this.education = education;
        this.birthday = birthday;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistryDate() {
        return registryDate;
    }

    public void setRegistryDate(Date registryDate) {
        this.registryDate = registryDate;
    }

    public long getEducationId() {
        return educationId;
    }

    public void setEducationId(long educationId) {
        this.educationId = educationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registryDate=" + registryDate +
                ", educationId=" + educationId +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", education='" + education + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
