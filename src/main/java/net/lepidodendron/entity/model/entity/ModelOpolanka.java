package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelOpolanka extends AdvancedModelBase {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer antennaL1;
    private final AdvancedModelRenderer antennaR1;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL3;
    private final AdvancedModelRenderer antennaR3;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;

    public ModelOpolanka() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 23.1F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 10, -3.0F, -1.75F, -2.75F, 6, 1, 5, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -3.0F, -0.825F, -2.75F, 6, 1, 5, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 17, 17, -2.0F, -1.6F, -3.75F, 4, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 8, 18, -1.0F, -2.2F, -1.95F, 2, 1, 2, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 6, 21, -0.99F, -1.1F, -4.7F, 2, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 17, 12, -2.5F, -1.0F, -4.0F, 5, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 17, 0, -4.0F, -1.0F, 1.0F, 8, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 17, 2, -3.5F, -1.01F, 1.75F, 7, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 16, -4.0F, -1.0F, -3.0F, 8, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -4.0F, -1.0F, -4.0F, 8, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 22, 1.5F, -0.99F, 2.5F, 1, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 16, 21, -2.5F, -0.99F, 2.5F, 1, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 12, 21, 0.15F, -0.99F, 2.5F, 1, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 6, 18, -1.15F, -0.99F, 2.5F, 1, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 6, -4.5F, -1.0F, -2.0F, 9, 1, 3, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 13, -3.5F, -0.95F, -3.5F, 1, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, 2.5F, -0.95F, -3.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.25F, -3.5F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 10, -3.0F, -0.45F, -1.05F, 6, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -1.01F, -0.65F, -1.775F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.15F, 0.0F);
        this.carapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 20, -0.5F, 0.0F, -0.1F, 1, 1, 2, 0.0F, false));

        this.antennaL1 = new AdvancedModelRenderer(this);
        this.antennaL1.setRotationPoint(2.5F, -0.5F, -3.9F);
        this.carapace.addChild(antennaL1);
        this.setRotateAngle(antennaL1, 0.0F, -0.9599F, 0.0F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 0, 10, 0.0F, -0.5F, -1.65F, 0, 1, 2, 0.0F, false));

        this.antennaR1 = new AdvancedModelRenderer(this);
        this.antennaR1.setRotationPoint(-2.5F, -0.5F, -3.9F);
        this.carapace.addChild(antennaR1);
        this.setRotateAngle(antennaR1, 0.0F, 0.9599F, 0.0F);
        this.antennaR1.cubeList.add(new ModelBox(antennaR1, 0, 2, 0.0F, -0.5F, -1.65F, 0, 1, 2, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(2.5F, -0.5F, -4.0F);
        this.carapace.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.7854F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 9, 0.0F, -0.5F, -1.65F, 0, 1, 2, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-2.5F, -0.5F, -4.0F);
        this.carapace.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.7854F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 1, 0.0F, -0.5F, -1.65F, 0, 1, 2, 0.0F, false));

        this.antennaL3 = new AdvancedModelRenderer(this);
        this.antennaL3.setRotationPoint(1.5F, -0.5F, -4.0F);
        this.carapace.addChild(antennaL3);
        this.setRotateAngle(antennaL3, 0.0F, -0.3491F, 0.0F);
        this.antennaL3.cubeList.add(new ModelBox(antennaL3, 0, 8, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.antennaR3 = new AdvancedModelRenderer(this);
        this.antennaR3.setRotationPoint(-1.5F, -0.5F, -4.0F);
        this.carapace.addChild(antennaR3);
        this.setRotateAngle(antennaR3, 0.0F, 0.3491F, 0.0F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 0, 0, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.75F, 0.15F, -2.0F);
        this.carapace.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.3054F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 21, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.75F, 0.15F, -2.0F);
        this.carapace.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, -0.3054F);
        this.legR1.cubeList.add(new ModelBox(legR1, 19, 19, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(3.0F, 0.15F, -1.0F);
        this.carapace.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.2618F, 0.2618F);
        this.legL2.cubeList.add(new ModelBox(legL2, 15, 20, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-3.0F, 0.15F, -1.0F);
        this.carapace.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.2618F, -0.2618F);
        this.legR2.cubeList.add(new ModelBox(legR2, 13, 19, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(3.0F, 0.15F, 0.0F);
        this.carapace.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.0436F, 0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 8, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-3.0F, 0.15F, 0.0F);
        this.carapace.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0436F, -0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 16, 16, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(3.0F, 0.15F, 1.0F);
        this.carapace.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.4363F, 0.3054F);
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 7, -0.4F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-3.0F, 0.15F, 1.0F);
        this.carapace.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.4363F, -0.3054F);
        this.legR4.cubeList.add(new ModelBox(legR4, 16, 14, -2.6F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(2.75F, 0.15F, 2.0F);
        this.carapace.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.8727F, 0.4363F);
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 6, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-2.75F, 0.15F, 2.0F);
        this.carapace.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.8727F, -0.4363F);
        this.legR5.cubeList.add(new ModelBox(legR5, 16, 4, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.carapace.render(f5 * 0.28F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.carapace.offsetZ = 0.1F;
        this.carapace.render(0.022f);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.carapace.offsetY = 1.08F;

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(antennaL1, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR1, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        this.swing(antennaL2, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR2, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        this.swing(antennaL3, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR3, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

    }
}
