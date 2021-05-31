package com.hazir.Hazirlaniyor.api.controllers;

import com.hazir.Hazirlaniyor.business.concretes.ContactManager;
import com.hazir.Hazirlaniyor.entity.concretes.Contact;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/contact")
@AllArgsConstructor
public class ContactController {
    private final ContactManager contactManager;
@GetMapping
    public List<Contact> getAll(){
    return this.contactManager.getContacts();
}
@GetMapping(path = "{firstName}")
    public List<Contact> findContactAccountByName(@PathVariable("firstName")String firstName){
    return this.contactManager.findContactByName(firstName);
}
@PostMapping
    public void addContact(@RequestBody Contact contact){
      this.contactManager.addNewContact(contact);
}
@DeleteMapping(path = "{id}")
    public void deleteContactById(@PathVariable("Id")Long Id){
    this.contactManager.deleteContactById(Id);
}

}
