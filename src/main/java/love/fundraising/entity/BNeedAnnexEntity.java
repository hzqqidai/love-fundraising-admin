package love.fundraising.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author auto
 * @email 
 * @date 2018-09-01 19:41:25
 */
public class BNeedAnnexEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//附件类型
	private String annextype;
	//文件地址
	private String url;
	//创建时间
	private Date createtime;
	//创建人
	private String createname;
	//修改时间
	private Date updatetime;
	//修改人
	private String updatename;
	//删除标识 1是未删除 0是删除
	private Integer yn;
	//附件名称
	private String annexname;

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
	 * 设置：附件类型
	 */
	public void setAnnextype(String annextype) {
		this.annextype = annextype;
	}
	/**
	 * 获取：附件类型
	 */
	public String getAnnextype() {
		return annextype;
	}
	/**
	 * 设置：文件地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：文件地址
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatetime() {
		return createtime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreatename(String createname) {
		this.createname = createname;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreatename() {
		return createname;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdatetime() {
		return updatetime;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdatename(String updatename) {
		this.updatename = updatename;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdatename() {
		return updatename;
	}
	/**
	 * 设置：删除标识 1是未删除 0是删除
	 */
	public void setYn(Integer yn) {
		this.yn = yn;
	}
	/**
	 * 获取：删除标识 1是未删除 0是删除
	 */
	public Integer getYn() {
		return yn;
	}
	/**
	 * 设置：附件名称
	 */
	public void setAnnexname(String annexname) {
		this.annexname = annexname;
	}
	/**
	 * 获取：附件名称
	 */
	public String getAnnexname() {
		return annexname;
	}
}
