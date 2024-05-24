package net.cobra.minecraftmod.world.biome.surface;

import net.cobra.minecraftmod.block.ModBlocks;
import net.cobra.minecraftmod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;


public class ModMaterialRules {

    private static final MaterialRules.MaterialRule LAVA = makeStateRule(Blocks.LAVA);
    private static final MaterialRules.MaterialRule ENERGY_BLOCK = makeStateRule(ModBlocks.ENERGY_BLOCK);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(1, 5);

        MaterialRules.MaterialRule energySurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, LAVA), ENERGY_BLOCK);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.DARK_LANDS),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ENERGY_BLOCK)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, LAVA)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, energySurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}