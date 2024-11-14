package com.home.Left.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.home.Left.Entity.depoWithHisObj;

/** 관리비 입출금 내역 */
@Repository
public interface depoWithHisRepository extends CrudRepository<depoWithHisObj, Integer> {
		
	  List<depoWithHisObj> findByRoomNumber(int roomNumber);

	  depoWithHisObj findById(int id);
}
