public class Student {
    //Değişkenlerin dışarıdan ulaşıma açık olmaması için private ile tanımlama yapıyoruz
    //Değişkenlerin değerleri değişmeyecaği için final ile tanımlama yapıyoruz.
    private final int id;
    private final String name;
    private final double cgpa;

    //Constructer
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    //Değişkenleri dışarıdan okuyabilmek için getter method'ları:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
