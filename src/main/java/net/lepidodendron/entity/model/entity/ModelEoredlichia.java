package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEoredlichia extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tail;

    public ModelEoredlichia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 23.4F, 3.0F);
        this.bone.cubeList.add(new ModelBox(bone, 13, 7, -3.5F, -1.0F, -8.2F, 7, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 1, 35, -2.5F, -1.0F, -9.2F, 5, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 8, 22, -4.35F, -0.99F, -8.25F, 1, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 10, 3.35F, -0.99F, -8.25F, 1, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 11, -3.0F, -1.25F, -8.02F, 6, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 6, -1.0F, -1.5F, -8.01F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.65F, -0.5F, -7.4F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.4835F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 1, -9.5F, -0.08F, -2.65F, 5, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.65F, -0.5F, -7.4F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.4835F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 1, 4.5F, -0.08F, -2.65F, 5, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.65F, -0.5F, -7.4F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.2217F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 1, -5.25F, -0.09F, -1.4F, 4, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.65F, -0.5F, -7.4F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.2217F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 1, 1.25F, -0.09F, -1.4F, 4, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.65F, -0.5F, -7.15F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -1.7F, -0.1F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.65F, -0.5F, -7.15F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 37, -0.3F, -0.1F, -1.0F, 2, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.75F, -1.0F, -9.0F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 40, -0.25F, 0.02F, -0.1F, 2, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.75F, -1.0F, -9.0F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, -1.75F, 0.02F, -0.1F, 2, 1, 1, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, 0.0F, -8.75F);
        this.bone.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 58, 0.0F, 0.0F, -6.0F, 7, 0, 6, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(-1.0F, 0.0F, -8.75F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, 0.3491F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 28, -7.0F, 0.0F, -6.0F, 7, 0, 6, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.bone.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 12, 22, 0.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.bone.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 17, -4.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.bone.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 34, 2.0F, 0.0F, 0.25F, 2, 0, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 34, -4.0F, 0.0F, 0.25F, 2, 0, 1, 0.0F, true));
        this.body1.cubeList.add(new ModelBox(body1, 25, 21, -1.0F, -0.75F, -0.01F, 2, 1, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 34, 8, 0.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 44, -1.5F, -0.51F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 44, -1.5F, -0.52F, 2.0F, 3, 1, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body1.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 17, -4.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body1.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 12, 22, 0.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 25, -0.99F, -0.751F, -0.01F, 2, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 34, -3.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 34, 8, -3.5F, -0.5F, -2.0F, 3, 1, 2, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 34, 8, -3.25F, -0.51F, 0.0F, 3, 1, 2, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 0, 34, 1.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 34, 8, 0.25F, -0.51F, 0.0F, 3, 1, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 12, 22, 0.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 17, -4.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 34, 8, 0.0F, -0.51F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 34, -3.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));
        this.body3.cubeList.add(new ModelBox(body3, 0, 34, 1.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 34, 8, -3.0F, -0.51F, 0.0F, 3, 1, 2, 0.0F, true));
        this.body3.cubeList.add(new ModelBox(body3, 0, 23, -1.0F, -0.75F, -0.01F, 2, 1, 2, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body3.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 17, -4.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body3.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 12, 22, 0.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 34, 0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 34, -3.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));
        this.body4.cubeList.add(new ModelBox(body4, 0, 34, 1.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 34, -2.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.body4.cubeList.add(new ModelBox(body4, 19, 22, -0.99F, -0.751F, -0.01F, 2, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 18, -2.49F, -0.51F, 0.0F, 5, 1, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, 0.5F, 1.0F);
        this.body4.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 17, -4.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 0.5F, 1.0F);
        this.body4.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 12, 22, 0.0F, 0.02F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 42, -1.49F, -0.52F, 0.0F, 3, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 6, -0.5F, -0.01F, 0.0F, 1, 0, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5 * 0.35F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.bone.render(0.022F);
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
        this.bone.offsetY = 0.975F;

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5};
        AdvancedModelRenderer[] bodyF = {this.body1, this.body2, this.body3, this.body4, this.body5};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(antennaL, 0.4F, -0.22F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaL2, 0.4F, 0.22F, false, 0, 0.1F, f2, 0.8F);

        this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

        this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
        this.chainWave(bodyF, 0.1F, 0.05f, -3, f2, 0.1F);
    }
}
