package lyons.entity;

/**
 * Gsales g购物结算实体类
 * @author lyons(hzd)
 */

public final class Gsales
{
	private Integer gId;
	private Integer sId;
	private Integer sNum;
	
	private String gName; 
	private Double gPrice;
	private Integer gNum;
	private Integer allSnum; //单种商品销量总和
	
	/**
	 * 购物结算
	 * @param gId,sId,sNum
	 */
	public Gsales(Integer gId,Integer sId, Integer sNum)
	{
		this.gId = gId;
		this.sId = sId;
		this.sNum = sNum;
	}
	
	/**
	 * 展现商品列表
	 * @param gName,gPrice,gNum,allSnum
	 */
	public Gsales(String gName,double gPrice,int gNum,int allSnum)
	{
		this.gName = gName;
		this.gPrice = gPrice;
		this.gNum = gNum;
		this.allSnum = allSnum;
	}

	//共有set、get
		public int getGId()
		{
			return gId;
		}
		public void setGId(int id)
		{
			gId = id;
		}
		public int getSId()
		{
			return sId;
		}
		public void setSId(int id)
		{
			sId = id;
		}
		public int getSNum()
		{
			return sNum;
		}
		public void setSNum(int num)
		{
			sNum = num;
		}
		public String getGName()
		{
			return gName;
		}
		public void setGName(String name)
		{
			gName = name;
		}
		public double getGPrice()
		{
			return gPrice;
		}
		public void setGPrice(double price)
		{
			gPrice = price;
		}
		public int getGNum()
		{
			return gNum;
		}
		public void setGNum(int num)
		{
			gNum = num;
		}
		public int getAllSnum()
		{
			return allSnum;
		}
		public void setAllSnum(int allSnum)
		{
			this.allSnum = allSnum;
		}

}
