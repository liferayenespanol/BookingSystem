package com.LiferayEnEspanol.booking.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MeetingRoom. This utility wraps
 * {@link com.LiferayEnEspanol.booking.service.impl.MeetingRoomLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jesus Flores
 * @see MeetingRoomLocalService
 * @see com.LiferayEnEspanol.booking.service.base.MeetingRoomLocalServiceBaseImpl
 * @see com.LiferayEnEspanol.booking.service.impl.MeetingRoomLocalServiceImpl
 * @generated
 */
public class MeetingRoomLocalServiceUtil {
    private static MeetingRoomLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.LiferayEnEspanol.booking.service.impl.MeetingRoomLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the meeting room to the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoom the meeting room
    * @return the meeting room that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.LiferayEnEspanol.booking.model.MeetingRoom addMeetingRoom(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addMeetingRoom(meetingRoom);
    }

    /**
    * Creates a new meeting room with the primary key. Does not add the meeting room to the database.
    *
    * @param meetingRoomId the primary key for the new meeting room
    * @return the new meeting room
    */
    public static com.LiferayEnEspanol.booking.model.MeetingRoom createMeetingRoom(
        long meetingRoomId) {
        return getService().createMeetingRoom(meetingRoomId);
    }

    /**
    * Deletes the meeting room with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room that was removed
    * @throws PortalException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.LiferayEnEspanol.booking.model.MeetingRoom deleteMeetingRoom(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMeetingRoom(meetingRoomId);
    }

    /**
    * Deletes the meeting room from the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoom the meeting room
    * @return the meeting room that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.LiferayEnEspanol.booking.model.MeetingRoom deleteMeetingRoom(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMeetingRoom(meetingRoom);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.LiferayEnEspanol.booking.model.MeetingRoom fetchMeetingRoom(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMeetingRoom(meetingRoomId);
    }

    /**
    * Returns the meeting room with the primary key.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room
    * @throws PortalException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.LiferayEnEspanol.booking.model.MeetingRoom getMeetingRoom(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMeetingRoom(meetingRoomId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> getMeetingRooms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMeetingRooms(start, end);
    }

    /**
    * Returns the number of meeting rooms.
    *
    * @return the number of meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public static int getMeetingRoomsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMeetingRoomsCount();
    }

    /**
    * Updates the meeting room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param meetingRoom the meeting room
    * @return the meeting room that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.LiferayEnEspanol.booking.model.MeetingRoom updateMeetingRoom(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateMeetingRoom(meetingRoom);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.Collection findByCapacity(int capacity) {
        return getService().findByCapacity(capacity);
    }

    public static java.util.Collection findByName(java.lang.String name) {
        return getService().findByName(name);
    }

    public static java.util.Collection findByCapacity(int capacity,
        boolean active) {
        return getService().findByCapacity(capacity, active);
    }

    public static void clearService() {
        _service = null;
    }

    public static MeetingRoomLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    MeetingRoomLocalService.class.getName());

            if (invokableLocalService instanceof MeetingRoomLocalService) {
                _service = (MeetingRoomLocalService) invokableLocalService;
            } else {
                _service = new MeetingRoomLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(MeetingRoomLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MeetingRoomLocalService service) {
    }
}
