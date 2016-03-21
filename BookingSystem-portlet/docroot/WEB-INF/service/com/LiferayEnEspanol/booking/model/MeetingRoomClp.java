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

import com.LiferayEnEspanol.booking.service.ClpSerializer;
import com.LiferayEnEspanol.booking.service.MeetingRoomLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jesus Flores
 */
public class MeetingRoomClp extends BaseModelImpl<MeetingRoom>
	implements MeetingRoom {
	public MeetingRoomClp() {
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
	public long getPrimaryKey() {
		return _meetingRoomId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMeetingRoomId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _meetingRoomId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getMeetingRoomId() {
		return _meetingRoomId;
	}

	@Override
	public void setMeetingRoomId(long meetingRoomId) {
		_meetingRoomId = meetingRoomId;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setMeetingRoomId", long.class);

				method.invoke(_meetingRoomRemoteModel, meetingRoomId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_meetingRoomRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_meetingRoomRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_meetingRoomRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_meetingRoomRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_meetingRoomRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_meetingRoomRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_meetingRoomRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_meetingRoomRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCapacity() {
		return _capacity;
	}

	@Override
	public void setCapacity(int capacity) {
		_capacity = capacity;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setCapacity", int.class);

				method.invoke(_meetingRoomRemoteModel, capacity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getLocation() {
		return _location;
	}

	@Override
	public boolean isLocation() {
		return _location;
	}

	@Override
	public void setLocation(boolean location) {
		_location = location;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", boolean.class);

				method.invoke(_meetingRoomRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getActive() {
		return _active;
	}

	@Override
	public boolean isActive() {
		return _active;
	}

	@Override
	public void setActive(boolean active) {
		_active = active;

		if (_meetingRoomRemoteModel != null) {
			try {
				Class<?> clazz = _meetingRoomRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", boolean.class);

				method.invoke(_meetingRoomRemoteModel, active);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMeetingRoomRemoteModel() {
		return _meetingRoomRemoteModel;
	}

	public void setMeetingRoomRemoteModel(BaseModel<?> meetingRoomRemoteModel) {
		_meetingRoomRemoteModel = meetingRoomRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _meetingRoomRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_meetingRoomRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MeetingRoomLocalServiceUtil.addMeetingRoom(this);
		}
		else {
			MeetingRoomLocalServiceUtil.updateMeetingRoom(this);
		}
	}

	@Override
	public MeetingRoom toEscapedModel() {
		return (MeetingRoom)ProxyUtil.newProxyInstance(MeetingRoom.class.getClassLoader(),
			new Class[] { MeetingRoom.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MeetingRoomClp clone = new MeetingRoomClp();

		clone.setMeetingRoomId(getMeetingRoomId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setCode(getCode());
		clone.setCapacity(getCapacity());
		clone.setLocation(getLocation());
		clone.setActive(getActive());

		return clone;
	}

	@Override
	public int compareTo(MeetingRoom meetingRoom) {
		int value = 0;

		value = getName().compareTo(meetingRoom.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MeetingRoomClp)) {
			return false;
		}

		MeetingRoomClp meetingRoom = (MeetingRoomClp)obj;

		long primaryKey = meetingRoom.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{meetingRoomId=");
		sb.append(getMeetingRoomId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", capacity=");
		sb.append(getCapacity());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.LiferayEnEspanol.booking.model.MeetingRoom");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>meetingRoomId</column-name><column-value><![CDATA[");
		sb.append(getMeetingRoomId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>capacity</column-name><column-value><![CDATA[");
		sb.append(getCapacity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _meetingRoomId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _code;
	private int _capacity;
	private boolean _location;
	private boolean _active;
	private BaseModel<?> _meetingRoomRemoteModel;
	private Class<?> _clpSerializerClass = com.LiferayEnEspanol.booking.service.ClpSerializer.class;
}