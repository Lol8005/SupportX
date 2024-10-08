package Entity;
/*
 *  Author: Tan Qian Yiin
 *  ID: 2307616
 *
 * */

import java.io.Serializable;

public class Volunteer extends Applicants implements Serializable {

    private String id;
    private String gender;
    private String age;
    private String availability;

    public Volunteer (){

    }

    public Volunteer(String id,  String name, String age, String gender, String phone, String email, String availability) {
        super(name, email, phone);
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "," + super.name + "," + age + "," + gender + "," + super.phone + "," + super.email + "," + availability;
    }


}

