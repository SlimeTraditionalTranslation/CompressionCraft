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
    public static final NestedItemGroup CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_GENERAL"), new CustomItemStack(Material.PISTON, "&b壓縮製造"));
    public static final SubItemGroup CC_COMPRESSED_ITEMS = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_COMPRESSED_ITEMS"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&b壓縮物品"));
    public static final SubItemGroup CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_ITEM_COMPRESSION"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&b壓縮器 & 解壓縮器"));
    public static final SubItemGroup CC_INFO = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_INFO"), CC_GENERAL, new CustomItemStack(Material.BOOK, "&b附加資訊"));

    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&b壓縮製造"));



    //machines Compressors
    //main
    public static final SlimefunItemStack CC_COMPRESSOR_1 = new SlimefunItemStack("CC_COMPRESSOR_1", Material.PISTON, "&e基礎壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CC_COMPRESSOR_2 = new SlimefunItemStack("CC_COMPRESSOR_2", Material.PISTON, "&6常規壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(100));
    public static final SlimefunItemStack CC_COMPRESSOR_3 = new SlimefunItemStack("CC_COMPRESSOR_3", Material.PISTON, "&a中階壓縮器", "&f壓縮方塊",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(150));
    public static final SlimefunItemStack CC_COMPRESSOR_4 = new SlimefunItemStack("CC_COMPRESSOR_4", Material.PISTON, "&2高階壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(200));
    public static final SlimefunItemStack CC_COMPRESSOR_5 = new SlimefunItemStack("CC_COMPRESSOR_5", Material.PISTON, "&6特規壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(250));
    public static final SlimefunItemStack CC_COMPRESSOR_6 = new SlimefunItemStack("CC_COMPRESSOR_6", Material.PISTON, "&4超特規壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerPerSecond(300));
    //Machines Decompressors
    public static final SlimefunItemStack CC_DECOMPRESSOR_1 = new SlimefunItemStack("CC_DECOMPRESSOR_1", Material.PISTON, "&e基礎解壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CC_DECOMPRESSOR_2 = new SlimefunItemStack("CC_DECOMPRESSOR_2", Material.PISTON, "&6常規解壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(100));
    public static final SlimefunItemStack CC_DECOMPRESSOR_3 = new SlimefunItemStack("CC_DECOMPRESSOR_3", Material.PISTON, "&a中階解壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(150));
    public static final SlimefunItemStack CC_DECOMPRESSOR_4 = new SlimefunItemStack("CC_DECOMPRESSOR_4", Material.PISTON, "&2高階解壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(200));
    public static final SlimefunItemStack CC_DECOMPRESSOR_5 = new SlimefunItemStack("CC_DECOMPRESSOR_5", Material.PISTON, "&6特規解壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(250));
    public static final SlimefunItemStack CC_DECOMPRESSOR_6 = new SlimefunItemStack("CC_DECOMPRESSOR_6", Material.PISTON, "&4超特規解壓縮器", "&f壓縮方塊", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerPerSecond(300));

    //blocks

    public static final SlimefunItemStack CC_COBBLESTONE_1 = new SlimefunItemStack("CC_COBBLESTONE_1", Material.COBBLESTONE, "&d壓縮鵝卵石", "", "&fx8 鵝卵石", "");
    public static final SlimefunItemStack CC_COBBLESTONE_2 = new SlimefunItemStack("CC_COBBLESTONE_2", Material.COBBLESTONE, "&d雙重壓縮鵝卵石", "", "&fx64 鵝卵石", "");
    public static final SlimefunItemStack CC_COBBLESTONE_3 = new SlimefunItemStack("CC_COBBLESTONE_3", Material.COBBLESTONE, "&d三重壓縮鵝卵石", "", "&fx512 鵝卵石", "");
    public static final SlimefunItemStack CC_COBBLESTONE_4 = new SlimefunItemStack("CC_COBBLESTONE_4", Material.COBBLESTONE, "&d四重壓縮鵝卵石", "", "&fx4096 鵝卵石", "");
    public static final SlimefunItemStack CC_COBBLESTONE_5 = new SlimefunItemStack("CC_COBBLESTONE_5", Material.COBBLESTONE, "&d五重壓縮鵝卵石", "", "&fx32768 鵝卵石", "");
    public static final SlimefunItemStack CC_COBBLESTONE_6 = new SlimefunItemStack("CC_COBBLESTONE_6", Material.COBBLESTONE, "&d六重壓縮鵝卵石", "", "&fx262144 鵝卵石", "");
    public static final SlimefunItemStack CC_STONE_1 = new SlimefunItemStack("CC_STONE_1", Material.STONE, "&d壓縮石頭", "", "&fx8 石頭", "");
    public static final SlimefunItemStack CC_ANDESITE_1 = new SlimefunItemStack("CC_ANDESITE_1", Material.ANDESITE, "&d壓縮安山岩", "", "&fx8 安山岩", "");
    public static final SlimefunItemStack CC_DIORITE_1 = new SlimefunItemStack("CC_DIORITE_1", Material.DIORITE, "&d壓縮閃長岩", "", "&fx8 閃長岩", "");
    public static final SlimefunItemStack CC_GRANITE_1 = new SlimefunItemStack("CC_GRANITE_1", Material.GRANITE, "&d壓縮花崗岩", "", "&fx8 花崗岩", "");
    public static final SlimefunItemStack CC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("CC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&d壓縮深板岩碎石", "", "&fx8 深板岩碎石", "");
    public static final SlimefunItemStack CC_DEEPSLATE_1 = new SlimefunItemStack("CC_DEEPSLATE_1", Material.DEEPSLATE, "&d壓縮深板岩", "", "&f8 深板岩", "");
    public static final SlimefunItemStack CC_FLINT_1 = new SlimefunItemStack("CC_FLINT_1", Material.FLINT, "&d壓縮燧石", "", "&f8 燧石", "");
    public static final SlimefunItemStack CC_GRAVEL_1 = new SlimefunItemStack("CC_GRAVEL_1", Material.GRAVEL, "&d壓縮礫石", "", "&fx8 礫石", "");
    public static final SlimefunItemStack CC_DIRT_1 = new SlimefunItemStack("CC_DIRT_1", Material.DIRT, "&d壓縮泥土", "", "&fx8 泥土", "");
    public static final SlimefunItemStack CC_CLAY_1 = new SlimefunItemStack("CC_CLAY_1", Material.CLAY, "&d壓縮黏土", "", "&fx8 黏土", "");
    public static final SlimefunItemStack CC_CLAY_BALL_1 = new SlimefunItemStack("CC_CLAY_BALL_1", Material.CLAY_BALL, "&d壓縮黏土球", "", "&fx8 黏土球", "");
    public static final SlimefunItemStack CC_COAL_1 = new SlimefunItemStack("CC_COAL_1", Material.COAL, "&d壓縮煤炭", "", "&fx8 煤炭", "");
    public static final SlimefunItemStack CC_COAL_BLOCK_1 = new SlimefunItemStack("CC_COAL_BLOCK_1", Material.COAL_BLOCK, "&d壓縮煤炭方塊", "", "&fx8 煤炭方塊", "");
    public static final SlimefunItemStack CC_IRON_NUGGET_1 = new SlimefunItemStack("CC_IRON_NUGGET_1", Material.IRON_NUGGET, "&d壓縮鐵粒", "", "&fx8 鐵粒", "");
    public static final SlimefunItemStack CC_IRON_INGOT_1 = new SlimefunItemStack("CC_IRON_INGOT_1", Material.IRON_INGOT, "&d壓縮鐵錠", "", "&fx8 鐵錠", "");
    public static final SlimefunItemStack CC_IRON_BLOCk_1 = new SlimefunItemStack("CC_IRON_BLOCK_1", Material.IRON_BLOCK, "&d壓縮鐵方塊", "", "&fx8 鐵方塊", "");
    public static final SlimefunItemStack CC_GOLD_NUGGET_1 = new SlimefunItemStack("CC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&d壓縮金粒", "", "&fx8 金粒", "");
    public static final SlimefunItemStack CC_GOLD_INGOT_1 = new SlimefunItemStack("CC_GOLD_INGOT_1", Material.GOLD_INGOT, "&d壓縮金錠", "", "&fx8 金錠", "");
    public static final SlimefunItemStack CC_GOLD_BLOCK_1 = new SlimefunItemStack("CC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&d壓縮黃金方塊", "", "&fx8 黃金方塊", "");
    public static final SlimefunItemStack CC_REDSTONE_1 = new SlimefunItemStack("CC_REDSTONE_1", Material.REDSTONE, "&d壓縮紅石粉", "", "&fx8 紅石粉", "");
    public static final SlimefunItemStack CC_REDSTONE_BLOCK_1 = new SlimefunItemStack("CC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&d壓縮紅石方塊", "", "&fx8 紅石方塊", "");
    public static final SlimefunItemStack CC_LAPIS_LAZULI_1 = new SlimefunItemStack("CC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&d壓縮青金石", "", "&fx8 青金石", "");
    public static final SlimefunItemStack CC_LAPIS_BLOCK_1 = new SlimefunItemStack("CC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&d壓縮青金石方塊", "", "&fx8 青金石方塊", "");
    public static final SlimefunItemStack CC_DIAMOND_1 = new SlimefunItemStack("CC_DIAMOND_1", Material.DIAMOND, "&d壓縮鑽石", "", "&fx8 鑽石", "");
    public static final SlimefunItemStack CC_DIAMOND_BLOCK_1 = new SlimefunItemStack("CC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&d壓縮鑽石方塊", "", "&fx8 壓縮鑽石方塊", "");
    public static final SlimefunItemStack CC_EMERALD_1 = new SlimefunItemStack("CC_EMERALD_1", Material.EMERALD, "&d壓縮綠寶石", "", "&fx8 綠寶石", "");
    public static final SlimefunItemStack CC_EMERALD_BLOCK_1 = new SlimefunItemStack("CC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&d壓縮綠寶石方塊", "", "&fx8 綠寶石方塊", "");
    public static final SlimefunItemStack CC_AMETHYST_SHARD_1 = new SlimefunItemStack("CC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&d壓縮紫水晶碎片", "", "&fx8 紫水晶碎片", "");
    public static final SlimefunItemStack CC_AMETHYST_BLOCK_1 = new SlimefunItemStack("CC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&d壓縮紫水晶方塊", "", "&fx8 紫水晶方塊", "");
    public static final SlimefunItemStack CC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("CC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&d壓縮小型紫水晶芽", "", "&fx8 小型紫水晶芽", "");
    public static final SlimefunItemStack CC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("CC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&d壓縮中型紫水晶芽", "", "&fx8 中型紫水晶芽", "");
    public static final SlimefunItemStack CC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("CC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&d壓縮大型紫水晶芽", "", "&fx8 大型紫水晶芽", "");
    public static final SlimefunItemStack CC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("CC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&d壓縮紫水晶晶簇", "", "&fx8 紫水晶晶簇", "");
    //addon info
    public static final SlimefunItemStack CC_MC_VERSION = new SlimefunItemStack("CC_MC_VERSION", Material.BOOK, "&fMinecraft 版本", "", "&f運行於版本 1.17x-1.19x");
    public static final SlimefunItemStack CC_JAVA_VERSION = new SlimefunItemStack("CC_JAVA_VERSION", Material.BOOK, "&fJava 版本", "", "&f壓縮製造需要 Java 16+ 來運行");
    public static final SlimefunItemStack CC_SF_BUILD = new SlimefunItemStack("CC_SF_BUILD", Material.BOOK, "&fSlimefun 建構", "", "&f壓縮製造建構在黏液科技版本: RC-32");
    public static final SlimefunItemStack CC_VERSION = new SlimefunItemStack("CC_VERSION", Material.BOOK, "&fCompressioncraft 版本",  "&f壓縮製造 - 資訊",
            "",
            "&f" + CompressionCraft.getInstance().getName() + " " + CompressionCraft.getInstance().getPluginVersion());
    //Credit and the source for the CC_VERSION goes to https://github.com/Sfiguz7/TranscEndence/blob/master/src/main/java/me/sfiguz7/transcendence/lists/TEItems.java
}
