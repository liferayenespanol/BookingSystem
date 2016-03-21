create table LiferayEnEspanol_MeetingRoom (
	meetingRoomId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null,
	capacity INTEGER,
	location BOOLEAN,
	active_ BOOLEAN
);