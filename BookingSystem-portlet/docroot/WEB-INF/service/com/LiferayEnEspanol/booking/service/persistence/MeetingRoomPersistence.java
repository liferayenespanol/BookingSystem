package com.LiferayEnEspanol.booking.service.persistence;

import com.LiferayEnEspanol.booking.model.MeetingRoom;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the meeting room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jesus Flores
 * @see MeetingRoomPersistenceImpl
 * @see MeetingRoomUtil
 * @generated
 */
public interface MeetingRoomPersistence extends BasePersistence<MeetingRoom> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MeetingRoomUtil} to access the meeting room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the meeting rooms where capacity = &#63;.
    *
    * @param capacity the capacity
    * @return the matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findByCapacity(
        int capacity)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the meeting rooms where capacity = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param capacity the capacity
    * @param start the lower bound of the range of meeting rooms
    * @param end the upper bound of the range of meeting rooms (not inclusive)
    * @return the range of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findByCapacity(
        int capacity, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the meeting rooms where capacity = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param capacity the capacity
    * @param start the lower bound of the range of meeting rooms
    * @param end the upper bound of the range of meeting rooms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findByCapacity(
        int capacity, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first meeting room in the ordered set where capacity = &#63;.
    *
    * @param capacity the capacity
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom findByCapacity_First(
        int capacity,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first meeting room in the ordered set where capacity = &#63;.
    *
    * @param capacity the capacity
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching meeting room, or <code>null</code> if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByCapacity_First(
        int capacity,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last meeting room in the ordered set where capacity = &#63;.
    *
    * @param capacity the capacity
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom findByCapacity_Last(
        int capacity,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last meeting room in the ordered set where capacity = &#63;.
    *
    * @param capacity the capacity
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching meeting room, or <code>null</code> if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByCapacity_Last(
        int capacity,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting rooms before and after the current meeting room in the ordered set where capacity = &#63;.
    *
    * @param meetingRoomId the primary key of the current meeting room
    * @param capacity the capacity
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom[] findByCapacity_PrevAndNext(
        long meetingRoomId, int capacity,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the meeting rooms where capacity = &#63; from the database.
    *
    * @param capacity the capacity
    * @throws SystemException if a system exception occurred
    */
    public void removeByCapacity(int capacity)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of meeting rooms where capacity = &#63;.
    *
    * @param capacity the capacity
    * @return the number of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public int countByCapacity(int capacity)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting room where name = &#63; or throws a {@link com.LiferayEnEspanol.booking.NoSuchMeetingRoomException} if it could not be found.
    *
    * @param name the name
    * @return the matching meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom findByName(
        java.lang.String name)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting room where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param name the name
    * @return the matching meeting room, or <code>null</code> if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting room where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param name the name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching meeting room, or <code>null</code> if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByName(
        java.lang.String name, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the meeting room where name = &#63; from the database.
    *
    * @param name the name
    * @return the meeting room that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom removeByName(
        java.lang.String name)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of meeting rooms where name = &#63;.
    *
    * @param name the name
    * @return the number of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the meeting rooms where capacity = &#63; and active = &#63;.
    *
    * @param capacity the capacity
    * @param active the active
    * @return the matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findByCapacityAndActive(
        int capacity, boolean active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the meeting rooms where capacity = &#63; and active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param capacity the capacity
    * @param active the active
    * @param start the lower bound of the range of meeting rooms
    * @param end the upper bound of the range of meeting rooms (not inclusive)
    * @return the range of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findByCapacityAndActive(
        int capacity, boolean active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the meeting rooms where capacity = &#63; and active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param capacity the capacity
    * @param active the active
    * @param start the lower bound of the range of meeting rooms
    * @param end the upper bound of the range of meeting rooms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findByCapacityAndActive(
        int capacity, boolean active, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first meeting room in the ordered set where capacity = &#63; and active = &#63;.
    *
    * @param capacity the capacity
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom findByCapacityAndActive_First(
        int capacity, boolean active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first meeting room in the ordered set where capacity = &#63; and active = &#63;.
    *
    * @param capacity the capacity
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching meeting room, or <code>null</code> if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByCapacityAndActive_First(
        int capacity, boolean active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last meeting room in the ordered set where capacity = &#63; and active = &#63;.
    *
    * @param capacity the capacity
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom findByCapacityAndActive_Last(
        int capacity, boolean active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last meeting room in the ordered set where capacity = &#63; and active = &#63;.
    *
    * @param capacity the capacity
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching meeting room, or <code>null</code> if a matching meeting room could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByCapacityAndActive_Last(
        int capacity, boolean active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting rooms before and after the current meeting room in the ordered set where capacity = &#63; and active = &#63;.
    *
    * @param meetingRoomId the primary key of the current meeting room
    * @param capacity the capacity
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom[] findByCapacityAndActive_PrevAndNext(
        long meetingRoomId, int capacity, boolean active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the meeting rooms where capacity = &#63; and active = &#63; from the database.
    *
    * @param capacity the capacity
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public void removeByCapacityAndActive(int capacity, boolean active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of meeting rooms where capacity = &#63; and active = &#63;.
    *
    * @param capacity the capacity
    * @param active the active
    * @return the number of matching meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public int countByCapacityAndActive(int capacity, boolean active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the meeting room in the entity cache if it is enabled.
    *
    * @param meetingRoom the meeting room
    */
    public void cacheResult(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom);

    /**
    * Caches the meeting rooms in the entity cache if it is enabled.
    *
    * @param meetingRooms the meeting rooms
    */
    public void cacheResult(
        java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> meetingRooms);

    /**
    * Creates a new meeting room with the primary key. Does not add the meeting room to the database.
    *
    * @param meetingRoomId the primary key for the new meeting room
    * @return the new meeting room
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom create(
        long meetingRoomId);

    /**
    * Removes the meeting room with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room that was removed
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom remove(
        long meetingRoomId)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.LiferayEnEspanol.booking.model.MeetingRoom updateImpl(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting room with the primary key or throws a {@link com.LiferayEnEspanol.booking.NoSuchMeetingRoomException} if it could not be found.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room
    * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom findByPrimaryKey(
        long meetingRoomId)
        throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the meeting room with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param meetingRoomId the primary key of the meeting room
    * @return the meeting room, or <code>null</code> if a meeting room with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.LiferayEnEspanol.booking.model.MeetingRoom fetchByPrimaryKey(
        long meetingRoomId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the meeting rooms.
    *
    * @return the meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the meeting rooms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of meeting rooms
    * @param end the upper bound of the range of meeting rooms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the meeting rooms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of meeting rooms.
    *
    * @return the number of meeting rooms
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
