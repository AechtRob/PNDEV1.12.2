package net.lepidodendron.entity.model.llibraryextensions;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.client.model.tools.Model3DTexture;

public class AdvancedModelRendererExtended extends AdvancedModelRenderer {

    private AdvancedModelBaseExtended model;

    public AdvancedModelRendererExtended(AdvancedModelBaseExtended model, String name) {
        super(model, name);
        this.model = model;
    }

    public AdvancedModelRendererExtended(AdvancedModelBaseExtended model) {
        this(model, null);
    }

    public AdvancedModelRendererExtended(AdvancedModelBaseExtended model, int textureOffsetX, int textureOffsetY) {
        this(model);
        this.setTextureOffset(textureOffsetX, textureOffsetY);
    }

    public AdvancedModelRendererExtended add3DTexture(float posX, float posY, float posZ, int width, int height) {
        this.cubeList.add(new Model3DTexture(this, this.textureOffsetX, this.textureOffsetY, posX, posY, posZ, width, height));
        return this;
    }

    public void bobExtended(float speed, float degree, boolean bounce, float offset, float f, float f1) {
        float movementScale = this.model.getMovementScale();
        degree *= movementScale;
        speed *= movementScale;
        float bob = (float) (Math.sin(f * speed + offset) * f1 * degree - f1 * degree);
        if (bounce) {
            bob = (float) -Math.abs((Math.sin(f * speed + offset) * f1 * degree));
        }
        this.rotationPointY += bob;
    }


}
