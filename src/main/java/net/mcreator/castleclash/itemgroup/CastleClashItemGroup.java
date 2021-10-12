
package net.mcreator.castleclash.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.castleclash.block.LimeStoneBlock;
import net.mcreator.castleclash.CastleClashModElements;

@CastleClashModElements.ModElement.Tag
public class CastleClashItemGroup extends CastleClashModElements.ModElement {
	public CastleClashItemGroup(CastleClashModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcastle_clash") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LimeStoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
