package love.fundraising.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import love.fundraising.dao.BHelpListDao;
import love.fundraising.entity.BHelpListEntity;
import love.fundraising.service.BHelpListService;



@Service("bHelpListService")
public class BHelpListServiceImpl implements BHelpListService {
	@Autowired
	private BHelpListDao bHelpListDao;
	
	@Override
	public BHelpListEntity queryObject(Integer id){
		return bHelpListDao.queryObject(id);
	}
	
	@Override
	public List<BHelpListEntity> queryList(Map<String, Object> map){
		return bHelpListDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return bHelpListDao.queryTotal(map);
	}
	
	@Override
	public void save(BHelpListEntity bHelpList){
		bHelpListDao.save(bHelpList);
	}
	
	@Override
	public void update(BHelpListEntity bHelpList){
		bHelpListDao.update(bHelpList);
	}
	
	@Override
	public void delete(Integer id){
		bHelpListDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		bHelpListDao.deleteBatch(ids);
	}
	
}
