public class FitFreak {
    private String fitnessId;
    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;

    public FitFreak(String fitnessId, String name, String gender, int age, double height, double weight) {
        super();
        this.fitnessId = fitnessId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFitnessId() {
        return fitnessId;
    }

    public void setFitnessId(String fitnessId) {
        this.fitnessId = fitnessId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "fitnessId=" + fitnessId + ", name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight=" + weight;
    }
}
