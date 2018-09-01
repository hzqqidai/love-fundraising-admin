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

import love.fundraising.entity.BHelpListEntity;
import love.fundraising.service.BHelpListService;
import love.fundraising.utils.PageUtils;
import love.fundraising.utils.Query;
import love.fundraising.utils.R;


/**
 * 
 * 
 * @author auto
 * @email 
 * @date 2018-09-01 19:41:24
 */
@RestController
@RequestMapping("bhelplist")
public class BHelpListController {
	@Autowired
	private BHelpListService bHelpListService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("bhelplist:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<BHelpListEntity> bHelpListList = bHelpListService.queryList(query);
		int total = bHelpListService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(bHelpListList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("bhelplist:info")
	public R info(@PathVariable("id") Integer id){
		BHelpListEntity bHelpList = bHelpListService.queryObject(id);
		
		return R.ok().put("bHelpList", bHelpList);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("bhelplist:save")
	public R save(@RequestBody BHelpListEntity bHelpList){
		bHelpListService.save(bHelpList);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("bhelplist:update")
	public R update(@RequestBody BHelpListEntity bHelpList){
		bHelpListService.update(bHelpList);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("bhelplist:delete")
	public R delete(@RequestBody Integer[] ids){
		bHelpListService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
