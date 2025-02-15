package net.tslat.tes.api;

import net.tslat.tes.api.util.TESUtil;
import net.tslat.tes.core.networking.TESNetworking;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ServiceLoader;

/**
 * Common class to store all of the globally & statically accessible data points for TES
 */
public final class TESConstants {
	public static final String VERSION = "1.0.2";
	public static final String MOD_ID = "tslatentitystatus";
	public static final String MOD_NAME = "TES";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static TESConfig CONFIG = null;

	public static TESUtil UTILS = ServiceLoader.load(TESUtil.class).findFirst().get();
	public static TESNetworking NETWORKING = ServiceLoader.load(TESNetworking.class).findFirst().get();

	public static boolean IS_SERVER_SIDE = true;

	public static void setConfig(TESConfig config) {
		CONFIG = config;
	}

	public static void setIsClient() {
		IS_SERVER_SIDE = false;
	}
}
