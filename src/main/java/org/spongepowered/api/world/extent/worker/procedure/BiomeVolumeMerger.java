/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.world.extent.worker.procedure;

import org.spongepowered.api.world.biome.BiomeType;
import org.spongepowered.api.world.extent.UnmodifiableBiomeVolume;

/**
 * Produces a new biome from two original biomes given as their volumea and their
 * coordinates.
 */
@FunctionalInterface
public interface BiomeVolumeMerger {

    /**
     * Produces a new biome from two original biomes given as their volumes and
     * their coordinates.
     *
     * @param firstVolume The volume for the first biome
     * @param xFirst The x coordinate for the first biome
     * @param yFirst The y coordinate for the first biome
     * @param zFirst The z coordinate for the first biome
     * @param secondVolume The volume for the second biome
     * @param xSecond The x coordinate for the second biome
     * @param ySecond The y coordinate for the second biome
     * @param zSecond The z coordinate for the second biome
     * @return The produced biome
     */
    BiomeType merge(UnmodifiableBiomeVolume firstVolume, int xFirst, int yFirst, int zFirst, UnmodifiableBiomeVolume secondVolume, int xSecond,
            int ySecond, int zSecond);

}
