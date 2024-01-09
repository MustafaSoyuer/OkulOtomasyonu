package com.mustafa;

import com.mustafa.entity.Contact;
import com.mustafa.entity.Student;

public class Runner {
    public static void main(String[] args) {

    }

    private static void addStudentAndContact(){
        Student student1 = Student.builder()
                .name("Umit")
                .surname("Gecekusu")
                .build();

        Student student2 = new Student();
        student2.setName("Meryem");
        student2.setSurname("Macaroglu");

        Contact contact1 = Contact.builder()
                .city("Ankara")
                .zipcode("06123")
                .phone("0 555 111 2233")
                .parent("Ali")
                .student(student1)
                .build();

        Contact contact2 = new Contact();





    }

}