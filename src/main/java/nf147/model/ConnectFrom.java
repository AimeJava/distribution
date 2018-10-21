package model;

import java.util.Date;

public class ConnectFrom {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column connect_from.origin_city
     *
     * @mbg.generated
     */
    private String originCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column connect_from.destination_city
     *
     * @mbg.generated
     */
    private String destinationCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column connect_from.arrive_city
     *
     * @mbg.generated
     */
    private String arriveCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column connect_from.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column connect_from.date
     *
     * @mbg.generated
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column connect_from.notes
     *
     * @mbg.generated
     */
    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column connect_from.origin_city
     *
     * @return the value of connect_from.origin_city
     *
     * @mbg.generated
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column connect_from.origin_city
     *
     * @param originCity the value for connect_from.origin_city
     *
     * @mbg.generated
     */
    public void setOriginCity(String originCity) {
        this.originCity = originCity == null ? null : originCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column connect_from.destination_city
     *
     * @return the value of connect_from.destination_city
     *
     * @mbg.generated
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column connect_from.destination_city
     *
     * @param destinationCity the value for connect_from.destination_city
     *
     * @mbg.generated
     */
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity == null ? null : destinationCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column connect_from.arrive_city
     *
     * @return the value of connect_from.arrive_city
     *
     * @mbg.generated
     */
    public String getArriveCity() {
        return arriveCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column connect_from.arrive_city
     *
     * @param arriveCity the value for connect_from.arrive_city
     *
     * @mbg.generated
     */
    public void setArriveCity(String arriveCity) {
        this.arriveCity = arriveCity == null ? null : arriveCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column connect_from.state
     *
     * @return the value of connect_from.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column connect_from.state
     *
     * @param state the value for connect_from.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column connect_from.date
     *
     * @return the value of connect_from.date
     *
     * @mbg.generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column connect_from.date
     *
     * @param date the value for connect_from.date
     *
     * @mbg.generated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column connect_from.notes
     *
     * @return the value of connect_from.notes
     *
     * @mbg.generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column connect_from.notes
     *
     * @param notes the value for connect_from.notes
     *
     * @mbg.generated
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}