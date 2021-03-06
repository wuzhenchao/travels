package com.youha.model;

public class User extends BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.profession
     *
     * @mbggenerated
     */
    private String profession;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.age
     *
     * @mbggenerated
     */
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dev.user.area
     *
     * @mbggenerated
     */
    private String area;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.id
     *
     * @return the value of dev.user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.id
     *
     * @param id the value for dev.user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.email
     *
     * @return the value of dev.user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.email
     *
     * @param email the value for dev.user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.phone
     *
     * @return the value of dev.user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.phone
     *
     * @param phone the value for dev.user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.nick_name
     *
     * @return the value of dev.user.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.nick_name
     *
     * @param nickName the value for dev.user.nick_name
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.profession
     *
     * @return the value of dev.user.profession
     *
     * @mbggenerated
     */
    public String getProfession() {
        return profession;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.profession
     *
     * @param profession the value for dev.user.profession
     *
     * @mbggenerated
     */
    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.age
     *
     * @return the value of dev.user.age
     *
     * @mbggenerated
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.age
     *
     * @param age the value for dev.user.age
     *
     * @mbggenerated
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dev.user.area
     *
     * @return the value of dev.user.area
     *
     * @mbggenerated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dev.user.area
     *
     * @param area the value for dev.user.area
     *
     * @mbggenerated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}