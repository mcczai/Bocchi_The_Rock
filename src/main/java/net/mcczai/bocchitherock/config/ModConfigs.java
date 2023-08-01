package net.mcczai.bocchitherock.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class ModConfigs {
    public static ClientConfig CLIENT;
    public static ForgeConfigSpec CLIENTSPEC;

    static {
        final Pair<ClientConfig, ForgeConfigSpec> clientPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
        CLIENT = clientPair.getLeft();
        CLIENTSPEC = clientPair.getRight();
    }

    public static void preInit(ModLoadingContext context) {
        context.registerConfig(ModConfig.Type.CLIENT, ModConfigs.CLIENTSPEC);
    }
}
