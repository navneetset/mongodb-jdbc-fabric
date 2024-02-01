package tech.sethi.mongodb

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object MongoDBJDBC : ModInitializer {
    private val logger = LoggerFactory.getLogger("mongodb-jdbc")

	override fun onInitialize() {
		logger.info("Initialized Pebble's MongoDB JDBC!")
	}
}