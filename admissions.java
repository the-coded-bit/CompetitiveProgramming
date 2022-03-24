import java.util.*;
public class admissions {

    public static class Student {
        double percentage;
        int id, preference1, preference2, preference3;
        Student(){}
        Student(int _id, double _percentage, int _preference1, int _preference2, int _preference3){
            id = _id;
            percentage = _percentage;
            preference1 = _preference1;
            preference2 = _preference2;
            preference3 = _preference3;
        }
    }

    public static Student createStudent(String s){
        String[] converted = s.split(",");
        String id = converted[0].substring(converted[0].indexOf("-") + 1);
        String percentage = converted[1];
        String coll1 = converted[2].substring(converted[2].indexOf("-") + 1);
        String coll2 = converted[3].substring(converted[3].indexOf("-") + 1);
        String coll3 = converted[4].substring(converted[4].indexOf("-") + 1);
        // System.out.println("id = " + id + " percentage = " + percentage + " coll1 = " + coll1 + " coll2 " + coll2 + " coll3 " + coll3);
        Student student= new Student(Integer.parseInt(id), Double.parseDouble(percentage), Integer.parseInt(coll1), Integer.parseInt(coll2), Integer.parseInt(coll3));
        return student;
    }

    // static void printStudents(List<Student> students){
    //     for(int i = 0; i < students.size(); i++){
    //         Student std = students.get(i);
    //         System.out.println("id = " + std.id + " percentage = " + std.percentage + " coll1 = " + std.preference1 + " coll2 " + std.preference2 + " coll3 " + std.preference3);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();

        int[] collegeSeats = new int[c];
        for(int i = 0; i < c; i++){
            collegeSeats[i] = sc.nextInt();
        }

        String[] studentslist = new String[n];
        for(int i = 0; i < n; i++){
            studentslist[i] = sc.next();
        }

        sc.close();

        //creating students objects in ArrayList
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String curr = studentslist[i];
            Student std = createStudent(curr);
            students.add(std);
        }

        // printStudents(students);

        //sorting the students
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b){
                if(Double.compare(a.percentage, b.percentage) > 0) return (int)(b.percentage - a.percentage);
            else if(Double.compare(a.percentage, b.percentage) == 0){
                if(a.id < b.id)
                    return a.id - b.id;
            }
            return (int)(b.percentage - a.percentage);
            }
        });

        // printStudents(students);
        
        //allocating the colleges
        for(int i = 0; i < students.size(); i++){
            Student std = students.get(i);
            int pref1 = std.preference1;
            int pref2 = std.preference2;
            int pref3 = std.preference3;

            if(collegeSeats[pref1 - 1] > 0){
                String id = "Student-"+std.id;
                String ch = " C-"+pref1;
                System.out.println(id + ch);
                collegeSeats[pref1 - 1]--;
            }
            else if(collegeSeats[pref2 - 1] > 0){
                String id = "Student-"+std.id;
                String ch = " C-"+pref2;
                System.out.println(id + ch);
                collegeSeats[pref2 - 1]--;
            }
            else if(collegeSeats[pref3 - 1] > 0){
                String id = "Student-"+std.id;
                String ch = " C-"+pref3;
                System.out.println(id + ch);
                collegeSeats[pref1 - 1]--;
            }
        }
    }
}
