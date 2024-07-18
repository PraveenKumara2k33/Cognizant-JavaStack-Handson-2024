import java.util.Objects;

public class Animal {
    private String animalName;
    private String isDomesticOrWild;
    private String habitat;

    public Animal() {
        super();
    }

    public Animal(String animalName, String isDomesticOrWild, String habitat) {
        super();
        this.animalName = animalName;
        this.isDomesticOrWild = isDomesticOrWild;
        this.habitat = habitat;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getIsDomesticOrWild() {
        return isDomesticOrWild;
    }

    public void setIsDomesticOrWild(String isDomesticOrWild) {
        this.isDomesticOrWild = isDomesticOrWild;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        
        if (this == o) return true;
        
        if (o == null || getClass() != o.getClass()) return false;
        
        Animal animal = (Animal) o;
        return Objects.equals(animalName, animal.animalName) &&
               Objects.equals(isDomesticOrWild, animal.isDomesticOrWild) &&
               Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, isDomesticOrWild, habitat);
    }

    @Override
    public String toString() {
        return animalName + ":" + isDomesticOrWild + ":" + habitat;
    }
}
