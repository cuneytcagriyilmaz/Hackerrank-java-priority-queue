import java.util.*;



public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan değerleri almak için Scanner.
        Scanner input = new Scanner(System.in);
        // Priorities Class'ının priorities adında nesnesi oluşturuldu
        Priorities priorities = new Priorities();

        // ne kadar event olacağı belirlendi.
        int totalEvent = Integer.parseInt(input.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvent-- !=0){
            String event = input.nextLine();
            events.add(event);
        }


        List<Student> students = priorities.getStudents(events);
        //students listesi boş ise EMPTY yazılır
        if (students.isEmpty()){
            System.out.println(" EMPTY ");
        }else {
            for (Student student : students){
                System.out.print(student.getName());
            }
        }
    }
}