package model;

import java.util.List;

public class Student {
    private String name;
    private List<Double> notes;
    private String speciality;

    public double getAverageNote(){
        return this.notes.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }
    public List<Double> getNotes(){
        return this.notes;
    }
    @Override
    public String toString(){
        return "[ Студент - " + this.getName()
                + "\t Средняя оценка - " + this.getAverageNote()
                + " Специальность - " + this.getSpeciality() + "]\n";
    }

    private String getSpeciality() {
        return this.speciality;
    }

    private String getName() {
        return this.name;
    }

}
