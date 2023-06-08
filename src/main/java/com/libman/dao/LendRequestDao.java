package com.libman.dao;

import java.util.List;

import com.libman.models.Lends;

public interface LendRequestDao {
	 List<Lends>getLentRecords();
	 int lendRequestApproveAction(Lends lend);
	 int lendRequestRejectAction(Lends lend);
	 Lends getLendRequestById(int id);
	 
}
