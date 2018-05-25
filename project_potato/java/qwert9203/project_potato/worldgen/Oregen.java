package qwert9203.project_potato.worldgen;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import qwert9203.project_potato.init.ModBlocks;
import qwert9203.project_potato.init.blocks.BlockGraphiteOre;
import qwert9203.project_potato.init.blocks.BlockPhosphoriteOre;

public class Oregen implements IWorldGenerator {
	
	//world generators
	private WorldGenerator phosphorite_overworld;
	private WorldGenerator graphite_nether;
	private WorldGenerator potatium_end;
	private WorldGenerator gabrium_end;
	
	public Oregen() {
		phosphorite_overworld = new WorldGenMinable(ModBlocks.phosphorite_ore.getDefaultState(),7);
		graphite_nether = new WorldGenMinable(ModBlocks.graphite_ore.getDefaultState(), 6, new NetherGenPredicate());
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case 0: //overworld
			this.runGenerator(phosphorite_overworld, world, random, chunkX, chunkZ, 23, 4, 35);
		case 1: //end
		case -1: //nether
			this.runGenerator(graphite_nether,world, random, chunkX, chunkZ, 12, 10, 240);
		}
	}

}
