package ttechnic.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TTBlocks {

	public static void registerBlocks() {

		SimpleBlock simpleBlock = new SimpleBlock();
		simpleBlock.setUnlocalizedName("TT_SimpleBlock");
		GameRegistry.registerBlock(simpleBlock, "TT_SimpleBlock");
	}
}
