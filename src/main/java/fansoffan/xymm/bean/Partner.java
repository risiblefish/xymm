package fansoffan.xymm.bean;

/**
 * @author yzx
 */
public class Partner {

    private String userName;

    private String openId;

    private String phone;

    private String email;

    private Long pid;

    private Integer status;

    public Partner(String userName, String openId, String phone, String email, Long pid) {
        this.userName = userName;
        this.openId = openId;
        this.phone = phone;
        this.email = email;
        this.pid = pid;
        this.status = 1;
    }

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
