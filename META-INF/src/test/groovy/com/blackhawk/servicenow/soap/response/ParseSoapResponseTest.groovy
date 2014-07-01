package com.blackhawk.servicenow.soap.response

import org.junit.Test

class ParseSoapResponseTest {
    private String data = '''<?xml version='1.0' encoding='UTF-8'?><SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><SOAP-ENV:Body><getRecordsResponse><getRecordsResult><accumulated_roles/><active>1</active><auditor>0</auditor><building/><calendar_integration>1</calendar_integration><city/><company/><cost_center>0b9526dda4bed040a3c703bacef35aec</cost_center><country/><date_format/><date_time_format/><default_perspective/><department>77976541d4af3404827f604f95a441c5</department><edu_status>faculty</edu_status><email>greg.foote@bhnetwork.com</email><employee_number>100494</employee_number><failed_attempts>0</failed_attempts><first_name>Gregory</first_name><gender/><home_phone/><introduction/><last_login></last_login><last_login_device>63.81.107.221</last_login_device><last_login_time>2014-02-06 00:57:07</last_login_time><last_name>Foote</last_name><last_password/><ldap_server/><location/><locked_out>0</locked_out><manager>9428c3c2ffd81840c07c1d9d05e7bde9</manager><middle_name/><mobile_phone>925.551.1860</mobile_phone><name>Gregory Foote</name><notification>2</notification><password_needs_reset>0</password_needs_reset><phone>925.551.1860</phone><photo/><preferred_language/><roles/><sales_account/><sales_contact/><schedule/><source/><state/><street/><sys_class_name>sys_user</sys_class_name><sys_created_by>jtass00</sys_created_by><sys_created_on>2011-08-11 23:23:39</sys_created_on><sys_domain>global</sys_domain><sys_id>e341983bffd41c40c07c1d9d05e7bdc0</sys_id><sys_mod_count>414</sys_mod_count><sys_updated_by>system</sys_updated_by><sys_updated_on>2014-02-06 00:57:28</sys_updated_on><time_format/><time_zone/><title>Sr. Staff Enterprise Engineer</title><u_active_in_incident_tracking>0</u_active_in_incident_tracking><u_active_in_partners_list>0</u_active_in_partners_list><u_cube_number/><u_director>9428c3c2ffd81840c07c1d9d05e7bde9</u_director><u_employee_type>Staff</u_employee_type><u_group>49ccca9a465567620176b5d25f13ff31</u_group><u_licensed_user>Yes</u_licensed_user><u_merchant_onboarding/><u_outage_notification>0</u_outage_notification><u_page_at/><u_partner_name/><u_preferred_name/><u_safeway_id>9782073</u_safeway_id><u_type_of_user>BHN Internal</u_type_of_user><u_vp>ef79b3cc0a0a3c570104a03f5b55662f</u_vp><user_name>gfoot00</user_name><user_password>$s$DB5SRlnyhHDwOwuM/HJYcEp8O9Y=$06M+3DjLBsQLTTTVRP5w66Sv6PA=</user_password><vip>0</vip><zip/></getRecordsResult></getRecordsResponse></SOAP-ENV:Body></SOAP-ENV:Envelope>'''

//    ParseSoapResponse component = new ParseSoapResponse()

    @Test
    void handleResponseTest() {
//        def results = component.parseOutData(data)
//
//        assert 1 == results.size()
//        assert '0' == results[0].locked_out
//        assert '1' == results[0].active
//        assert '2014-02-06 00:57:28' == results[0].updatedOn
//        assert 'gfoot00' == results[0].user_name
    }
}
