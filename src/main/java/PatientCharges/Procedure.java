/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCharges;

/**
 *
 * @author drewm
 */
public class Procedure {
    String procedureName;
    String proceedureDate;
    String doctorName;
    double procedureCharges;

    public Procedure(String procedureName, String proceedureDate, String doctorName, double procedureCharges) {
        this.procedureName = procedureName;
        this.proceedureDate = proceedureDate;
        this.doctorName = doctorName;
        this.procedureCharges = procedureCharges;
    }

    @Override
    public String toString() {
        return "Procedure{" + "Procedure = " + procedureName + ", Date = " + proceedureDate + ", Dcotor = " + doctorName + ", Procedure Charges = " + procedureCharges + '}';
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }
    
}
