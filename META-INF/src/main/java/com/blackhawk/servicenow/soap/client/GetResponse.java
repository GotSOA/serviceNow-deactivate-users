
package com.blackhawk.servicenow.soap.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accumulated_roles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="auditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calendar_integration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost_center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_time_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="default_perspective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edu_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failed_attempts" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="home_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_login_device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_login_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ldap_server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locked_out" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="password_needs_reset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferred_language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sales_account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sales_contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_class_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_created_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_created_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_mod_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sys_updated_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sys_updated_on" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_active_in_incident_tracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="u_active_in_partners_list" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="u_cube_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_employee_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_licensed_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_merchant_onboarding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_outage_notification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="u_page_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_partner_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_preferred_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_safeway_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_type_of_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="u_vp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accumulatedRoles",
    "active",
    "auditor",
    "building",
    "calendarIntegration",
    "city",
    "company",
    "costCenter",
    "country",
    "dateFormat",
    "dateTimeFormat",
    "defaultPerspective",
    "department",
    "eduStatus",
    "email",
    "employeeNumber",
    "failedAttempts",
    "firstName",
    "gender",
    "homePhone",
    "introduction",
    "lastLogin",
    "lastLoginDevice",
    "lastLoginTime",
    "lastName",
    "lastPassword",
    "ldapServer",
    "location",
    "lockedOut",
    "manager",
    "middleName",
    "mobilePhone",
    "name",
    "notification",
    "passwordNeedsReset",
    "phone",
    "photo",
    "preferredLanguage",
    "roles",
    "salesAccount",
    "salesContact",
    "schedule",
    "source",
    "state",
    "street",
    "sysClassName",
    "sysCreatedBy",
    "sysCreatedOn",
    "sysDomain",
    "sysId",
    "sysModCount",
    "sysUpdatedBy",
    "sysUpdatedOn",
    "timeFormat",
    "timeZone",
    "title",
    "uActiveInIncidentTracking",
    "uActiveInPartnersList",
    "uCubeNumber",
    "uDirector",
    "uEmployeeType",
    "uGroup",
    "uLicensedUser",
    "uMerchantOnboarding",
    "uOutageNotification",
    "uPageAt",
    "uPartnerName",
    "uPreferredName",
    "uSafewayId",
    "uTypeOfUser",
    "uVp",
    "userName",
    "userPassword",
    "vip",
    "zip"
})
@XmlRootElement(name = "getResponse")
public class GetResponse {

