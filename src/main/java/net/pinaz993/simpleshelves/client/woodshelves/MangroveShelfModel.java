package net.pinaz993.simpleshelves.client.woodshelves;

import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import net.pinaz993.simpleshelves.SimpleShelves;
import net.pinaz993.simpleshelves.client.UnbakedShelfModel;

public class MangroveShelfModel extends UnbakedShelfModel {
    @Override
    public SpriteIdentifier getShelfSpriteId() {
        return new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE,
                new Identifier("minecraft:block/mangrove_planks")
        );
    }

    @Override
    public Identifier getShelfModelId() {
        return new Identifier(SimpleShelves.NAMESPACE, "block/mangrove_shelf_empty");
    }
}
