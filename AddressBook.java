package com.bridgelabz;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNumber;
    String email;

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook("Dinesh", "Kumar", "Gandhi Nagar", "Dwarka", "New Delhi", 121, 256654, "abc@ghi.com");
        System.out.println(addressBook.toString());
    }
}
