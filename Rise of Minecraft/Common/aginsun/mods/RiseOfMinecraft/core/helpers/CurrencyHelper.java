package aginsun.mods.RiseOfMinecraft.core.helpers;

import cpw.mods.fml.common.FMLLog;

public class CurrencyHelper 
{
	public int GoldTotal = 0;
	public int CrystalTotal = 0;
	
	/**
	 * @param String s
	 * Add 1 to the CrystalTotal or GoldTotal
	 */
	public void addTotal(String s)
	{
		if(s == "Crystal")
		{
			CrystalTotal++;
		}
		else if (s == "Gold")
		{
			GoldTotal++;
		}
		else
		{
			FMLLog.getLogger().warning("Gold or Crystal is not entered!");
		}
	}
	
	/**
	 * @param String s
	 * @param int i
	 * 
	 * Add a certain value to CrystalTotal or GoldTotal
	 */
	public void addTotal(String s, int i)
	{
		if(i > 1)
		{
			if(s == "Crystal")
			{
				CrystalTotal += i;
			}
			else if(s == "Gold")
			{
				GoldTotal += i;
			}
			else
			{
				FMLLog.getLogger().warning("Gold or Crystal is not entered!");
			}
		}
		else
		{
			addTotal(s);
		}
	}
	
	/**
	 * @param String s
	 * 
	 * Decrease CrystalTotal or GoldTotal by 1
	 */
	public void DecreaseTotal(String s)
	{
		if(s == "Crystal" && CrystalTotal > 0)
		{
			CrystalTotal--;
		}
		else if (s == "Gold" && GoldTotal > 0)
		{
			GoldTotal--;
		}
		else if ((s == "Gold" || s == "Crystal") && (GoldTotal == 0 || CrystalTotal == 0)) //TODO: see if this activates when not wanted!
		{
			FMLLog.getLogger().warning("GoldTotal or CrystalTotal == 0");
		}
		else
		{
			FMLLog.getLogger().warning("Gold or Crystal is not entered!");
		}
	}
	
	/**
	 * @param String s
	 * @param int i
	 * 
	 * Decrease GoldTotal or CrystalTotal by a certain number
	 */
	public void DecreaseTotal(String s, int i)
	{
		if(s == "Crystal" && CrystalTotal >= i)
		{
			CrystalTotal -= i;
		}
		else if(s == "Gold" && GoldTotal >= i)
		{
			GoldTotal -= i;
		}
		else if((s == "Gold" || s == "Crystal") && (GoldTotal <= i || CrystalTotal <= i)) //TODO: see if this activates when not wanted!
		{
			FMLLog.getLogger().warning("GoldTotal or CrystalTotal cannot be lower than 0");
		}
		else
		{
			FMLLog.getLogger().warning("Gold or Crystal is not entered!");
		}
	}
	
	/**
	 * @return CrystalTotal
	 * 
	 * Returns CrystalTotal
	 */
	public int GetCrystalTotal()
	{
		return CrystalTotal;
	}
	
	/**
	 * @return GoldTotal
	 * 
	 * Returns GoldTotal
	 */
	public int GetGoldTotal()
	{
		return GoldTotal;
	}
}
