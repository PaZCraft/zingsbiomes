package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;
import net.mcreator.zingsbiomes.entity.*;

import java.util.Comparator;

public class WoodenBirdzingShearingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity == (findEntityInWorldRange(world, OakWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem2 ? _entUseItem2.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof OakWoodenBirdzingEntity _datEntL4 && _datEntL4.getEntityData().get(OakWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.OAK_SAPLING));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem8 ? _entUseItem8.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof OakWoodenBirdzingEntity _datEntL10 && _datEntL10.getEntityData().get(OakWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
		if (entity == (findEntityInWorldRange(world, CrimsonWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem16 ? _entUseItem16.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof CrimsonWoodenBirdzingEntity _datEntL18 && _datEntL18.getEntityData().get(CrimsonWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CRIMSON_FUNGUS));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem22 ? _entUseItem22.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof CrimsonWoodenBirdzingEntity _datEntL24 && _datEntL24.getEntityData().get(CrimsonWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
		if (entity == (findEntityInWorldRange(world, CherryWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem30 ? _entUseItem30.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof CherryWoodenBirdzingEntity _datEntL32 && _datEntL32.getEntityData().get(CherryWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CHERRY_SAPLING));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem36 ? _entUseItem36.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof CherryWoodenBirdzingEntity _datEntL38 && _datEntL38.getEntityData().get(CherryWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
		if (entity == (findEntityInWorldRange(world, PaleWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem44 ? _entUseItem44.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof PaleWoodenBirdzingEntity _datEntL46 && _datEntL46.getEntityData().get(PaleWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PALE_OAK_SAPLING));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem50 ? _entUseItem50.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof PaleWoodenBirdzingEntity _datEntL52 && _datEntL52.getEntityData().get(PaleWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
		if (entity == (findEntityInWorldRange(world, BambooWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem58 ? _entUseItem58.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof BambooWoodenBirdzingEntity _datEntL60 && _datEntL60.getEntityData().get(BambooWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BAMBOO));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem64 ? _entUseItem64.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof BambooWoodenBirdzingEntity _datEntL66 && _datEntL66.getEntityData().get(BambooWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
		if (entity == (findEntityInWorldRange(world, AzaleaWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem72 ? _entUseItem72.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof AzaleaWoodenBirdzingEntity _datEntL74 && _datEntL74.getEntityData().get(AzaleaWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.AZALEA));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem78 ? _entUseItem78.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof AzaleaWoodenBirdzingEntity _datEntL80 && _datEntL80.getEntityData().get(AzaleaWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
		if (entity == (findEntityInWorldRange(world, EndWoodenBirdzingEntity.class, x, y, z, 4))) {
			if ((sourceentity instanceof LivingEntity _entUseItem86 ? _entUseItem86.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if ((entity instanceof EndWoodenBirdzingEntity _datEntL88 && _datEntL88.getEntityData().get(EndWoodenBirdzingEntity.DATA_is_sheared)) == false) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ZingsBiomesModBlocks.CHORUS_SAPLING.get()));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _entUseItem92 ? _entUseItem92.getUseItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if ((entity instanceof EndWoodenBirdzingEntity _datEntL94 && _datEntL94.getEntityData().get(EndWoodenBirdzingEntity.DATA_is_sheared)) == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.regrow")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					world.addParticle(ParticleTypes.RESET_MOB_GROWTH, x, y, z, 0, 1, 0);
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
				}
			}
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}