    @XmlElement(name = "accumulated_roles")
    protected String accumulatedRoles;
    protected Boolean active;
    protected Boolean auditor;
    protected String building;
    @XmlElement(name = "calendar_integration")
    protected String calendarIntegration;
    protected String city;
    protected String company;
    @XmlElement(name = "cost_center")
    protected String costCenter;
    protected String country;
    @XmlElement(name = "date_format")
    protected String dateFormat;
    @XmlElement(name = "date_time_format")
    protected String dateTimeFormat;
    @XmlElement(name = "default_perspective")
    protected String defaultPerspective;
    protected String department;
    @XmlElement(name = "edu_status")
    protected String eduStatus;
    protected String email;
    @XmlElement(name = "employee_number")
    protected String employeeNumber;
    @XmlElement(name = "failed_attempts")
    protected BigInteger failedAttempts;
    @XmlElement(name = "first_name")
    protected String firstName;
    protected String gender;
    @XmlElement(name = "home_phone")
    protected String homePhone;
    protected String introduction;
    @XmlElement(name = "last_login")
    protected String lastLogin;
    @XmlElement(name = "last_login_device")
    protected String lastLoginDevice;
    @XmlElement(name = "last_login_time")
    protected String lastLoginTime;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "last_password")
    protected String lastPassword;
    @XmlElement(name = "ldap_server")
    protected String ldapServer;
    protected String location;
    @XmlElement(name = "locked_out")
    protected Boolean lockedOut;
    protected String manager;
    @XmlElement(name = "middle_name")
    protected String middleName;
    @XmlElement(name = "mobile_phone")
    protected String mobilePhone;
    protected String name;
    protected BigInteger notification;
    @XmlElement(name = "password_needs_reset")
    protected Boolean passwordNeedsReset;
    protected String phone;
    protected String photo;
    @XmlElement(name = "preferred_language")
    protected String preferredLanguage;
    protected String roles;
    @XmlElement(name = "sales_account")
    protected String salesAccount;
    @XmlElement(name = "sales_contact")
    protected String salesContact;
    protected String schedule;
    protected String source;
    protected String state;
    protected String street;
    @XmlElement(name = "sys_class_name")
    protected String sysClassName;
    @XmlElement(name = "sys_created_by")
    protected String sysCreatedBy;
    @XmlElement(name = "sys_created_on")
    protected String sysCreatedOn;
    @XmlElement(name = "sys_domain")
    protected String sysDomain;
    @XmlElement(name = "sys_id")
    protected String sysId;
    @XmlElement(name = "sys_mod_count")
    protected BigInteger sysModCount;
    @XmlElement(name = "sys_updated_by")
    protected String sysUpdatedBy;
    @XmlElement(name = "sys_updated_on")
    protected String sysUpdatedOn;
    @XmlElement(name = "time_format")
    protected String timeFormat;
    @XmlElement(name = "time_zone")
    protected String timeZone;
    protected String title;
    @XmlElement(name = "u_active_in_incident_tracking")
    protected Boolean uActiveInIncidentTracking;
    @XmlElement(name = "u_active_in_partners_list")
    protected Boolean uActiveInPartnersList;
    @XmlElement(name = "u_cube_number")
    protected String uCubeNumber;
    @XmlElement(name = "u_director")
    protected String uDirector;
    @XmlElement(name = "u_employee_type")
    protected String uEmployeeType;
    @XmlElement(name = "u_group")
    protected String uGroup;
    @XmlElement(name = "u_licensed_user")
    protected String uLicensedUser;
    @XmlElement(name = "u_merchant_onboarding")
    protected String uMerchantOnboarding;
    @XmlElement(name = "u_outage_notification")
    protected Boolean uOutageNotification;
    @XmlElement(name = "u_page_at")
    protected String uPageAt;
    @XmlElement(name = "u_partner_name")
    protected String uPartnerName;
    @XmlElement(name = "u_preferred_name")
    protected String uPreferredName;
    @XmlElement(name = "u_safeway_id")
    protected String uSafewayId;
    @XmlElement(name = "u_type_of_user")
    protected String uTypeOfUser;
    @XmlElement(name = "u_vp")
    protected String uVp;
    @XmlElement(name = "user_name")
    protected String userName;
    @XmlElement(name = "user_password")
    protected String userPassword;
    protected Boolean vip;
    protected String zip;

    /**
     * Gets the value of the accumulatedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatedRoles() {
        return accumulatedRoles;
    }

    /**
     * Sets the value of the accumulatedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatedRoles(String value) {
        this.accumulatedRoles = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the auditor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditor() {
        return auditor;
    }

    /**
     * Sets the value of the auditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditor(Boolean value) {
        this.auditor = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the calendarIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarIntegration() {
        return calendarIntegration;
    }

    /**
     * Sets the value of the calendarIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarIntegration(String value) {
        this.calendarIntegration = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the dateTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Sets the value of the dateTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeFormat(String value) {
        this.dateTimeFormat = value;
    }

    /**
     * Gets the value of the defaultPerspective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPerspective() {
        return defaultPerspective;
    }

    /**
     * Sets the value of the defaultPerspective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPerspective(String value) {
        this.defaultPerspective = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the eduStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduStatus() {
        return eduStatus;
    }

    /**
     * Sets the value of the eduStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduStatus(String value) {
        this.eduStatus = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the failedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * Sets the value of the failedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailedAttempts(BigInteger value) {
        this.failedAttempts = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the introduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * Sets the value of the introduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroduction(String value) {
        this.introduction = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLogin(String value) {
        this.lastLogin = value;
    }

    /**
     * Gets the value of the lastLoginDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginDevice() {
        return lastLoginDevice;
    }

    /**
     * Sets the value of the lastLoginDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginDevice(String value) {
        this.lastLoginDevice = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginTime(String value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPassword() {
        return lastPassword;
    }

    /**
     * Sets the value of the lastPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPassword(String value) {
        this.lastPassword = value;
    }

    /**
     * Gets the value of the ldapServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapServer() {
        return ldapServer;
    }

    /**
     * Sets the value of the ldapServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapServer(String value) {
        this.ldapServer = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the lockedOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedOut() {
        return lockedOut;
    }

    /**
     * Sets the value of the lockedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedOut(Boolean value) {
        this.lockedOut = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNotification(BigInteger value) {
        this.notification = value;
    }

    /**
     * Gets the value of the passwordNeedsReset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordNeedsReset() {
        return passwordNeedsReset;
    }

    /**
     * Sets the value of the passwordNeedsReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordNeedsReset(Boolean value) {
        this.passwordNeedsReset = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoto(String value) {
        this.photo = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoles(String value) {
        this.roles = value;
    }

    /**
     * Gets the value of the salesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAccount() {
        return salesAccount;
    }

    /**
     * Sets the value of the salesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAccount(String value) {
        this.salesAccount = value;
    }

    /**
     * Gets the value of the salesContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesContact() {
        return salesContact;
    }

    /**
     * Sets the value of the salesContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesContact(String value) {
        this.salesContact = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the sysClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysClassName() {
        return sysClassName;
    }

    /**
     * Sets the value of the sysClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysClassName(String value) {
        this.sysClassName = value;
    }

    /**
     * Gets the value of the sysCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    /**
     * Sets the value of the sysCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCreatedBy(String value) {
        this.sysCreatedBy = value;
    }

    /**
     * Gets the value of the sysCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCreatedOn() {
        return sysCreatedOn;
    }

    /**
     * Sets the value of the sysCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCreatedOn(String value) {
        this.sysCreatedOn = value;
    }

    /**
     * Gets the value of the sysDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysDomain() {
        return sysDomain;
    }

    /**
     * Sets the value of the sysDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysDomain(String value) {
        this.sysDomain = value;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the sysModCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSysModCount() {
        return sysModCount;
    }

    /**
     * Sets the value of the sysModCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSysModCount(BigInteger value) {
        this.sysModCount = value;
    }

    /**
     * Gets the value of the sysUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    /**
     * Sets the value of the sysUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysUpdatedBy(String value) {
        this.sysUpdatedBy = value;
    }

    /**
     * Gets the value of the sysUpdatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    /**
     * Sets the value of the sysUpdatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysUpdatedOn(String value) {
        this.sysUpdatedOn = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the uActiveInIncidentTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUActiveInIncidentTracking() {
        return uActiveInIncidentTracking;
    }

    /**
     * Sets the value of the uActiveInIncidentTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUActiveInIncidentTracking(Boolean value) {
        this.uActiveInIncidentTracking = value;
    }

    /**
     * Gets the value of the uActiveInPartnersList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUActiveInPartnersList() {
        return uActiveInPartnersList;
    }

    /**
     * Sets the value of the uActiveInPartnersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUActiveInPartnersList(Boolean value) {
        this.uActiveInPartnersList = value;
    }

    /**
     * Gets the value of the uCubeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCubeNumber() {
        return uCubeNumber;
    }

    /**
     * Sets the value of the uCubeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCubeNumber(String value) {
        this.uCubeNumber = value;
    }

    /**
     * Gets the value of the uDirector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDirector() {
        return uDirector;
    }

    /**
     * Sets the value of the uDirector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDirector(String value) {
        this.uDirector = value;
    }

    /**
     * Gets the value of the uEmployeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUEmployeeType() {
        return uEmployeeType;
    }

    /**
     * Sets the value of the uEmployeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUEmployeeType(String value) {
        this.uEmployeeType = value;
    }

    /**
     * Gets the value of the uGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUGroup() {
        return uGroup;
    }

    /**
     * Sets the value of the uGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUGroup(String value) {
        this.uGroup = value;
    }

    /**
     * Gets the value of the uLicensedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULicensedUser() {
        return uLicensedUser;
    }

    /**
     * Sets the value of the uLicensedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULicensedUser(String value) {
        this.uLicensedUser = value;
    }

    /**
     * Gets the value of the uMerchantOnboarding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMerchantOnboarding() {
        return uMerchantOnboarding;
    }

    /**
     * Sets the value of the uMerchantOnboarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMerchantOnboarding(String value) {
        this.uMerchantOnboarding = value;
    }

    /**
     * Gets the value of the uOutageNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUOutageNotification() {
        return uOutageNotification;
    }

    /**
     * Sets the value of the uOutageNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUOutageNotification(Boolean value) {
        this.uOutageNotification = value;
    }

    /**
     * Gets the value of the uPageAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPageAt() {
        return uPageAt;
    }

    /**
     * Sets the value of the uPageAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPageAt(String value) {
        this.uPageAt = value;
    }

    /**
     * Gets the value of the uPartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPartnerName() {
        return uPartnerName;
    }

    /**
     * Sets the value of the uPartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPartnerName(String value) {
        this.uPartnerName = value;
    }

    /**
     * Gets the value of the uPreferredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPreferredName() {
        return uPreferredName;
    }

    /**
     * Sets the value of the uPreferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPreferredName(String value) {
        this.uPreferredName = value;
    }

    /**
     * Gets the value of the uSafewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSafewayId() {
        return uSafewayId;
    }

    /**
     * Sets the value of the uSafewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSafewayId(String value) {
        this.uSafewayId = value;
    }

    /**
     * Gets the value of the uTypeOfUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTypeOfUser() {
        return uTypeOfUser;
    }

    /**
     * Sets the value of the uTypeOfUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTypeOfUser(String value) {
        this.uTypeOfUser = value;
    }

    /**
     * Gets the value of the uVp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVp() {
        return uVp;
    }

    /**
     * Sets the value of the uVp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVp(String value) {
        this.uVp = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVip(Boolean value) {
        this.vip = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

}
