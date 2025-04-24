package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLonchodomas;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLonchodomas extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer LonchodomasMain;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer AntennaeLeft;
    private final AdvancedModelRenderer AntennaeRight;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r9;

    public ModelLonchodomas() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.LonchodomasMain = new AdvancedModelRenderer(this);
        this.LonchodomasMain.setRotationPoint(-0.5F, 23.25F, 2.0F);
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 4, 0, -6.5F, 0.0F, -2.75F, 14, 0, 14, 0.0F, false));
        this.LonchodomasMain.cubeList.add(new ModelBox(LonchodomasMain, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.LonchodomasMain.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.829F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.LonchodomasMain.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.LonchodomasMain.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.829F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        this.AntennaeLeft = new AdvancedModelRenderer(this);
        this.AntennaeLeft.setRotationPoint(1.0F, 0.35F, -4.25F);
        this.LonchodomasMain.addChild(AntennaeLeft);
        this.AntennaeLeft.cubeList.add(new ModelBox(AntennaeLeft, 0, 12, -0.25F, 0.0F, -1.75F, 3, 0, 2, 0.0F, false));

        this.AntennaeRight = new AdvancedModelRenderer(this);
        this.AntennaeRight.setRotationPoint(0.0F, 0.35F, -4.25F);
        this.LonchodomasMain.addChild(AntennaeRight);
        this.AntennaeRight.cubeList.add(new ModelBox(AntennaeRight, 0, 10, -2.75F, 0.0F, -1.75F, 3, 0, 2, 0.0F, false));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(1.0481F, 0.5436F, -2.5F);
        this.LonchodomasMain.addChild(LLeg1);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0019F, -0.0436F, -4.5F);
        this.LLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0873F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 6, 0.0F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.0F, 0.5F, -1.25F);
        this.LonchodomasMain.addChild(LLeg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0981F, 0.0436F, -0.55F);
        this.LLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 6, -0.0019F, -0.0436F, 0.0F, 1, 0, 1, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.0981F, 0.5436F, -0.1F);
        this.LonchodomasMain.addChild(LLeg3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0019F, -0.0436F, 0.1F);
        this.LLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0873F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 4, 0.0F, 0.0F, -0.6F, 1, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-0.1481F, 0.5436F, -2.5F);
        this.LonchodomasMain.addChild(RLeg1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.0019F, -0.0436F, -4.5F);
        this.RLeg1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 3, -1.0F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.1981F, 0.5436F, -1.3F);
        this.LonchodomasMain.addChild(RLeg2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0019F, -0.0436F, -0.7F);
        this.RLeg2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 1, -1.0F, 0.0F, 0.2F, 1, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.1981F, 0.5436F, -0.1F);
        this.LonchodomasMain.addChild(RLeg3);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 3, 0, -0.9981F, -0.0436F, 0.0F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.LonchodomasMain.render(f5 * 0.2F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.LonchodomasMain.offsetZ = 0.1F;
        this.LonchodomasMain.render(0.022f);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.LonchodomasMain.offsetY = -0.3F;
        this.LonchodomasMain.offsetX = 0.1F;
        this.LonchodomasMain.offsetZ = 2.0F;
        this.LonchodomasMain.rotateAngleY = (float)Math.toRadians(120);
        this.LonchodomasMain.rotateAngleX = (float)Math.toRadians(1);
        this.LonchodomasMain.rotateAngleZ = (float)Math.toRadians(0);
        this.LonchodomasMain.scaleChildren = true;
        float scaler = 0.8F;
        this.LonchodomasMain.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(LonchodomasMain, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.LonchodomasMain.render(f);
        //Reset rotations, positions and sizing:
        this.LonchodomasMain.setScale(1.0F, 1.0F, 1.0F);
        this.LonchodomasMain.scaleChildren = false;
        resetToDefaultPose();

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
        this.LonchodomasMain.offsetY = 1.2F;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3};
        if (((EntityPrehistoricFloraLonchodomas) e).getIsMoving()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

            this.flap(LLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(RLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

        }
        this.swing(AntennaeLeft, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaeRight, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);
    }
}
