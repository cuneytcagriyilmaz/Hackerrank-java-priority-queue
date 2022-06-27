import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.PriorityQueue;

    public class Priorities {

        // Queque'de FIFO(First in Firs Out) mantığı ile çalışır.
        private final PriorityQueue<Student> studentQueue = new PriorityQueue<>(
                //Comparator'un comparing methodu ile queue sıralamasını ayarlıyoruz.
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );
        //Öğrenci gösterme
        List<Student> getStudents(List<String> e) {
            e.forEach((event) -> {
                //SERVED En yüksek önceliğe sahip öğrenci queue'dan çıkarılır.
                //Eğer SERVED ile giriş yapılırsa poll() işlemi yapılır.
                if (event.equals("SERVED")) {
                    studentQueue.poll();
                }else {
                    //Prioriy olan öğrenciler queue'e girer
                    String[] studentData = event.split(" ");
                    studentQueue.add(new Student(Integer.parseInt(studentData[3]), studentData[1], Double.parseDouble(studentData[2])));
                };
            });
            List<Student> studentList = new ArrayList<>();
            // Eğer queue de değer varsa yeni oluşturduğumuz studentList'e queue poll() methodu çalışır.
            while (!studentQueue.isEmpty()){
                studentList.add(studentQueue.poll());
            }
            return studentList;
        }
    }
