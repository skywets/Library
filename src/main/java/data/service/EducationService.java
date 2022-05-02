package data.service;

import data.entity.Education;
import data.repository.EducationRepository;

public class EducationService {
    private EducationRepository er = new EducationRepository();

    public Education getItem(long id) {
        return er.getItem(id);
    }

    public void createUser(Education education) {
        er.addItem(education);
    }

    public void editUser(long id, Education education) {
        education.setId(id);
        er.updateItem(education);
    }

    public void deleteBook(long id) {
        er.deleteItem(id);
    }
}
