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

import love.fundraising.entity.BHelpTypeEntity;
import love.fundraising.service.BHelpTypeService;
import love.fundraising.utils.PageUtils;
import love.fundraising.utils.Query;
import love.fundraising.utils.R;


/**
 * 类型表
 * 
 * @author auto
 * @email 
 * @date 2018-08-11 22:51:30
 */
@RestController
@RequestMapping("bhelptype")
public class BHelpTypeController {
	@Autowired
	private BHelpTypeService bHelpTypeService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("bhelptype:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<BHelpTypeEntity> bHelpTypeList = bHelpTypeService.queryList(query);
		int total = bHelpTypeService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(bHelpTypeList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("bhelptype:info")
	public R info(@PathVariable("id") Long id){
		BHelpTypeEntity bHelpType = bHelpTypeService.queryObject(id);
		
		return R.ok().put("bHelpType", bHelpType);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("bhelptype:save")
	public R save(@RequestBody BHelpTypeEntity bHelpType){
		bHelpTypeService.save(bHelpType);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("bhelptype:update")
	public R update(@RequestBody BHelpTypeEntity bHelpType){
		bHelpTypeService.update(bHelpType);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("bhelptype:delete")
	public R delete(@RequestBody Long[] ids){
		bHelpTypeService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
