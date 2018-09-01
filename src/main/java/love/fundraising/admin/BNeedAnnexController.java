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

import love.fundraising.entity.BNeedAnnexEntity;
import love.fundraising.service.BNeedAnnexService;
import love.fundraising.utils.PageUtils;
import love.fundraising.utils.Query;
import love.fundraising.utils.R;


/**
 * 
 * 
 * @author auto
 * @email 
 * @date 2018-09-01 19:41:25
 */
@RestController
@RequestMapping("bneedannex")
public class BNeedAnnexController {
	@Autowired
	private BNeedAnnexService bNeedAnnexService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("bneedannex:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<BNeedAnnexEntity> bNeedAnnexList = bNeedAnnexService.queryList(query);
		int total = bNeedAnnexService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(bNeedAnnexList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("bneedannex:info")
	public R info(@PathVariable("id") Integer id){
		BNeedAnnexEntity bNeedAnnex = bNeedAnnexService.queryObject(id);
		
		return R.ok().put("bNeedAnnex", bNeedAnnex);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("bneedannex:save")
	public R save(@RequestBody BNeedAnnexEntity bNeedAnnex){
		bNeedAnnexService.save(bNeedAnnex);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("bneedannex:update")
	public R update(@RequestBody BNeedAnnexEntity bNeedAnnex){
		bNeedAnnexService.update(bNeedAnnex);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("bneedannex:delete")
	public R delete(@RequestBody Integer[] ids){
		bNeedAnnexService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
