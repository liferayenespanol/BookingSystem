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

package com.LiferayEnEspanol.booking.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MeetingRoom}.
 * </p>
 *
 * @author Jesus Flores
 * @see MeetingRoom
 * @generated
 */
public class MeetingRoomWrapper implements MeetingRoom,
	ModelWrapper<MeetingRoom> {
	public MeetingRoomWrapper(MeetingRoom meetingRoom) {
		_meetingRoom = meetingRoom;
	}

	@Override
	public Class<?> getModelClass() {
		return MeetingRoom.class;
	}

	@Override
	public String getModelClassName() {
		return MeetingRoom.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("meetingRoomId", getMeetingRoomId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("capacity", getCapacity());
		attributes.put("location", getLocation());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long meetingRoomId = (Long)attributes.get("meetingRoomId");

		if (meetingRoomId != null) {
			setMeetingRoomId(meetingRoomId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Integer capacity = (Integer)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		Boolean location = (Boolean)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	/**
	* Returns the primary key of this meeting room.
	*
	* @return the primary key of this meeting room
	*/
	@Override
	public long getPrimaryKey() {
		return _meetingRoom.getPrimaryKey();
	}

	/**
	* Sets the primary key of this meeting room.
	*
	* @param primaryKey the primary key of this meeting room
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_meetingRoom.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the meeting room ID of this meeting room.
	*
	* @return the meeting room ID of this meeting room
	*/
	@Override
	public long getMeetingRoomId() {
		return _meetingRoom.getMeetingRoomId();
	}

	/**
	* Sets the meeting room ID of this meeting room.
	*
	* @param meetingRoomId the meeting room ID of this meeting room
	*/
	@Override
	public void setMeetingRoomId(long meetingRoomId) {
		_meetingRoom.setMeetingRoomId(meetingRoomId);
	}

	/**
	* Returns the group ID of this meeting room.
	*
	* @return the group ID of this meeting room
	*/
	@Override
	public long getGroupId() {
		return _meetingRoom.getGroupId();
	}

	/**
	* Sets the group ID of this meeting room.
	*
	* @param groupId the group ID of this meeting room
	*/
	@Override
	public void setGroupId(long groupId) {
		_meetingRoom.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this meeting room.
	*
	* @return the company ID of this meeting room
	*/
	@Override
	public long getCompanyId() {
		return _meetingRoom.getCompanyId();
	}

	/**
	* Sets the company ID of this meeting room.
	*
	* @param companyId the company ID of this meeting room
	*/
	@Override
	public void setCompanyId(long companyId) {
		_meetingRoom.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this meeting room.
	*
	* @return the user ID of this meeting room
	*/
	@Override
	public long getUserId() {
		return _meetingRoom.getUserId();
	}

	/**
	* Sets the user ID of this meeting room.
	*
	* @param userId the user ID of this meeting room
	*/
	@Override
	public void setUserId(long userId) {
		_meetingRoom.setUserId(userId);
	}

	/**
	* Returns the user uuid of this meeting room.
	*
	* @return the user uuid of this meeting room
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _meetingRoom.getUserUuid();
	}

	/**
	* Sets the user uuid of this meeting room.
	*
	* @param userUuid the user uuid of this meeting room
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_meetingRoom.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this meeting room.
	*
	* @return the user name of this meeting room
	*/
	@Override
	public java.lang.String getUserName() {
		return _meetingRoom.getUserName();
	}

	/**
	* Sets the user name of this meeting room.
	*
	* @param userName the user name of this meeting room
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_meetingRoom.setUserName(userName);
	}

	/**
	* Returns the create date of this meeting room.
	*
	* @return the create date of this meeting room
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _meetingRoom.getCreateDate();
	}

	/**
	* Sets the create date of this meeting room.
	*
	* @param createDate the create date of this meeting room
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_meetingRoom.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this meeting room.
	*
	* @return the modified date of this meeting room
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _meetingRoom.getModifiedDate();
	}

	/**
	* Sets the modified date of this meeting room.
	*
	* @param modifiedDate the modified date of this meeting room
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_meetingRoom.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this meeting room.
	*
	* @return the name of this meeting room
	*/
	@Override
	public java.lang.String getName() {
		return _meetingRoom.getName();
	}

	/**
	* Sets the name of this meeting room.
	*
	* @param name the name of this meeting room
	*/
	@Override
	public void setName(java.lang.String name) {
		_meetingRoom.setName(name);
	}

	/**
	* Returns the code of this meeting room.
	*
	* @return the code of this meeting room
	*/
	@Override
	public java.lang.String getCode() {
		return _meetingRoom.getCode();
	}

	/**
	* Sets the code of this meeting room.
	*
	* @param code the code of this meeting room
	*/
	@Override
	public void setCode(java.lang.String code) {
		_meetingRoom.setCode(code);
	}

	/**
	* Returns the capacity of this meeting room.
	*
	* @return the capacity of this meeting room
	*/
	@Override
	public int getCapacity() {
		return _meetingRoom.getCapacity();
	}

	/**
	* Sets the capacity of this meeting room.
	*
	* @param capacity the capacity of this meeting room
	*/
	@Override
	public void setCapacity(int capacity) {
		_meetingRoom.setCapacity(capacity);
	}

	/**
	* Returns the location of this meeting room.
	*
	* @return the location of this meeting room
	*/
	@Override
	public boolean getLocation() {
		return _meetingRoom.getLocation();
	}

	/**
	* Returns <code>true</code> if this meeting room is location.
	*
	* @return <code>true</code> if this meeting room is location; <code>false</code> otherwise
	*/
	@Override
	public boolean isLocation() {
		return _meetingRoom.isLocation();
	}

	/**
	* Sets whether this meeting room is location.
	*
	* @param location the location of this meeting room
	*/
	@Override
	public void setLocation(boolean location) {
		_meetingRoom.setLocation(location);
	}

	/**
	* Returns the active of this meeting room.
	*
	* @return the active of this meeting room
	*/
	@Override
	public boolean getActive() {
		return _meetingRoom.getActive();
	}

	/**
	* Returns <code>true</code> if this meeting room is active.
	*
	* @return <code>true</code> if this meeting room is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _meetingRoom.isActive();
	}

	/**
	* Sets whether this meeting room is active.
	*
	* @param active the active of this meeting room
	*/
	@Override
	public void setActive(boolean active) {
		_meetingRoom.setActive(active);
	}

	@Override
	public boolean isNew() {
		return _meetingRoom.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_meetingRoom.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _meetingRoom.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_meetingRoom.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _meetingRoom.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _meetingRoom.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_meetingRoom.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _meetingRoom.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_meetingRoom.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_meetingRoom.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_meetingRoom.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MeetingRoomWrapper((MeetingRoom)_meetingRoom.clone());
	}

	@Override
	public int compareTo(
		com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom) {
		return _meetingRoom.compareTo(meetingRoom);
	}

	@Override
	public int hashCode() {
		return _meetingRoom.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.LiferayEnEspanol.booking.model.MeetingRoom> toCacheModel() {
		return _meetingRoom.toCacheModel();
	}

	@Override
	public com.LiferayEnEspanol.booking.model.MeetingRoom toEscapedModel() {
		return new MeetingRoomWrapper(_meetingRoom.toEscapedModel());
	}

	@Override
	public com.LiferayEnEspanol.booking.model.MeetingRoom toUnescapedModel() {
		return new MeetingRoomWrapper(_meetingRoom.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _meetingRoom.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _meetingRoom.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_meetingRoom.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MeetingRoomWrapper)) {
			return false;
		}

		MeetingRoomWrapper meetingRoomWrapper = (MeetingRoomWrapper)obj;

		if (Validator.equals(_meetingRoom, meetingRoomWrapper._meetingRoom)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MeetingRoom getWrappedMeetingRoom() {
		return _meetingRoom;
	}

	@Override
	public MeetingRoom getWrappedModel() {
		return _meetingRoom;
	}

	@Override
	public void resetOriginalValues() {
		_meetingRoom.resetOriginalValues();
	}

	private MeetingRoom _meetingRoom;
}