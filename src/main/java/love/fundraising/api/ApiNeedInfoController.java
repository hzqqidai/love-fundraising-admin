package love.fundraising.api;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import love.fundraising.entity.BNeedInfoEntity;
import love.fundraising.service.BNeedInfoService;
import love.fundraising.utils.PageUtils;
import love.fundraising.utils.Query;
import love.fundraising.utils.R;

@RestController
@RequestMapping("/api/need")
@Api("需求接口")
public class ApiNeedInfoController extends ApiAbstractController{

	@Autowired
	private BNeedInfoService bNeedInfoService;
	
	/**
	 * 查询公告列表
	 * 
	 * @throws IOException
	 */
	@RequestMapping("/needList")
	public R needList(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<BNeedInfoEntity> bNeedInfoList = bNeedInfoService.queryList(query);
		int total = bNeedInfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(bNeedInfoList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
}
