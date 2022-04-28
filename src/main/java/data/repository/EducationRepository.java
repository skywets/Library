package data.repository;

import data.entity.Education;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EducationRepository implements Repository<Education> {
    private List<Education> educations = new ArrayList<>();

    @Override
    public Optional<Education> getItem(long id) {
        Optional<Education> education = educations.stream().filter(e -> e.getId() == id).findFirst();
        return education;
    }

    @Override
    public Education addItem(Education item) {
        educations.add(new Education(item.getId(), item.getElematrySchool(), item.getSecondrySchool(), item.getSecondrySchool()));
        return item;
    }

    @Override
    public Education updateItem(Education item) {
        Education education = educations.stream().filter(e -> e.getId() == item.getId())
                .findFirst().orElseThrow();
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
