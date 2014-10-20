package me.planetguy.endgamerf.mbmachines;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import me.planetguy.endgamerf.mbmachines.tileentities.TileEntityVaporizer;
import me.planetguy.lib.prefab.BlockContainerBase;

public class BlockMachineCore extends BlockContainerBase{

	public BlockMachineCore() {
		super(Material.iron, "blockMachineCore", TileEntityVaporizer.class); //TODO TE classes
	}

}
