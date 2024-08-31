/*
 *  Author: Sim Hor Kang
 *  ID: 2307611
 *
 * */

package Entity;

public class Donor extends Applicants {

    private String id;
    private String category;
    private String type;

    public Donor (){

    }

    public Donor(String id, String name, String email, String phone , String category, String type) {
        super(name, email, phone);
        this.id = id;
        this.category = category;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + super.toString() + "," + category + "," + type;
    }

}

