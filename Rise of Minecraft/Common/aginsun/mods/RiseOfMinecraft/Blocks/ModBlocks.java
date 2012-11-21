package aginsun.mods.RiseOfMinecraft.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;

public class ModBlocks 
{
	public static Block BlockMainBuilding;
	
	public static void init()
	{
		BlockMainBuilding = new BlockMainBuilding(BlockIds.BLOCKMAINBUILDING);
		
		GameRegistry.registerBlock(BlockMainBuilding);
	}
}
