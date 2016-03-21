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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.LiferayEnEspanol.booking.service.http.MeetingRoomServiceSoap}.
 *
 * @author Jesus Flores
 * @see com.LiferayEnEspanol.booking.service.http.MeetingRoomServiceSoap
 * @generated
 */
public class MeetingRoomSoap implements Serializable {
	public static MeetingRoomSoap toSoapModel(MeetingRoom model) {
		MeetingRoomSoap soapModel = new MeetingRoomSoap();

		soapModel.setMeetingRoomId(model.getMeetingRoomId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setCode(model.getCode());
		soapModel.setCapacity(model.getCapacity());
		soapModel.setLocation(model.getLocation());
		soapModel.setActive(model.getActive());

		return soapModel;
	}

	public static MeetingRoomSoap[] toSoapModels(MeetingRoom[] models) {
		MeetingRoomSoap[] soapModels = new MeetingRoomSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MeetingRoomSoap[][] toSoapModels(MeetingRoom[][] models) {
		MeetingRoomSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MeetingRoomSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MeetingRoomSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MeetingRoomSoap[] toSoapModels(List<MeetingRoom> models) {
		List<MeetingRoomSoap> soapModels = new ArrayList<MeetingRoomSoap>(models.size());

		for (MeetingRoom model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MeetingRoomSoap[soapModels.size()]);
	}

	public MeetingRoomSoap() {
	}

	public long getPrimaryKey() {
		return _meetingRoomId;
	}

	public void setPrimaryKey(long pk) {
		setMeetingRoomId(pk);
	}

	public long getMeetingRoomId() {
		return _meetingRoomId;
	}

	public void setMeetingRoomId(long meetingRoomId) {
		_meetingRoomId = meetingRoomId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public int getCapacity() {
		return _capacity;
	}

	public void setCapacity(int capacity) {
		_capacity = capacity;
	}

	public boolean getLocation() {
		return _location;
	}

	public boolean isLocation() {
		return _location;
	}

	public void setLocation(boolean location) {
		_location = location;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	private long _meetingRoomId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _code;
	private int _capacity;
	private boolean _location;
	private boolean _active;
}