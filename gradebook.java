import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] students = {"Nikoleta", "Vasil", "Martin","Svetoslav","Irina", "Aleksandar"};
        int[] grades = {99, 49, 89, 45, 35, 78 };

        /* Implement a switch case for the menu:
         * 1. Calculate Average
         * 2. Display the student with the highest grade
         * 3. Display the student with the lowest grade
         * 4. Display the count of students who are failing (>50 is failing)
         * 5. Look up student grade with user input.
         * 6. Exit. */
        System.out.println("Which of the following actions do you want to perform?");
        System.out.println("1. Calculate Average.");
        System.out.println("2. Display the student with the highest grade.");
        System.out.println("3. Display the student with the lowest grade.");
        System.out.println("4. Display the count of students who are failing (<50 is failing).");
        System.out.println("5. Look up student grade with user input.");
        System.out.println("6. Exit.");

        int action = scanner.nextInt();

        switch (action){
            case 1:
                System.out.println(calculateAverage(grades));
                break;
            case 2:
                System.out.println(findHighestGradeStudent(students, grades));
                break;
            case 3:
                System.out.println(findLowestGradeStudent(students, grades));
                break;
            case 4:
                System.out.println(countFailedStudents(grades));
                break;
            case 5:
                System.out.println(lookupStudentGrade(students, grades, "Svetoslav"));
                break;

        }
    }

    private static double calculateAverage(int[] grades) {
        double sum=0;
        for(int i=0;i<grades.length; i++) {
            sum += grades[i];
        }
        return sum/grades.length;
    }

    private static String findHighestGradeStudent(String[] studentNames, int[] grades) {
        int maxGrade = grades[0];
        int indexOfMax=0;
        for(int i=1;i<grades.length;i++){
            if(grades[i]>maxGrade){
                maxGrade=grades[i];
                indexOfMax=i;
            }
        }
        return studentNames[indexOfMax];
    }

    private static String findLowestGradeStudent(String[] studentNames, int[] grades) {
        int minGrade = grades[0];
        int indexOfMin=0;
        for(int i=1;i<grades.length;i++){
            if(grades[i]<minGrade){
                minGrade=grades[i];
                indexOfMin=i;
            }
        }
        return studentNames[indexOfMin];
    }


    private static int countFailedStudents(int[] grades) {
        int countFailed = 0;
        for(int i=0;i<grades.length;i++) {
            if(grades[i]<50) countFailed++;
        }
        return countFailed;
    }

    private static int lookupStudentGrade(String[] studentNames, int[] grades, String studentToLookup) {
        int grade=0;
        for(int i=0;i<studentNames.length;i++){
            if(studentNames[i].equals(studentToLookup)){
                grade=grades[i];
            }
        }
        return grade;
    }
}
