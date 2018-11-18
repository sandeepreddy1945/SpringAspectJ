/**
 * 
 */
package com.app.spring.aspectj.aj;

/**
 * @author Sandeep
 *
 */
public class AccountModel {

    private String name;
    private String address;
    private String phoneNum;
    private String id;

    /**
     * @return the name
     */
    public String getName() {
        return trim(name);
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return trim(address);
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return trim(phoneNum);
    }

    /**
     * @param phoneNum
     *            the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public AccountModel(String name, String address, String phoneNum, String id) {
        super();
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.id = id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private String trim(String str) {
        return str.trim();
    }
}
