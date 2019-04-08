package vu.lt.mybatis.dao;

import java.util.List;


import org.mybatis.cdi.Mapper;
import vu.lt.mybatis.model.Book;


@Mapper
public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *ß
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    List<Book> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Sun Mar 03 13:45:02 EET 2019
     */
    int updateByPrimaryKey(Book record);
}