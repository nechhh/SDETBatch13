package class24;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent() };

        for (Student st:students){
            st.study();
            st.doHomeWork();
            st.practice();
        }
        /*for(int i=0; i<students.length; i++){
            students[i].study();
            students[i].doHomeWork();
            students[i].practice();
        }*/
    }
}
