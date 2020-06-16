package com.springbook.biz.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity //엔티티 클래스, 테이블과 매핑
@Table(name = "BOARD") // 엔티티와 관련된 테이블 매핑. 생략하면 클래스 이름이 테이블 이름과 매핑
public class Board{
	
	@Id // 특정 변수를 테이블의 기본 키와 매핑. 예제에서는 seq 변수를 테이블의 SEQ 칼럼과 매핑
	@GeneratedValue // @Id가 선언된 필드에 기본 키를 자동으로 생성하여 할당할 때 사용. DB에 따라서 자동으로 결정
	private int seq;
	private String title;
	private String writer;
	private String content;
	@Temporal(TemporalType.DATE) // 날짜 타입의 변수에 선언하여 날짜 타입을 매핑할 때 사용 DATE TIME TIMESTAMP
	private Date redDate = new Date();
	private int cnt;
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRedDate() {
		return redDate;
	}

	public void setRedDate(Date redDate) {
		this.redDate = redDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Board() {
		super();
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", redDate="
				+ redDate + ", cnt=" + cnt + "]";
	}
   
}
