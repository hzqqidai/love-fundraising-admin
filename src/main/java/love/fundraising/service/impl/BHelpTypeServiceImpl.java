package love.fundraising.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import love.fundraising.dao.BHelpTypeDao;
import love.fundraising.entity.BHelpTypeEntity;
import love.fundraising.service.BHelpTypeService;



@Service("bHelpTypeService")
public class BHelpTypeServiceImpl implements BHelpTypeService {
	@Autowired
	private BHelpTypeDao bHelpTypeDao;
	
	@Override
	public BHelpTypeEntity queryObject(Long id){
		return bHelpTypeDao.queryObject(id);
	}
	
	@Override
	public List<BHelpTypeEntity> queryList(Map<String, Object> map){
		return bHelpTypeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return bHelpTypeDao.queryTotal(map);
	}
	
	@Override
	public void save(BHelpTypeEntity bHelpType){
		bHelpTypeDao.save(bHelpType);
	}
	
	@Override
	public void update(BHelpTypeEntity bHelpType){
		bHelpTypeDao.update(bHelpType);
	}
	
	@Override
	public void delete(Long id){
		bHelpTypeDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		bHelpTypeDao.deleteBatch(ids);
	}
	
}
