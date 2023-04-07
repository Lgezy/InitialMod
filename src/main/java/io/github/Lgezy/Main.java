package io.github.Lgezy;

import io.github.Lgezy.blocks.AddBlocks;
import io.github.Lgezy.items.AddItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "initial";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AddItems.insertItems();
		AddBlocks.registerBlocks();
		LOGGER.info("你好，物品正在注册中... ...");
	}
}
