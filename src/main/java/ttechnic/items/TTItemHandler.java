package ttechnic.items;

import net.minecraft.item.Item;

public class TTItemHandler {
	public static void registerItems() {
		TTItem simpleItem = new SimpleItem();
		simpleItem.register();		
	}
}
