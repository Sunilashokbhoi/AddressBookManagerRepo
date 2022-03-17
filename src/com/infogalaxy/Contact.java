package com.infogalaxy;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String mobno;
    private String email;
    private String zip;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName1){
        this.lastName = lastName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setMobno(String mobno){
        this.mobno = mobno;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public String getMobno(){
        return this.mobno;
    }
    public String getEmail(){
        return this.email;
    }
    public String getZip(){
        return this.zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobno='" + mobno + '\'' +
                ", email='" + email + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}

