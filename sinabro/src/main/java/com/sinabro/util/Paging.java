package com.sinabro.util;

public class Paging {

	private Integer pageSize;// �������� ������ �� ��
	private Integer pageBlock;// ��������ȣ ǥ�ü�
	private Integer count; // ��ü �� ��
	private Integer currentPage; // ���� ��������

	public Paging() {
		super();
	}

	/*
	 * ����¡ (�� ȭ�鿡 ������ �� ��, ������ ���� ��, �� ���� ����, ���� ���� �ִ� ������ ��ȣ);
	 */
	public void setPaging(Integer w_size, Integer p_size, Integer writing_Count, Integer cur_Page) {
		this.pageSize = w_size;
		this.pageBlock = p_size;
		this.count = writing_Count;
		this.currentPage = cur_Page;
	}

	/*
	 * �� ������ ���� �������ִ� �޼ҵ� ��ü �ۼ��� �������� ������ �ۼ��� ���� ���� ��ü �ۼ��� �������� ������ �ۼ��� ������������ �Ͽ� ����
	 * ���� 0���� ũ�� 1�� ���ϰ� �ƴϸ� 0�� ����
	 * 
	 * @return �����̼�
	 */

	public Integer getPage_Count() {
		return (count / pageSize) + (count % pageSize > 0 ? 1 : 0);
	}

	/*
	 * ������ ���� ���� �������ִ� �޼ҵ�
	 * 
	 * @return ������ ���ۼ�
	 */

	public Integer getPage_Start() {
		return ((currentPage - 1) / pageBlock) * pageBlock + 1;
	}

	/*
	 * ������ ������ ���� �������ִ� �޼ҵ�
	 * 
	 * @return ������ ������ ��
	 */

	public Integer getPage_End() {
		return getPage_Start() + pageBlock - 1;
	}

	/*
	 * Pre ǥ�� ����
	 * 
	 * @return boolean
	 */

	public boolean isPre() {
		return getPage_Start() > pageBlock;
	}

	/*
	 * next ǥ�� ����
	 * 
	 * @return boolean
	 */

	public boolean isNext() {
		return getPage_End() < getPage_Count();
	}

	/*
	 * �� ���� ���� ��ȣ
	 * 
	 * @return �� ���� ���� ��ȣ
	 */

	public Integer getWriting_Start() {
		 return (currentPage - 1) * pageSize + 1;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getPageBlock() {
		return pageBlock;
	}

	public Integer getCount() {
		return count;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	/*
	 * �� ���� �� ��ȣ
	 * 
	 * @return �� ���� �� ��ȣ
	 */
	public Integer getWriting_End() {
		return currentPage * pageSize;
	}

	

	

}
