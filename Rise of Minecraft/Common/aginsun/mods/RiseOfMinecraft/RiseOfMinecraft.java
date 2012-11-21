package aginsun.mods.RiseOfMinecraft;

import aginsun.mods.RiseOfMinecraft.core.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.*;

@Mod(modid = "RiseOfMinecraft", name = "Rise of Minecraft", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class RiseOfMinecraft 
{
	@Instance
	RiseOfMinecraft riseofminecraft = new RiseOfMinecraft();
	
	@SidedProxy(clientSide="aginsun.mods.RiseOfMinecraft.Core", serverSide="aginsun.mods.RiseOfMinecraft.Client.core")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) 
	{
		
	}

	@Init
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent event) 
	{
	}
}
