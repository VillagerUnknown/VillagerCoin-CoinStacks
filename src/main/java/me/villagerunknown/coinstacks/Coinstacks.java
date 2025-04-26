package me.villagerunknown.coinstacks;

import me.villagerunknown.coinstacks.feature.CoinStackBlocksFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Coinstacks implements ModInitializer {
	
	public static PlatformMod<CoinstacksConfigData> MOD = Platform.register("coinstacks", Coinstacks.class, CoinstacksConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static CoinstacksConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "CoinStackBlocksFeatureLoader", CoinStackBlocksFeatureLoader::execute );
	}
	
}
