package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBurgessia;
import net.lepidodendron.entity.EntityPrehistoricFloraEoredlichia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBurgessia extends AdvancedModelBase {
    private final AdvancedModelRenderer Burgessia;
    private final AdvancedModelRenderer LEFTSHELL1;
    private final AdvancedModelRenderer LEFTSHELL2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer LEFTSHELL3;
    private final AdvancedModelRenderer RIGHTSHELL1;
    private final AdvancedModelRenderer RIGHTSHELL2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer RIGHTSHELL3;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;

    public ModelBurgessia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Burgessia = new AdvancedModelRenderer(this);
        this.Burgessia.setRotationPoint(0.0F, 22.45F, -2.0F);
        this.Burgessia.cubeList.add(new ModelBox(Burgessia, 13, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.LEFTSHELL1 = new AdvancedModelRenderer(this);
        this.LEFTSHELL1.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.Burgessia.addChild(LEFTSHELL1);
        this.setRotateAngle(LEFTSHELL1, 0.0F, 0.0F, 0.1745F);
        this.LEFTSHELL1.cubeList.add(new ModelBox(LEFTSHELL1, 0, 11, 0.0F, 0.0F, -2.0F, 3, 1, 5, 0.01F, false));
        this.LEFTSHELL1.cubeList.add(new ModelBox(LEFTSHELL1, 13, 0, 0.0F, 0.0F, -3.0F, 1, 1, 1, 0.01F, false));

        this.LEFTSHELL2 = new AdvancedModelRenderer(this);
        this.LEFTSHELL2.setRotationPoint(3.0F, 2.0F, 1.0F);
        this.LEFTSHELL1.addChild(LEFTSHELL2);
        this.setRotateAngle(LEFTSHELL2, 0.0F, -0.3927F, 0.0F);
        this.LEFTSHELL2.cubeList.add(new ModelBox(LEFTSHELL2, 0, 0, -2.0F, -2.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.LEFTSHELL2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -1.0F, 0.0F, 0.45F, 1, 1, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 17, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.LEFTSHELL3 = new AdvancedModelRenderer(this);
        this.LEFTSHELL3.setRotationPoint(1.0F, 0.0F, -3.0F);
        this.LEFTSHELL1.addChild(LEFTSHELL3);
        this.setRotateAngle(LEFTSHELL3, 0.0F, -0.7767F, 0.0F);
        this.LEFTSHELL3.cubeList.add(new ModelBox(LEFTSHELL3, 0, 6, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.LEFTSHELL3.cubeList.add(new ModelBox(LEFTSHELL3, 0, 11, 1.85F, 0.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.RIGHTSHELL1 = new AdvancedModelRenderer(this);
        this.RIGHTSHELL1.setRotationPoint(0.0F, -0.7F, -3.0F);
        this.Burgessia.addChild(RIGHTSHELL1);
        this.setRotateAngle(RIGHTSHELL1, 0.0F, 0.0F, -0.1745F);
        this.RIGHTSHELL1.cubeList.add(new ModelBox(RIGHTSHELL1, 0, 11, -3.0F, 0.0F, -2.0F, 3, 1, 5, 0.01F, true));
        this.RIGHTSHELL1.cubeList.add(new ModelBox(RIGHTSHELL1, 13, 0, -1.0F, 0.0F, -3.0F, 1, 1, 1, 0.01F, true));

        this.RIGHTSHELL2 = new AdvancedModelRenderer(this);
        this.RIGHTSHELL2.setRotationPoint(-3.0F, 2.0F, 1.0F);
        this.RIGHTSHELL1.addChild(RIGHTSHELL2);
        this.setRotateAngle(RIGHTSHELL2, 0.0F, 0.3927F, 0.0F);
        this.RIGHTSHELL2.cubeList.add(new ModelBox(RIGHTSHELL2, 0, 0, 0.0F, -2.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.RIGHTSHELL2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, 0.0F, 0.0F, 0.45F, 1, 1, 1, -0.02F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 17, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, true));

        this.RIGHTSHELL3 = new AdvancedModelRenderer(this);
        this.RIGHTSHELL3.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.RIGHTSHELL1.addChild(RIGHTSHELL3);
        this.setRotateAngle(RIGHTSHELL3, 0.0F, 0.7767F, 0.0F);
        this.RIGHTSHELL3.cubeList.add(new ModelBox(RIGHTSHELL3, 0, 6, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));
        this.RIGHTSHELL3.cubeList.add(new ModelBox(RIGHTSHELL3, 0, 11, -2.85F, 0.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.Burgessia.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.2356F, -0.2855F, -0.1123F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 12, 11, 0.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.Burgessia.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.2356F, 0.2855F, 0.1123F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 12, 11, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Burgessia.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 10, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, -0.25F, -4.5F);
        this.Burgessia.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.6545F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, -0.25F, -4.5F);
        this.Burgessia.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.6545F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 4, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, -0.25F, -3.25F);
        this.Burgessia.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.5411F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 13, 7, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, -0.25F, -3.25F);
        this.Burgessia.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.5411F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 13, 7, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, -0.25F, -1.75F);
        this.Burgessia.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.5934F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 13, 7, -0.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, -0.25F, -1.75F);
        this.Burgessia.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.5934F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 13, 7, -3.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.5F, -0.25F, -0.5F);
        this.Burgessia.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.7069F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 4, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.5F, -0.25F, -0.5F);
        this.Burgessia.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.7069F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 4, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Burgessia.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Burgessia.render(0.022F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.bone.offsetY = 0.975F;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4};

        if (((EntityPrehistoricFloraBurgessia) e).getIsMoving()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

            this.flap(leftLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        }

        this.swing(leftAntenna, 0.4F, -0.22F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna, 0.4F, 0.22F, false, 0, 0.1F, f2, 0.8F);

    }
}
