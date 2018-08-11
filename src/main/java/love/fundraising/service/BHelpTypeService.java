package love.fundraising.service;

import love.fundraising.entity.BHelpTypeEntity;

import java.util.List;
import java.util.Map;

/**
 * 类型表
 * 
 * @author auto
 * @email 
 * @date 2018-08-11 22:51:30
 */
public interface BHelpTypeService {
	
	BHelpTypeEntity queryObject(Long id);
	
	List<BHelpTypeEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(BHelpTypeEntity bHelpType);
	
	void update(BHelpTypeEntity bHelpType);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
