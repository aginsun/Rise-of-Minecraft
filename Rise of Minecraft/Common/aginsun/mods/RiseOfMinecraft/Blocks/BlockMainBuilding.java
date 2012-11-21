package aginsun.mods.RiseOfMinecraft.Blocks;

import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.Side;
import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class BlockMainBuilding extends Block
{
	public BlockMainBuilding(int BlockId) 
	{
		super(BlockId, Material.iron);
		setBlockName("blockMainBuilding");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "aginsun/textures/riseofminecraft/blocks.png"; //TODO: add texture files
	}
    @SideOnly(Side.CLIENT)
    public int getBlockTextureFromSide(int i)
    { 
    	return 0;
    }
}
