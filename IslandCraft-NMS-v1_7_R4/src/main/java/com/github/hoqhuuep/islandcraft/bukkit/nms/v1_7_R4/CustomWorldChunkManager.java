package com.github.hoqhuuep.islandcraft.bukkit.nms.v1_7_R4;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.server.v1_7_R4.BiomeBase;
import net.minecraft.server.v1_7_R4.BiomeCache;
import net.minecraft.server.v1_7_R4.ChunkPosition;
import net.minecraft.server.v1_7_R4.WorldChunkManager;

import com.github.hoqhuuep.islandcraft.bukkit.nms.BiomeGenerator;
import com.github.hoqhuuep.islandcraft.bukkit.nms.ICBiome;

public class CustomWorldChunkManager extends WorldChunkManager {
    private static final Map<ICBiome, BiomeBase> biomeMap = new EnumMap<ICBiome, BiomeBase>(ICBiome.class);

    private static final BiomeBase special(final BiomeBase biome) {
        return BiomeBase.getBiome(biome.id + 128);
    }

    static {
        biomeMap.put(ICBiome.BEACH, BiomeBase.BEACH);
        biomeMap.put(ICBiome.BIRCH_FOREST, BiomeBase.BIRCH_FOREST);
        biomeMap.put(ICBiome.BIRCH_FOREST_HILLS, BiomeBase.BIRCH_FOREST_HILLS);
        biomeMap.put(ICBiome.BIRCH_FOREST_HILLS_M, special(BiomeBase.BIRCH_FOREST_HILLS));
        biomeMap.put(ICBiome.BIRCH_FOREST_M, special(BiomeBase.BIRCH_FOREST));
        biomeMap.put(ICBiome.COLD_BEACH, BiomeBase.COLD_BEACH);
        biomeMap.put(ICBiome.COLD_TAIGA, BiomeBase.COLD_TAIGA);
        biomeMap.put(ICBiome.COLD_TAIGA_HILLS, BiomeBase.COLD_TAIGA_HILLS);
        biomeMap.put(ICBiome.COLD_TAIGA_M, special(BiomeBase.COLD_TAIGA));
        biomeMap.put(ICBiome.DEEP_OCEAN, BiomeBase.DEEP_OCEAN);
        biomeMap.put(ICBiome.DESERT, BiomeBase.DESERT);
        biomeMap.put(ICBiome.DESERT_HILLS, BiomeBase.DESERT_HILLS);
        biomeMap.put(ICBiome.DESERT_M, special(BiomeBase.DESERT));
        biomeMap.put(ICBiome.END, BiomeBase.SKY);
        biomeMap.put(ICBiome.EXTREME_HILLS, BiomeBase.EXTREME_HILLS);
        biomeMap.put(ICBiome.EXTREME_HILLS_EDGE, BiomeBase.SMALL_MOUNTAINS);
        biomeMap.put(ICBiome.EXTREME_HILLS_M, special(BiomeBase.EXTREME_HILLS));
        biomeMap.put(ICBiome.EXTREME_HILLS_PLUS, BiomeBase.EXTREME_HILLS_PLUS);
        biomeMap.put(ICBiome.EXTREME_HILLS_PLUS_M, special(BiomeBase.EXTREME_HILLS_PLUS));
        biomeMap.put(ICBiome.FLOWER_FOREST, special(BiomeBase.FOREST));
        biomeMap.put(ICBiome.FOREST, BiomeBase.FOREST);
        biomeMap.put(ICBiome.FOREST_HILLS, BiomeBase.FOREST_HILLS);
        biomeMap.put(ICBiome.FROZEN_OCEAN, BiomeBase.FROZEN_OCEAN);
        biomeMap.put(ICBiome.FROZEN_RIVER, BiomeBase.FROZEN_RIVER);
        biomeMap.put(ICBiome.ICE_MOUNTAINS, BiomeBase.ICE_MOUNTAINS);
        biomeMap.put(ICBiome.ICE_PLAINS, BiomeBase.ICE_PLAINS);
        biomeMap.put(ICBiome.ICE_PLAINS_SPIKES, special(BiomeBase.ICE_PLAINS));
        biomeMap.put(ICBiome.JUNGLE, BiomeBase.JUNGLE);
        biomeMap.put(ICBiome.JUNGLE_EDGE, BiomeBase.JUNGLE_EDGE);
        biomeMap.put(ICBiome.JUNGLE_HILLS, BiomeBase.JUNGLE_HILLS);
        biomeMap.put(ICBiome.JUNGLE_M, special(BiomeBase.JUNGLE));
        biomeMap.put(ICBiome.JUNGLE_EDGE_M, special(BiomeBase.JUNGLE_EDGE));
        biomeMap.put(ICBiome.MEGA_SPRUCE_TAIGA, special(BiomeBase.MEGA_TAIGA));
        biomeMap.put(ICBiome.MEGA_SPRUCE_TAIGA_HILLS, special(BiomeBase.MEGA_TAIGA_HILLS));
        biomeMap.put(ICBiome.MEGA_TAIGA, BiomeBase.MEGA_TAIGA);
        biomeMap.put(ICBiome.MEGA_TAIGA_HILLS, BiomeBase.MEGA_TAIGA_HILLS);
        biomeMap.put(ICBiome.MESA, BiomeBase.MESA);
        biomeMap.put(ICBiome.MESA_BRYCE, special(BiomeBase.MESA));
        biomeMap.put(ICBiome.MESA_PLATEAU, BiomeBase.MESA_PLATEAU);
        biomeMap.put(ICBiome.MESA_PLATEAU_F, BiomeBase.MESA_PLATEAU_F);
        biomeMap.put(ICBiome.MESA_PLATEAU_F_M, special(BiomeBase.MESA_PLATEAU_F));
        biomeMap.put(ICBiome.MESA_PLATEAU_M, special(BiomeBase.MESA_PLATEAU));
        biomeMap.put(ICBiome.MUSHROOM_ISLAND, BiomeBase.MUSHROOM_ISLAND);
        biomeMap.put(ICBiome.MUSHROOM_ISLAND_SHORE, BiomeBase.MUSHROOM_SHORE);
        biomeMap.put(ICBiome.NETHER, BiomeBase.HELL);
        biomeMap.put(ICBiome.OCEAN, BiomeBase.OCEAN);
        biomeMap.put(ICBiome.PLAINS, BiomeBase.PLAINS);
        biomeMap.put(ICBiome.RIVER, BiomeBase.RIVER);
        biomeMap.put(ICBiome.ROOFED_FOREST, BiomeBase.ROOFED_FOREST);
        biomeMap.put(ICBiome.ROOFED_FOREST_M, special(BiomeBase.ROOFED_FOREST));
        biomeMap.put(ICBiome.SAVANNA, BiomeBase.SAVANNA);
        biomeMap.put(ICBiome.SAVANNA_M, special(BiomeBase.SAVANNA));
        biomeMap.put(ICBiome.SAVANNA_PLATEAU, BiomeBase.SAVANNA_PLATEAU);
        biomeMap.put(ICBiome.SAVANNA_PLATEAU_M, special(BiomeBase.SAVANNA_PLATEAU));
        biomeMap.put(ICBiome.STONE_BEACH, BiomeBase.STONE_BEACH);
        biomeMap.put(ICBiome.SUNFLOWER_PLAINS, special(BiomeBase.PLAINS));
        biomeMap.put(ICBiome.SWAMPLAND, BiomeBase.SWAMPLAND);
        biomeMap.put(ICBiome.SWAMPLAND_M, special(BiomeBase.SWAMPLAND));
        biomeMap.put(ICBiome.TAIGA, BiomeBase.TAIGA);
        biomeMap.put(ICBiome.TAIGA_HILLS, BiomeBase.TAIGA_HILLS);
        biomeMap.put(ICBiome.TAIGA_M, special(BiomeBase.TAIGA));
    }

