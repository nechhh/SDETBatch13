package class26;

import java.util.ArrayList;

public class Demo8 {


    public static void main(String[] args) {
        ArrayList<String> subjectSeen=new ArrayList<>();
        subjectSeen.add("SDLS");
        subjectSeen.add("Manual Teating");
        subjectSeen.add("Java");
        subjectSeen.add("Git");
        subjectSeen.add("Selenium");

        ArrayList<String> futureSubjects=new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");

        ArrayList<String> allSubject=new ArrayList<>();
        allSubject.addAll(subjectSeen);
        allSubject.addAll(futureSubjects);
        System.out.println("allSubject = " + allSubject);

        ArrayList<String> allSubject2=new ArrayList<>();
        allSubject.addAll(subjectSeen);
        allSubject.addAll(1,futureSubjects);
    }
    }

