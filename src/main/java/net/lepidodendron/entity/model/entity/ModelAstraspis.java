package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAstraspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Astraspis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer robpleasedontlook;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelAstraspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Astraspis = new AdvancedModelRenderer(this);
        this.Astraspis.setRotationPoint(0.0F, 22.0F, 2.5F);
        this.Astraspis.cubeList.add(new ModelBox(Astraspis, 0, 0, -4.0F, -2.0F, -8.0F, 8, 4, 8, 0.0F, false));
        this.Astraspis.cubeList.add(new ModelBox(Astraspis, 0, 12, 2.3F, 0.0F, -9.1F, 3, 0, 9, 0.0F, false));
        this.Astraspis.cubeList.add(new ModelBox(Astraspis, 0, 12, -5.3F, 0.0F, -9.1F, 3, 0, 9, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -1.0F, -8.0F);
        this.Astraspis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 36, -1.0F, 0.0F, -1.9F, 2, 2, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5F, 1.5F, -5.0F);
        this.Astraspis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 32, 0.0F, -3.0F, -3.0F, 1, 3, 4, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.5F, 1.5F, -3.0F);
        this.Astraspis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 32, 0.0F, -3.0F, -1.0F, 1, 3, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 0.8F, -3.45F);
        this.Astraspis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, 1.2F, -1.0F, -3.35F, 2, 0, 7, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 0.8F, -3.45F);
        this.Astraspis.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0873F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -3.2F, -1.0F, -3.35F, 2, 0, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6F, -4.0F);
        this.Astraspis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 9, 0.0F, -1.0F, -5.0F, 0, 2, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.5F, 1.5F, -3.0F);
        this.Astraspis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 32, -1.0F, -3.0F, -1.0F, 1, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -9.0F);
        this.Astraspis.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 14, -2.0F, 0.0F, -1.4F, 4, 1, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4F, -9.0F);
        this.Astraspis.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 27, -2.0F, -1.0F, -1.4F, 4, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, -1.0F, -8.0F);
        this.Astraspis.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7418F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 36, -1.0F, 0.0F, -1.9F, 2, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(4.5F, 1.5F, -5.0F);
        this.Astraspis.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 32, -1.0F, -3.0F, -3.0F, 1, 3, 4, -0.01F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Astraspis.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 18, 20, -3.0F, -2.0F, -1.0F, 6, 4, 3, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 28, 0, -2.0F, -1.5F, -1.0F, 4, 3, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.45F, 2.9F);
        this.Tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 27, 7, -1.5F, -1.25F, -1.5F, 3, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.7F, -1.1F);
        this.Tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 18, -0.5F, -1.2F, 0.6F, 2, 1, 4, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.25F, 3.5F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 29, -1.0F, -1.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.95F, -4.6F);
        this.Tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 37, 0.0F, -1.2F, 4.6F, 1, 1, 4, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 8, 20, -0.5F, -0.5F, -1.0F, 1, 1, 8, -0.01F, false));
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 13, 0.0F, -2.5F, 0.0F, 0, 5, 8, -0.01F, false));

        this.robpleasedontlook = new AdvancedModelRenderer(this);
        this.robpleasedontlook.setRotationPoint(-1.0F, -2.5F, -5.5F);
        this.Astraspis.addChild(robpleasedontlook);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.robpleasedontlook.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 57, -2.0F, 0.0F, -2.0F, 6, 0, 6, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 55, -0.5F, -5.0F, -1.0F, 3, 5, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.robpleasedontlook.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.5708F, -1.4835F, -1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 55, -0.5F, -5.0F, -3.0F, 3, 5, 4, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Astraspis.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Astraspis.rotateAngleY = (float) Math.toRadians(90);
        this.Astraspis.offsetY = -0.15F;
        this.Astraspis.offsetX = -0.1F;
        this.Astraspis.offsetZ = 0.025F;
        this.Astraspis.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Astraspis, -0.2F, 0.2F, -0.3F);
        this.setRotateAngle(Tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, 0.0F, 0.0F);
        this.Astraspis.offsetZ = 0.01F;
        this.Astraspis.offsetY = 0.15F;
        this.Astraspis.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Astraspis.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.99F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed*0.5F, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed*0.5F, 0.335F, -2.6, f2, 1);
            this.swing(Astraspis, speed*0.5F, 0.16F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Astraspis.rotateAngleZ = (float) Math.toRadians(90);
                //this.Astraspis.offsetY = 1.2F;
                this.bob(Astraspis, -speed*0.5F, 5F, false, f2, 1);
            }
        }
    }
}
