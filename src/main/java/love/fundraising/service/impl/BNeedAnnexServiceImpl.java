package love.fundraising.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import love.fundraising.dao.BNeedAnnexDao;
import love.fundraising.entity.BNeedAnnexEntity;
import love.fundraising.service.BNeedAnnexService;



@Service("bNeedAnnexService")
public class BNeedAnnexServiceImpl implements BNeedAnnexService {
	@Autowired
	private BNeedAnnexDao bNeedAnnexDao;
	
	@Override
	public BNeedAnnexEntity queryObject(Integer id){
		return bNeedAnnexDao.queryObject(id);
	}
	
	@Override
	public List<BNeedAnnexEntity> queryList(Map<String, Object> map){
		return bNeedAnnexDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return bNeedAnnexDao.queryTotal(map);
	}
	
	@Override
	public void save(BNeedAnnexEntity bNeedAnnex){
		bNeedAnnexDao.save(bNeedAnnex);
	}
	
	@Override
	public void update(BNeedAnnexEntity bNeedAnnex){
		bNeedAnnexDao.update(bNeedAnnex);
	}
	
	@Override
	public void delete(Integer id){
		bNeedAnnexDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		bNeedAnnexDao.deleteBatch(ids);
	}
	
}
