package com.cts.project.dao;

import java.util.List;

import com.cts.project.entity.EventEntity;

public interface EventDao {
	void saveEvent(EventEntity eventEntity);

	List<EventEntity> showEvent();

	EventEntity showEvent(int eventId);

	boolean registeredToevent(int eventId, int visitorId, int seats);

	List<EventEntity> getRegisteredEvent(int visitorId);

	boolean isAlreadyRegistered(int visitorId, int eventId);
	boolean cancelEventTicket(int visitorId,int eventId);

}
