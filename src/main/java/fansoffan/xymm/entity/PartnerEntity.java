package fansoffan.xymm.entity;

import javax.persistence.*;

/**
 * @author yzx
 */
@Entity
@Table(name = "partner")
public class PartnerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "user_name", unique = true, nullable = false)
	private String userName;

	@Column(name = "open_id", unique = true, nullable = false)
	private String openId;

	@Column(name = "phone", unique = true, nullable = false)
	private String phone;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "pid")
	private Long pid;

	@Column(name = "status", nullable = false)
	private Integer status;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
