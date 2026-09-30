package me.eccentric_nz.TARDIS;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.item.custom.v2.CustomItemBedrockOptions;
import org.geysermc.geyser.api.item.custom.v2.CustomItemDefinition;
import org.geysermc.geyser.api.predicate.item.ItemRangeDispatchPredicate;
import org.geysermc.geyser.api.util.CreativeCategory;
import org.geysermc.geyser.api.util.Identifier;

/**
 * The main class of your extension - must implement extension, and be in the extension.yml file.
 * See {@link Extension} for available methods - for example to get the path to the configuration folder.
 */
public class TARDISExtension implements Extension {

    // add items with Custom item API v2 - https://geysermc.org/wiki/geyser/custom-items
    @Subscribe
    public void onGeyserDefineCustomItems(GeyserDefineCustomItemsEvent event) {

        event.register(Identifier.of("minecraft", "blaze_rod"), CustomItemDefinition.builder(
                        Identifier.of("tardis", "sonic_eighth"), // bedrock item identifier
                        Identifier.of("tardis", "sonic_eighth") // item model definition in java resource pack
                ).displayName("Sonic Screwdriver")
                .bedrockOptions(CustomItemBedrockOptions.builder()
                        .icon("sonic_eighth")
                        .displayHandheld(true)
                        .creativeCategory(CreativeCategory.EQUIPMENT))
                .predicate(ItemRangeDispatchPredicate.customModelData(0, 108))
                .build());
        System.out.println("sonic_eighth");
        event.register(Identifier.of("minecraft", "blaze_rod"), CustomItemDefinition.builder(
                        Identifier.of("tardis", "sonic_eighth_on"), // bedrock item identifier
                        Identifier.of("tardis", "sonic_eighth_on") // item model definition in java resource pack
                ).displayName("Sonic Screwdriver")
                .bedrockOptions(CustomItemBedrockOptions.builder()
                        .icon("sonic_eighth_on")
                        .displayHandheld(true)
                        .creativeCategory(CreativeCategory.EQUIPMENT))
                .predicate(ItemRangeDispatchPredicate.customModelData(0, 208))
                .build());
        System.out.println("sonic_eighth_on");
        event.register(Identifier.of("minecraft", "flint"), CustomItemDefinition.builder(
                        Identifier.of("tardis", "tardis_stattenheim_remote"),
                        Identifier.of("tardis", "stattenheim_remote")
                ).displayName("TARDIS Stattenheim Remote")
                .bedrockOptions(CustomItemBedrockOptions.builder()
                        .icon("tardis_stattenheim_remote")
                        .displayHandheld(true)
                        .creativeCategory(CreativeCategory.EQUIPMENT)
                )
                .build());
        System.out.println("stattenheim_remote");
    }
}
