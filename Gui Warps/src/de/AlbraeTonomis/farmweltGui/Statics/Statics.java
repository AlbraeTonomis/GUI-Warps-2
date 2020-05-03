package de.AlbraeTonomis.farmweltGui.Statics;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

import de.AlbraeTonomis.farmweltGui.FarmweltGui;

public class Statics {

	public Location LocOberwelt;
	public Location LocNether;
	public Location LocEnde;

	public Statics() {
		setStatics();
	}

	public void setStatics() {
		String[] welten = { "Oberwelt", "Nether", "Ende" };
		FileConfiguration config = FarmweltGui.getPlugin().getConfig();
		for (int i = 0; i < 3; i++) {

			World world = Bukkit.getWorld(config.getString(welten[i] + ".World"));
			double x = config.getDouble(welten[i] + ".X");
			double y = config.getDouble(welten[i] + ".Y");
			double z = config.getDouble(welten[i] + ".Z");
			float yaw = (float) config.getDouble(welten[i] + ".Yaw");
			float pitch = (float) config.getDouble(welten[i] + ".Pitch");
			switch (i) {
			case 0: {
				this.LocOberwelt = new Location(world, x, y, z, yaw, pitch);
				break;

			}
			case 1: {
				this.LocNether = new Location(world, x, y, z, yaw, pitch);
				break;

			}
			case 2: {
				this.LocEnde = new Location(world, x, y, z, yaw, pitch);
				break;

			}
			}
		}

	}

}
