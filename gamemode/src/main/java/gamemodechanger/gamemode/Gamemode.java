package gamemodechanger.gamemode;

import org.bukkit.plugin.java.JavaPlugin;

public final class Gamemode extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gmc").setExecutor(new gmcCommand());
        getCommand("gms").setExecutor(new gmsCommand());
        getCommand("gma").setExecutor(new gmaCommand());
        getCommand("gmsp").setExecutor(new gmspCommand());

    }


}
