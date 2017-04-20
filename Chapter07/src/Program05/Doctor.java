/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program05;

/**
 *
 * @author janellejlo
 */
class Doctor extends Person {
    private String specialty;
    private double fee;

    public Doctor(String initialName, String specialty, double fee) {
        super(initialName);
        this.specialty = specialty;
        this.fee = fee;
    }

    public Doctor() {
        super();
        specialty = "None";
        fee = 0;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }



    @Override
    public void writeOutput( ) {
        System.out.println("Name: " + getName()+"\nSpecialty: "+specialty+"\nFee: $"+fee);
    }

    @Override
    public boolean equals(Object obj) {

        final Doctor other = (Doctor) obj;

        if(!this.getName().equals(other.getName())) {
            return false;
        }

        if (!this.specialty.equals(other.specialty)) {
            return false;
        }
        
        if (this.fee != other.fee) {
            return false;
        }

        return true;
    }
}