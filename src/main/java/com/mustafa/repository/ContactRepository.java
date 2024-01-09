package com.mustafa.repository;

import com.mustafa.entity.Contact;

public class ContactRepository extends RepositoryManager<Contact,Long> {
    public ContactRepository(){
        super(new Contact());
    }
}
