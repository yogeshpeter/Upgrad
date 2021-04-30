package com.company.upgrad;

public class Passenger {

    private static int idCount = 0;
    int id;
    public static  class Address {
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    public static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    public Address address;
    public Contact contact;
    public Passenger (String street, String city, String state,String name, String phone, String email,int id) {
        this.id = ++idCount;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public static int getIdCount() {
        return idCount;
    }
}
