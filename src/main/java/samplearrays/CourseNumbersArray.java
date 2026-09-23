package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse = 2200;
        int[] updatedCourses = new int[7];
        for(int i =0; i<7;i++){
            updatedCourses[i] = registeredCourses[i];
            System.out.println(updatedCourses[i]);
        }
        updatedCourses[6] = newCourse;
        System.out.println(updatedCourses[6]);

        int courseToCheck = 2140;
        int flag = 0;
        for(int course : updatedCourses){
            if(course==courseToCheck){
                flag = 1;
                break;
            }

        }
        if (flag==0){
        System.out.println("Course " + courseToCheck + "does not exist in courses.");}
        else {
            System.out.println("Course " + courseToCheck + "exists in courses.");
        }
    }
}
