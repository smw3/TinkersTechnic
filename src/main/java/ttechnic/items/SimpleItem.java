package ttechnic.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ttechnic.TTechnicRegistry;

public class SimpleItem extends Item implements TTItem {

	@Override
	public void register() {
		this.setUnlocalizedName("SimpleItem");
		this.setCreativeTab(TTechnicRegistry.ttechnicTab);
		GameRegistry.registerItem(this,"SimpleItem");
	}

}
