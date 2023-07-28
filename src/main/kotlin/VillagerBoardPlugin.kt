package technology.bootleg.villagerboard;

import org.bukkit.plugin.java.JavaPlugin

class VillagerBoardPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("VillagerBoard enabled")
    }

    override fun onDisable() {
        logger.info("VillagerBoard disabled")
    }
}
