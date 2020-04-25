package cn.benevolence.doctor.mapper;

import cn.benevolence.doctor.model.Doctor;
import cn.benevolence.doctor.model.DoctorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DoctorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    long countByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int deleteByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int insert(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int insertSelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    List<Doctor> selectByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    Doctor selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Doctor record);
}