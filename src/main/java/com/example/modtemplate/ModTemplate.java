package com.example.modtemplate;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = ModTemplate.MODID,
    name = ModTemplate.NAME,
    version = ModTemplate.VERSION,
    acceptedMinecraftVersions = "[1.12.2]"
)
public class ModTemplate {
    public static final String MODID = "modtemplate";
    public static final String NAME = "Mod Template";
    public static final String VERSION = "${version}";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }
}