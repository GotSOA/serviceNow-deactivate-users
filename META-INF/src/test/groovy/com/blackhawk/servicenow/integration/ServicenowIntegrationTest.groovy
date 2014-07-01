package com.blackhawk.servicenow.integration

import org.junit.Test
import org.mule.api.MuleMessage
import org.mule.tck.junit4.FunctionalTestCase

class ServicenowIntegrationTest extends FunctionalTestCase {

    static final LOCK_TIMEOUT = 5000

    @Override
    protected String getConfigResources() {
        return 'mule-config.xml, blackhawk.xml';
    }

    @Test
    void ServiceNowSOAPSchedulerFlowTest() {
        muleContext.client.dispatch('vm://servicenow.inactive.users.inbound', null, [:])
        MuleMessage muleMessage = muleContext.client.request('vm://servicenow.inactive.users.outbound', LOCK_TIMEOUT)

        def payload = muleMessage.payload
        assert 100 < payload.size()
    }
}
