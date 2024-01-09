package com.mustafa;

import com.mustafa.entity.Contact;
import com.mustafa.entity.Lesson;
import com.mustafa.entity.Student;
import com.mustafa.entity.Teacher;
import com.mustafa.repository.LessonRepository;
import com.mustafa.repository.StudentRepository;
import com.mustafa.repository.TeacherRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        addAll();

//        addStudentAndLesson();
//        addStudentAndContact();
//        addLessonAndTeacher();
    }

    private static void addAll(){
        Lesson lesson1 = Lesson.builder()
                .name("Yazilim")
                .build();

        Teacher teacher1 = Teacher.builder()
                .name("Muhammet HOCA")
                .lesson(lesson1)
                .build();

        lesson1.setTeacher(teacher1);
        new TeacherRepository().save(teacher1);


        Lesson lesson2 = new Lesson();
        lesson2.setName("Matematik");

        Teacher teacher2 = new Teacher();
        teacher2.setName("Bahar HOCA");
        teacher2.setLesson(lesson2);

        lesson2.setTeacher(teacher2);
        new TeacherRepository().save(teacher2);

        Contact contact1 = Contact.builder()
                .city("Ankara")
                .zipcode("06123")
                .phone("0 555 111 2233")
                .parent("Ali")
                .build();

        Student student1 = Student.builder()
                .name("Umit")
                .surname("Gecekusu")
                .contact(contact1)
                .build();

        contact1.setStudent(student1);
        new StudentRepository().save(student1);

        Contact contact2 = new Contact();
        contact2.setCity("Istanbul");
        contact2.setZipcode("34123");
        contact2.setPhone("0 555 222 3344");
        contact2.setParent("Veli");

        Student student2 = new Student();
        student2.setName("Meryem");
        student2.setSurname("Macaroglu");
        student2.setContact(contact2);

        contact2.setStudent(student2);
        new StudentRepository().save(student2);

        Contact contact3 = new Contact();
        contact3.setCity("Mugla");
        contact3.setZipcode("48111");
        contact3.setPhone("0 555 222 4444");
        contact3.setParent("Kemal");

        Student student3 = new Student();
        student3.setName("Mustafa");
        student3.setSurname("Soyuer");
        student3.setContact(contact3);

        contact3.setStudent(student3);
        new StudentRepository().save(student3);

        Contact contact4 = new Contact();
        contact4.setCity("Izmir");
        contact4.setZipcode("35132");
        contact4.setPhone("0 555 222 3535");
        contact4.setParent("Mahmut");

        Student student4 = new Student();
        student4.setName("Mehmet Giray");
        student4.setSurname("Cinar");
        student4.setContact(contact4);


        contact4.setStudent(student4);
        new StudentRepository().save(student4);



        lesson1.setStudentList(List.of(student1,student2));
//        student1.setLessonList(List.of(lesson1));
//        student2.setLessonList(List.of(lesson1));
        new LessonRepository().save(lesson1);

        lesson2.setStudentList(List.of(student3,student4));
//        student3.setLessonList(List.of(lesson2));
//        student4.setLessonList(List.of(lesson2));
        new LessonRepository().save(lesson2);

    }

    private static void addStudentAndLesson(){

//        Student student1 = new StudentRepository().findById(1L).get();
//        Student student2 = new StudentRepository().findById(2L).get();
//        Lesson lesson1 = new LessonRepository().findById(1L).get();

        Student student1 = Student.builder()
                .name("Mustafa")
                .surname("Soyuer")
                .build();

        Student student2 = new Student();
        student2.setName("Mehmet Giray");
        student2.setSurname("Cinar");

        Lesson lesson1 = Lesson.builder()
                .name("Java")
                .build();

        lesson1.setStudentList(List.of(student1,student2));
        student1.setLessonList(List.of(lesson1));
        student2.setLessonList(List.of(lesson1));
        new LessonRepository().save(lesson1);

    }

    private static void addStudentAndContact(){
        Contact contact1 = Contact.builder()
                .city("Ankara")
                .zipcode("06123")
                .phone("0 555 111 2233")
                .parent("Ali")
                .build();

        Student student1 = Student.builder()
                .name("Umit")
                .surname("Gecekusu")
                .contact(contact1)
                .build();

        contact1.setStudent(student1);
        new StudentRepository().save(student1);

        Contact contact2 = new Contact();
        contact2.setCity("Istanbul");
        contact2.setZipcode("34123");
        contact2.setPhone("0 555 222 3344");
        contact2.setParent("Veli");

        Student student2 = new Student();
        student2.setName("Meryem");
        student2.setSurname("Macaroglu");
        student2.setContact(contact2);

        contact2.setStudent(student2);
        new StudentRepository().save(student2);

    }

    private static void addLessonAndTeacher(){
        Lesson lesson1 = Lesson.builder()
                .name("Yazilim")
                .build();

        Teacher teacher1 = Teacher.builder()
                .name("Muhammet HOCA")
                .lesson(lesson1)
                .build();

        lesson1.setTeacher(teacher1);
        new TeacherRepository().save(teacher1);


        Lesson lesson2 = new Lesson();
        lesson2.setName("Matematik");

        Teacher teacher2 = new Teacher();
        teacher2.setName("Bahar HOCA");
        teacher2.setLesson(lesson2);

        lesson2.setTeacher(teacher2);
        new TeacherRepository().save(teacher2);
    }
}