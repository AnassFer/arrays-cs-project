package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    Student[] students = {new Student(1,"Anass"), new Student(2, "Douae", 20), new Student(3, "Ilyass",25, 17), new Student(4, "Amine", 31, 19), new Student(5, "Imane")};

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for(Student student: students){
            if (student.getAge() > oldest.getAge()){
                oldest = student;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0;
        for(Student student: students){
            if (student.getAge() >= 18){
                count++;
            }
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int count = 0;
        for(Student student: students){

                count+= student.getGrade();

        }
        return (double) count /students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) return students[i];
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()) );
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        System.out.println("High achievers:");
        for (Student student : students){
            if(student.getGrade()>=15) System.out.println(student.getName()+" ");
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId() == id) {
                students[i].setGrade(newGrade);
                return true;}

        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {

        for(Student student1 : students){
            for (Student student2 : students){
                if(student1.getName().equalsIgnoreCase(student2.getName())) return true
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents ;
        newStudents = Arrays.copyOf(students, students.length+1);
        newStudents[newStudents.length-1] = newStudent;
        return newStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students


        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}

