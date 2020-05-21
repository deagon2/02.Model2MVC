package com.model2.mvc.common;


public class Search {
	
	///Field
	private int curruntPage;     //������������ ���� �޾ƿ��� ��ü
	private String searchCondition;  //ȸ��ID ���� ȸ�������� Ȯ���ϴ� ��ü
	private String searchKeyword;  // ������ �ؽ�Ʈ�� �Էµ� ���ڸ� �޴� ��ü
	private int pageSize; //�������� ����� �޾ƿ��� ��ü
	
	///Constructor
	public Search() {
	}
	
	///Method
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int paseSize) {
		this.pageSize = paseSize;
	}
	
	public int getCurrentPage() {
		return curruntPage;
	}
	public void setCurrentPage(int curruntPage) {
		this.curruntPage = curruntPage;
	}

	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	@Override
	public String toString() {
		return "Search [curruntPage=" + curruntPage + ", searchCondition="
				+ searchCondition + ", searchKeyword=" + searchKeyword
				+ ", pageSize=" + pageSize + "]";
	}
}