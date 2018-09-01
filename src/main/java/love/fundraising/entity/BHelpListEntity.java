package love.fundraising.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author auto
 * @email 
 * @date 2018-09-01 19:41:24
 */
public class BHelpListEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//帮助人ID
	private Long helpid;
	//需求ID
	private Long needid;
	//物资类型
	private String materialtype;
	//物资数量
	private Integer materialnum;
	//物资清单
	private String materiallist;
	//审核状态
	private Integer auditstate;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：帮助人ID
	 */
	public void setHelpid(Long helpid) {
		this.helpid = helpid;
	}
	/**
	 * 获取：帮助人ID
	 */
	public Long getHelpid() {
		return helpid;
	}
	/**
	 * 设置：需求ID
	 */
	public void setNeedid(Long needid) {
		this.needid = needid;
	}
	/**
	 * 获取：需求ID
	 */
	public Long getNeedid() {
		return needid;
	}
	/**
	 * 设置：物资类型
	 */
	public void setMaterialtype(String materialtype) {
		this.materialtype = materialtype;
	}
	/**
	 * 获取：物资类型
	 */
	public String getMaterialtype() {
		return materialtype;
	}
	/**
	 * 设置：物资数量
	 */
	public void setMaterialnum(Integer materialnum) {
		this.materialnum = materialnum;
	}
	/**
	 * 获取：物资数量
	 */
	public Integer getMaterialnum() {
		return materialnum;
	}
	/**
	 * 设置：物资清单
	 */
	public void setMateriallist(String materiallist) {
		this.materiallist = materiallist;
	}
	/**
	 * 获取：物资清单
	 */
	public String getMateriallist() {
		return materiallist;
	}
	/**
	 * 设置：审核状态
	 */
	public void setAuditstate(Integer auditstate) {
		this.auditstate = auditstate;
	}
	/**
	 * 获取：审核状态
	 */
	public Integer getAuditstate() {
		return auditstate;
	}
}
