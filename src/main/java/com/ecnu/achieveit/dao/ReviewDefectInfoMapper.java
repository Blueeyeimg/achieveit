package com.ecnu.achieveit.dao;

import com.ecnu.achieveit.model.ReviewDefectInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReviewDefectInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_defect_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer reviewDefectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_defect_info
     *
     * @mbg.generated
     */
    int insert(ReviewDefectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_defect_info
     *
     * @mbg.generated
     */
    int insertSelective(ReviewDefectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_defect_info
     *
     * @mbg.generated
     */
    ReviewDefectInfo selectByPrimaryKey(Integer reviewDefectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_defect_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReviewDefectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table review_defect_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReviewDefectInfo record);


    List<ReviewDefectInfo> selectListByProjectId(String projectId);


    List<ReviewDefectInfo> selectListByProviderId(String providerId);


    List<ReviewDefectInfo> selectListBySolverId(String solverId);


    List<ReviewDefectInfo> selectListByProjectIdAndState(@Param("projectId") String projectId, @Param("state") Integer state);


    List<ReviewDefectInfo> selectListByProjectIdAndType(@Param("projectId")String projectId, @Param("type") String type);
}