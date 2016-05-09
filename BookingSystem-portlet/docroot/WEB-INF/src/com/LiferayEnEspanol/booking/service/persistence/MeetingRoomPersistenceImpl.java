package com.LiferayEnEspanol.booking.service.persistence;

import com.LiferayEnEspanol.booking.NoSuchMeetingRoomException;
import com.LiferayEnEspanol.booking.model.MeetingRoom;
import com.LiferayEnEspanol.booking.model.impl.MeetingRoomImpl;
import com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the meeting room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jesus Flores
 * @see MeetingRoomPersistence
 * @see MeetingRoomUtil
 * @generated
 */
public class MeetingRoomPersistenceImpl extends BasePersistenceImpl<MeetingRoom>
    implements MeetingRoomPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MeetingRoomUtil} to access the meeting room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MeetingRoomImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPACITY = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCapacity",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITY =
        new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCapacity",
            new String[] { Integer.class.getName() },
            MeetingRoomModelImpl.CAPACITY_COLUMN_BITMASK |
            MeetingRoomModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CAPACITY = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCapacity",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_CAPACITY_CAPACITY_2 = "meetingRoom.capacity = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_NAME = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByName",
            new String[] { String.class.getName() },
            MeetingRoomModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAME_NAME_1 = "meetingRoom.name IS NULL";
    private static final String _FINDER_COLUMN_NAME_NAME_2 = "meetingRoom.name = ?";
    private static final String _FINDER_COLUMN_NAME_NAME_3 = "(meetingRoom.name IS NULL OR meetingRoom.name = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPACITYANDACTIVE =
        new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCapacityAndActive",
            new String[] {
                Integer.class.getName(), Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITYANDACTIVE =
        new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, MeetingRoomImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByCapacityAndActive",
            new String[] { Integer.class.getName(), Boolean.class.getName() },
            MeetingRoomModelImpl.CAPACITY_COLUMN_BITMASK |
            MeetingRoomModelImpl.ACTIVE_COLUMN_BITMASK |
            MeetingRoomModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CAPACITYANDACTIVE = new FinderPath(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCapacityAndActive",
            new String[] { Integer.class.getName(), Boolean.class.getName() });
    private static final String _FINDER_COLUMN_CAPACITYANDACTIVE_CAPACITY_2 = "meetingRoom.capacity = ? AND ";
    private static final String _FINDER_COLUMN_CAPACITYANDACTIVE_ACTIVE_2 = "meetingRoom.active = ?";
    private static final String _SQL_SELECT_MEETINGROOM = "SELECT meetingRoom FROM MeetingRoom meetingRoom";
    private static final String _SQL_SELECT_MEETINGROOM_WHERE = "SELECT meetingRoom FROM MeetingRoom meetingRoom WHERE ";
    private static final String _SQL_COUNT_MEETINGROOM = "SELECT COUNT(meetingRoom) FROM MeetingRoom meetingRoom";
    private static final String _SQL_COUNT_MEETINGROOM_WHERE = "SELECT COUNT(meetingRoom) FROM MeetingRoom meetingRoom WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "meetingRoom.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MeetingRoom exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MeetingRoom exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MeetingRoomPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "code", "active"
            });
    private static MeetingRoom _nullMeetingRoom = new MeetingRoomImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MeetingRoom> toCacheModel() {
                return _nullMeetingRoomCacheModel;
            }
        };

    private static CacheModel<MeetingRoom> _nullMeetingRoomCacheModel = new CacheModel<MeetingRoom>() {
            @Override
            public MeetingRoom toEntityModel() {
                return _nullMeetingRoom;
            }
        };

    public MeetingRoomPersistenceImpl() {
        setModelClass(MeetingRoom.class);
    }

    /**
     * Returns all the meeting rooms where capacity = &#63;.
     *
     * @param capacity the capacity
     * @return the matching meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MeetingRoom> findByCapacity(int capacity)
        throws SystemException {
        return findByCapacity(capacity, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

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
    @Override
    public List<MeetingRoom> findByCapacity(int capacity, int start, int end)
        throws SystemException {
        return findByCapacity(capacity, start, end, null);
    }

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
    @Override
    public List<MeetingRoom> findByCapacity(int capacity, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITY;
            finderArgs = new Object[] { capacity };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPACITY;
            finderArgs = new Object[] { capacity, start, end, orderByComparator };
        }

        List<MeetingRoom> list = (List<MeetingRoom>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (MeetingRoom meetingRoom : list) {
                if ((capacity != meetingRoom.getCapacity())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_MEETINGROOM_WHERE);

            query.append(_FINDER_COLUMN_CAPACITY_CAPACITY_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(MeetingRoomModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(capacity);

                if (!pagination) {
                    list = (List<MeetingRoom>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MeetingRoom>(list);
                } else {
                    list = (List<MeetingRoom>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first meeting room in the ordered set where capacity = &#63;.
     *
     * @param capacity the capacity
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching meeting room
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom findByCapacity_First(int capacity,
        OrderByComparator orderByComparator)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = fetchByCapacity_First(capacity,
                orderByComparator);

        if (meetingRoom != null) {
            return meetingRoom;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("capacity=");
        msg.append(capacity);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchMeetingRoomException(msg.toString());
    }

    /**
     * Returns the first meeting room in the ordered set where capacity = &#63;.
     *
     * @param capacity the capacity
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching meeting room, or <code>null</code> if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByCapacity_First(int capacity,
        OrderByComparator orderByComparator) throws SystemException {
        List<MeetingRoom> list = findByCapacity(capacity, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last meeting room in the ordered set where capacity = &#63;.
     *
     * @param capacity the capacity
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching meeting room
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom findByCapacity_Last(int capacity,
        OrderByComparator orderByComparator)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = fetchByCapacity_Last(capacity,
                orderByComparator);

        if (meetingRoom != null) {
            return meetingRoom;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("capacity=");
        msg.append(capacity);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchMeetingRoomException(msg.toString());
    }

    /**
     * Returns the last meeting room in the ordered set where capacity = &#63;.
     *
     * @param capacity the capacity
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching meeting room, or <code>null</code> if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByCapacity_Last(int capacity,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCapacity(capacity);

        if (count == 0) {
            return null;
        }

        List<MeetingRoom> list = findByCapacity(capacity, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public MeetingRoom[] findByCapacity_PrevAndNext(long meetingRoomId,
        int capacity, OrderByComparator orderByComparator)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = findByPrimaryKey(meetingRoomId);

        Session session = null;

        try {
            session = openSession();

            MeetingRoom[] array = new MeetingRoomImpl[3];

            array[0] = getByCapacity_PrevAndNext(session, meetingRoom,
                    capacity, orderByComparator, true);

            array[1] = meetingRoom;

            array[2] = getByCapacity_PrevAndNext(session, meetingRoom,
                    capacity, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected MeetingRoom getByCapacity_PrevAndNext(Session session,
        MeetingRoom meetingRoom, int capacity,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_MEETINGROOM_WHERE);

        query.append(_FINDER_COLUMN_CAPACITY_CAPACITY_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(MeetingRoomModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(capacity);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(meetingRoom);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<MeetingRoom> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the meeting rooms where capacity = &#63; from the database.
     *
     * @param capacity the capacity
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCapacity(int capacity) throws SystemException {
        for (MeetingRoom meetingRoom : findByCapacity(capacity,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(meetingRoom);
        }
    }

    /**
     * Returns the number of meeting rooms where capacity = &#63;.
     *
     * @param capacity the capacity
     * @return the number of matching meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCapacity(int capacity) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPACITY;

        Object[] finderArgs = new Object[] { capacity };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_MEETINGROOM_WHERE);

            query.append(_FINDER_COLUMN_CAPACITY_CAPACITY_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(capacity);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the meeting room where name = &#63; or throws a {@link com.LiferayEnEspanol.booking.NoSuchMeetingRoomException} if it could not be found.
     *
     * @param name the name
     * @return the matching meeting room
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom findByName(String name)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = fetchByName(name);

        if (meetingRoom == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("name=");
            msg.append(name);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchMeetingRoomException(msg.toString());
        }

        return meetingRoom;
    }

    /**
     * Returns the meeting room where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param name the name
     * @return the matching meeting room, or <code>null</code> if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByName(String name) throws SystemException {
        return fetchByName(name, true);
    }

    /**
     * Returns the meeting room where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param name the name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching meeting room, or <code>null</code> if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByName(String name, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { name };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_NAME,
                    finderArgs, this);
        }

        if (result instanceof MeetingRoom) {
            MeetingRoom meetingRoom = (MeetingRoom) result;

            if (!Validator.equals(name, meetingRoom.getName())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_MEETINGROOM_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                List<MeetingRoom> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "MeetingRoomPersistenceImpl.fetchByName(String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    MeetingRoom meetingRoom = list.get(0);

                    result = meetingRoom;

                    cacheResult(meetingRoom);

                    if ((meetingRoom.getName() == null) ||
                            !meetingRoom.getName().equals(name)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
                            finderArgs, meetingRoom);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (MeetingRoom) result;
        }
    }

    /**
     * Removes the meeting room where name = &#63; from the database.
     *
     * @param name the name
     * @return the meeting room that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom removeByName(String name)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = findByName(name);

        return remove(meetingRoom);
    }

    /**
     * Returns the number of meeting rooms where name = &#63;.
     *
     * @param name the name
     * @return the number of matching meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByName(String name) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_MEETINGROOM_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the meeting rooms where capacity = &#63; and active = &#63;.
     *
     * @param capacity the capacity
     * @param active the active
     * @return the matching meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MeetingRoom> findByCapacityAndActive(int capacity,
        boolean active) throws SystemException {
        return findByCapacityAndActive(capacity, active, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<MeetingRoom> findByCapacityAndActive(int capacity,
        boolean active, int start, int end) throws SystemException {
        return findByCapacityAndActive(capacity, active, start, end, null);
    }

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
    @Override
    public List<MeetingRoom> findByCapacityAndActive(int capacity,
        boolean active, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITYANDACTIVE;
            finderArgs = new Object[] { capacity, active };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPACITYANDACTIVE;
            finderArgs = new Object[] {
                    capacity, active,
                    
                    start, end, orderByComparator
                };
        }

        List<MeetingRoom> list = (List<MeetingRoom>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (MeetingRoom meetingRoom : list) {
                if ((capacity != meetingRoom.getCapacity()) ||
                        (active != meetingRoom.getActive())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_MEETINGROOM_WHERE);

            query.append(_FINDER_COLUMN_CAPACITYANDACTIVE_CAPACITY_2);

            query.append(_FINDER_COLUMN_CAPACITYANDACTIVE_ACTIVE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(MeetingRoomModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(capacity);

                qPos.add(active);

                if (!pagination) {
                    list = (List<MeetingRoom>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MeetingRoom>(list);
                } else {
                    list = (List<MeetingRoom>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public MeetingRoom findByCapacityAndActive_First(int capacity,
        boolean active, OrderByComparator orderByComparator)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = fetchByCapacityAndActive_First(capacity,
                active, orderByComparator);

        if (meetingRoom != null) {
            return meetingRoom;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("capacity=");
        msg.append(capacity);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchMeetingRoomException(msg.toString());
    }

    /**
     * Returns the first meeting room in the ordered set where capacity = &#63; and active = &#63;.
     *
     * @param capacity the capacity
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching meeting room, or <code>null</code> if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByCapacityAndActive_First(int capacity,
        boolean active, OrderByComparator orderByComparator)
        throws SystemException {
        List<MeetingRoom> list = findByCapacityAndActive(capacity, active, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public MeetingRoom findByCapacityAndActive_Last(int capacity,
        boolean active, OrderByComparator orderByComparator)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = fetchByCapacityAndActive_Last(capacity,
                active, orderByComparator);

        if (meetingRoom != null) {
            return meetingRoom;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("capacity=");
        msg.append(capacity);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchMeetingRoomException(msg.toString());
    }

    /**
     * Returns the last meeting room in the ordered set where capacity = &#63; and active = &#63;.
     *
     * @param capacity the capacity
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching meeting room, or <code>null</code> if a matching meeting room could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByCapacityAndActive_Last(int capacity,
        boolean active, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByCapacityAndActive(capacity, active);

        if (count == 0) {
            return null;
        }

        List<MeetingRoom> list = findByCapacityAndActive(capacity, active,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public MeetingRoom[] findByCapacityAndActive_PrevAndNext(
        long meetingRoomId, int capacity, boolean active,
        OrderByComparator orderByComparator)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = findByPrimaryKey(meetingRoomId);

        Session session = null;

        try {
            session = openSession();

            MeetingRoom[] array = new MeetingRoomImpl[3];

            array[0] = getByCapacityAndActive_PrevAndNext(session, meetingRoom,
                    capacity, active, orderByComparator, true);

            array[1] = meetingRoom;

            array[2] = getByCapacityAndActive_PrevAndNext(session, meetingRoom,
                    capacity, active, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected MeetingRoom getByCapacityAndActive_PrevAndNext(Session session,
        MeetingRoom meetingRoom, int capacity, boolean active,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_MEETINGROOM_WHERE);

        query.append(_FINDER_COLUMN_CAPACITYANDACTIVE_CAPACITY_2);

        query.append(_FINDER_COLUMN_CAPACITYANDACTIVE_ACTIVE_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(MeetingRoomModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(capacity);

        qPos.add(active);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(meetingRoom);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<MeetingRoom> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the meeting rooms where capacity = &#63; and active = &#63; from the database.
     *
     * @param capacity the capacity
     * @param active the active
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCapacityAndActive(int capacity, boolean active)
        throws SystemException {
        for (MeetingRoom meetingRoom : findByCapacityAndActive(capacity,
                active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(meetingRoom);
        }
    }

    /**
     * Returns the number of meeting rooms where capacity = &#63; and active = &#63;.
     *
     * @param capacity the capacity
     * @param active the active
     * @return the number of matching meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCapacityAndActive(int capacity, boolean active)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPACITYANDACTIVE;

        Object[] finderArgs = new Object[] { capacity, active };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_MEETINGROOM_WHERE);

            query.append(_FINDER_COLUMN_CAPACITYANDACTIVE_CAPACITY_2);

            query.append(_FINDER_COLUMN_CAPACITYANDACTIVE_ACTIVE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(capacity);

                qPos.add(active);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the meeting room in the entity cache if it is enabled.
     *
     * @param meetingRoom the meeting room
     */
    @Override
    public void cacheResult(MeetingRoom meetingRoom) {
        EntityCacheUtil.putResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomImpl.class, meetingRoom.getPrimaryKey(), meetingRoom);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME,
            new Object[] { meetingRoom.getName() }, meetingRoom);

        meetingRoom.resetOriginalValues();
    }

    /**
     * Caches the meeting rooms in the entity cache if it is enabled.
     *
     * @param meetingRooms the meeting rooms
     */
    @Override
    public void cacheResult(List<MeetingRoom> meetingRooms) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (EntityCacheUtil.getResult(
                        MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
                        MeetingRoomImpl.class, meetingRoom.getPrimaryKey()) == null) {
                cacheResult(meetingRoom);
            } else {
                meetingRoom.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all meeting rooms.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MeetingRoomImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MeetingRoomImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the meeting room.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MeetingRoom meetingRoom) {
        EntityCacheUtil.removeResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomImpl.class, meetingRoom.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(meetingRoom);
    }

    @Override
    public void clearCache(List<MeetingRoom> meetingRooms) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MeetingRoom meetingRoom : meetingRooms) {
            EntityCacheUtil.removeResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
                MeetingRoomImpl.class, meetingRoom.getPrimaryKey());

            clearUniqueFindersCache(meetingRoom);
        }
    }

    protected void cacheUniqueFindersCache(MeetingRoom meetingRoom) {
        if (meetingRoom.isNew()) {
            Object[] args = new Object[] { meetingRoom.getName() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NAME, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME, args,
                meetingRoom);
        } else {
            MeetingRoomModelImpl meetingRoomModelImpl = (MeetingRoomModelImpl) meetingRoom;

            if ((meetingRoomModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { meetingRoom.getName() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NAME, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_NAME, args,
                    meetingRoom);
            }
        }
    }

    protected void clearUniqueFindersCache(MeetingRoom meetingRoom) {
        MeetingRoomModelImpl meetingRoomModelImpl = (MeetingRoomModelImpl) meetingRoom;

        Object[] args = new Object[] { meetingRoom.getName() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME, args);

        if ((meetingRoomModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
            args = new Object[] { meetingRoomModelImpl.getOriginalName() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_NAME, args);
        }
    }

    /**
     * Creates a new meeting room with the primary key. Does not add the meeting room to the database.
     *
     * @param meetingRoomId the primary key for the new meeting room
     * @return the new meeting room
     */
    @Override
    public MeetingRoom create(long meetingRoomId) {
        MeetingRoom meetingRoom = new MeetingRoomImpl();

        meetingRoom.setNew(true);
        meetingRoom.setPrimaryKey(meetingRoomId);

        return meetingRoom;
    }

    /**
     * Removes the meeting room with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param meetingRoomId the primary key of the meeting room
     * @return the meeting room that was removed
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom remove(long meetingRoomId)
        throws NoSuchMeetingRoomException, SystemException {
        return remove((Serializable) meetingRoomId);
    }

    /**
     * Removes the meeting room with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the meeting room
     * @return the meeting room that was removed
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom remove(Serializable primaryKey)
        throws NoSuchMeetingRoomException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MeetingRoom meetingRoom = (MeetingRoom) session.get(MeetingRoomImpl.class,
                    primaryKey);

            if (meetingRoom == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMeetingRoomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(meetingRoom);
        } catch (NoSuchMeetingRoomException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MeetingRoom removeImpl(MeetingRoom meetingRoom)
        throws SystemException {
        meetingRoom = toUnwrappedModel(meetingRoom);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(meetingRoom)) {
                meetingRoom = (MeetingRoom) session.get(MeetingRoomImpl.class,
                        meetingRoom.getPrimaryKeyObj());
            }

            if (meetingRoom != null) {
                session.delete(meetingRoom);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (meetingRoom != null) {
            clearCache(meetingRoom);
        }

        return meetingRoom;
    }

    @Override
    public MeetingRoom updateImpl(
        com.LiferayEnEspanol.booking.model.MeetingRoom meetingRoom)
        throws SystemException {
        meetingRoom = toUnwrappedModel(meetingRoom);

        boolean isNew = meetingRoom.isNew();

        MeetingRoomModelImpl meetingRoomModelImpl = (MeetingRoomModelImpl) meetingRoom;

        Session session = null;

        try {
            session = openSession();

            if (meetingRoom.isNew()) {
                session.save(meetingRoom);

                meetingRoom.setNew(false);
            } else {
                session.merge(meetingRoom);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !MeetingRoomModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((meetingRoomModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITY.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        meetingRoomModelImpl.getOriginalCapacity()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPACITY, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITY,
                    args);

                args = new Object[] { meetingRoomModelImpl.getCapacity() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPACITY, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITY,
                    args);
            }

            if ((meetingRoomModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITYANDACTIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        meetingRoomModelImpl.getOriginalCapacity(),
                        meetingRoomModelImpl.getOriginalActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPACITYANDACTIVE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITYANDACTIVE,
                    args);

                args = new Object[] {
                        meetingRoomModelImpl.getCapacity(),
                        meetingRoomModelImpl.getActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPACITYANDACTIVE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPACITYANDACTIVE,
                    args);
            }
        }

        EntityCacheUtil.putResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
            MeetingRoomImpl.class, meetingRoom.getPrimaryKey(), meetingRoom);

        clearUniqueFindersCache(meetingRoom);
        cacheUniqueFindersCache(meetingRoom);

        return meetingRoom;
    }

    protected MeetingRoom toUnwrappedModel(MeetingRoom meetingRoom) {
        if (meetingRoom instanceof MeetingRoomImpl) {
            return meetingRoom;
        }

        MeetingRoomImpl meetingRoomImpl = new MeetingRoomImpl();

        meetingRoomImpl.setNew(meetingRoom.isNew());
        meetingRoomImpl.setPrimaryKey(meetingRoom.getPrimaryKey());

        meetingRoomImpl.setMeetingRoomId(meetingRoom.getMeetingRoomId());
        meetingRoomImpl.setGroupId(meetingRoom.getGroupId());
        meetingRoomImpl.setCompanyId(meetingRoom.getCompanyId());
        meetingRoomImpl.setUserId(meetingRoom.getUserId());
        meetingRoomImpl.setUserName(meetingRoom.getUserName());
        meetingRoomImpl.setCreateDate(meetingRoom.getCreateDate());
        meetingRoomImpl.setModifiedDate(meetingRoom.getModifiedDate());
        meetingRoomImpl.setName(meetingRoom.getName());
        meetingRoomImpl.setCode(meetingRoom.getCode());
        meetingRoomImpl.setCapacity(meetingRoom.getCapacity());
        meetingRoomImpl.setLocation(meetingRoom.isLocation());
        meetingRoomImpl.setActive(meetingRoom.isActive());

        return meetingRoomImpl;
    }

    /**
     * Returns the meeting room with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the meeting room
     * @return the meeting room
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMeetingRoomException, SystemException {
        MeetingRoom meetingRoom = fetchByPrimaryKey(primaryKey);

        if (meetingRoom == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMeetingRoomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return meetingRoom;
    }

    /**
     * Returns the meeting room with the primary key or throws a {@link com.LiferayEnEspanol.booking.NoSuchMeetingRoomException} if it could not be found.
     *
     * @param meetingRoomId the primary key of the meeting room
     * @return the meeting room
     * @throws com.LiferayEnEspanol.booking.NoSuchMeetingRoomException if a meeting room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom findByPrimaryKey(long meetingRoomId)
        throws NoSuchMeetingRoomException, SystemException {
        return findByPrimaryKey((Serializable) meetingRoomId);
    }

    /**
     * Returns the meeting room with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the meeting room
     * @return the meeting room, or <code>null</code> if a meeting room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        MeetingRoom meetingRoom = (MeetingRoom) EntityCacheUtil.getResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
                MeetingRoomImpl.class, primaryKey);

        if (meetingRoom == _nullMeetingRoom) {
            return null;
        }

        if (meetingRoom == null) {
            Session session = null;

            try {
                session = openSession();

                meetingRoom = (MeetingRoom) session.get(MeetingRoomImpl.class,
                        primaryKey);

                if (meetingRoom != null) {
                    cacheResult(meetingRoom);
                } else {
                    EntityCacheUtil.putResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
                        MeetingRoomImpl.class, primaryKey, _nullMeetingRoom);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
                    MeetingRoomImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return meetingRoom;
    }

    /**
     * Returns the meeting room with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param meetingRoomId the primary key of the meeting room
     * @return the meeting room, or <code>null</code> if a meeting room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MeetingRoom fetchByPrimaryKey(long meetingRoomId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) meetingRoomId);
    }

    /**
     * Returns all the meeting rooms.
     *
     * @return the meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MeetingRoom> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<MeetingRoom> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<MeetingRoom> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<MeetingRoom> list = (List<MeetingRoom>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MEETINGROOM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MEETINGROOM;

                if (pagination) {
                    sql = sql.concat(MeetingRoomModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<MeetingRoom>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MeetingRoom>(list);
                } else {
                    list = (List<MeetingRoom>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the meeting rooms from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (MeetingRoom meetingRoom : findAll()) {
            remove(meetingRoom);
        }
    }

    /**
     * Returns the number of meeting rooms.
     *
     * @return the number of meeting rooms
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_MEETINGROOM);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the meeting room persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.LiferayEnEspanol.booking.model.MeetingRoom")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MeetingRoom>> listenersList = new ArrayList<ModelListener<MeetingRoom>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<MeetingRoom>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MeetingRoomImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
