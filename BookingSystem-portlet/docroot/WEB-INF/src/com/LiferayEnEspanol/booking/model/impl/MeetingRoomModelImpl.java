package com.LiferayEnEspanol.booking.model.impl;

import com.LiferayEnEspanol.booking.model.MeetingRoom;
import com.LiferayEnEspanol.booking.model.MeetingRoomModel;
import com.LiferayEnEspanol.booking.model.MeetingRoomSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MeetingRoom service. Represents a row in the &quot;LiferayEnEspanol_MeetingRoom&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.LiferayEnEspanol.booking.model.MeetingRoomModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MeetingRoomImpl}.
 * </p>
 *
 * @author Jesus Flores
 * @see MeetingRoomImpl
 * @see com.LiferayEnEspanol.booking.model.MeetingRoom
 * @see com.LiferayEnEspanol.booking.model.MeetingRoomModel
 * @generated
 */
@JSON(strict = true)
public class MeetingRoomModelImpl extends BaseModelImpl<MeetingRoom>
    implements MeetingRoomModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a meeting room model instance should use the {@link com.LiferayEnEspanol.booking.model.MeetingRoom} interface instead.
     */
    public static final String TABLE_NAME = "LiferayEnEspanol_MeetingRoom";
    public static final Object[][] TABLE_COLUMNS = {
            { "meetingRoomId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "name", Types.VARCHAR },
            { "code_", Types.VARCHAR },
            { "capacity", Types.INTEGER },
            { "location", Types.BOOLEAN },
            { "active_", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table LiferayEnEspanol_MeetingRoom (meetingRoomId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,code_ VARCHAR(75) null,capacity INTEGER,location BOOLEAN,active_ BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table LiferayEnEspanol_MeetingRoom";
    public static final String ORDER_BY_JPQL = " ORDER BY meetingRoom.name ASC";
    public static final String ORDER_BY_SQL = " ORDER BY LiferayEnEspanol_MeetingRoom.name ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.LiferayEnEspanol.booking.model.MeetingRoom"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.LiferayEnEspanol.booking.model.MeetingRoom"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.LiferayEnEspanol.booking.model.MeetingRoom"),
            true);
    public static long ACTIVE_COLUMN_BITMASK = 1L;
    public static long CAPACITY_COLUMN_BITMASK = 2L;
    public static long NAME_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.LiferayEnEspanol.booking.model.MeetingRoom"));
    private static ClassLoader _classLoader = MeetingRoom.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            MeetingRoom.class
        };
    private long _meetingRoomId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _originalName;
    private String _code;
    private int _capacity;
    private int _originalCapacity;
    private boolean _setOriginalCapacity;
    private boolean _location;
    private boolean _active;
    private boolean _originalActive;
    private boolean _setOriginalActive;
    private long _columnBitmask;
    private MeetingRoom _escapedModel;

    public MeetingRoomModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static MeetingRoom toModel(MeetingRoomSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        MeetingRoom model = new MeetingRoomImpl();

        model.setMeetingRoomId(soapModel.getMeetingRoomId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setName(soapModel.getName());
        model.setCode(soapModel.getCode());
        model.setCapacity(soapModel.getCapacity());
        model.setLocation(soapModel.getLocation());
        model.setActive(soapModel.getActive());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<MeetingRoom> toModels(MeetingRoomSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<MeetingRoom> models = new ArrayList<MeetingRoom>(soapModels.length);

        for (MeetingRoomSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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
        Long meetingRoomId = (Long) attributes.get("meetingRoomId");

        if (meetingRoomId != null) {
            setMeetingRoomId(meetingRoomId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String code = (String) attributes.get("code");

        if (code != null) {
            setCode(code);
        }

        Integer capacity = (Integer) attributes.get("capacity");

        if (capacity != null) {
            setCapacity(capacity);
        }

        Boolean location = (Boolean) attributes.get("location");

        if (location != null) {
            setLocation(location);
        }

        Boolean active = (Boolean) attributes.get("active");

        if (active != null) {
            setActive(active);
        }
    }

    @JSON
    @Override
    public long getMeetingRoomId() {
        return _meetingRoomId;
    }

    @Override
    public void setMeetingRoomId(long meetingRoomId) {
        _meetingRoomId = meetingRoomId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _columnBitmask = -1L;

        if (_originalName == null) {
            _originalName = _name;
        }

        _name = name;
    }

    public String getOriginalName() {
        return GetterUtil.getString(_originalName);
    }

    @JSON
    @Override
    public String getCode() {
        if (_code == null) {
            return StringPool.BLANK;
        } else {
            return _code;
        }
    }

    @Override
    public void setCode(String code) {
        _code = code;
    }

    @JSON
    @Override
    public int getCapacity() {
        return _capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        _columnBitmask |= CAPACITY_COLUMN_BITMASK;

        if (!_setOriginalCapacity) {
            _setOriginalCapacity = true;

            _originalCapacity = _capacity;
        }

        _capacity = capacity;
    }

    public int getOriginalCapacity() {
        return _originalCapacity;
    }

    @JSON
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
    }

    @JSON
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
        _columnBitmask |= ACTIVE_COLUMN_BITMASK;

        if (!_setOriginalActive) {
            _setOriginalActive = true;

            _originalActive = _active;
        }

        _active = active;
    }

    public boolean getOriginalActive() {
        return _originalActive;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            MeetingRoom.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public MeetingRoom toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (MeetingRoom) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        MeetingRoomImpl meetingRoomImpl = new MeetingRoomImpl();

        meetingRoomImpl.setMeetingRoomId(getMeetingRoomId());
        meetingRoomImpl.setGroupId(getGroupId());
        meetingRoomImpl.setCompanyId(getCompanyId());
        meetingRoomImpl.setUserId(getUserId());
        meetingRoomImpl.setUserName(getUserName());
        meetingRoomImpl.setCreateDate(getCreateDate());
        meetingRoomImpl.setModifiedDate(getModifiedDate());
        meetingRoomImpl.setName(getName());
        meetingRoomImpl.setCode(getCode());
        meetingRoomImpl.setCapacity(getCapacity());
        meetingRoomImpl.setLocation(getLocation());
        meetingRoomImpl.setActive(getActive());

        meetingRoomImpl.resetOriginalValues();

        return meetingRoomImpl;
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

        if (!(obj instanceof MeetingRoom)) {
            return false;
        }

        MeetingRoom meetingRoom = (MeetingRoom) obj;

        long primaryKey = meetingRoom.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        MeetingRoomModelImpl meetingRoomModelImpl = this;

        meetingRoomModelImpl._originalName = meetingRoomModelImpl._name;

        meetingRoomModelImpl._originalCapacity = meetingRoomModelImpl._capacity;

        meetingRoomModelImpl._setOriginalCapacity = false;

        meetingRoomModelImpl._originalActive = meetingRoomModelImpl._active;

        meetingRoomModelImpl._setOriginalActive = false;

        meetingRoomModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<MeetingRoom> toCacheModel() {
        MeetingRoomCacheModel meetingRoomCacheModel = new MeetingRoomCacheModel();

        meetingRoomCacheModel.meetingRoomId = getMeetingRoomId();

        meetingRoomCacheModel.groupId = getGroupId();

        meetingRoomCacheModel.companyId = getCompanyId();

        meetingRoomCacheModel.userId = getUserId();

        meetingRoomCacheModel.userName = getUserName();

        String userName = meetingRoomCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            meetingRoomCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            meetingRoomCacheModel.createDate = createDate.getTime();
        } else {
            meetingRoomCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            meetingRoomCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            meetingRoomCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        meetingRoomCacheModel.name = getName();

        String name = meetingRoomCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            meetingRoomCacheModel.name = null;
        }

        meetingRoomCacheModel.code = getCode();

        String code = meetingRoomCacheModel.code;

        if ((code != null) && (code.length() == 0)) {
            meetingRoomCacheModel.code = null;
        }

        meetingRoomCacheModel.capacity = getCapacity();

        meetingRoomCacheModel.location = getLocation();

        meetingRoomCacheModel.active = getActive();

        return meetingRoomCacheModel;
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
}
