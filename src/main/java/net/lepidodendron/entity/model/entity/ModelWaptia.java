package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelWaptia extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer rightgill1;
    private final AdvancedModelRenderer leftgill1;
    private final AdvancedModelRenderer rightgill2;
    private final AdvancedModelRenderer leftgill2;
    private final AdvancedModelRenderer rightgill3;
    private final AdvancedModelRenderer leftgill7;
    private final AdvancedModelRenderer rightgill4;
    private final AdvancedModelRenderer leftgill4;
    private final AdvancedModelRenderer rightgill5;
    private final AdvancedModelRenderer leftgill5;
    private final AdvancedModelRenderer rightgill6;
    private final AdvancedModelRenderer leftgill6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightleg5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightantenna;
    private final AdvancedModelRenderer leftantenna;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    public ModelWaptia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.4F, -5.75F);
        this.setRotateAngle(base, 0.2618F, 0.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 11, -1.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 18, 17, -1.5F, -1.9F, -2.5F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 12, -1.0F, -0.75F, -8.0F, 2, 1, 4, 0.01F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.base.addChild(body1);
        this.setRotateAngle(body1, -0.3054F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 14, 0, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.rightgill1 = new AdvancedModelRenderer(this);
        this.rightgill1.setRotationPoint(-1.0F, 2.0F, 0.0F);
        this.body1.addChild(rightgill1);
        this.setRotateAngle(rightgill1, 0.0F, 0.1745F, -0.6981F);
        this.rightgill1.cubeList.add(new ModelBox(rightgill1, 14, 14, -3.0F, 0.0F, -0.25F, 3, 0, 2, 0.0F, false));

        this.leftgill1 = new AdvancedModelRenderer(this);
        this.leftgill1.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.body1.addChild(leftgill1);
        this.setRotateAngle(leftgill1, 0.0F, -0.1745F, 0.6981F);
        this.leftgill1.cubeList.add(new ModelBox(leftgill1, 14, 14, 0.0F, 0.0F, -0.25F, 3, 0, 2, 0.0F, true));

        this.rightgill2 = new AdvancedModelRenderer(this);
        this.rightgill2.setRotationPoint(-1.0F, 2.0F, 0.5F);
        this.body1.addChild(rightgill2);
        this.setRotateAngle(rightgill2, 0.0F, 0.3054F, -0.7854F);
        this.rightgill2.cubeList.add(new ModelBox(rightgill2, 14, 12, -3.0F, 0.0F, -0.25F, 3, 0, 2, 0.0F, false));

        this.leftgill2 = new AdvancedModelRenderer(this);
        this.leftgill2.setRotationPoint(1.0F, 2.0F, 0.5F);
        this.body1.addChild(leftgill2);
        this.setRotateAngle(leftgill2, 0.0F, -0.3054F, 0.7854F);
        this.leftgill2.cubeList.add(new ModelBox(leftgill2, 14, 12, 0.0F, 0.0F, -0.25F, 3, 0, 2, 0.0F, true));

        this.rightgill3 = new AdvancedModelRenderer(this);
        this.rightgill3.setRotationPoint(-1.0F, 2.0F, 1.25F);
        this.body1.addChild(rightgill3);
        this.setRotateAngle(rightgill3, 0.0F, 0.48F, -0.829F);
        this.rightgill3.cubeList.add(new ModelBox(rightgill3, 9, 17, -3.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.leftgill7 = new AdvancedModelRenderer(this);
        this.leftgill7.setRotationPoint(1.0F, 2.0F, 1.25F);
        this.body1.addChild(leftgill7);
        this.setRotateAngle(leftgill7, 0.0F, -0.48F, 0.829F);
        this.leftgill7.cubeList.add(new ModelBox(leftgill7, 9, 17, 0.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, true));

        this.rightgill4 = new AdvancedModelRenderer(this);
        this.rightgill4.setRotationPoint(-1.0F, 2.0F, 2.0F);
        this.body1.addChild(rightgill4);
        this.setRotateAngle(rightgill4, 0.0F, 0.4363F, -0.8727F);
        this.rightgill4.cubeList.add(new ModelBox(rightgill4, 13, 5, -2.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.leftgill4 = new AdvancedModelRenderer(this);
        this.leftgill4.setRotationPoint(1.0F, 2.0F, 2.0F);
        this.body1.addChild(leftgill4);
        this.setRotateAngle(leftgill4, 0.0F, -0.4363F, 0.8727F);
        this.leftgill4.cubeList.add(new ModelBox(leftgill4, 13, 5, -0.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, true));

        this.rightgill5 = new AdvancedModelRenderer(this);
        this.rightgill5.setRotationPoint(-1.0F, 2.0F, 2.5F);
        this.body1.addChild(rightgill5);
        this.setRotateAngle(rightgill5, 0.0F, 0.4363F, -0.9163F);
        this.rightgill5.cubeList.add(new ModelBox(rightgill5, 0, 4, -2.0F, 0.0F, -0.25F, 2, 0, 1, 0.0F, false));

        this.leftgill5 = new AdvancedModelRenderer(this);
        this.leftgill5.setRotationPoint(1.0F, 2.0F, 2.5F);
        this.body1.addChild(leftgill5);
        this.setRotateAngle(leftgill5, 0.0F, -0.4363F, 0.9163F);
        this.leftgill5.cubeList.add(new ModelBox(leftgill5, 0, 4, 0.0F, 0.0F, -0.25F, 2, 0, 1, 0.0F, true));

        this.rightgill6 = new AdvancedModelRenderer(this);
        this.rightgill6.setRotationPoint(-1.0F, 2.0F, 3.0F);
        this.body1.addChild(rightgill6);
        this.setRotateAngle(rightgill6, 0.0F, 0.6109F, -0.9599F);
        this.rightgill6.cubeList.add(new ModelBox(rightgill6, 0, 3, -1.5F, 0.0F, -0.4F, 2, 0, 1, 0.0F, false));

        this.leftgill6 = new AdvancedModelRenderer(this);
        this.leftgill6.setRotationPoint(1.0F, 2.0F, 3.0F);
        this.body1.addChild(leftgill6);
        this.setRotateAngle(leftgill6, 0.0F, -0.6109F, 0.9599F);
        this.leftgill6.cubeList.add(new ModelBox(leftgill6, 0, 3, -0.5F, 0.0F, -0.4F, 2, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 2.75F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 17, 5, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 2.95F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 17, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 5, 17, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.body4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.45F, -0.75F, 0.6F, 1, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.body4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.55F, -0.75F, 0.6F, 1, 0, 3, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.0F, -0.6F, -1.0F);
        this.base.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.6109F, -0.6981F, -0.9599F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.85F, 7.5F);
        this.rightleg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 5, -2.25F, 0.15F, -8.0F, 2, 0, 1, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(1.0F, -0.6F, -1.0F);
        this.base.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.6109F, 0.6981F, 0.9599F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.85F, 7.5F);
        this.leftleg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 5, 0.25F, 0.15F, -8.0F, 2, 0, 1, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.0F, -0.6F, -0.5F);
        this.base.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6109F, -0.6109F, -0.9599F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.85F, 7.5F);
        this.rightleg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 11, -3.0F, 0.15F, -8.0F, 3, 0, 1, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, -0.6F, -0.5F);
        this.base.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6109F, 0.6109F, 0.9599F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.85F, 7.5F);
        this.leftleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 11, 0.0F, 0.15F, -8.0F, 3, 0, 1, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.0F, -0.6F, 0.0F);
        this.base.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.6545F, -0.48F, -0.9599F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.85F, 7.5F);
        this.rightleg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 10, -3.75F, 0.15F, -8.0F, 4, 0, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.0F, -0.6F, 0.0F);
        this.base.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.6545F, 0.48F, 0.9599F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.85F, 7.5F);
        this.leftleg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 10, -0.25F, 0.15F, -8.0F, 4, 0, 1, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-1.0F, -0.45F, 0.5F);
        this.base.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.6545F, -0.4363F, -0.9599F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.85F, 7.5F);
        this.rightleg4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 9, -4.25F, 0.15F, -8.0F, 4, 0, 1, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(1.0F, -0.45F, 0.5F);
        this.base.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.6545F, 0.4363F, 0.9599F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.85F, 7.5F);
        this.leftleg4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 9, 0.25F, 0.15F, -8.0F, 4, 0, 1, 0.0F, true));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(-1.0F, -0.35F, 1.15F);
        this.base.addChild(rightleg5);
        this.setRotateAngle(rightleg5, 0.6109F, -0.3491F, -0.8727F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.85F, 7.5F);
        this.rightleg5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 11, -4.75F, 0.15F, -8.0F, 5, 0, 1, 0.0F, false));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(1.0F, -0.35F, 1.15F);
        this.base.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.6109F, 0.3491F, 0.8727F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.85F, 7.5F);
        this.leftleg5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 11, -0.25F, 0.15F, -8.0F, 5, 0, 1, 0.0F, true));

        this.rightantenna = new AdvancedModelRenderer(this);
        this.rightantenna.setRotationPoint(-0.15F, -1.5F, -2.5F);
        this.base.addChild(rightantenna);
        this.setRotateAngle(rightantenna, 0.0436F, 0.2182F, -0.6109F);
        this.rightantenna.cubeList.add(new ModelBox(rightantenna, 0, 6, -3.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.leftantenna = new AdvancedModelRenderer(this);
        this.leftantenna.setRotationPoint(0.15F, -1.5F, -2.5F);
        this.base.addChild(leftantenna);
        this.setRotateAngle(leftantenna, 0.0436F, -0.2182F, 0.6109F);
        this.leftantenna.cubeList.add(new ModelBox(leftantenna, 0, 6, 0.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, true));

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, -2.1F, -2.0F);
        this.base.addChild(carapace);
        this.setRotateAngle(carapace, 0.0873F, 0.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 6, 6, -1.5F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, 0.0F, 2.0F);
        this.carapace.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.2654F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, 0.0F, -2.0F, 4, 0, 6, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 0.0F, 2.0F);
        this.carapace.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -1.2654F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -4.0F, 0.0F, -2.0F, 4, 0, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }
    public void renderStaticDisplayCase(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

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
        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(leftantenna, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(rightantenna, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(leftantenna, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(rightantenna, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.05F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.25F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.3F;
            this.flap(leftleg1, speedLeg, -degreeLeg, true, 0, -0.5F, f2, 0.7F);
            this.flap(rightleg1, speedLeg, degreeLeg, true, 0, 0.5F, f2, 0.7F);
            this.flap(leftleg2, speedLeg, -degreeLeg, true, 0.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg2, speedLeg, degreeLeg, true, 0.5F, 0.5F, f2, 0.7F);
            this.flap(leftleg3, speedLeg, -degreeLeg, true, 1.0F, -0.5F, f2, 0.7F);
            this.flap(rightleg3, speedLeg, degreeLeg, true, 1.0F, 0.5F, f2, 0.7F);
            this.flap(leftleg4, speedLeg, -degreeLeg, true, 1.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg4, speedLeg, degreeLeg, true, 1.5F, 0.5F, f2, 0.7F);
            this.flap(leftleg5, speedLeg, -degreeLeg, true, 2.0F, -0.5F, f2, 0.7F);
            this.flap(rightleg5, speedLeg, degreeLeg, true, 2.0F, 0.5F, f2, 0.7F);
            this.flap(leftgill1, speedLeg, -degreeLeg, true, 2.5F, -0.5F, f2, 0.7F);
            this.flap(rightgill1, speedLeg, degreeLeg, true, 2.5F, 0.5F, f2, 0.7F);
            this.flap(leftgill2, speedLeg, -degreeLeg, true, 3.0F, -0.5F, f2, 0.7F);
            this.flap(rightgill2, speedLeg, degreeLeg, true, 3.0F, 0.5F, f2, 0.7F);
            this.flap(leftgill7, speedLeg, -degreeLeg, true, 3.5F, -0.5F, f2, 0.7F);
            this.flap(rightgill3, speedLeg, degreeLeg, true, 3.5F, 0.5F, f2, 0.7F);
            this.flap(leftgill4, speedLeg, -degreeLeg, true, 4.0F, -0.5F, f2, 0.7F);
            this.flap(rightgill4, speedLeg, degreeLeg, true, 4.0F, 0.5F, f2, 0.7F);
            this.flap(leftgill5, speedLeg, -degreeLeg, true, 4.5F, -0.5F, f2, 0.7F);
            this.flap(rightgill5, speedLeg, degreeLeg, true, 4.5F, 0.5F, f2, 0.7F);
            this.flap(leftgill6, speedLeg, -degreeLeg, true, 5.0F, -0.5F, f2, 0.7F);
            this.flap(rightgill6, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);

                if (f3 == 0.0F) {
                    this.bob(base, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(base, -speed, 1F, false, f2, 2);
                }

        }
    }
}
