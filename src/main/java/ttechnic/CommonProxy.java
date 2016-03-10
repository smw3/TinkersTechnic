package ttechnic;

import ttechnic.items.TTItemHandler;

public class CommonProxy {

	public void preInit() {
		// Register items
		TTItemHandler.registerItems();
	}

	public void init() {

	}

	public void postInit() {

	}

}
