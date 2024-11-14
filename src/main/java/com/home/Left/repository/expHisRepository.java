package com.home.Left.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.home.Left.Entity.expHisObj;
/** 월별 지출 내역 */
@Repository
public interface expHisRepository extends CrudRepository<expHisObj, Integer>{
	 List<expHisObj> findByExpDateMonth(String expDateMonth);

	 expHisObj findById(int id);
}
