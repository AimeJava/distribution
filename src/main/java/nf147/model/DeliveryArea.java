package model;

public class DeliveryArea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_area.da_id
     *
     * @mbg.generated
     */
    private Integer daId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_area.da_name
     *
     * @mbg.generated
     */
    private String daName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_area.da_price
     *
     * @mbg.generated
     */
    private Long daPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_area.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_area.notes
     *
     * @mbg.generated
     */
    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_area.da_id
     *
     * @return the value of delivery_area.da_id
     *
     * @mbg.generated
     */
    public Integer getDaId() {
        return daId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_area.da_id
     *
     * @param daId the value for delivery_area.da_id
     *
     * @mbg.generated
     */
    public void setDaId(Integer daId) {
        this.daId = daId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_area.da_name
     *
     * @return the value of delivery_area.da_name
     *
     * @mbg.generated
     */
    public String getDaName() {
        return daName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_area.da_name
     *
     * @param daName the value for delivery_area.da_name
     *
     * @mbg.generated
     */
    public void setDaName(String daName) {
        this.daName = daName == null ? null : daName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_area.da_price
     *
     * @return the value of delivery_area.da_price
     *
     * @mbg.generated
     */
    public Long getDaPrice() {
        return daPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_area.da_price
     *
     * @param daPrice the value for delivery_area.da_price
     *
     * @mbg.generated
     */
    public void setDaPrice(Long daPrice) {
        this.daPrice = daPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_area.city
     *
     * @return the value of delivery_area.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_area.city
     *
     * @param city the value for delivery_area.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_area.notes
     *
     * @return the value of delivery_area.notes
     *
     * @mbg.generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_area.notes
     *
     * @param notes the value for delivery_area.notes
     *
     * @mbg.generated
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}