package me.jasperchasetoq.compressioncraft.items.implementation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class CcDecompressor extends AContainer implements RecipeDisplayItem {


    public CcDecompressor(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }
    @Override
    protected void registerDefaultRecipes() {

        //Old
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_1, 1)}, new ItemStack[]{new ItemStack(Material.COBBLESTONE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_ANDESITE_1, 1)}, new ItemStack[]{new ItemStack(Material.ANDESITE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DIORITE_1, 1)}, new ItemStack[]{new ItemStack(Material.DIORITE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GRANITE_1, 1)}, new ItemStack[]{new ItemStack(Material.GRANITE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLED_DEEPSLATE_1, 1)}, new ItemStack[]{new ItemStack(Material.COBBLED_DEEPSLATE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DEEPSLATE_1, 1)}, new ItemStack[]{new ItemStack(Material.DEEPSLATE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_STONE_1, 1)}, new ItemStack[]{new ItemStack(Material.STONE, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_FLINT_1, 1)}, new ItemStack[]{new ItemStack(Material.FLINT, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GRAVEL_1, 1)}, new ItemStack[]{new ItemStack(Material.GRAVEL, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DIRT_1, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_CLAY_1, 1)}, new ItemStack[]{new ItemStack(Material.CLAY, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_CLAY_BALL_1, 1)}, new ItemStack[]{new ItemStack(Material.CLAY_BALL, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COAL_1, 1)}, new ItemStack[]{new ItemStack(Material.COAL, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COAL_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.COAL_BLOCK, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_IRON_NUGGET_1, 1)}, new ItemStack[]{new ItemStack(Material.IRON_NUGGET, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_IRON_INGOT_1, 1)}, new ItemStack[]{new ItemStack(Material.IRON_INGOT, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_IRON_BLOCk_1, 1)}, new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GOLD_NUGGET_1, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_NUGGET, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GOLD_INGOT_1, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_INGOT, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GOLD_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_REDSTONE_1, 1)}, new ItemStack[]{new ItemStack(Material.REDSTONE, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_REDSTONE_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.REDSTONE_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_LAPIS_LAZULI_1, 1)}, new ItemStack[]{new ItemStack(Material.LAPIS_LAZULI, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_LAPIS_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.LAPIS_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DIAMOND_1, 1)}, new ItemStack[]{new ItemStack(Material.DIAMOND, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DIAMOND_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.DIAMOND_BLOCK, 8)});
        registerRecipe(28, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_EMERALD_1, 1)}, new ItemStack[]{new ItemStack(Material.EMERALD, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_EMERALD_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.EMERALD_BLOCK, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_AMETHYST_SHARD_1, 1)}, new ItemStack[]{new ItemStack(Material.AMETHYST_SHARD, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_AMETHYST_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.AMETHYST_BLOCK, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_SMALL_AMETHYST_BUD_1, 1)}, new ItemStack[]{new ItemStack(Material.SMALL_AMETHYST_BUD, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_MEDIUM_AMETHYST_BUD_1, 1)}, new ItemStack[]{new ItemStack(Material.MEDIUM_AMETHYST_BUD, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_LARGE_AMETHYST_BUD_1, 1)}, new ItemStack[]{new ItemStack(Material.LARGE_AMETHYST_BUD, 8)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_AMETHYST_CLUSTER_1, 1)}, new ItemStack[]{new ItemStack(Material.AMETHYST_CLUSTER, 8)});
        //Double Compressed
        registerRecipe(24, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_2, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_1, 8)});
        //Triple Compressed
        registerRecipe(36, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_3, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_2, 8)});
        //Quadruple Compressed
        registerRecipe(48, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_4, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_3, 8)});
        //Quintuple Compressed
        registerRecipe(60, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_5, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_4, 8)});
        //Sextuple Compressed
        registerRecipe(72, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_6, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_5, 8)});


        //New
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_1, 1)}, new ItemStack[]{new ItemStack(Material.COBBLESTONE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_ANDESITE_1, 1)}, new ItemStack[]{new ItemStack(Material.ANDESITE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIORITE_1, 1)}, new ItemStack[]{new ItemStack(Material.DIORITE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRANITE_1, 1)}, new ItemStack[]{new ItemStack(Material.GRANITE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLED_DEEPSLATE_1, 1)}, new ItemStack[]{new ItemStack(Material.COBBLED_DEEPSLATE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DEEPSLATE_1, 1)}, new ItemStack[]{new ItemStack(Material.DEEPSLATE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_STONE_1, 1)}, new ItemStack[]{new ItemStack(Material.STONE, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_FLINT_1, 1)}, new ItemStack[]{new ItemStack(Material.FLINT, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GRAVEL_1, 1)}, new ItemStack[]{new ItemStack(Material.GRAVEL, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIRT_1, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_BALL_1, 1)}, new ItemStack[]{new ItemStack(Material.CLAY_BALL, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_CLAY_1, 1)}, new ItemStack[]{new ItemStack(Material.CLAY, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BALL_1, 1)}, new ItemStack[]{new ItemStack(Material.SNOWBALL, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SNOW_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.SNOW_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_1, 1)}, new ItemStack[]{new ItemStack(Material.COAL, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COAL_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.COAL_BLOCK, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_NUGGET_1, 1)}, new ItemStack[]{new ItemStack(Material.IRON_NUGGET, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_INGOT_1, 1)}, new ItemStack[]{new ItemStack(Material.IRON_INGOT, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_IRON_BLOCk_1, 1)}, new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_NUGGET_1, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_NUGGET, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_INGOT_1, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_INGOT, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_GOLD_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_1, 1)}, new ItemStack[]{new ItemStack(Material.REDSTONE, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_REDSTONE_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.REDSTONE_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_LAZULI_1, 1)}, new ItemStack[]{new ItemStack(Material.LAPIS_LAZULI, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LAPIS_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.LAPIS_BLOCK, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_1, 1)}, new ItemStack[]{new ItemStack(Material.DIAMOND, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_DIAMOND_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.DIAMOND_BLOCK, 8)});
        registerRecipe(28, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_1, 1)}, new ItemStack[]{new ItemStack(Material.EMERALD, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_EMERALD_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.EMERALD_BLOCK, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_AMETHYST_SHARD_1, 1)}, new ItemStack[]{new ItemStack(Material.AMETHYST_SHARD, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_AMETHYST_BLOCK_1, 1)}, new ItemStack[]{new ItemStack(Material.AMETHYST_BLOCK, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_SMALL_AMETHYST_BUD_1, 1)}, new ItemStack[]{new ItemStack(Material.SMALL_AMETHYST_BUD, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_MEDIUM_AMETHYST_BUD_1, 1)}, new ItemStack[]{new ItemStack(Material.MEDIUM_AMETHYST_BUD, 8)});
        registerRecipe(16, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_LARGE_AMETHYST_BUD_1, 1)}, new ItemStack[]{new ItemStack(Material.LARGE_AMETHYST_BUD, 8)});
        registerRecipe(12, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_AMETHYST_CLUSTER_1, 1)}, new ItemStack[]{new ItemStack(Material.AMETHYST_CLUSTER, 8)});
        //Double Compressed
        registerRecipe(24, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_2, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_1, 8)});
        //Triple Compressed
        registerRecipe(36, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_3, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_2, 8)});
        //Quadruple Compressed
        registerRecipe(48, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_4, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_3, 8)});
        //Quintuple Compressed
        registerRecipe(60, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_5, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_4, 8)});
        //Sextuple Compressed
        registerRecipe(72, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_6, 1)}, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.JC_COBBLESTONE_5, 8)});
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(SlimefunItems.ELECTRIC_PRESS);
    }



    @Override
    public String getMachineIdentifier() {return "JC_DECOMPRESSOR";}
    @Override
    public String getInventoryTitle() {return "&0CompressionCraft " + getItemName();}


    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }

}


