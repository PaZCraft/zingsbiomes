package com.zing.zingsbiomes.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import com.zing.zingsbiomes.procedures.BucketOfSeaUrchinRightclickedOnBlockProcedure;

public class BucketOfSeaUrchinItem extends Item {
	public BucketOfSeaUrchinItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BucketOfSeaUrchinRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}