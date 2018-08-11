package love.fundraising.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 需求表
 * 
 * @author auto
 * @email 
 * @date 2018-08-11 22:51:30
 */
public class BNeedInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//救助人姓名
	private String helpName;
	//性别 0男性 1女性
	private String helpSex;
	//年龄
	private Integer helpAge;
	//身份证
	private String helpCard;
	//联系方式
	private String helpTel;
	//地址
	private String address;
	//监护人
	private String guardian;
	//监护人电话
	private String gTel;
	//标题
	private String title;
	//描述
	private String describe;
	//受助人类型
	private String helpType;
	//0：待提交审核1：审核中2：审核通过3：审核不通过
	private String auditStatus;
	//监护人身份证
	private String gCard;
	//监护人年龄
	private Integer gAge;
	//监护人性别0：男1：女
	private String gSex;
	//省
	private String province;
	//市
	private String city;
	//县
	private String county;
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
	 * 设置：救助人姓名
	 */
	public void setHelpName(String helpName) {
		this.helpName = helpName;
	}
	/**
	 * 获取：救助人姓名
	 */
	public String getHelpName() {
		return helpName;
	}
	/**
	 * 设置：性别 0男性 1女性
	 */
	public void setHelpSex(String helpSex) {
		this.helpSex = helpSex;
	}
	/**
	 * 获取：性别 0男性 1女性
	 */
	public String getHelpSex() {
		return helpSex;
	}
	/**
	 * 设置：年龄
	 */
	public void setHelpAge(Integer helpAge) {
		this.helpAge = helpAge;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getHelpAge() {
		return helpAge;
	}
	/**
	 * 设置：身份证
	 */
	public void setHelpCard(String helpCard) {
		this.helpCard = helpCard;
	}
	/**
	 * 获取：身份证
	 */
	public String getHelpCard() {
		return helpCard;
	}
	/**
	 * 设置：联系方式
	 */
	public void setHelpTel(String helpTel) {
		this.helpTel = helpTel;
	}
	/**
	 * 获取：联系方式
	 */
	public String getHelpTel() {
		return helpTel;
	}
	/**
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：监护人
	 */
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	/**
	 * 获取：监护人
	 */
	public String getGuardian() {
		return guardian;
	}
	/**
	 * 设置：监护人电话
	 */
	public void setGTel(String gTel) {
		this.gTel = gTel;
	}
	/**
	 * 获取：监护人电话
	 */
	public String getGTel() {
		return gTel;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：描述
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * 获取：描述
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * 设置：受助人类型
	 */
	public void setHelpType(String helpType) {
		this.helpType = helpType;
	}
	/**
	 * 获取：受助人类型
	 */
	public String getHelpType() {
		return helpType;
	}
	/**
	 * 设置：0：待提交审核1：审核中2：审核通过3：审核不通过
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * 获取：0：待提交审核1：审核中2：审核通过3：审核不通过
	 */
	public String getAuditStatus() {
		return auditStatus;
	}
	/**
	 * 设置：监护人身份证
	 */
	public void setGCard(String gCard) {
		this.gCard = gCard;
	}
	/**
	 * 获取：监护人身份证
	 */
	public String getGCard() {
		return gCard;
	}
	/**
	 * 设置：监护人年龄
	 */
	public void setGAge(Integer gAge) {
		this.gAge = gAge;
	}
	/**
	 * 获取：监护人年龄
	 */
	public Integer getGAge() {
		return gAge;
	}
	/**
	 * 设置：监护人性别0：男1：女
	 */
	public void setGSex(String gSex) {
		this.gSex = gSex;
	}
	/**
	 * 获取：监护人性别0：男1：女
	 */
	public String getGSex() {
		return gSex;
	}
	/**
	 * 设置：省
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：省
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：县
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * 获取：县
	 */
	public String getCounty() {
		return county;
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
