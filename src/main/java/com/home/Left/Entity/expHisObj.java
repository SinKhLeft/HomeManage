package com.home.Left.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 월별 지출 내역 */
@Entity
@Table(name="tbExpHisObj")
public class expHisObj {
	
	
	@Id
	private int idx;//순번

	
	/**지출명*/
	@Column(nullable = false)
	private String expName;
	
	/**지출기준월*/
	@Column(nullable = false)
	private String expDateMonth;
	
	
	/**지출금액*/
	@Column(nullable = false)
	private int payment;

	/**비고*/
	@Column(nullable = true)
	private String commant;
}
