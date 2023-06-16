package com.libman.dao;

import java.util.List;

import com.libman.models.Lends;

public interface LendRequestDao {
	 List<Lends>getLentRecords();
	 List<Lends>getApprovedLentRecords();
	 List<Lends>getLentHistoryRecords();
	 int lendRequestApproveAction(Lends lend);
	 int lendRequestRejectAction(Lends lend);
	 Lends getLendRequestById(int id);
	 List<Lends>getLentRecords(int userid);
	 List<Lends>getUserRecords(int userid);
		
}
