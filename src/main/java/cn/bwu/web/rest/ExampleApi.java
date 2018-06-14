package cn.bwu.web.rest;

import cn.bwu.web.bean.JsonResult;
import cn.bwu.web.bean.Pageable;
import cn.bwu.web.service.SampleService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("exampleApi")
@RequestMapping("/api/example")
public class ExampleApi {

    @Autowired
    @Qualifier("sampleService")
    private SampleService sampleService;

    /**
     * 查询用户 分页列表
     */
    @RequestMapping(method = RequestMethod.GET, value = "/user/page")
    public JsonResult<Pageable<JSONObject>> example(@RequestParam(required = false) String startTime,
                                                    @RequestParam(defaultValue = "1") Integer page,
                                                    @RequestParam(defaultValue = "10") Integer pageSize) {
        Date startDate;
        if (StringUtils.isEmpty(startTime)) {
            startDate = new DateTime(new DateTime().plusDays(-6).toString("yyyy-MM-dd")).toDate();
        } else {
            startDate = new DateTime(startTime).toDate();
        }
        return JsonResult.success(sampleService.selectUserPageable(startDate, page, pageSize));
    }


}
