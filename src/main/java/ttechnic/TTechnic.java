package ttechnic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ttechnic.blocks.TTBlockHandler;
import ttechnic.blocks.SimpleBlock;

@Mod(modid = TTechnic.MODID, version = TTechnic.VERSION)
public class TTechnic {
	public static final String MODID = "Tinkers Technic";
	public static final String VERSION = "0.1";

	@Mod.Instance(TTechnic.MODID)
	public static TTechnic instance;

	@SidedProxy(clientSide = "ttechnic.ClientProxy", serverSide = "ttechnic.DedicatedServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Initialize a custom creative tab and save it in the registry singleton
		TTechnicRegistry.ttechnicTab = new CreativeTabs("TinkersTechnic") {
		    @Override
		    @SideOnly(Side.CLIENT)
		    public Item getTabIconItem() {
		        return Items.ender_eye;
		    }
		};
		
		// Register blocks
		TTBlockHandler.registerBlocks();
		
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
	
	/**
	 * Prepend the name with the mod ID, suitable for ResourceLocations such as
	 * textures.
	 * 
	 * @param name
	 * @return eg "minecraftbyexample:myblockname"
	 */
	public static String prependModID(String name) {
		return MODID + ":" + name;
	}
}
