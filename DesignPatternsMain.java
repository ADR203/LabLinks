package edu.sdsu.cs160l.ScholarshipApplication;

import edu.sdsu.cs160l.university.lab5.application.Applicant;
import edu.sdsu.cs160l.university.lab5.application.UniversityApplication;
import edu.sdsu.cs160l.university.lab5.course.CS160;
import edu.sdsu.cs160l.university.lab5.course.Course;
import edu.sdsu.cs160l.university.lab5.course.CourseFactory;
import edu.sdsu.cs160l.university.lab5.criteria.StudentStrategy;
import edu.sdsu.cs160l.university.lab5.registrar.Registrar;
import edu.sdsu.cs160l.university.lab5.student.Student;

/**
 * TODO
 *  1) create your own template for admission with the following specs
 *     a) Create a class ScholarshipApplication in the application package.
 *     b) That class should implement UniversityApplication Interface
 *     c) submitScore should accept Applicant with score of 3.2 and above if not throw and Exception
 *     d) submitDocuments must set documents String to applicants document variable
 *     e) checkStatus must return true if applicants score is 3.2 and above and has non null document string
 *     f) uncomment line 14 on ScholarshipApplicationTest class and run tests
 *  2) make cs150, cs160, cs210 and cs340 courses a singleton class (Refer Registrar for inspiration)
 *     a) Note your code change has a cascading change in you CourseFactory class (hint you can't do a "new" Anymore, use getInstance instead)
 *
 * 
 * Remember design principle 1.
 * Program to and interface and not an Implementation.
 * <p>
 * Design principle 2
 * Prefer a has a relationship over is a relationship.
 */
public class DesignPatternsMain {
    public static void main(String[] args) {
        //write sample code here
        CS160 cs160 = new CS160();
        //Registrar reg = new Registrar();

        public void submitScore (Applicant applicant,float score){
            if (score < 3.2) {
                applicant.setAdmitted(false);
                throw new UnsupportedOperationException("Cannot admit student to graduate program if his score is below 3.2");
            }
            applicant.setApplicantScore(score);
        }

        public void submitDocuments (Applicant applicant, String documents){
            if (applicant.isAdmitted()) {
                applicant.setApplicantDocuments(documents);
            } else {
                throw new UnsupportedOperationException("Cannot submit documents until you are admitted");
            }
        }

        public boolean checkStatus (Applicant applicant){
            return applicant.isAdmitted();
        }

        Course cs150 = Course.getInstance();
        Course cs160 = Course.getInstance();
        Course cs210 = Course.getInstance();
        Course cs340 = Course.getInstance();


        class Course {

            private static Course class_instance = null;

            public static Course getInstance(){
                if(class_instance==null){
                    class_instance = new class_instance();
                }
                return class_instance;
            }


        }


    }
}

