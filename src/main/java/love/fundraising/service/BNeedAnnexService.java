package love.fundraising.service;

import love.fundraising.entity.BNeedAnnexEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author auto
 * @email 
 * @date 2018-09-01 19:41:25
 */
public interface BNeedAnnexService {
	
	BNeedAnnexEntity queryObject(Integer id);
	
	List<BNeedAnnexEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(BNeedAnnexEntity bNeedAnnex);
	
	void update(BNeedAnnexEntity bNeedAnnex);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
