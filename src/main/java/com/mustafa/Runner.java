package com.mustafa;

import com.mustafa.entity.Contact;
import com.mustafa.entity.Student;
import com.mustafa.repository.StudentRepository;

public class Runner {
    public static void main(String[] args) {

        addStudentAndContact();
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

}