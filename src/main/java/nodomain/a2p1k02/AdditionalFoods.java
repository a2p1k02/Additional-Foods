package nodomain.a2p1k02;

import net.fabricmc.api.ModInitializer;

import nodomain.a2p1k02.item.ModItemGroups;
import nodomain.a2p1k02.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalFoods implements ModInitializer {
	public static final String MOD_ID = "additional-foods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}