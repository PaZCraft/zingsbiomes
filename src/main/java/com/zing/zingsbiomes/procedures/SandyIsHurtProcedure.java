package com.zing.zingsbiomes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownSplashPotion;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownLingeringPotion;
import net.minecraft.world.entity.projectile.throwableitemprojectile.AbstractThrownPotion;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

public class SandyIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			if (world instanceof net.minecraft.world.level.Level _level) {
				net.minecraft.world.level.Level projectileLevel = _level;
				double _custom_x = (double) x;
				double _custom_y = (double) y;
				double _custom_z = (double) z;
				net.minecraft.world.entity.Entity _targetEntity = sourceentity;
				if (_targetEntity != null
						&& createPotionProjectile(projectileLevel, PotionContents.createItemStack(Items.LINGERING_POTION, Potions.STRONG_SLOWNESS), null, new Vec3(0, 0, 0)) instanceof net.minecraft.world.entity.projectile.Projectile _proj) {
					double _dx = _targetEntity.getX() - _custom_x;
					double _dy = _targetEntity.getEyeY() - 0.1d - _custom_y;
					double _dz = _targetEntity.getZ() - _custom_z;
					double _dist = Math.sqrt(_dx * _dx + _dy * _dy + _dz * _dz);
					if (_dist >= 1.0E-7D) {
						double _spawnX = _custom_x + (_dx / _dist) * 1.0d;
						double _spawnY = _custom_y + (_dy / _dist) * 1.0d;
						double _spawnZ = _custom_z + (_dz / _dist) * 1.0d;
						_proj.setPos(_spawnX, _spawnY, _spawnZ);
						_proj.shoot(_dx, _dy, _dz, (float) 1.5, (float) 0);
						_level.addFreshEntity(_proj);
					}
				}
			}
		}
		ZingsBiomesModEntities.queueServerWork(35, (Runnable) () -> {
			{
				if (world instanceof net.minecraft.world.level.Level _level) {
					net.minecraft.world.level.Level projectileLevel = _level;
					double _custom_x = (double) x;
					double _custom_y = (double) y;
					double _custom_z = (double) z;
					net.minecraft.world.entity.Entity _targetEntity = sourceentity;
					if (_targetEntity != null
							&& createPotionProjectile(projectileLevel, PotionContents.createItemStack(Items.SPLASH_POTION, Potions.HARMING), null, new Vec3(0, 0, 0)) instanceof net.minecraft.world.entity.projectile.Projectile _proj) {
						double _dx = _targetEntity.getX() - _custom_x;
						double _dy = _targetEntity.getEyeY() - 0.1d - _custom_y;
						double _dz = _targetEntity.getZ() - _custom_z;
						double _dist = Math.sqrt(_dx * _dx + _dy * _dy + _dz * _dz);
						if (_dist >= 1.0E-7D) {
							double _spawnX = _custom_x + (_dx / _dist) * 1.0d;
							double _spawnY = _custom_y + (_dy / _dist) * 1.0d;
							double _spawnZ = _custom_z + (_dz / _dist) * 1.0d;
							_proj.setPos(_spawnX, _spawnY, _spawnZ);
							_proj.shoot(_dx, _dy, _dz, (float) 1.5, (float) 0.5);
							_level.addFreshEntity(_proj);
						}
					}
				}
			}
		});
	}

	private static Projectile createPotionProjectile(Level level, ItemStack contents, Entity shooter, Vec3 acceleration) {
		EntityType<?> projectileType = getPotionEntityType(contents.getItem() == Items.LINGERING_POTION);
		AbstractThrownPotion entityToSpawn = contents.getItem() == Items.LINGERING_POTION
				? new ThrownLingeringPotion((EntityType<? extends ThrownLingeringPotion>) projectileType, level)
				: new ThrownSplashPotion((EntityType<? extends ThrownSplashPotion>) projectileType, level);
		entityToSpawn.setItem(contents);
		return initProjectileProperties(entityToSpawn, shooter, acceleration);
	}

	@SuppressWarnings("unchecked")
	private static EntityType<?> getPotionEntityType(boolean lingering) {
		String[] fieldNames = lingering ? new String[] { "LINGERING_POTION", "THROWN_LINGERING_POTION" } : new String[] { "SPLASH_POTION", "THROWN_SPLASH_POTION" };
		for (String fieldName : fieldNames) {
			try {
				java.lang.reflect.Field field = EntityType.class.getField(fieldName);
				return (EntityType<?>) field.get(null);
			} catch (ReflectiveOperationException ignored) {
			}
		}
		throw new IllegalStateException("Missing potion entity type for " + (lingering ? "lingering" : "splash") + " potion");
	}

	private static Projectile initProjectileProperties(Projectile entityToSpawn, Entity shooter, Vec3 acceleration) {
		entityToSpawn.setOwner(shooter);
		if (!Vec3.ZERO.equals(acceleration)) {
			entityToSpawn.setDeltaMovement(acceleration);
			entityToSpawn.needsSync = true;
		}
		return entityToSpawn;
	}
}