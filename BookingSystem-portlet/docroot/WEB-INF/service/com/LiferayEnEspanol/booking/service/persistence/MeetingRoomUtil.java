/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.LiferayEnEspanol.booking.service.persistence;

import com.LiferayEnEspanol.booking.model.MeetingRoom;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the meeting room service. This utility wraps {@link MeetingRoomPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jesus Flores
 * @see MeetingRoomPersistence
 * @see MeetingRoomPersistenceImpl
 * @generated
 */
public class MeetingRoomUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MeetingRoom meetingRoom) {
		getPersistence().clearCache(meetingRoom);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MeetingRoom> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MeetingRoom> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MeetingRoom> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MeetingRoom update(MeetingRoom meetingRoom)
		throws SystemException {
		return getPersistence().update(meetingRoom);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MeetingRoom update(MeetingRoom meetingRoom,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(meetingRoom, serviceContext);
	}

	/**
	* Caches the meeting room in the entity cache if it is enabled.
	*
	* @param meetingRoom the meeting room
	*/
	public static void cacheResult(
		com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom) {
		getPersistence().cacheResult(meetingRoom);
	}

	/**
	* Caches the meeting rooms in the entity cache if it is enabled.
	*
	* @param meetingRooms the meeting rooms
	*/
	public static void cacheResult(
		java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> meetingRooms) {
		getPersistence().cacheResult(meetingRooms);
	}

	/**
	* Creates a new meeting room with the primary key. Does not add the meeting room to the database.
	*
	* @param meetingRoomId the primary key for the new meeting room
	* @return the new meeting room
	*/
	public static com.LiferayEnEspanol.booking.model.MeetingRoom create(
		long meetingRoomId) {
		return getPersistence().create(meetingRoomId);
	}

	/**
	* Removes the meeting room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param meetingRoomId the primary key of the meeting room
	* @return the meeting room that was removed
	* @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.LiferayEnEspanol.booking.model.MeetingRoom remove(
		long meetingRoomId)
		throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(meetingRoomId);
	}

	public static com.LiferayEnEspanol.booking.model.MeetingRoom updateImpl(
		com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(meetingRoom);
	}

	/**
	* Returns the meeting room with the primary key or throws a {@link com.LiferayEnEspanol.booking.NoSuchMeetingRoomException} if it could not be found.
	*
	* @param meetingRoomId the primary key of the meeting room
	* @return the meeting room
	* @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.LiferayEnEspanol.booking.model.MeetingRoom findByPrimaryKey(
		long meetingRoomId)
		throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(meetingRoomId);
	}

	/**
	* Returns the meeting room with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param meetingRoomId the primary key of the meeting room
	* @return the meeting room, or <code>null</code> if a meeting room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.LiferayEnEspanol.booking.model.MeetingRoom fetchByPrimaryKey(
		long meetingRoomId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(meetingRoomId);
	}

	/**
	* Returns all the meeting rooms.
	*
	* @return the meeting rooms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.LiferayEnEspanol.booking.model.MeetingRoom> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the meeting rooms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of meeting rooms.
	*
	* @return the number of meeting rooms
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MeetingRoomPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MeetingRoomPersistence)PortletBeanLocatorUtil.locate(com.LiferayEnEspanol.booking.service.ClpSerializer.getServletContextName(),
					MeetingRoomPersistence.class.getName());

			ReferenceRegistry.registerReference(MeetingRoomUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MeetingRoomPersistence persistence) {
	}

	private static MeetingRoomPersistence _persistence;
}