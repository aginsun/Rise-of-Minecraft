package aginsun.mods.RiseOfMinecraft.client.guis;

import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;

@SideOnly(Side.CLIENT)
public class GuiMainBuilding extends GuiScreen //TODO: might change this to gui not sure, since not gonna use slots for this gui
{
	@Override
	public void initGui()
	{
		controlList.add(new GuiButton(0, width / 2 - 60, height / 2 + 20, 120, 20, "Exit")); //TODO: position it right
		controlList.add(new GuiButton(1, width / 2 - 100, 100, 100, 20, "Trade District"));
		controlList.add(new GuiButton(2, width / 2 - 100, 120, 100, 20, "Economic District"));
	}
	
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if(guibutton.id == 0)
		{
			FMLCommonHandler.instance().showGuiScreen(null);
		}
	}
	
	@Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }
	
	@Override
	public void drawScreen(int i, int j, float f)
	{
		drawDefaultBackground();
        for (int k = 0; k < controlList.size(); k++)
        {
            GuiButton guibutton = (GuiButton)controlList.get(k);
            guibutton.drawButton(mc, i, j);
        }
	}
}
