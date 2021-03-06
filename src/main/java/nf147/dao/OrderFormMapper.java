package dao;

import java.util.List;
import model.OrderForm;

public interface OrderFormMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_form
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_form
     *
     * @mbg.generated
     */
    int insert(OrderForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_form
     *
     * @mbg.generated
     */
    OrderForm selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_form
     *
     * @mbg.generated
     */
    List<OrderForm> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_form
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderForm record);
}