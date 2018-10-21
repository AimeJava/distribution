package dao;

import java.util.List;
import model.Dispatching;

public interface DispatchingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatching
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatching
     *
     * @mbg.generated
     */
    int insert(Dispatching record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatching
     *
     * @mbg.generated
     */
    Dispatching selectByPrimaryKey(Integer dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatching
     *
     * @mbg.generated
     */
    List<Dispatching> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dispatching
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dispatching record);
}