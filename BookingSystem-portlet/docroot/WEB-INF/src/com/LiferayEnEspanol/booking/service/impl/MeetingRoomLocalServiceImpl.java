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

package com.LiferayEnEspanol.booking.service.impl;

import java.util.Collection;

import com.LiferayEnEspanol.booking.service.base.MeetingRoomLocalServiceBaseImpl;

/**
 * The implementation of the meeting room local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.LiferayEnEspanol.booking.service.MeetingRoomLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jesus Flores
 * @see com.LiferayEnEspanol.booking.service.base.MeetingRoomLocalServiceBaseImpl
 * @see com.LiferayEnEspanol.booking.service.MeetingRoomLocalServiceUtil
 */
public class MeetingRoomLocalServiceImpl extends MeetingRoomLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.LiferayEnEspanol.booking.service.MeetingRoomLocalServiceUtil} to access the meeting room local service.
	 */
	public Collection findByCapacity(int capacity){
		return meetingRoomPersistence.findbyCapacity(capacity);
	}
	public Collection findByName(String name){
		return meetingRoomPersistence.findByName(name);
	}
	public Collection findByCapacity(int capacity,boolean active){
		return meetingRoomPersistence.findbyCapacityAndActive(capacity,active);
	}
}