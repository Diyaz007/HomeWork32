package ExerciceA;

public enum CatName {
    ALICA("Алиса"),
    TOM("Том"),
    ROCKI("Рокки");

    private String name;

    CatName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
