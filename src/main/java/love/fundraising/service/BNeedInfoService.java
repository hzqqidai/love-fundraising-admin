package love.fundraising.service;

import love.fundraising.entity.BNeedInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 需求表
 * 
 * @author auto
 * @email 
 * @date 2018-08-11 22:51:30
 */
public interface BNeedInfoService {
	
	BNeedInfoEntity queryObject(Long id);
	
	List<BNeedInfoEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(BNeedInfoEntity bNeedInfo);
	
	void update(BNeedInfoEntity bNeedInfo);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
