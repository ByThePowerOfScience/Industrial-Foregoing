package com.buuz135.industrial.proxy;

import com.buuz135.industrial.item.IFCustomItem;
import com.buuz135.industrial.item.MeatFeederItem;
import com.buuz135.industrial.item.MobImprisonmentToolItem;

public class ItemRegistry {

    public static MeatFeederItem meatFeederItem;
    public static MobImprisonmentToolItem mobImprisonmentToolItem;
    public static IFCustomItem tinyDryRubber;
    public static IFCustomItem dryRubber;
    public static IFCustomItem plastic;

    public static void registerItems() {
        (meatFeederItem = new MeatFeederItem()).register();
        (mobImprisonmentToolItem = new MobImprisonmentToolItem()).register();
        (tinyDryRubber = new IFCustomItem("tinydryrubber")).register();
        (dryRubber = new IFCustomItem("dryrubber")).register();
        (plastic = new IFCustomItem("plastic")).register();
    }
}