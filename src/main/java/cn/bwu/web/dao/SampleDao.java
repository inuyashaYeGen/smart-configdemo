package cn.bwu.web.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface SampleDao {

    /**
     * 查询用户数
     * @param startTime 起始时间
     * @return 个数
     */
    int countUsers(@Param("startTime") Date startTime);

    /**
     * 查询用户 分页列表
     * @param param json参数
     * @return list
     */
    List<JSONObject> selectUserPageable(JSONObject param);
}
