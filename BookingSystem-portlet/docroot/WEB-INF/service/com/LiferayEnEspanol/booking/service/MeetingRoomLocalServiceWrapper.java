package com.LiferayEnEspanol.booking.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MeetingRoomLocalService}.
 *
 * @author Jesus Flores
 * @see MeetingRoomLocalService
 * @generated
 */
public class MeetingRoomLocalServiceWrapper implements MeetingRoomLocalService,
    ServiceWrapper<MeetingRoomLocalService> {
    private MeetingRoomLocalService _meetingRoomLocalService;

    public MeetingRoomLocalServiceWrapper(
        MeetingRoomLocalService meetingRoomLocalService) {
        _meetingRoomLocalService = meetingRoomLocalService;
    }

    /**
    * Adds the meeting room to the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoom the meeting room
    * @return the meeting room that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom addMeetingRoom(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.addMeetingRoom(meetingRoom);
    }

    /**
    * Creates a new meeting room with the primary key. Does not add the meeting room to the database.
    *
    * @param meetingRoomId the primary key for the new meeting room
    * @return the new meeting room
    */
    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom createMeetingRoom(
        long meetingRoomId) {
        return _meetingRoomLocalService.createMeetingRoom(meetingRoomId);
    }

    /**
    * Deletes the meeting room with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room that was removed
    * @throws PortalException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom deleteMeetingRoom(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.deleteMeetingRoom(meetingRoomId);
    }

    /**
    * Deletes the meeting room from the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoom the meeting room
    * @return the meeting room that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom deleteMeetingRoom(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.deleteMeetingRoom(meetingRoom);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _meetingRoomLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchMeetingRoom(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.fetchMeetingRoom(meetingRoomId);
    }

    /**
    * Returns the meeting room with the primary key.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room
    * @throws PortalException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom getMeetingRoom(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.getMeetingRoom(meetingRoomId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the meeting rooms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of meeting rooms
    * @param end the upper bound of the range of meeting rooms (not inclusive)
    * @return the range of meeting rooms
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> getMeetingRooms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.getMeetingRooms(start, end);
    }

    /**
    * Returns the number of meeting rooms.
    *
    * @return the number of meeting rooms
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getMeetingRoomsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.getMeetingRoomsCount();
    }

    /**
    * Updates the meeting room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param meetingRoom the meeting room
    * @return the meeting room that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.LiferayEnEspanol.booking.model.MeetingRoom updateMeetingRoom(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _meetingRoomLocalService.updateMeetingRoom(meetingRoom);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _meetingRoomLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _meetingRoomLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _meetingRoomLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.Collection findByCapacity(int capacity) {
        return _meetingRoomLocalService.findByCapacity(capacity);
    }

    @Override
    public java.util.Collection findByName(java.lang.String name) {
        return _meetingRoomLocalService.findByName(name);
    }

    @Override
    public java.util.Collection findByCapacity(int capacity, boolean active) {
        return _meetingRoomLocalService.findByCapacity(capacity, active);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MeetingRoomLocalService getWrappedMeetingRoomLocalService() {
        return _meetingRoomLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMeetingRoomLocalService(
        MeetingRoomLocalService meetingRoomLocalService) {
        _meetingRoomLocalService = meetingRoomLocalService;
    }

    @Override
    public MeetingRoomLocalService getWrappedService() {
        return _meetingRoomLocalService;
    }

    @Override
    public void setWrappedService(
        MeetingRoomLocalService meetingRoomLocalService) {
        _meetingRoomLocalService = meetingRoomLocalService;
    }
}
