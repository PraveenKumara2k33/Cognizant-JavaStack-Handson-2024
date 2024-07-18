import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalUtil {

    public List<Animal> retriveDistinctAnimals(Stream<Animal> animalStream) {
        return animalStream.distinct().collect(Collectors.toList());
    }

    public long countOfTotalDistinctAnimals(Stream<Animal> animalStream) {
        return animalStream.distinct().count();
    }
}
