package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Владимир", "Георафия");
        Student student = new Student("Максим");
        teacher.evalute(student);
    }
}

class Teacher {
    private String name;
    private String thing;

    public Teacher(String name, String thing) {
        this.name = name;
        this.thing = thing;
    }

    void evalute(Student student) {
        int rating = (int) (Math.random() * 4) + 2;
        String ratingStudent = null;
        if (rating == 2) {
            ratingStudent = "Неудовлетворительно";
        } else if (rating == 3) {
            ratingStudent = "Удовлетворительно";
        } else if (rating == 4) {
            ratingStudent = "Хорошо";
        } else if (rating == 5) {
            ratingStudent = "Отлично";
        }
        System.out.println("Преподаватель: " + name + " оценил студента с именем " + student.studentName + " по предмету " + thing + " на оценку " + ratingStudent);
    }
}

class Student {
    protected String studentName;

    public Student(String name) {
        this.studentName = name;
    }
}