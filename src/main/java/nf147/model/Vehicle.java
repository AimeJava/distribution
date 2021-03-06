package model;

import java.util.Date;

public class Vehicle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.vehicle_id
     *
     * @mbg.generated
     */
    private String vehicleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.vehicle_model
     *
     * @mbg.generated
     */
    private String vehicleModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.origin
     *
     * @mbg.generated
     */
    private String origin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.route_number
     *
     * @mbg.generated
     */
    private String routeNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.date
     *
     * @mbg.generated
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.purchase_date
     *
     * @mbg.generated
     */
    private Date purchaseDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.notes
     *
     * @mbg.generated
     */
    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.vehicle_id
     *
     * @return the value of vehicle.vehicle_id
     *
     * @mbg.generated
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.vehicle_id
     *
     * @param vehicleId the value for vehicle.vehicle_id
     *
     * @mbg.generated
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId == null ? null : vehicleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.vehicle_model
     *
     * @return the value of vehicle.vehicle_model
     *
     * @mbg.generated
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.vehicle_model
     *
     * @param vehicleModel the value for vehicle.vehicle_model
     *
     * @mbg.generated
     */
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel == null ? null : vehicleModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.origin
     *
     * @return the value of vehicle.origin
     *
     * @mbg.generated
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.origin
     *
     * @param origin the value for vehicle.origin
     *
     * @mbg.generated
     */
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.route_number
     *
     * @return the value of vehicle.route_number
     *
     * @mbg.generated
     */
    public String getRouteNumber() {
        return routeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.route_number
     *
     * @param routeNumber the value for vehicle.route_number
     *
     * @mbg.generated
     */
    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber == null ? null : routeNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.date
     *
     * @return the value of vehicle.date
     *
     * @mbg.generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.date
     *
     * @param date the value for vehicle.date
     *
     * @mbg.generated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.purchase_date
     *
     * @return the value of vehicle.purchase_date
     *
     * @mbg.generated
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.purchase_date
     *
     * @param purchaseDate the value for vehicle.purchase_date
     *
     * @mbg.generated
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.notes
     *
     * @return the value of vehicle.notes
     *
     * @mbg.generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.notes
     *
     * @param notes the value for vehicle.notes
     *
     * @mbg.generated
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}