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

import com.LiferayEnEspanol.booking.NoSuchMeetingRoomException;
import com.LiferayEnEspanol.booking.model.MeetingRoom;
import com.LiferayEnEspanol.booking.model.impl.MeetingRoomImpl;
import com.LiferayEnEspanol.booking.model.impl.MeetingRoomModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
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

	public MeetingRoomPersistenceImpl() {
		setModelClass(MeetingRoom.class);
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
			}
			else {
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
	}

	@Override
	public void clearCache(List<MeetingRoom> meetingRooms) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MeetingRoom meetingRoom : meetingRooms) {
			EntityCacheUtil.removeResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
				MeetingRoomImpl.class, meetingRoom.getPrimaryKey());
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
		return remove((Serializable)meetingRoomId);
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

			MeetingRoom meetingRoom = (MeetingRoom)session.get(MeetingRoomImpl.class,
					primaryKey);

			if (meetingRoom == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMeetingRoomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(meetingRoom);
		}
		catch (NoSuchMeetingRoomException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
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
				meetingRoom = (MeetingRoom)session.get(MeetingRoomImpl.class,
						meetingRoom.getPrimaryKeyObj());
			}

			if (meetingRoom != null) {
				session.delete(meetingRoom);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
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

		Session session = null;

		try {
			session = openSession();

			if (meetingRoom.isNew()) {
				session.save(meetingRoom);

				meetingRoom.setNew(false);
			}
			else {
				session.merge(meetingRoom);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
			MeetingRoomImpl.class, meetingRoom.getPrimaryKey(), meetingRoom);

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
		return findByPrimaryKey((Serializable)meetingRoomId);
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
		MeetingRoom meetingRoom = (MeetingRoom)EntityCacheUtil.getResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
				MeetingRoomImpl.class, primaryKey);

		if (meetingRoom == _nullMeetingRoom) {
			return null;
		}

		if (meetingRoom == null) {
			Session session = null;

			try {
				session = openSession();

				meetingRoom = (MeetingRoom)session.get(MeetingRoomImpl.class,
						primaryKey);

				if (meetingRoom != null) {
					cacheResult(meetingRoom);
				}
				else {
					EntityCacheUtil.putResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
						MeetingRoomImpl.class, primaryKey, _nullMeetingRoom);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MeetingRoomModelImpl.ENTITY_CACHE_ENABLED,
					MeetingRoomImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
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
		return fetchByPrimaryKey((Serializable)meetingRoomId);
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
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<MeetingRoom> list = (List<MeetingRoom>)FinderCacheUtil.getResult(finderPath,
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
			}
			else {
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
					list = (List<MeetingRoom>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MeetingRoom>(list);
				}
				else {
					list = (List<MeetingRoom>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
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
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MEETINGROOM);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
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
					listenersList.add((ModelListener<MeetingRoom>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
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

	private static final String _SQL_SELECT_MEETINGROOM = "SELECT meetingRoom FROM MeetingRoom meetingRoom";
	private static final String _SQL_COUNT_MEETINGROOM = "SELECT COUNT(meetingRoom) FROM MeetingRoom meetingRoom";
	private static final String _ORDER_BY_ENTITY_ALIAS = "meetingRoom.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MeetingRoom exists with the primary key ";
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
}