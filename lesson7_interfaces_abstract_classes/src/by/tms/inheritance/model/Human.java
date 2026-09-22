package by.tms.inheritance.model;

public abstract class Human {

    private String speciesName;

    public Human(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return this.speciesName;
    }

    public abstract String getSpeciesNameWithoutBody();

}