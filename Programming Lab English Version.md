# Programming Lab (Grade System)



# Goal



1. Define the use cases for teachers, students, and administrative personnel.

2. Define the Entity-Relationship diagram

3. Analyze the project

4. Based on the analysis define the relationship diagram of classes of model to be proposed.

5. Define the application services based on the proposed model

6. Implement the services by means of the Java Spring Framework



## Description

A University (Polytechnic or school) has a set of careers. Each of these careers is defined by a pensum. The function of the pensum is to establish the subjects that must be seen in each career or otherwise the curriculum. A subject, depending on the university, is defined by a unique name (or at least a unique form of identification - the format depends on the university), an area of knowledge, a number of credits (a value of 1 to a maximum - it is up to each university to define it). At the beginning of the academic period, depending on the registered careers and their established curriculum, the administrative part of the University oversees opening one or more courses of each of the subjects; once a particular course is opened, it is assigned to a teacher in charge of teaching it and score the students. The function of the teacher, once the course is assigned, is to register the evaluations that the course will have. An evaluation has a unique name and a percentage of the value of the grade in the final grade of the course.



Before starting the academic period, a teacher records the evaluations that the course will have and during the academic period records the grades obtained by the students. The registration of a grade must inform the student. Students can consult from the very beginning of the academic period their grades obtained in each of the evaluations presented to the different courses they are enrolled in and at the end obtain the final grade for the subject within the pensum that each student has when registered in a particular career.



* The pensum serves to define the subjects that a career will have.

* Each subject within the pensum will define the number of credits (NC), the name of the subject and the semester (or academic period) in which it must be taken.
*  The total credits of a course (TCC) are computed by adding all the credits of all the subjects in the curriculum.
* For each subject, the percentage (P) that the subject contributes to the course is calculated P = NC / TCC.
*  When a course is created, the specific curriculum is defined.
* An academic period or semester has several parts: beginning of the semester, where the courses per subject are defined, the teacher(s) are assigned to teach the subject; the current semester period, where the classes per course begin and grades are recorded; and the end of the semester, where the semester ends and the grade obtained by the student is recorded, indicating whether he/she approved or failed.
* The administrative part, at the beginning of the semester, registers the courses and the assignment of teachers. 
* Once a teacher is assigned to a course, he/she establishes the evaluations of the course or courses assigned to him/her.
* A teacher will record during the current term the grades earned by each student enrolled in the course(s).
* A student can view the grades recorded during the academic period, either by having them emailed to him/her, or by viewing them in the system.
* A student at the end of the academic period will receive an e-mail indicating the passing or failing grade. You can also check the final grade.
* The University through the administrative staff establishes the end of the term.
* The administrative staff formally closes the course and uploads the final grade record by subject.
* In this project, the behavior will be shown for one semester, it will be assumed that the databases of Pensum, Subjects, Teachers, Students are already full, and no specific work will be done on them.



## Users



* Students, receive the information of each registered grade, view the evaluations contained in each enrolled course and receive confirmation of the final grade (Pass or Fail).
* Teachers, assign the evaluations to each assigned course. Where each evaluation has a percentage, they should also have a certain date of the evaluation, but for ease of the project will be omitted. Also, they have the function of recording the grades.
* Administrative personnel, they register the careers, the corresponding pensums and the registration of new students.

)