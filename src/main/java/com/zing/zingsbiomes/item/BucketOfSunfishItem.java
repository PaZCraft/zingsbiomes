package com.zing.zingsbiomes.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import com.zing.zingsbiomes.procedures.BucketOfSunfishRightclickedOnBlockProcedure;

public class BucketOfSunfishItem extends Item {
	public BucketOfSunfishItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BucketOfSunfishRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}