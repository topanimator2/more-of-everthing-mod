
package net.mcreator.moreeverything.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreeverything.block.RefineryBlock;
import net.mcreator.moreeverything.MoreEverythingModElements;

@MoreEverythingModElements.ModElement.Tag
public class PowerItemGroup extends MoreEverythingModElements.ModElement {
	public PowerItemGroup(MoreEverythingModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpower") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RefineryBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
