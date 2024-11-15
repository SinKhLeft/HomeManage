package com.home.Left.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.home.Left.Entity.depoWithHisObj;

/** 관리비 입출금 내역 */
@Repository
public interface depoWithHisRepository extends CrudRepository<depoWithHisObj, Integer> {
		
	  List<depoWithHisObj> findByRoomNumber(int roomNumber);

	  depoWithHisObj findById(int id);
	  
	  @Query(nativeQuery = true ,value = "select A.idx,A.room_number,A.input_date,A.payment,A.start_date_month,A.end_date_month from tb_depo_with_his A join (select idx,max(end_date_month) from tb_depo_with_his where input_date < :endOfInputDate group by room_number) B on A.idx = B.idx")
	  List<depoWithHisObj> findByReportInfo(@Param("endOfInputDate") String endOfInputDate);
	  
	  
}
