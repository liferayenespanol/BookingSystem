package com.LiferayEnEspanol.booking.service.messaging;

import com.LiferayEnEspanol.booking.service.ClpSerializer;
import com.LiferayEnEspanol.booking.service.MeetingRoomLocalServiceUtil;
import com.LiferayEnEspanol.booking.service.MeetingRoomServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            MeetingRoomLocalServiceUtil.clearService();

            MeetingRoomServiceUtil.clearService();
        }
    }
}
