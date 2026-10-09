package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class DrenchedSpiderEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof net.minecraft.world.entity.Entity _ent1 && sourceentity instanceof net.minecraft.world.entity.Entity _ent2) {
			net.minecraft.world.phys.Vec3 _pos1 = _ent1.position();
			net.minecraft.world.phys.Vec3 _pos2 = _ent2.position();
			_ent1.teleportTo(_pos2.x, _pos2.y, _pos2.z);
			_ent2.teleportTo(_pos1.x, _pos1.y, _pos1.z);
			if (_ent1 instanceof net.minecraft.server.level.ServerPlayer _player1) {
				_player1.connection.teleport(_pos2.x, _pos2.y, _pos2.z, _player1.getYRot(), _player1.getXRot());
			}
			if (_ent2 instanceof net.minecraft.server.level.ServerPlayer _player2) {
				_player2.connection.teleport(_pos1.x, _pos1.y, _pos1.z, _player2.getYRot(), _player2.getXRot());
			}
		}
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
	}
}