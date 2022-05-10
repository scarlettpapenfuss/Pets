package org.vashonsd;

import java.time.LocalDate;
import java.time.Period;

public class pet {
    String breed;
    String name;
    boolean needsRestraint;
    LocalDate dateOfBirth;

    public enum typeOfAnimal{
        DOG,
        CAT,
        CHICKEN
    }

    public boolean isNeedsRestraint() {
        return needsRestraint;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public pet(String name, String breed, LocalDate dateOfBirth){
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }
    
    public static int getAge(LocalDate dateOfBirth, LocalDate currentDate){
        if((dateOfBirth != null) && (currentDate != null)){
            return Period.between(dateOfBirth, currentDate).getMonths();
        }else{
            return 0;
        }

    }

    public void needsRestraint(boolean needsRestraint){

    }
}
