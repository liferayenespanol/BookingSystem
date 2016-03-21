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

package com.LiferayEnEspanol.booking.model.impl;

import com.LiferayEnEspanol.booking.model.MeetingRoom;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MeetingRoom in entity cache.
 *
 * @author Jesus Flores
 * @see MeetingRoom
 * @generated
 */
public class MeetingRoomCacheModel implements CacheModel<MeetingRoom>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{meetingRoomId=");
		sb.append(meetingRoomId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", code=");
		sb.append(code);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", location=");
		sb.append(location);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MeetingRoom toEntityModel() {
		MeetingRoomImpl meetingRoomImpl = new MeetingRoomImpl();

		meetingRoomImpl.setMeetingRoomId(meetingRoomId);
		meetingRoomImpl.setGroupId(groupId);
		meetingRoomImpl.setCompanyId(companyId);
		meetingRoomImpl.setUserId(userId);

		if (userName == null) {
			meetingRoomImpl.setUserName(StringPool.BLANK);
		}
		else {
			meetingRoomImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			meetingRoomImpl.setCreateDate(null);
		}
		else {
			meetingRoomImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			meetingRoomImpl.setModifiedDate(null);
		}
		else {
			meetingRoomImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			meetingRoomImpl.setName(StringPool.BLANK);
		}
		else {
			meetingRoomImpl.setName(name);
		}

		if (code == null) {
			meetingRoomImpl.setCode(StringPool.BLANK);
		}
		else {
			meetingRoomImpl.setCode(code);
		}

		meetingRoomImpl.setCapacity(capacity);
		meetingRoomImpl.setLocation(location);
		meetingRoomImpl.setActive(active);

		meetingRoomImpl.resetOriginalValues();

		return meetingRoomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		meetingRoomId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		code = objectInput.readUTF();
		capacity = objectInput.readInt();
		location = objectInput.readBoolean();
		active = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(meetingRoomId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeInt(capacity);
		objectOutput.writeBoolean(location);
		objectOutput.writeBoolean(active);
	}

	public long meetingRoomId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String code;
	public int capacity;
	public boolean location;
	public boolean active;
}