    private final BiomeCache biomeCache;
    private final BiomeGenerator biomeGenerator;

    public CustomWorldChunkManager(final BiomeGenerator biomeGenerator) {
        this.biomeGenerator = biomeGenerator;
        this.biomeCache = new BiomeCache(this);
    }

    /** Returns a list of biome's which are valid for spawn */
    @Override
    @SuppressWarnings("rawtypes")
    public List a() {
        return super.a();
    }

    /** Returns the biome at a position. Used for various things. */
    @Override
    public BiomeBase getBiome(final int x, final int z) {
        // Get from cache
        return this.biomeCache.b(x, z);
    }

    /** Used in creating ChunkSnapshot's */
    @Override
    public float[] getWetness(float[] result, final int x, final int z, int xSize, final int zSize) {
        // Create result array if given one is insufficient
        if (result == null || result.length < xSize * zSize) {
            // In reality result is always null
            result = new float[xSize * zSize];
        }
        // In reality size is always 1 chunk's worth
        final BiomeBase[] biomes = a(null, x, z, xSize, zSize, false);
        for (int i = 0; i < xSize * zSize; i++) {
            final float wetness = biomes[i].h() / 65536.0F;
            if (wetness > 1.0F) {
                result[i] = 1.0F;
            } else {
                result[i] = wetness;
            }
        }
        return result;
    }

