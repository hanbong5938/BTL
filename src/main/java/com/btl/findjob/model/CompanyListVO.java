package com.btl.findjob.model;

import lombok.Data;

@Data
public class CompanyListVO {
	public static void main(String[] args) {
		
	}
	private int ci_id; //회사pk
	private String ci_companyName; //회사명
	private String ci_address; //회사 주소
	private String ci_industry; //산업군
	private String ci_since; //연식
	private int companyReviewCnt;
	private int interviewReviewCnt;
	private int followId; //팔로우 유무체크
	private int ci_avgsalary; //기업 평균연봉
	private double companyReviewAvg; //기업평가평균
}
