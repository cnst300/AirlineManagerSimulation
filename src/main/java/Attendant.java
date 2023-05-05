public class Attendant extends Employee {

    private Language language;

    public Attendant(String name, Type type, Language language) {
        super(name, type);
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }
}
