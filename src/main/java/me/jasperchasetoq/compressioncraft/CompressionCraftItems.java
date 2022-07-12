package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class CompressionCraftItems {

    private CompressionCraftItems() {}

    //groups
    public static final NestedItemGroup JC_CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_GENERAL"), new CustomItemStack(Material.PISTON, "&b壓縮製造"));
    public static final SubItemGroup JC_CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_ITEM_COMPRESSION"), JC_CC_GENERAL, new CustomItemStack(Material.PISTON, "&b壓縮物品"));
    public static final SubItemGroup JC_CC_MACHINES = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_MACHINES"), JC_CC_GENERAL, new CustomItemStack(Material.FURNACE, "&b機器"));
    public static final SubItemGroup JC_CC_INFO = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_INFO"), JC_CC_GENERAL, new CustomItemStack(Material.BOOK, "&b附加資訊"));

    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&b壓縮製造"));



    //machines Old
    public static final SlimefunItemStack CC_COMPRESSOR_1 = new SlimefunItemStack("CC_COMPRESSOR_1", Material.PISTON, "&e壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&e壓縮製造");
    public static final SlimefunItemStack CC_COMPRESSOR_2 = new SlimefunItemStack("CC_COMPRESSOR_2", Material.PISTON, "&6壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6壓縮製造");
    public static final SlimefunItemStack CC_COMPRESSOR_3 = new SlimefunItemStack("CC_COMPRESSOR_3", Material.PISTON, "&a壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&a壓縮製造");
    public static final SlimefunItemStack CC_COMPRESSOR_4 = new SlimefunItemStack("CC_COMPRESSOR_4", Material.PISTON, "&2壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2壓縮製造");
    public static final SlimefunItemStack CC_COMPRESSOR_5 = new SlimefunItemStack("CC_COMPRESSOR_5", Material.PISTON, "&6壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6壓縮製造");
    public static final SlimefunItemStack CC_COMPRESSOR_6 = new SlimefunItemStack("CC_COMPRESSOR_6", Material.PISTON, "&4壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4壓縮製造");
    public static final SlimefunItemStack CC_DECOMPRESSOR_1 = new SlimefunItemStack("CC_DECOMPRESSOR_1", Material.PISTON, "&e解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&e壓縮製造");
    public static final SlimefunItemStack CC_DECOMPRESSOR_2 = new SlimefunItemStack("CC_DECOMPRESSOR_2", Material.PISTON, "&6解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6壓縮製造");
    public static final SlimefunItemStack CC_DECOMPRESSOR_3 = new SlimefunItemStack("CC_DECOMPRESSOR_3", Material.PISTON, "&a解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&a壓縮製造");
    public static final SlimefunItemStack CC_DECOMPRESSOR_4 = new SlimefunItemStack("CC_DECOMPRESSOR_4", Material.PISTON, "&2解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2壓縮製造");
    public static final SlimefunItemStack CC_DECOMPRESSOR_5 = new SlimefunItemStack("CC_DECOMPRESSOR_5", Material.PISTON, "&6解壓縮器", "", "&7解壓縮方塊", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6壓縮製造");
    public static final SlimefunItemStack CC_DECOMPRESSOR_6 = new SlimefunItemStack("CC_DECOMPRESSOR_6", Material.PISTON, "&4解壓縮器", "", "&7解壓縮方塊", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4壓縮製造");
    //New Machines
    public static final SlimefunItemStack JC_COMPRESSOR_1 = new SlimefunItemStack("JC_COMPRESSOR_1", Material.PISTON, "&e壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&e壓縮製造");
    public static final SlimefunItemStack JC_COMPRESSOR_2 = new SlimefunItemStack("JC_COMPRESSOR_2", Material.PISTON, "&6壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6壓縮製造");
    public static final SlimefunItemStack JC_COMPRESSOR_3 = new SlimefunItemStack("JC_COMPRESSOR_3", Material.PISTON, "&a壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&a壓縮製造");
    public static final SlimefunItemStack JC_COMPRESSOR_4 = new SlimefunItemStack("JC_COMPRESSOR_4", Material.PISTON, "&2壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2壓縮製造");
    public static final SlimefunItemStack JC_COMPRESSOR_5 = new SlimefunItemStack("JC_COMPRESSOR_5", Material.PISTON, "&6壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6壓縮製造");
    public static final SlimefunItemStack JC_COMPRESSOR_6 = new SlimefunItemStack("JC_COMPRESSOR_6", Material.PISTON, "&4壓縮器", "","&7壓縮方塊","",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4壓縮製造");
    public static final SlimefunItemStack JC_DECOMPRESSOR_1 = new SlimefunItemStack("JC_DECOMPRESSOR_1", Material.PISTON, "&e解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&e壓縮製造");
    public static final SlimefunItemStack JC_DECOMPRESSOR_2 = new SlimefunItemStack("JC_DECOMPRESSOR_2", Material.PISTON, "&6解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6壓縮製造");
    public static final SlimefunItemStack JC_DECOMPRESSOR_3 = new SlimefunItemStack("JC_DECOMPRESSOR_3", Material.PISTON, "&a解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&a壓縮製造");
    public static final SlimefunItemStack JC_DECOMPRESSOR_4 = new SlimefunItemStack("JC_DECOMPRESSOR_4", Material.PISTON, "&2解壓縮器", "", "&7解壓縮方塊", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2壓縮製造");
    public static final SlimefunItemStack JC_DECOMPRESSOR_5 = new SlimefunItemStack("JC_DECOMPRESSOR_5", Material.PISTON, "&6解壓縮器", "", "&7解壓縮方塊", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6壓縮製造");
    public static final SlimefunItemStack JC_DECOMPRESSOR_6 = new SlimefunItemStack("JC_DECOMPRESSOR_6", Material.PISTON, "&4解壓縮器", "", "&7解壓縮方塊", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4壓縮製造");


    public static final SlimefunItemStack CC_JC_LORE_REFRESHER = new SlimefunItemStack("CC_LORE_REFRESHER", Material.BOOKSHELF, "&f敘述重刷機", "&f重新刷新壓縮製造附加的物品敘述", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(10),"&f壓縮製造");


    //Compressed Items (Old)

    public static final SlimefunItemStack CC_COBBLESTONE_1 = new SlimefunItemStack("CC_COBBLESTONE_1", Material.COBBLESTONE, "&f壓縮鵝卵石",  "&fx8 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack CC_STONE_1 = new SlimefunItemStack("CC_STONE_1", Material.STONE, "&f壓縮石頭",  "&fx8 石頭", "&f壓縮製造");
    public static final SlimefunItemStack CC_ANDESITE_1 = new SlimefunItemStack("CC_ANDESITE_1", Material.ANDESITE, "&f壓縮安山岩",  "&fx8 安山岩", "&f壓縮製造");
    public static final SlimefunItemStack CC_DIORITE_1 = new SlimefunItemStack("CC_DIORITE_1", Material.DIORITE, "&f壓縮閃長岩",  "&fx8 閃長岩", "&f壓縮製造");
    public static final SlimefunItemStack CC_GRANITE_1 = new SlimefunItemStack("CC_GRANITE_1", Material.GRANITE, "&f壓縮花崗岩",  "&fx8 花崗岩", "&f壓縮製造");
    public static final SlimefunItemStack CC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("CC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&f壓縮深板岩碎石",  "&fx8 深板岩碎石", "&f壓縮製造");
    public static final SlimefunItemStack CC_DEEPSLATE_1 = new SlimefunItemStack("CC_DEEPSLATE_1", Material.DEEPSLATE, "&f壓縮深板岩",  "&fx8 深板岩", "&f壓縮製造");
    public static final SlimefunItemStack CC_FLINT_1 = new SlimefunItemStack("CC_FLINT_1", Material.FLINT, "&f壓縮燧石",  "&fx8 燧石", "&f壓縮製造");
    public static final SlimefunItemStack CC_GRAVEL_1 = new SlimefunItemStack("CC_GRAVEL_1", Material.GRAVEL, "&f壓縮礫石",  "&fx8 礫石", "&f壓縮製造");
    public static final SlimefunItemStack CC_DIRT_1 = new SlimefunItemStack("CC_DIRT_1", Material.DIRT, "&f壓縮泥土",  "&fx8 泥土", "&f壓縮製造");
    public static final SlimefunItemStack CC_CLAY_BALL_1 = new SlimefunItemStack("CC_CLAY_BALL_1", Material.CLAY_BALL, "&f壓縮黏土球",  "&fx8 黏土球", "&f壓縮製造");
    public static final SlimefunItemStack CC_CLAY_1 = new SlimefunItemStack("CC_CLAY_1", Material.CLAY, "&f壓縮黏土",  "&fx8 黏土", "&f壓縮製造");
    public static final SlimefunItemStack CC_COAL_1 = new SlimefunItemStack("CC_COAL_1", Material.COAL, "&f壓縮煤炭",  "&fx8 煤炭", "&f壓縮製造");
    public static final SlimefunItemStack CC_COAL_BLOCK_1 = new SlimefunItemStack("CC_COAL_BLOCK_1", Material.COAL_BLOCK, "&f壓縮煤炭方塊",  "&fx8 煤炭方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_IRON_NUGGET_1 = new SlimefunItemStack("CC_IRON_NUGGET_1", Material.IRON_NUGGET, "&f壓縮鐵粒",  "&fx8 鐵粒", "&f壓縮製造");
    public static final SlimefunItemStack CC_IRON_INGOT_1 = new SlimefunItemStack("CC_IRON_INGOT_1", Material.IRON_INGOT, "&f壓縮鐵錠",  "&fx8 鐵錠", "&f壓縮製造");
    public static final SlimefunItemStack CC_IRON_BLOCk_1 = new SlimefunItemStack("CC_IRON_BLOCK_1", Material.IRON_BLOCK, "&f壓縮鐵方塊",  "&fx8 鐵方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_GOLD_NUGGET_1 = new SlimefunItemStack("CC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&f壓縮金粒",  "&fx8 金錠", "&f壓縮製造");
    public static final SlimefunItemStack CC_GOLD_INGOT_1 = new SlimefunItemStack("CC_GOLD_INGOT_1", Material.GOLD_INGOT, "&f壓縮金錠",  "&fx8 金錠", "&f壓縮製造");
    public static final SlimefunItemStack CC_GOLD_BLOCK_1 = new SlimefunItemStack("CC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&f壓縮黃金方塊",  "&fx8 黃金方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_REDSTONE_1 = new SlimefunItemStack("CC_REDSTONE_1", Material.REDSTONE, "&f壓縮紅石粉",  "&fx8 紅石粉", "&f壓縮製造");
    public static final SlimefunItemStack CC_REDSTONE_BLOCK_1 = new SlimefunItemStack("CC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&f壓縮紅石方塊",  "&fx8 紅石方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_LAPIS_LAZULI_1 = new SlimefunItemStack("CC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&f壓縮青金石",  "&fx8 青金石", "&f壓縮製造");
    public static final SlimefunItemStack CC_LAPIS_BLOCK_1 = new SlimefunItemStack("CC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&f壓縮青金石方塊",  "&fx8 青金石方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_DIAMOND_1 = new SlimefunItemStack("CC_DIAMOND_1", Material.DIAMOND, "&f壓縮鑽石",  "&fx8 鑽石", "&f壓縮製造");
    public static final SlimefunItemStack CC_DIAMOND_BLOCK_1 = new SlimefunItemStack("CC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&f壓縮鑽石方塊",  "&fx8 壓縮鑽石方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_EMERALD_1 = new SlimefunItemStack("CC_EMERALD_1", Material.EMERALD, "&f壓縮綠寶石",  "&fx8 綠寶石", "&f壓縮製造");
    public static final SlimefunItemStack CC_EMERALD_BLOCK_1 = new SlimefunItemStack("CC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&f壓縮綠寶石方塊",  "&fx8 綠寶石方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_AMETHYST_SHARD_1 = new SlimefunItemStack("CC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&f壓縮紫水晶碎片",  "&fx8 紫水晶碎片", "&f壓縮製造");
    public static final SlimefunItemStack CC_AMETHYST_BLOCK_1 = new SlimefunItemStack("CC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&f壓縮紫水晶方塊",  "&fx8 紫水晶方塊", "&f壓縮製造");
    public static final SlimefunItemStack CC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("CC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&f壓縮小型紫水晶芽",  "&fx8 小型紫水晶芽", "&f壓縮製造");
    public static final SlimefunItemStack CC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("CC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&f壓縮中型紫水晶芽",  "&fx8 中型紫水晶芽", "&f壓縮製造");
    public static final SlimefunItemStack CC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("CC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&f壓縮大型紫水晶芽",  "&fx8 大型紫水晶芽", "&f壓縮製造");
    public static final SlimefunItemStack CC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("CC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&f壓縮紫水晶晶簇",  "&fx8 紫水晶晶簇", "&f壓縮製造");
    public static final SlimefunItemStack CC_COBBLESTONE_2 = new SlimefunItemStack("CC_COBBLESTONE_2", Material.COBBLESTONE, "&f重壓縮鵝卵石",  "&fx64 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack CC_COBBLESTONE_3 = new SlimefunItemStack("CC_COBBLESTONE_3", Material.COBBLESTONE, "&f三重壓縮鵝卵石",  "&fx512 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack CC_COBBLESTONE_4 = new SlimefunItemStack("CC_COBBLESTONE_4", Material.COBBLESTONE, "&f四重壓縮鵝卵石",  "&fx4096 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack CC_COBBLESTONE_5 = new SlimefunItemStack("CC_COBBLESTONE_5", Material.COBBLESTONE, "&f五重壓縮鵝卵石",  "&fx32768 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack CC_COBBLESTONE_6 = new SlimefunItemStack("CC_COBBLESTONE_6", Material.COBBLESTONE, "&f六重壓縮鵝卵石",  "&fx262144 鵝卵石", "&f壓縮製造");

    //Compressed Items (New)

    public static final SlimefunItemStack JC_COBBLESTONE_1 = new SlimefunItemStack("JC_COBBLESTONE_1", Material.COBBLESTONE, "&f壓縮鵝卵石",  "&fx8 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack JC_STONE_1 = new SlimefunItemStack("JC_STONE_1", Material.STONE, "&f壓縮石頭",  "&fx8 石頭", "&f壓縮製造");
    public static final SlimefunItemStack JC_ANDESITE_1 = new SlimefunItemStack("JC_ANDESITE_1", Material.ANDESITE, "&f壓縮安山岩",  "&fx8 安山岩", "&f壓縮製造");
    public static final SlimefunItemStack JC_DIORITE_1 = new SlimefunItemStack("JC_DIORITE_1", Material.DIORITE, "&f壓縮閃長岩",  "&fx8 閃長岩", "&f壓縮製造");
    public static final SlimefunItemStack JC_GRANITE_1 = new SlimefunItemStack("JC_GRANITE_1", Material.GRANITE, "&f壓縮花崗岩",  "&fx8 花崗岩", "&f壓縮製造");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&f壓縮深板岩碎石",  "&fx8 深板岩碎石", "&f壓縮製造");
    public static final SlimefunItemStack JC_DEEPSLATE_1 = new SlimefunItemStack("JC_DEEPSLATE_1", Material.DEEPSLATE, "&f壓縮深板岩",  "&fx8 深板岩", "&f壓縮製造");
    public static final SlimefunItemStack JC_FLINT_1 = new SlimefunItemStack("JC_FLINT_1", Material.FLINT, "&f壓縮燧石",  "&fx8 燧石", "&f壓縮製造");
    public static final SlimefunItemStack JC_GRAVEL_1 = new SlimefunItemStack("JC_GRAVEL_1", Material.GRAVEL, "&f壓縮礫石",  "&fx8 礫石", "&f壓縮製造");
    public static final SlimefunItemStack JC_DIRT_1 = new SlimefunItemStack("JC_DIRT_1", Material.DIRT, "&f壓縮泥土",  "&fx8 泥土", "&f壓縮製造");
    public static final SlimefunItemStack JC_CLAY_BALL_1 = new SlimefunItemStack("JC_CLAY_BALL_1", Material.CLAY_BALL, "&f壓縮黏土球",  "&fx8 黏土球", "&f壓縮製造");
    public static final SlimefunItemStack JC_CLAY_1 = new SlimefunItemStack("JC_CLAY_1", Material.CLAY, "&f壓縮黏土",  "&fx8 黏土", "&f壓縮製造");
    public static final SlimefunItemStack JC_SNOW_BALL_1 = new SlimefunItemStack("JC_SNOW_BALL_1", Material.SNOWBALL, "&f壓縮雪球",  "&fx8 雪球", "&f壓縮製造");
    public static final SlimefunItemStack JC_SNOW_BLOCK_1 = new SlimefunItemStack("JC_SNOW_BLOCK_1", Material.SNOW_BLOCK, "&f壓縮雪塊",  "&fx8 雪塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_COAL_1 = new SlimefunItemStack("JC_COAL_1", Material.COAL, "&f壓縮煤炭",  "&fx8 煤炭", "&f壓縮製造");
    public static final SlimefunItemStack JC_COAL_BLOCK_1 = new SlimefunItemStack("JC_COAL_BLOCK_1", Material.COAL_BLOCK, "&f壓縮煤炭方塊",  "&fx8 煤炭方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_IRON_NUGGET_1 = new SlimefunItemStack("JC_IRON_NUGGET_1", Material.IRON_NUGGET, "&f壓縮鐵粒",  "&fx8 鐵粒", "&f壓縮製造");
    public static final SlimefunItemStack JC_IRON_INGOT_1 = new SlimefunItemStack("JC_IRON_INGOT_1", Material.IRON_INGOT, "&f壓縮鐵錠",  "&fx8 鐵錠", "&f壓縮製造");
    public static final SlimefunItemStack JC_IRON_BLOCk_1 = new SlimefunItemStack("JC_IRON_BLOCK_1", Material.IRON_BLOCK, "&f壓縮鐵方塊",  "&fx8 鐵方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_GOLD_NUGGET_1 = new SlimefunItemStack("JC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&f壓縮金粒",  "&fx8 金錠", "&f壓縮製造");
    public static final SlimefunItemStack JC_GOLD_INGOT_1 = new SlimefunItemStack("JC_GOLD_INGOT_1", Material.GOLD_INGOT, "&f壓縮金錠",  "&fx8 金錠", "&f壓縮製造");
    public static final SlimefunItemStack JC_GOLD_BLOCK_1 = new SlimefunItemStack("JC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&f壓縮黃金方塊",  "&fx8 黃金方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_REDSTONE_1 = new SlimefunItemStack("JC_REDSTONE_1", Material.REDSTONE, "&f壓縮紅石粉",  "&fx8 紅石粉", "&f壓縮製造");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_1 = new SlimefunItemStack("JC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&f壓縮紅石方塊",  "&fx8 紅石方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_1 = new SlimefunItemStack("JC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&f壓縮青金石",  "&fx8 青金石", "&f壓縮製造");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_1 = new SlimefunItemStack("JC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&f壓縮青金石方塊",  "&fx8 青金石方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_DIAMOND_1 = new SlimefunItemStack("JC_DIAMOND_1", Material.DIAMOND, "&f壓縮鑽石",  "&fx8 鑽石", "&f壓縮製造");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_1 = new SlimefunItemStack("JC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&f壓縮鑽石方塊",  "&fx8 壓縮鑽石方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_EMERALD_1 = new SlimefunItemStack("JC_EMERALD_1", Material.EMERALD, "&f壓縮綠寶石",  "&fx8 綠寶石", "&f壓縮製造");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_1 = new SlimefunItemStack("JC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&f壓縮綠寶石方塊",  "&fx8 綠寶石方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_1 = new SlimefunItemStack("JC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&f壓縮紫水晶碎片",  "&fx8 紫水晶碎片", "&f壓縮製造");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_1 = new SlimefunItemStack("JC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&f壓縮紫水晶方塊",  "&fx8 紫水晶方塊", "&f壓縮製造");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&f壓縮小型紫水晶芽",  "&fx8 小型紫水晶芽", "&f壓縮製造");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&f壓縮中型紫水晶芽",  "&fx8 中型紫水晶芽", "&f壓縮製造");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&f壓縮大型紫水晶芽",  "&fx8 大型紫水晶芽", "&f壓縮製造");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&fC壓縮紫水晶晶簇",  "&fx8 紫水晶晶簇", "&f壓縮製造");
    public static final SlimefunItemStack JC_COBBLESTONE_2 = new SlimefunItemStack("JC_COBBLESTONE_2", Material.COBBLESTONE, "&f重壓縮鵝卵石",  "&fx64 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack JC_COBBLESTONE_3 = new SlimefunItemStack("JC_COBBLESTONE_3", Material.COBBLESTONE, "&f三重壓縮鵝卵石",  "&fx512 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack JC_COBBLESTONE_4 = new SlimefunItemStack("JC_COBBLESTONE_4", Material.COBBLESTONE, "&f四重壓縮鵝卵石",  "&fx4096 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack JC_COBBLESTONE_5 = new SlimefunItemStack("JC_COBBLESTONE_5", Material.COBBLESTONE, "&f五重壓縮鵝卵石",  "&fx32768 鵝卵石", "&f壓縮製造");
    public static final SlimefunItemStack JC_COBBLESTONE_6 = new SlimefunItemStack("JC_COBBLESTONE_6", Material.COBBLESTONE, "&f六重壓縮鵝卵石",  "&fx262144 鵝卵石", "&f壓縮製造");



    //addon info
    public static final SlimefunItemStack JC_CC_MC_VERSION = new SlimefunItemStack("JC_CC_MC_VERSION", Material.BOOK, "&fMinecraft 版本",  "&f運行於版本 1.17x-1.19x");
    public static final SlimefunItemStack JC_CC_JAVA_VERSION = new SlimefunItemStack("JC_CC_JAVA_VERSION", Material.BOOK, "&fJava 版本",  "&f壓縮製造需要 Java 16+ 來運行");
    public static final SlimefunItemStack JC_CC_SF_BUILD = new SlimefunItemStack("JC_CC_SF_BUILD", Material.BOOK, "&fSlimefun 建構",  "&f壓縮製造建構在黏液科技版本: RC-32");
    public static final SlimefunItemStack JC_CC_PREFIX = new SlimefunItemStack("JC_CC_PREFIX", Material.BOOK, "&f前綴 (給開發者)",  "&f壓縮製造正使用以下前綴來做物品註冊","CC","JC");
    public static final SlimefunItemStack JC_CC_VERSION = new SlimefunItemStack("JC_CC_VERSION", Material.BOOK, "&fCompressioncraft 版本",  "&f壓縮製造 - 資訊",
            "&f" + CompressionCraft.getInstance().getName() + " " + CompressionCraft.getInstance().getPluginVersion());
    //Credit and the source for the CC_VERSION goes to https://github.com/Sfiguz7/TranscEndence/blob/master/src/main/java/me/sfiguz7/transcendence/lists/TEItems.java
}
