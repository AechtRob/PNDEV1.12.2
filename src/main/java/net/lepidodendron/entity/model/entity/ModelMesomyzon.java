package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAquaticSticker;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMesomyzon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    public ModelMesomyzon() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -7.5F);
        this.body.cubeList.add(new ModelBox(body, 16, 0, -1.0F, -1.175F, 3.45F, 2, 2, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 27, 0.0F, -1.925F, 5.45F, 0, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 23, -1.0F, -0.575F, 4.0F, 2, 1, 3, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.075F, 2.4F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.6581F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 4, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.475F, 1.75F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.7017F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -1.0F, -2.0F, 0.0F, 2, 3, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, 3.3F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5272F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 2, -1.0F, 0.15F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.925F, 1.725F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.4312F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 12, -1.0F, -1.75F, 0.0F, 2, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.025F, -0.225F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 0, -1.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.body.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 10, 26, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.02F, false));
        this.mouth.cubeList.add(new ModelBox(mouth, 14, 29, -0.5F, 0.025F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.875F, 0.95F, 1.5F);
        this.mouth.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 30, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.475F, 0.95F, -0.75F);
        this.mouth.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 26, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.875F, 0.95F, 1.5F);
        this.mouth.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 30, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.475F, 0.95F, -0.75F);
        this.mouth.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 26, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2F, 7.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -1.0F, -0.5F, 2, 2, 6, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 27, 0.0F, 0.25F, 0.0F, 0, 1, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 6, 0.0F, -1.975F, -0.05F, 0, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.025F, 4.95F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 26, 0.0F, 0.225F, 0.05F, 0, 1, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, 0.0F, -1.85F, 0.0F, 0, 1, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 8, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.125F, 7.05F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 29, -0.01F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 12, 16, -0.75F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 10, 23, 0.0F, -2.0F, 2.5F, 0, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 21, -0.75F, -0.25F, -0.5F, 1, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 16, -0.25F, -1.0F, -0.5F, 1, 1, 4, 0.01F, true));
        this.body4.cubeList.add(new ModelBox(body4, 12, 21, -0.25F, -0.25F, -0.5F, 1, 1, 4, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 3.1F);
        this.body4.addChild(body5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.85F, 0.3F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 22, 0.0F, -1.0F, -0.5F, 1, 1, 4, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.35F, 0.4F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 12, 0.0F, -1.0F, -0.5F, 1, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.05F, 0.95F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 6, -0.01F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.85F, 3.85F);
        this.body5.addChild(body6);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.5F, -0.15F);
        this.body6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 17, 0.0F, -1.0F, -0.5F, 1, 1, 4, -0.03F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.65F, 2.725F);
        this.body6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 27, 0.0F, -0.5F, -2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.75F, 2.8F);
        this.body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 29, -0.01F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.25F, 0.4F);
        this.body6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6109F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 27, 0.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.9F;
        this.body.offsetX = 2.5F;
        this.body.rotateAngleY = (float)Math.toRadians(250);
        this.body.rotateAngleX = (float)Math.toRadians(28);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(180);
        this.body.rotateAngleX = (float) Math.toRadians(-90);
        this.body.offsetZ = -0.19F;
        this.body.offsetY = -0.3F;
        this.body.offsetX = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.2F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.3F, 0.4F, 0.0F);
        this.setRotateAngle(body5, 0.4F, 0.6F, 0.0F);
        this.body.offsetY = -0.17F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        EntityPrehistoricFloraAquaticSticker EntitySticker = (EntityPrehistoricFloraAquaticSticker) e;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (EntitySticker.getAttachmentPos() != null) {
                this.chainSwing(fishTail, speed*0.3F, 0.07F, 0, f2, 1);
                this.swing(body, speed*0.3F, 0.1F, true, 0, 0, f2, 1);
            } else {
                this.chainSwing(fishTail, speed * 0.8F, 0.27F, 0, f2, 1);
                this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
            }


             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -0.1F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
