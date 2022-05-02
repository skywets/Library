package data.repository;

import data.entity.Education;

import java.util.ArrayList;
import java.util.List;

public class EducationRepository implements Repository<Education> {
    private List<Education> educations = new ArrayList<>();

    @Override
    public Education getItem(long id) {
        Education education = findUserById(id);
        return education;
    }

    private Education findUserById(long id) {
        Education education = educations.stream().filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow();
        return education;
    }

    @Override
    public Education addItem(Education item) {
        educations.add(new Education(item.getId(), item.getElematrySchool(), item.getSecondrySchool(), item.getSecondrySchool()));
        return item;
    }

    @Override
    public Education updateItem(Education item) {
        Education education = findUserById(item.getId());
        education.setId(item.getId());
        education.setElematrySchool(item.getElematrySchool());
        education.setSecondrySchool(item.getSecondrySchool());
        education.setHigherEducation(item.getHigherEducation());
        return education;
    }

    @Override
    public void deleteItem(long id) {

    }
}
