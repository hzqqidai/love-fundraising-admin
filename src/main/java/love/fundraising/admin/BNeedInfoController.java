package love.fundraising.admin;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import love.fundraising.entity.BNeedInfoEntity;
import love.fundraising.service.BNeedInfoService;
import love.fundraising.utils.PageUtils;
import love.fundraising.utils.Query;
import love.fundraising.utils.R;


/**
 * 需求表
 * 
 * @author auto
 * @email 
 * @date 2018-08-11 22:51:30
 */
@RestController
@RequestMapping("bneedinfo")
public class BNeedInfoController {
	@Autowired
	private BNeedInfoService bNeedInfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<BNeedInfoEntity> bNeedInfoList = bNeedInfoService.queryList(query);
		int total = bNeedInfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(bNeedInfoList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Long id){
		BNeedInfoEntity bNeedInfo = bNeedInfoService.queryObject(id);
		
		return R.ok().put("bNeedInfo", bNeedInfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("bneedinfo:save")
	public R save(@RequestBody BNeedInfoEntity bNeedInfo){
		bNeedInfoService.save(bNeedInfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("bneedinfo:update")
	public R update(@RequestBody BNeedInfoEntity bNeedInfo){
		bNeedInfoService.update(bNeedInfo);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("bneedinfo:delete")
	public R delete(@RequestBody Long[] ids){
		bNeedInfoService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
