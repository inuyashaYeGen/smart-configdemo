package cn.bwu.web.service;

import cn.bwu.web.bean.Pageable;
import cn.bwu.web.dao.SampleDao;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("sampleService")
public class SampleService {

    @Autowired
    private SampleDao sampleDao;

    /**
     * 查询用户 分页列表
     * @param startTime 起始时间
     * @param page 起始页
     * @param pageSize 每页用户数
     * @return 用户分页列表
     */
    public Pageable<JSONObject> selectUserPageable(Date startTime, int page, int pageSize) {
        int total = sampleDao.countUsers(startTime);
        Pageable<JSONObject> result = new Pageable<>(total, pageSize, page);
        JSONObject param = new JSONObject();
        param.put("startTime", startTime);
        param.put("pageSize", pageSize);
        param.put("start", result.getStart());
        result.setItems(sampleDao.selectUserPageable(param));
        return result;
    }


}
