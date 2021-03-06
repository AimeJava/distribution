package dao;

import java.util.List;
import model.DeliveryArea;

public interface DeliveryAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delivery_area
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer daId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delivery_area
     *
     * @mbg.generated
     */
    int insert(DeliveryArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delivery_area
     *
     * @mbg.generated
     */
    DeliveryArea selectByPrimaryKey(Integer daId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delivery_area
     *
     * @mbg.generated
     */
    List<DeliveryArea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table delivery_area
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DeliveryArea record);
}