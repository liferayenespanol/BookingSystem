package com.LiferayEnEspanol.booking.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MeetingRoomService}.
 *
 * @author Jesus Flores
 * @see MeetingRoomService
 * @generated
 */
public class MeetingRoomServiceWrapper implements MeetingRoomService,
    ServiceWrapper<MeetingRoomService> {
    private MeetingRoomService _meetingRoomService;

    public MeetingRoomServiceWrapper(MeetingRoomService meetingRoomService) {
        _meetingRoomService = meetingRoomService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _meetingRoomService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _meetingRoomService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _meetingRoomService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MeetingRoomService getWrappedMeetingRoomService() {
        return _meetingRoomService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMeetingRoomService(
        MeetingRoomService meetingRoomService) {
        _meetingRoomService = meetingRoomService;
    }

    @Override
    public MeetingRoomService getWrappedService() {
        return _meetingRoomService;
    }

    @Override
    public void setWrappedService(MeetingRoomService meetingRoomService) {
        _meetingRoomService = meetingRoomService;
    }
}
