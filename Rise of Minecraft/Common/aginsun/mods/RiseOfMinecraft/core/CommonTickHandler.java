package aginsun.mods.RiseOfMinecraft.core;

import java.util.EnumSet;

import aginsun.mods.RiseOfMinecraft.WorldGen.WorldGenMainBuilding;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class CommonTickHandler implements ITickHandler
{
	private EntityPlayer player;
	private int MainBuildingCreated = 0;
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		if(type.equals(EnumSet.of(TickType.SERVER)))
		{
			onTickInGame();
		}
	}

	public EnumSet ticks()
	{
		return EnumSet.of(TickType.SERVER);
	}

	@Override
	public String getLabel() 
	{
		return null;
	}
	
	public void onTickInGame()
	{
		World world = FMLCommonHandler.instance().getMinecraftServerInstance().worldServerForDimension(0);
		//we check first if world is not null
		if(world != null)
		{
			if(MainBuildingCreated == 0)
			{
				//WorldGenMainBuilding worldgenmainbuilding = new WorldGenMainBuilding(world, world.getWorldInfo().getSpawnX(), world.getWorldInfo().getSpawnY(), world.getWorldInfo().getSpawnZ());
				WorldGenMainBuilding worldgenmainbuilding = new WorldGenMainBuilding(world, 0, 70, 0);
				worldgenmainbuilding.WorldGen();
				MainBuildingCreated = 1;
			}
		}
	}
}
