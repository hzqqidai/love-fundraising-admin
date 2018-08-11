package love.fundraising.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import love.fundraising.dao.BNeedInfoDao;
import love.fundraising.entity.BNeedInfoEntity;
import love.fundraising.service.BNeedInfoService;



@Service("bNeedInfoService")
public class BNeedInfoServiceImpl implements BNeedInfoService {
	@Autowired
	private BNeedInfoDao bNeedInfoDao;
	
	@Override
	public BNeedInfoEntity queryObject(Long id){
		return bNeedInfoDao.queryObject(id);
	}
	
	@Override
	public List<BNeedInfoEntity> queryList(Map<String, Object> map){
		return bNeedInfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return bNeedInfoDao.queryTotal(map);
	}
	
	@Override
	public void save(BNeedInfoEntity bNeedInfo){
		bNeedInfoDao.save(bNeedInfo);
	}
	
	@Override
	public void update(BNeedInfoEntity bNeedInfo){
		bNeedInfoDao.update(bNeedInfo);
	}
	
	@Override
	public void delete(Long id){
		bNeedInfoDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		bNeedInfoDao.deleteBatch(ids);
	}
	
}
