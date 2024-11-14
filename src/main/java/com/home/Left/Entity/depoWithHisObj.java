package com.home.Left.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/** 관리비 입출금 내역 */
@Entity
@Table(name="tbDepoWithHis")
@Data
public class depoWithHisObj {
	
	@Id
	private int idx;//순번
	
	
	/**호수*/
	@Column(nullable = false)
	private int roomNumber;
	
	/**입금일자*/
	@Column(nullable = false)
	private String inputDate;
	
	/**납입금*/
	@Column(nullable = false)
	private int payment;
	
	
	/**납부기준월*/
	@Column(nullable = false)
	private String StartDateMonth;
	
	/**납무금만기월*/
	@Column(nullable = false)
	private String endDateMonth;
	
	
}
