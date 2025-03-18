package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAulacoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended finL;
    private final AdvancedModelRendererExtended finR;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended armb1;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended armb2;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended armb3;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended armb4;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended armb5;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended armb6;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended armb7;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended armb8;
    private final AdvancedModelRendererExtended arm9;
    private final AdvancedModelRendererExtended armb9;
    private final AdvancedModelRendererExtended arm10;
    private final AdvancedModelRendererExtended armb10;

    public ModelAulacoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.4F, -5.25F, -1.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 41, -2.5F, -5.75F, -1.75F, 5, 4, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 20, -2.5F, -6.0F, 1.25F, 5, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 6, -2.0F, -2.25F, 1.15F, 4, 1, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.0F, -5.75F, 9.25F, 4, 4, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 28, -1.5F, -5.25F, 19.25F, 3, 3, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 32, -1.0F, -5.0F, 27.25F, 2, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -4.5F, 33.25F, 1, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 7, 2.4F, -5.25F, -1.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 0, 2.425F, -4.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -3.425F, -4.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -0.5F, -1.9F, -4.25F, 1, 1, 4, 0.0F, false));

        this.finL = new AdvancedModelRendererExtended(this);
        this.finL.setRotationPoint(0.75F, -4.0F, 27.0F);
        this.body.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 8, 0, -0.25F, 0.0F, -5.75F, 4, 0, 14, 0.0F, false));

        this.finR = new AdvancedModelRendererExtended(this);
        this.finR.setRotationPoint(-0.75F, -4.0F, 27.0F);
        this.body.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 0, 0, -3.75F, 0.0F, -5.75F, 4, 0, 14, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.75F, -5.1F, -1.75F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, -0.2618F, -0.0436F, 0.0F);
        this.arm1.cubeList.add(new ModelBox(arm1, 30, 51, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb1 = new AdvancedModelRendererExtended(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 42, 36, -0.49F, -0.51F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(2.0F, -4.7F, -1.75F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, -0.1745F, -0.1745F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 22, 50, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb2 = new AdvancedModelRendererExtended(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 42, 27, -0.49F, -0.501F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(2.0F, -2.3F, -1.75F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.1745F, -0.1745F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 8, 50, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb3 = new AdvancedModelRendererExtended(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 28, 41, -0.49F, -0.501F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(0.75F, -2.15F, -1.75F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.2618F, -0.0436F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 48, 46, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb4 = new AdvancedModelRendererExtended(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 10, 41, -0.49F, -0.51F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(2.25F, -3.5F, -1.75F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, -0.2618F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 48, 18, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb5 = new AdvancedModelRendererExtended(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 39, -0.49F, -0.51F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(-0.75F, -5.1F, -1.75F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, -0.2618F, 0.0436F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 48, 9, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb6 = new AdvancedModelRendererExtended(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 38, 18, -0.51F, -0.51F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(-2.0F, -4.7F, -1.75F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, -0.1745F, 0.1745F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 48, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb7 = new AdvancedModelRendererExtended(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 38, 9, -0.51F, -0.501F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(-2.0F, -2.3F, -1.75F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.1745F, 0.1745F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 48, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb8 = new AdvancedModelRendererExtended(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 38, 0, -0.51F, -0.501F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(-0.75F, -2.15F, -1.75F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.2618F, 0.0436F, 0.0F);
        this.arm9.cubeList.add(new ModelBox(arm9, 40, 45, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb9 = new AdvancedModelRendererExtended(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 32, 32, -0.51F, -0.51F, -8.0F, 1, 1, 8, 0.0F, false));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(-2.25F, -3.5F, -1.75F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.2618F, 0.0F);
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb10 = new AdvancedModelRendererExtended(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 14, 32, -0.51F, -0.51F, -8.0F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.21F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.14F;
        this.body.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.35F;
        this.body.offsetX = 0.1F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.46F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.3F, 3.8F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        this.body.offsetY = 1.1F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] topRightT = {this.arm1, this.armb1};
        AdvancedModelRendererExtended[] topMidRightT = {this.arm2, this.armb2};
        AdvancedModelRendererExtended[] centerRightT = {this.arm5, this.armb5};
        AdvancedModelRendererExtended[] bottomMidRightT = {this.arm3, this.armb3};
        AdvancedModelRendererExtended[] bottomRightT = {this.arm4, this.armb4};
        AdvancedModelRendererExtended[] bottomLeftT = {this.arm9, this.armb9};
        AdvancedModelRendererExtended[] bottomMidLeftT = {this.arm8, this.armb8};
        AdvancedModelRendererExtended[] centerLeftT = {this.arm10, this.armb10};
        AdvancedModelRendererExtended[] topMidLeftT = {this.arm7, this.armb7};
        AdvancedModelRendererExtended[] topLeftT = {this.arm6, this.armb6};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        this.flap(finL, (float) (speed * 0.65), 0.34F, true, 0.8F, 0, f2, 0.5F);
        this.flap(finR, (float) (speed * 0.65), 0.34F, true, 0.8F, 0, f2, 0.5F);

        this.chainSwingExtended(centerLeftT, speed, -0.3F, -2,3F, f2, 1F);
        //Left lower middle:
        this.chainWaveExtended(bottomMidLeftT, speed, 0.25F, -1.5,0F, f2, 1F);
        this.chainSwingExtended(bottomMidLeftT, speed, 0.2F, -1.5, 0F,f2, 1F);
        //Left lower bottom:
        this.chainWaveExtended(bottomLeftT, speed, 0.25F, -2,0, f2, 1F);

        //Left upper middle:
        this.chainWaveExtended(topMidLeftT, speed, 0.2F, -2, 3F, f2, 1F);
        this.chainSwingExtended(topMidLeftT, speed, -0.25F, -1.5, 3F, f2, 1F);
        //Left upper top:
        this.chainWaveExtended(topLeftT, speed, -0.25F, -2, 0,f2, 1F);


        //Right middle:
        this.chainSwingExtended(centerRightT, speed, 0.3F, -2, 3F,f2, 1F);
        //Right lower middle:
        this.chainWaveExtended(bottomMidRightT, speed, 0.25F, -1.5, 0F,f2, 1F);
        this.chainSwingExtended(bottomMidRightT, speed, -0.2F, -1.5, 0F,f2, 1F);
        //Right lower bottom:
        this.chainWaveExtended(bottomRightT, speed, 0.25F, -2,0, f2, 1F);
        //Right upper middle:
        this.chainWaveExtended(topMidRightT, speed, 0.25F, -2, 3F, f2, 1F);
        this.chainSwingExtended(topMidRightT, speed, 0.2F, -1.5, 3F, f2, 1F);
        //Right upper top:
        this.chainWaveExtended(topRightT, speed, -0.25F, -2, 0 ,f2, 1F);


        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(body, bobSpeed, 0.8F, false, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 0, f2, 1);
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.15F;
        }

    }

}
