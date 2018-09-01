package love.fundraising.service;

import love.fundraising.entity.BHelpListEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author auto
 * @email 
 * @date 2018-09-01 19:41:24
 */
public interface BHelpListService {
	
	BHelpListEntity queryObject(Integer id);
	
	List<BHelpListEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(BHelpListEntity bHelpList);
	
	void update(BHelpListEntity bHelpList);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
