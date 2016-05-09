package com.LiferayEnEspanol.booking.service.persistence;

import com.LiferayEnEspanol.booking.model.MeetingRoom;
import com.LiferayEnEspanol.booking.service.MeetingRoomLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Jesus Flores
 * @generated
 */
public abstract class MeetingRoomActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MeetingRoomActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MeetingRoomLocalServiceUtil.getService());
        setClass(MeetingRoom.class);

        setClassLoader(com.LiferayEnEspanol.booking.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("meetingRoomId");
    }
}
