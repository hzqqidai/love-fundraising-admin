package love.fundraising.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 类型表
 * 
 * @author auto
 * @email 
 * @date 2018-08-11 22:51:30
 */
public class BHelpTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//类型
	private String helpType;
	//创建人
	private String createName;
	//创建时间
	private Date createTime;
	//修改人
	private String updateName;
	//修改时间
	private Date updateTime;
	//1未删除 0已删除
	private Integer yn;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：类型
	 */
	public void setHelpType(String helpType) {
		this.helpType = helpType;
	}
	/**
	 * 获取：类型
	 */
	public String getHelpType() {
		return helpType;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateName() {
		return createName;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdateName() {
		return updateName;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：1未删除 0已删除
	 */
	public void setYn(Integer yn) {
		this.yn = yn;
	}
	/**
	 * 获取：1未删除 0已删除
	 */
	public Integer getYn() {
		return yn;
	}
}