    /** Used for height map and temperature */
    @Override
    public BiomeBase[] getBiomes(BiomeBase[] result, final int xMin, final int zMin, final int xSize, final int zSize) {
        // Create result array if given one is insufficient
        if (result == null || result.length < xSize * zSize) {
            result = new BiomeBase[xSize * zSize];
        }
        // 1 in every 4
        for (int i = 0; i < xSize * zSize; ++i) {
            final int x = (xMin + (i % xSize)) << 2;
            final int z = (zMin + (i / xSize)) << 2;
            final ICBiome biome = biomeGenerator.generateBiome(x, z);
            result[i] = biomeMap.get(biome);
        }
        return result;
    }

    /** Used in chunk creation */
    @Override
    public BiomeBase[] getBiomeBlock(final BiomeBase[] array, final int x, final int z, final int xSize, final int zSize) {
        return a(array, x, z, xSize, zSize, true);
    }

    /** Only used in above method... and getWetness */
    @Override
    public BiomeBase[] a(BiomeBase[] result, final int xMin, final int zMin, final int xSize, final int zSize, final boolean useCache) {
        // Create result array if given one is insufficient
        if (result == null || result.length < xSize * zSize) {
            // Happens for nether, end, and flat worlds...
            result = new BiomeBase[xSize * zSize];
        }
        // More efficient handling of whole chunk
        if (xSize == 16 && zSize == 16 && (xMin & 0xF) == 0 && (zMin & 0xF) == 0) {
            if (useCache) {
                // Happens most of the time
                final BiomeBase[] biomes = this.biomeCache.d(xMin, zMin);
                System.arraycopy(biomes, 0, result, 0, xSize * zSize);
                return result;
            }
            // This only happens in getWetness above
            final ICBiome[] temp = biomeGenerator.generateChunkBiomes(xMin, zMin);
            for (int i = 0; i < xSize * zSize; ++i) {
                result[i] = biomeMap.get(temp[i]);
            }
            return result;
        }
        // In reality this never happens...
        for (int x = 0; x < xSize; ++x) {
            for (int z = 0; z < zSize; ++z) {
                final ICBiome temp = biomeGenerator.generateBiome(xMin + x, zMin + z);
                result[x + z * xSize] = biomeMap.get(temp);
            }
        }
        return result;
    }

    /**
     * Returns true if all biome's in area are in allowedBiomes. x, z and radius
     * are in blocks. Used for checking where a village can go.
     */
    @Override
    public boolean a(final int x, final int z, final int radius, @SuppressWarnings("rawtypes") final List allowedBiomes) {
        // Convert center and radius to minimum and size
        final int xMin = (x - radius) >> 2;
        final int zMin = (z - radius) >> 2;
        final int xMax = (x + radius) >> 2;
        final int zMax = (z + radius) >> 2;
        final int xSize = xMax - xMin + 1;
        final int zSize = zMax - zMin + 1;
        // Generate biome's
        final BiomeBase[] biomes = getBiomes(null, xMin, zMin, xSize, zSize);
        // Make sure all biomes are allowed
        for (int i = 0; i < xSize * zSize; i++) {
            if (!allowedBiomes.contains(biomes[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns random position within biome if it can be found in given area.
     * Otherwise null. Used for initial guess at spawn point and stronghold
     * locations.
     */
    @Override
    public ChunkPosition a(final int x, final int z, final int radius, @SuppressWarnings("rawtypes") final List allowedBiomes, final Random random) {
        // Convert center and radius to minimum and size
        final int xMin = (x - radius) >> 2;
        final int zMin = (z - radius) >> 2;
        final int xMax = (x + radius) >> 2;
        final int zMax = (z + radius) >> 2;
        final int xSize = xMax - xMin + 1;
        final int zSize = zMax - zMin + 1;
        // Generate biome's
        final BiomeBase[] biomes = getBiomes(null, xMin, zMin, xSize, zSize);
        ChunkPosition result = null;
        int count = 0;
        for (int i = 0; i < xSize * zSize; i++) {
            final int xPosition = (xMin + (i % xSize)) << 2;
            final int zPosition = (zMin + (i / xSize)) << 2;
            if (allowedBiomes.contains(biomes[i]) && (result == null || random.nextInt(count + 1) == 0)) {
                result = new ChunkPosition(xPosition, 0, zPosition);
                count++;
            }
        }
        return result;
    }

    /** Cleans up biomeCache, called in tick */
    @Override
    public void b() {
        // Clean up biomeCache
        biomeCache.a();
        biomeGenerator.cleanupCache();
    }
}
