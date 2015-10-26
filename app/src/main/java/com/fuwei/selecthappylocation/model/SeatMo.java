package com.fuwei.selecthappylocation.model;

/**
 * @author YanLu
 */
public class SeatMo extends BaseMo {

    /**
     * 座位名称：几排几座
     */
    public String seatName;
    /**
     * 行名称：A排
     */
	public String rowName;
    /**
     * 行坐标
     */
	public int row;
    /**
     * 列坐标
     */
	public int column;

    /**
     * 座位状态:1：可售，0：已售，-1：锁定，2：选中
     */
	public int status;


}
